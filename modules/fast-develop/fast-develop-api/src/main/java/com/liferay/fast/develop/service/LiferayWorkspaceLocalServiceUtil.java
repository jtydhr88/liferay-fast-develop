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
 * Provides the local service utility for LiferayWorkspace. This utility wraps
 * <code>com.liferay.fast.develop.service.impl.LiferayWorkspaceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspaceLocalService
 * @generated
 */
public class LiferayWorkspaceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.fast.develop.service.impl.LiferayWorkspaceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the liferay workspace to the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was added
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
		addLiferayWorkspace(
			com.liferay.fast.develop.model.LiferayWorkspace liferayWorkspace) {

		return getService().addLiferayWorkspace(liferayWorkspace);
	}

	public static com.liferay.fast.develop.model.LiferayWorkspace
			addLiferayWorkspace(
				String liferayWorkspaceName, String buildType,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addLiferayWorkspace(
			liferayWorkspaceName, buildType, serviceContext);
	}

	/**
	 * Creates a new liferay workspace with the primary key. Does not add the liferay workspace to the database.
	 *
	 * @param workspaceId the primary key for the new liferay workspace
	 * @return the new liferay workspace
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
		createLiferayWorkspace(long workspaceId) {

		return getService().createLiferayWorkspace(workspaceId);
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
	 * Deletes the liferay workspace from the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was removed
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
		deleteLiferayWorkspace(
			com.liferay.fast.develop.model.LiferayWorkspace liferayWorkspace) {

		return getService().deleteLiferayWorkspace(liferayWorkspace);
	}

	/**
	 * Deletes the liferay workspace with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace that was removed
	 * @throws PortalException if a liferay workspace with the primary key could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
			deleteLiferayWorkspace(long workspaceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteLiferayWorkspace(workspaceId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.fast.develop.model.impl.LiferayWorkspaceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.fast.develop.model.impl.LiferayWorkspaceModelImpl</code>.
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

	public static com.liferay.fast.develop.model.LiferayWorkspace
		fetchLiferayWorkspace(long workspaceId) {

		return getService().fetchLiferayWorkspace(workspaceId);
	}

	/**
	 * Returns the liferay workspace matching the UUID and group.
	 *
	 * @param uuid the liferay workspace's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
		fetchLiferayWorkspaceByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchLiferayWorkspaceByUuidAndGroupId(
			uuid, groupId);
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
	 * Returns the liferay workspace with the primary key.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace
	 * @throws PortalException if a liferay workspace with the primary key could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
			getLiferayWorkspace(long workspaceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLiferayWorkspace(workspaceId);
	}

	/**
	 * Returns the liferay workspace matching the UUID and group.
	 *
	 * @param uuid the liferay workspace's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay workspace
	 * @throws PortalException if a matching liferay workspace could not be found
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
			getLiferayWorkspaceByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getLiferayWorkspaceByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the liferay workspaces.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.fast.develop.model.impl.LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @return the range of liferay workspaces
	 */
	public static java.util.List
		<com.liferay.fast.develop.model.LiferayWorkspace> getLiferayWorkspaces(
			int start, int end) {

		return getService().getLiferayWorkspaces(start, end);
	}

	/**
	 * Returns all the liferay workspaces matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay workspaces
	 * @param companyId the primary key of the company
	 * @return the matching liferay workspaces, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.liferay.fast.develop.model.LiferayWorkspace>
			getLiferayWorkspacesByUuidAndCompanyId(
				String uuid, long companyId) {

		return getService().getLiferayWorkspacesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of liferay workspaces matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay workspaces
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching liferay workspaces, or an empty list if no matches were found
	 */
	public static java.util.List
		<com.liferay.fast.develop.model.LiferayWorkspace>
			getLiferayWorkspacesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.fast.develop.model.LiferayWorkspace>
						orderByComparator) {

		return getService().getLiferayWorkspacesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of liferay workspaces.
	 *
	 * @return the number of liferay workspaces
	 */
	public static int getLiferayWorkspacesCount() {
		return getService().getLiferayWorkspacesCount();
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
	 * Updates the liferay workspace in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was updated
	 */
	public static com.liferay.fast.develop.model.LiferayWorkspace
		updateLiferayWorkspace(
			com.liferay.fast.develop.model.LiferayWorkspace liferayWorkspace) {

		return getService().updateLiferayWorkspace(liferayWorkspace);
	}

	public static com.liferay.fast.develop.model.LiferayWorkspace
		updateLocation(long workspaceId, String location) {

		return getService().updateLocation(workspaceId, location);
	}

	public static LiferayWorkspaceLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LiferayWorkspaceLocalService, LiferayWorkspaceLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			LiferayWorkspaceLocalService.class);

		ServiceTracker
			<LiferayWorkspaceLocalService, LiferayWorkspaceLocalService>
				serviceTracker =
					new ServiceTracker
						<LiferayWorkspaceLocalService,
						 LiferayWorkspaceLocalService>(
							 bundle.getBundleContext(),
							 LiferayWorkspaceLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}