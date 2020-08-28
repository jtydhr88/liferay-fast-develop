package com.liferay.fast.develop.web.portlet;

import com.liferay.fast.develop.model.LiferayModule;
import com.liferay.fast.develop.model.LiferayWorkspace;
import com.liferay.fast.develop.service.LiferayModuleLocalService;
import com.liferay.fast.develop.service.LiferayWorkspaceLocalService;
import com.liferay.fast.develop.web.constants.FastDevelopAdminPortletKeys;
import com.liferay.fast.develop.web.util.BladeCLI;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.File;
import java.io.IOException;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author wswdk
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.fast-develop",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FastDevelopAdmin",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/admin/view.jsp",
		"javax.portlet.name=" + FastDevelopAdminPortletKeys.FASTDEVELOPADMIN,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FastDevelopAdminPortlet extends MVCPortlet {

	public void deleteModule(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long moduleId = ParamUtil.getLong(actionRequest, "moduleId");

		_liferayModuleLocalService.deleteLiferayModule(moduleId);
	}

	public void deleteWorkspace(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long workspaceId = ParamUtil.getLong(actionRequest, "workspaceId");

		_liferayWorkspaceLocalService.deleteLiferayWorkspace(workspaceId);
	}

	public void render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		try {
			LiferayWorkspace workspace = null;

			long workspaceId = ParamUtil.getLong(renderRequest, "workspaceId");

			if (workspaceId > 0) {
				workspace = _liferayWorkspaceLocalService.getLiferayWorkspace(
					workspaceId);
			}

			renderRequest.setAttribute(
				FastDevelopAdminPortletKeys.LIFERAY_WORKSPACE, workspace);
		}
		catch (PortalException e) {
		}

		try {
			LiferayModule module = null;

			long moduleId = ParamUtil.getLong(renderRequest, "moduleId");

			if (moduleId > 0) {
				module = _liferayModuleLocalService.getLiferayModule(moduleId);
			}

			renderRequest.setAttribute(
				FastDevelopAdminPortletKeys.LIFERAY_MODULE, module);
		}
		catch (PortalException e) {
		}

		renderRequest.setAttribute(
			"liferayModuleLocalService", _liferayModuleLocalService);

		renderRequest.setAttribute(
			"liferayWorkspaceLocalService", _liferayWorkspaceLocalService);

		super.render(renderRequest, renderResponse);
	}

	public void updateLiferayModule(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long workspaceId = ParamUtil.getLong(actionRequest, "workspaceId");
		long moduleId = ParamUtil.getLong(actionRequest, "moduleId");

		String moduleName = ParamUtil.getString(actionRequest, "moduleName");

		String type = ParamUtil.getString(actionRequest, "type");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		if (moduleId <= 0) {
			LiferayModule liferayModule =
				_liferayModuleLocalService.addLiferayModule(
					moduleName, workspaceId, serviceContext);

			LiferayWorkspace liferayWorkspace =
				_liferayWorkspaceLocalService.getLiferayWorkspace(workspaceId);

			String location = _createModule(
				moduleName, type, liferayWorkspace.getLocation());

			_liferayWorkspaceLocalService.updateLocation(
				liferayModule.getWorkspaceId(), location);
		}
	}

	public void updateLiferayWorkspace(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long workspaceId = ParamUtil.getLong(actionRequest, "workspaceId");

		String workspaceName = ParamUtil.getString(
			actionRequest, "workspaceName");

		String buildType = ParamUtil.getString(actionRequest, "buildType");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			actionRequest);

		if (workspaceId <= 0) {
			LiferayWorkspace liferayWorkspace =
				_liferayWorkspaceLocalService.addLiferayWorkspace(
					workspaceName, buildType, serviceContext);

			String location = _createWorkspace(workspaceName, buildType);

			_liferayWorkspaceLocalService.updateLocation(
				liferayWorkspace.getWorkspaceId(), location);
		}
	}

	@Reference(unbind = "-")
	protected void setLiferayModuleLocalService(
		LiferayModuleLocalService liferayModuleLocalService) {

		_liferayModuleLocalService = liferayModuleLocalService;
	}

	@Reference(unbind = "-")
	protected void setLiferayWorkspaceLocalService(
		LiferayWorkspaceLocalService liferayWorkspaceLocalService) {

		_liferayWorkspaceLocalService = liferayWorkspaceLocalService;
	}

	private String _createModule(
			String moduleName, String type, String workspacePath)
		throws InterruptedException, IOException {

		String contextPath = System.getProperty("java.io.tmpdir");

		StringBuilder sb = new StringBuilder();

		sb.append("create ");
		sb.append("-d \"");
		sb.append(workspacePath + "/modules");
		sb.append("\" ");
		sb.append("--base \"");
		sb.append(workspacePath);
		sb.append("\" ");
		sb.append("-b ");
		sb.append("gradle ");
		sb.append("-v ");
		sb.append("7.3.0");
		sb.append(" ");
		sb.append("-t ");
		sb.append(type);
		sb.append(" ");

		sb.append("\"");
		sb.append(moduleName);
		sb.append("\" ");

		BladeCLI.execute(sb.toString());

		return new File(
			contextPath, moduleName
		).getAbsolutePath(
		).replaceAll(
			"\\\\", "/"
		);
	}

	private String _createWorkspace(String workspaceName, String buildType)
		throws InterruptedException, IOException {

		String temp = System.getProperty("java.io.tmpdir");

		File fastDevelopTempFile = new File(temp, "fast-develop");

		File workspaceFile = new File(fastDevelopTempFile, workspaceName);

		workspaceFile.mkdirs();

		String workspacePath = workspaceFile.getAbsolutePath(
		).replaceAll(
			"\\\\", "/"
		);

		StringBuilder sb = new StringBuilder();

		sb.append("--base ");
		sb.append("\"");
		sb.append(workspacePath);
		sb.append("\" ");
		sb.append("init ");
		sb.append("-v ");
		sb.append(7.3);
		sb.append(" ");
		sb.append("-f ");

		if ("maven".equals(buildType)) {
			sb.append("-b ");
			sb.append("maven");
		}

		BladeCLI.execute(sb.toString());

		return workspacePath;
	}

	private LiferayModuleLocalService _liferayModuleLocalService;
	private LiferayWorkspaceLocalService _liferayWorkspaceLocalService;

}