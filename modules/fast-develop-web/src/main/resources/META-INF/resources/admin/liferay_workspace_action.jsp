<%@ include file="/admin/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

LiferayWorkspace workspace = (LiferayWorkspace)row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/admin/edit_liferay_workspace.jsp" />
		<portlet:param name="workspaceId" value="<%= String.valueOf(workspace.getWorkspaceId()) %>" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:renderURL>

	<liferay-ui:icon
		image="edit"
		url="<%= editURL %>"
	/>

	<portlet:actionURL name="deleteWorkspace" var="deleteURL">
		<portlet:param name="workspaceId" value="<%= String.valueOf(workspace.getWorkspaceId()) %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete
		url="<%= deleteURL %>"
	/>
</liferay-ui:icon-menu>