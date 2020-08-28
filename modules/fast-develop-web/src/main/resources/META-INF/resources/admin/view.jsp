
<%@ include file="/admin/init.jsp" %>

<portlet:renderURL var="editLiferayWorkspaceURL">
	<portlet:param name="mvcPath" value="/admin/edit_liferay_workspace.jsp" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:renderURL>

<aui:button-row>
	<aui:button href="<%= editLiferayWorkspaceURL %>" value="add-liferay-workspace" />
</aui:button-row>

<liferay-ui:search-container
	emptyResultsMessage="there-are-no-liferay-workspace"
>
	<liferay-ui:search-container-results
		results="<%= liferayWorkspaceLocalService.getLiferayWorkspaces(searchContainer.getStart(), searchContainer.getEnd()) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.fast.develop.model.LiferayWorkspace"
		modelVar="workspace"
	>
		<portlet:renderURL var="rowURL">
			<portlet:param name="mvcPath" value="/admin/view_file_tree.jsp" />
			<portlet:param name="location" value="<%= String.valueOf(workspace.getLocation()) %>" />
			<portlet:param name="workspaceId" value="<%= String.valueOf(workspace.getWorkspaceId()) %>" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="workspace-id"
			value="<%= String.valueOf(workspace.getWorkspaceId()) %>"
		/>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="workspace-name"
			value="<%= HtmlUtil.escape(workspace.getWorkspaceName()) %>"
		/>

		<liferay-ui:search-container-column-text
			href="<%= rowURL %>"
			name="location"
			value="<%= HtmlUtil.escape(workspace.getLocation()) %>"
		/>

		<liferay-ui:search-container-column-jsp
			align="right"
			path="/admin/liferay_workspace_action.jsp"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>