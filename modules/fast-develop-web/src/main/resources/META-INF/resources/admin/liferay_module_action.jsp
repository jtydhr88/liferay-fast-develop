<%@ page import="com.liferay.fast.develop.model.LiferayModule" %>

<%@ include file="/admin/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

LiferayModule module = (LiferayModule)row.getObject();
%>

<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/admin/edit_liferay_module.jsp" />
		<portlet:param name="workspaceId" value="<%= String.valueOf(module.getWorkspaceId()) %>" />
		<portlet:param name="moduleId" value="<%= String.valueOf(module.getModuleId()) %>" />
		<portlet:param name="redirect" value="<%= currentURL %>" />
	</portlet:renderURL>

	<liferay-ui:icon
		image="edit"
		url="<%= editURL %>"
	/>

	<portlet:actionURL name="deleteModule" var="deleteURL">
		<portlet:param name="moduleId" value="<%= String.valueOf(module.getModuleId()) %>" />
	</portlet:actionURL>

	<liferay-ui:icon-delete
		url="<%= deleteURL %>"
	/>
</liferay-ui:icon-menu>