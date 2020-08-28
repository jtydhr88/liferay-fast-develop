
<%@ include file="/admin/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");
LiferayWorkspace workspace = (LiferayWorkspace)request.getAttribute(FastDevelopAdminPortletKeys.LIFERAY_WORKSPACE);

long workspaceId = BeanParamUtil.getLong(workspace, request, "workspaceId");
%>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (workspace == null) ? "new-liferay-workspace" : workspace.getWorkspaceName() %>'
/>

<portlet:actionURL name="updateLiferayWorkspace" var="updateWorkspaceURL">
	<portlet:param name="mvcPath" value="/admin/edit_liferay_workspace.jsp" />
	<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:actionURL>

<aui:form action="<%= updateWorkspaceURL %>" method="post" name="fm">
	<aui:input name="workspaceId" type="hidden" value="<%= workspaceId %>" />

	<aui:model-context bean="<%= workspace %>" model="<%= LiferayWorkspace.class %>" />

	<aui:fieldset>
		<aui:input name="workspaceName" />

		<aui:select name="buildType">
			<aui:option label="gradle" selected="true" value="gradle" />
			<aui:option label="maven" value="maven" />
		</aui:select>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>