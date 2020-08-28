<%@ page import="com.liferay.fast.develop.model.LiferayModule" %>

<%@ include file="/admin/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");
LiferayWorkspace workspace = (LiferayWorkspace)request.getAttribute(FastDevelopAdminPortletKeys.LIFERAY_WORKSPACE);

long workspaceId = BeanParamUtil.getLong(workspace, request, "workspaceId");

LiferayModule module = (LiferayModule)request.getAttribute(FastDevelopAdminPortletKeys.LIFERAY_MODULE);

long moduleId = BeanParamUtil.getLong(module, request, "moduleId");
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (module == null) ? "new-liferay-module" : module.getModuleName() %>'
/>

<portlet:actionURL name="updateLiferayModule" var="updateModuleURL">
	<portlet:param name="mvcPath" value="/admin/edit_liferay_module.jsp" />
	<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:actionURL>

<aui:form action="<%= updateModuleURL %>" method="post" name="fm">
	<aui:input name="workspaceId" type="hidden" value="<%= workspaceId %>" />
	<aui:input name="moduleId" type="hidden" value="<%= moduleId %>" />

	<aui:model-context bean="<%= module %>" model="<%= LiferayModule.class %>" />

	<aui:fieldset>
		<aui:input name="moduleName" />

		<aui:select name="type">

			<%
			String[] templates = BladeCLI.getProjectTemplates();

			for (String template : templates) {
			%>

				<aui:option label="<%= template %>" value="<%= template %>" />

			<%
			}
			%>

		</aui:select>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>