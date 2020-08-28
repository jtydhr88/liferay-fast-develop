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
 * Provides a wrapper for {@link LiferayModuleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayModuleLocalService
 * @generated
 */
public class LiferayModuleLocalServiceWrapper
	implements LiferayModuleLocalService,
			   ServiceWrapper<LiferayModuleLocalService> {

	public LiferayModuleLocalServiceWrapper(
		LiferayModuleLocalService liferayModuleLocalService) {

		_liferayModuleLocalService = liferayModuleLocalService;
	}

	/**
	 * Adds the liferay module to the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayModule the liferay module
	 * @return the liferay module that was added
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule addLiferayModule(
		com.liferay.fast.develop.model.LiferayModule liferayModule) {

		return _liferayModuleLocalService.addLiferayModule(liferayModule);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayModule addLiferayModule(
			String moduleName, long workspaceId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.addLiferayModule(
			moduleName, workspaceId, serviceContext);
	}

	/**
	 * Creates a new liferay module with the primary key. Does not add the liferay module to the database.
	 *
	 * @param moduleId the primary key for the new liferay module
	 * @return the new liferay module
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule createLiferayModule(
		long moduleId) {

		return _liferayModuleLocalService.createLiferayModule(moduleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the liferay module from the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayModule the liferay module
	 * @return the liferay module that was removed
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule deleteLiferayModule(
		com.liferay.fast.develop.model.LiferayModule liferayModule) {

		return _liferayModuleLocalService.deleteLiferayModule(liferayModule);
	}

	/**
	 * Deletes the liferay module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module that was removed
	 * @throws PortalException if a liferay module with the primary key could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule deleteLiferayModule(
			long moduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.deleteLiferayModule(moduleId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _liferayModuleLocalService.dynamicQuery();
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

		return _liferayModuleLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _liferayModuleLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _liferayModuleLocalService.dynamicQuery(
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

		return _liferayModuleLocalService.dynamicQueryCount(dynamicQuery);
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

		return _liferayModuleLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayModule fetchLiferayModule(
		long moduleId) {

		return _liferayModuleLocalService.fetchLiferayModule(moduleId);
	}

	/**
	 * Returns the liferay module matching the UUID and group.
	 *
	 * @param uuid the liferay module's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule
		fetchLiferayModuleByUuidAndGroupId(String uuid, long groupId) {

		return _liferayModuleLocalService.fetchLiferayModuleByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _liferayModuleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _liferayModuleLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _liferayModuleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the liferay module with the primary key.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module
	 * @throws PortalException if a liferay module with the primary key could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule getLiferayModule(
			long moduleId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.getLiferayModule(moduleId);
	}

	/**
	 * Returns the liferay module matching the UUID and group.
	 *
	 * @param uuid the liferay module's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay module
	 * @throws PortalException if a matching liferay module could not be found
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule
			getLiferayModuleByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.getLiferayModuleByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModules(int start, int end) {

		return _liferayModuleLocalService.getLiferayModules(start, end);
	}

	/**
	 * Returns all the liferay modules matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay modules
	 * @param companyId the primary key of the company
	 * @return the matching liferay modules, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModulesByUuidAndCompanyId(String uuid, long companyId) {

		return _liferayModuleLocalService.getLiferayModulesByUuidAndCompanyId(
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
	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModulesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.fast.develop.model.LiferayModule>
					orderByComparator) {

		return _liferayModuleLocalService.getLiferayModulesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.fast.develop.model.LiferayModule>
		getLiferayModulesByWorkspaceId(long workspaceId, int start, int end) {

		return _liferayModuleLocalService.getLiferayModulesByWorkspaceId(
			workspaceId, start, end);
	}

	/**
	 * Returns the number of liferay modules.
	 *
	 * @return the number of liferay modules
	 */
	@Override
	public int getLiferayModulesCount() {
		return _liferayModuleLocalService.getLiferayModulesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _liferayModuleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the liferay module in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param liferayModule the liferay module
	 * @return the liferay module that was updated
	 */
	@Override
	public com.liferay.fast.develop.model.LiferayModule updateLiferayModule(
		com.liferay.fast.develop.model.LiferayModule liferayModule) {

		return _liferayModuleLocalService.updateLiferayModule(liferayModule);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayModule updateLiferayModule(
			long moduleId, String moduleName, long workspaceId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _liferayModuleLocalService.updateLiferayModule(
			moduleId, moduleName, workspaceId, serviceContext);
	}

	@Override
	public com.liferay.fast.develop.model.LiferayModule updateLocation(
		long moduleId, String location) {

		return _liferayModuleLocalService.updateLocation(moduleId, location);
	}

	@Override
	public LiferayModuleLocalService getWrappedService() {
		return _liferayModuleLocalService;
	}

	@Override
	public void setWrappedService(
		LiferayModuleLocalService liferayModuleLocalService) {

		_liferayModuleLocalService = liferayModuleLocalService;
	}

	private LiferayModuleLocalService _liferayModuleLocalService;

}