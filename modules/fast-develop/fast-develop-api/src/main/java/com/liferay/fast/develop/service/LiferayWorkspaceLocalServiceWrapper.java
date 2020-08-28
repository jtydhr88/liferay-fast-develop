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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LiferayWorkspaceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspaceLocalService
 * @generated
 */
public class LiferayWorkspaceLocalServiceWrapper
	implements LiferayWorkspaceLocalService,
			   ServiceWrapper<LiferayWorkspaceLocalService> {

	public LiferayWorkspaceLocalServiceWrapper(
		LiferayWorkspaceLocalService liferayWorkspaceLocalService) {

		_liferayWorkspaceLocalService = liferayWorkspaceLocalService;
	}

	/**
	 * Adds the liferay workspace to the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was added
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace addLiferayWorkspace(
		com.liferay.fast.develop.model.LiferayWorkspace liferayWorkspace) {

		return _liferayWorkspaceLocalService.addLiferayWorkspace(
			liferayWorkspace);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace addLiferayWorkspace(
			String liferayWorkspaceName, String buildType,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.addLiferayWorkspace(
			liferayWorkspaceName, buildType, serviceContext);
	}

	/**
	 * Creates a new liferay workspace with the primary key. Does not add the liferay workspace to the database.
	 *
	 * @param workspaceId the primary key for the new liferay workspace
	 * @return the new liferay workspace
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
		createLiferayWorkspace(long workspaceId) {

		return _liferayWorkspaceLocalService.createLiferayWorkspace(
			workspaceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the liferay workspace from the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was removed
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
		deleteLiferayWorkspace(
			com.liferay.fast.develop.model.LiferayWorkspace liferayWorkspace) {

		return _liferayWorkspaceLocalService.deleteLiferayWorkspace(
			liferayWorkspace);
	}

	/**
	 * Deletes the liferay workspace with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace that was removed
	 * @throws PortalException if a liferay workspace with the primary key could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
			deleteLiferayWorkspace(long workspaceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.deleteLiferayWorkspace(
			workspaceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _liferayWorkspaceLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _liferayWorkspaceLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _liferayWorkspaceLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _liferayWorkspaceLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _liferayWorkspaceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _liferayWorkspaceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
		fetchLiferayWorkspace(long workspaceId) {

		return _liferayWorkspaceLocalService.fetchLiferayWorkspace(workspaceId);
	}

	/**
	 * Returns the liferay workspace matching the UUID and group.
	 *
	 * @param uuid the liferay workspace's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
		fetchLiferayWorkspaceByUuidAndGroupId(String uuid, long groupId) {

		return _liferayWorkspaceLocalService.
			fetchLiferayWorkspaceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _liferayWorkspaceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _liferayWorkspaceLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _liferayWorkspaceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the liferay workspace with the primary key.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace
	 * @throws PortalException if a liferay workspace with the primary key could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace getLiferayWorkspace(
			long workspaceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.getLiferayWorkspace(workspaceId);
	}

	/**
	 * Returns the liferay workspace matching the UUID and group.
	 *
	 * @param uuid the liferay workspace's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay workspace
	 * @throws PortalException if a matching liferay workspace could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
			getLiferayWorkspaceByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.
			getLiferayWorkspaceByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayWorkspace>
		getLiferayWorkspaces(int start, int end) {

		return _liferayWorkspaceLocalService.getLiferayWorkspaces(start, end);
	}

	/**
	 * Returns all the liferay workspaces matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay workspaces
	 * @param companyId the primary key of the company
	 * @return the matching liferay workspaces, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayWorkspace>
		getLiferayWorkspacesByUuidAndCompanyId(String uuid, long companyId) {

		return _liferayWorkspaceLocalService.
			getLiferayWorkspacesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayWorkspace>
		getLiferayWorkspacesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.fast.develop.model.LiferayWorkspace>
					orderByComparator) {

		return _liferayWorkspaceLocalService.
			getLiferayWorkspacesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of liferay workspaces.
	 *
	 * @return the number of liferay workspaces
	 */
	@Override
	public int getLiferayWorkspacesCount() {
		return _liferayWorkspaceLocalService.getLiferayWorkspacesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _liferayWorkspaceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayWorkspaceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the liferay workspace in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was updated
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace
		updateLiferayWorkspace(
			com.liferay.fast.develop.model.LiferayWorkspace liferayWorkspace) {

		return _liferayWorkspaceLocalService.updateLiferayWorkspace(
			liferayWorkspace);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayWorkspace updateLocation(
		long workspaceId, String location) {

		return _liferayWorkspaceLocalService.updateLocation(
			workspaceId, location);
	}

	@Override
	public LiferayWorkspaceLocalService getWrappedService() {
		return _liferayWorkspaceLocalService;
	}

	@Override
	public void setWrappedService(
		LiferayWorkspaceLocalService liferayWorkspaceLocalService) {

		_liferayWorkspaceLocalService = liferayWorkspaceLocalService;
	}

	private LiferayWorkspaceLocalService _liferayWorkspaceLocalService;

}