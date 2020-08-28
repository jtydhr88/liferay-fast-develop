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

package com.liferay.fast.develop.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for LiferayModule. This utility wraps
 * <code>com.liferay.fast.develop.service.impl.LiferayModuleLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayModuleLocalService
 * @generated
 */
public class LiferayModuleLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.fast.develop.service.impl.LiferayModuleLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the liferay module to the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayModule the liferay module
	 * @return the liferay module that was added
	 */
	public static com.liferay.fast.develop.model.LiferayModule addLiferayModule(
		com.liferay.fast.develop.model.LiferayModule liferayModule) {

		return getService().addLiferayModule(liferayModule);
	}

	public static com.liferay.fast.develop.model.LiferayModule addLiferayModule(
			String moduleName, long workspaceId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addLiferayModule(
			moduleName, workspaceId, serviceContext);
	}

	/**
	 * Creates a new liferay module with the primary key. Does not add the liferay module to the database.
	 *
	 * @param moduleId the primary key for the new liferay module
	 * @return the new liferay module
	 */
	public static com.liferay.fast.develop.model.LiferayModule
		createLiferayModule(long moduleId) {

		return getService().createLiferayModule(moduleId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the liferay module from the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayModule the liferay module
	 * @return the liferay module that was removed
	 */
	public static com.liferay.fast.develop.model.LiferayModule
		deleteLiferayModule(
			com.liferay.fast.develop.model.LiferayModule liferayModule) {

		return getService().deleteLiferayModule(liferayModule);
	}

	/**
	 * Deletes the liferay module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module that was removed
	 * @throws PortalException if a liferay module with the primary key could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayModule
			deleteLiferayModule(long moduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteLiferayModule(moduleId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.fast.develop.model.impl.LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.fast.develop.model.impl.LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.fast.develop.model.LiferayModule
		fetchLiferayModule(long moduleId) {

		return getService().fetchLiferayModule(moduleId);
	}

	/**
	 * Returns the liferay module matching the UUID and group.
	 *
	 * @param uuid the liferay module's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayModule
		fetchLiferayModuleByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchLiferayModuleByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the liferay module with the primary key.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module
	 * @throws PortalException if a liferay module with the primary key could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayModule getLiferayModule(
			long moduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLiferayModule(moduleId);
	}

	/**
	 * Returns the liferay module matching the UUID and group.
	 *
	 * @param uuid the liferay module's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay module
	 * @throws PortalException if a matching liferay module could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayModule
			getLiferayModuleByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLiferayModuleByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the liferay modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.fast.develop.model.impl.LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @return the range of liferay modules
	 */
	public static java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModules(int start, int end) {

		return getService().getLiferayModules(start, end);
	}

	/**
	 * Returns all the liferay modules matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay modules
	 * @param companyId the primary key of the company
	 * @return the matching liferay modules, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModulesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getLiferayModulesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of liferay modules matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay modules
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching liferay modules, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModulesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.fast.develop.model.LiferayModule>
					orderByComparator) {

		return getService().getLiferayModulesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	public static java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModulesByWorkspaceId(long workspaceId, int start, int end) {

		return getService().getLiferayModulesByWorkspaceId(
			workspaceId, start, end);
	}

	/**
	 * Returns the number of liferay modules.
	 *
	 * @return the number of liferay modules
	 */
	public static int getLiferayModulesCount() {
		return getService().getLiferayModulesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the liferay module in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param liferayModule the liferay module
	 * @return the liferay module that was updated
	 */
	public static com.liferay.fast.develop.model.LiferayModule
		updateLiferayModule(
			com.liferay.fast.develop.model.LiferayModule liferayModule) {

		return getService().updateLiferayModule(liferayModule);
	}

	public static com.liferay.fast.develop.model.LiferayModule
			updateLiferayModule(
				long moduleId, String moduleName, long workspaceId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateLiferayModule(
			moduleId, moduleName, workspaceId, serviceContext);
	}

	public static com.liferay.fast.develop.model.LiferayModule updateLocation(
		long moduleId, String location) {

		return getService().updateLocation(moduleId, location);
	}

	public static LiferayModuleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LiferayModuleLocalService, LiferayModuleLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			LiferayModuleLocalService.class);

		ServiceTracker<LiferayModuleLocalService, LiferayModuleLocalService>
			serviceTracker =
				new ServiceTracker
					<LiferayModuleLocalService, LiferayModuleLocalService>(
						bundle.getBundleContext(),
						LiferayModuleLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}