<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.fast.develop.model.LiferayWorkspace" %><%@
page import="com.liferay.fast.develop.service.LiferayModuleLocalService" %><%@
page import="com.liferay.fast.develop.service.LiferayWorkspaceLocalService" %><%@
page import="com.liferay.fast.develop.web.constants.FastDevelopAdminPortletKeys" %><%@
page import="com.liferay.fast.develop.web.util.BladeCLI" %><%@
page import="com.liferay.portal.kernel.bean.BeanParamUtil" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %><%@
page import="com.liferay.portal.kernel.util.PortalUtil" %><%@
page import="com.liferay.portal.kernel.util.WebKeys" %><%@
page import="com.liferay.taglib.search.ResultRow" %>

<%@ page import="java.io.File" %>

<%@ page import="java.util.Arrays" %><%@
page import="java.util.List" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
String currentURL = PortalUtil.getCurrentURL(request);

LiferayWorkspaceLocalService liferayWorkspaceLocalService = (LiferayWorkspaceLocalService)request.getAttribute("liferayWorkspaceLocalService");

LiferayModuleLocalService liferayModuleLocalService = (LiferayModuleLocalService)request.getAttribute("liferayModuleLocalService");
%>