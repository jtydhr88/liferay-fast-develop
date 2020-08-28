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

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.fast.develop.model.LiferayWorkspace;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for LiferayWorkspace. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspaceLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface LiferayWorkspaceLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LiferayWorkspaceLocalServiceUtil} to access the liferay workspace local service. Add custom service methods to <code>com.liferay.fast.develop.service.impl.LiferayWorkspaceLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the liferay workspace to the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public LiferayWorkspace addLiferayWorkspace(
		LiferayWorkspace liferayWorkspace);

	public LiferayWorkspace addLiferayWorkspace(
			String liferayWorkspaceName, String buildType,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new liferay workspace with the primary key. Does not add the liferay workspace to the database.
	 *
	 * @param workspaceId the primary key for the new liferay workspace
	 * @return the new liferay workspace
	 */
	@Transactional(enabled = false)
	public LiferayWorkspace createLiferayWorkspace(long workspaceId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the liferay workspace from the database. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public LiferayWorkspace deleteLiferayWorkspace(
		LiferayWorkspace liferayWorkspace);

	/**
	 * Deletes the liferay workspace with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace that was removed
	 * @throws PortalException if a liferay workspace with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public LiferayWorkspace deleteLiferayWorkspace(long workspaceId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LiferayWorkspace fetchLiferayWorkspace(long workspaceId);

	/**
	 * Returns the liferay workspace matching the UUID and group.
	 *
	 * @param uuid the liferay workspace's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LiferayWorkspace fetchLiferayWorkspaceByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the liferay workspace with the primary key.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace
	 * @throws PortalException if a liferay workspace with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LiferayWorkspace getLiferayWorkspace(long workspaceId)
		throws PortalException;

	/**
	 * Returns the liferay workspace matching the UUID and group.
	 *
	 * @param uuid the liferay workspace's UUID
	 * @param groupId the primary key of the group
	 * @return the matching liferay workspace
	 * @throws PortalException if a matching liferay workspace could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LiferayWorkspace getLiferayWorkspaceByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LiferayWorkspace> getLiferayWorkspaces(int start, int end);

	/**
	 * Returns all the liferay workspaces matching the UUID and company.
	 *
	 * @param uuid the UUID of the liferay workspaces
	 * @param companyId the primary key of the company
	 * @return the matching liferay workspaces, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LiferayWorkspace> getLiferayWorkspacesByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LiferayWorkspace> getLiferayWorkspacesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LiferayWorkspace> orderByComparator);

	/**
	 * Returns the number of liferay workspaces.
	 *
	 * @return the number of liferay workspaces
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLiferayWorkspacesCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the liferay workspace in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param liferayWorkspace the liferay workspace
	 * @return the liferay workspace that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public LiferayWorkspace updateLiferayWorkspace(
		LiferayWorkspace liferayWorkspace);

	public LiferayWorkspace updateLocation(long workspaceId, String location);

}