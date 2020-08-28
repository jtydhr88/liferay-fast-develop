<%@ include file="/admin/init.jsp" %>

<%
String redirect = ParamUtil.getString(request, "redirect");
String location = ParamUtil.getString(request, "location");

File locationFile = new File(location);

File[] files = locationFile.listFiles();

List<File> fileList = Arrays.asList(files);

LiferayWorkspace workspace = (LiferayWorkspace)request.getAttribute(FastDevelopAdminPortletKeys.LIFERAY_WORKSPACE);

long workspaceId = BeanParamUtil.getLong(workspace, request, "workspaceId");
%>

<%
if (workspaceId > 0) {
%>

	<portlet:renderURL var="editLiferayModuleURL">
		<portlet:param name="mvcPath" value="/admin/edit_liferay_module.jsp" />
		<portlet:param name="workspaceId" value="<%= String.valueOf(workspaceId) %>" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:renderURL>

	<aui:button-row>
		<aui:button href="<%= editLiferayModuleURL %>" value="add-liferay-module" />
	</aui:button-row>

<%
}
%>

<liferay-ui:search-container
	emptyResultsMessage="there-are-no-liferay-modules"
>
	<liferay-ui:search-container-results
		results="<%= liferayModuleLocalService.getLiferayModulesByWorkspaceId(workspaceId, searchContainer.getStart(), searchContainer.getEnd()) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.fast.develop.model.LiferayModule"
		modelVar="module"
	>
		<portlet:renderURL var="rowURL">
			<portlet:param name="mvcPath" value="/admin/view_file_tree.jsp" />
			<portlet:param name="location" value="<%= String.valueOf(module.getLocation()) %>" />
			<portlet:param name="moduleId" value="<%= String.valueOf(module.getModuleId()) %>" />
			<portlet:param name="workspaceId" value="<%= String.valueOf(module.getWorkspaceId()) %>" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="module-id"
			value="<%= String.valueOf(module.getModuleId()) %>"
		/>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="module-name"
			value="<%= HtmlUtil.escape(module.getModuleName()) %>"
		/>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="location"
			value="<%= HtmlUtil.escape(module.getLocation()) %>"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/admin/liferay_module_action.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<liferay-ui:search-container
	emptyResultsMessage="there-are-no-files"
>
	<liferay-ui:search-container-results
		results="<%= fileList %>"
	/>

	<liferay-ui:search-container-row
		className="java.io.File"
		modelVar="file"
	>

		<%
		String filePath = file.getAbsolutePath().replaceAll("\\\\", "/");
		%>

		<portlet:renderURL var="rowURL">
			<portlet:param name="mvcPath" value="/admin/view_file_tree.jsp" />
			<portlet:param name="location" value="<%= filePath %>" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href='<%= file.isDirectory()? rowURL: "" %>'
			name="file-name"
			value="<%= String.valueOf(file.getName()) %>"
		/>

		<liferay-ui:search-container-column-text
			href='<%= file.isDirectory()? rowURL: "" %>'
			name="path"
			value="<%= HtmlUtil.escape(file.getPath()) %>"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>