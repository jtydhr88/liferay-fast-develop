/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.fast.develop.service.impl;

import com.liferay.fast.develop.model.LiferayModule;
import com.liferay.fast.develop.service.base.LiferayModuleLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the liferay module local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.fast.develop.service.LiferayModuleLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayModuleLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.fast.develop.model.LiferayModule",
	service = AopService.class
)
public class LiferayModuleLocalServiceImpl
	extends LiferayModuleLocalServiceBaseImpl {

	public LiferayModule addLiferayModule(
			String moduleName, long workspaceId, ServiceContext serviceContext)
		throws PortalException {

		long moduleId = counterLocalService.increment();

		LiferayModule module = liferayModulePersistence.create(moduleId);

		Date now = new Date();

		module.setUserId(serviceContext.getUserId());
		module.setCompanyId(serviceContext.getCompanyId());
		module.setCreateDate(serviceContext.getCreateDate(now));
		module.setModifiedDate(serviceContext.getModifiedDate(now));

		module.setModuleName(moduleName);
		module.setWorkspaceId(workspaceId);

		return liferayModuleLocalService.updateLiferayModule(module);
	}

	public LiferayModule deleteLiferayModule(long moduleId)
		throws PortalException {

		// TODO

		return super.deleteLiferayModule(moduleId);
	}

	public List<LiferayModule> getLiferayModulesByWorkspaceId(
		long workspaceId, int start, int end) {

		return liferayModulePersistence.findByWorkspaceId(
			workspaceId, start, end);
	}

	public LiferayModule updateLiferayModule(
			long moduleId, String moduleName, long workspaceId,
			ServiceContext serviceContext)
		throws PortalException {

		LiferayModule module = liferayModulePersistence.fetchByPrimaryKey(
			moduleId);

		Date now = new Date();

		module.setUserId(serviceContext.getUserId());
		module.setCompanyId(serviceContext.getCompanyId());
		module.setModifiedDate(serviceContext.getModifiedDate(now));

		module.setModuleName(moduleName);
		module.setWorkspaceId(workspaceId);

		return liferayModuleLocalService.updateLiferayModule(module);
	}

	public LiferayModule updateLocation(long moduleId, String location) {
		LiferayModule module = liferayModulePersistence.fetchByPrimaryKey(
			moduleId);

		module.setLocation(location);

		return liferayModuleLocalService.updateLiferayModule(module);
	}

	protected void validate(String appName) throws PortalException {

		// TODO

	}

}