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

package com.liferay.fast.develop.service.persistence;

import com.liferay.fast.develop.exception.NoSuchLiferayWorkspaceException;
import com.liferay.fast.develop.model.LiferayWorkspace;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the liferay workspace service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspaceUtil
 * @generated
 */
@ProviderType
public interface LiferayWorkspacePersistence
	extends BasePersistence<LiferayWorkspace> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LiferayWorkspaceUtil} to access the liferay workspace persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the liferay workspaces where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid(String uuid);

	/**
	 * Returns a range of all the liferay workspaces where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @return the range of matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the liferay workspaces where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay workspaces where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first liferay workspace in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
				orderByComparator)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the first liferay workspace in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns the last liferay workspace in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
				orderByComparator)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the last liferay workspace in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns the liferay workspaces before and after the current liferay workspace in the ordered set where uuid = &#63;.
	 *
	 * @param workspaceId the primary key of the current liferay workspace
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a liferay workspace with the primary key could not be found
	 */
	public LiferayWorkspace[] findByUuid_PrevAndNext(
			long workspaceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
				orderByComparator)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Removes all the liferay workspaces where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of liferay workspaces where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching liferay workspaces
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the liferay workspace where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLiferayWorkspaceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace findByUUID_G(String uuid, long groupId)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the liferay workspace where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the liferay workspace where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the liferay workspace where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the liferay workspace that was removed
	 */
	public LiferayWorkspace removeByUUID_G(String uuid, long groupId)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the number of liferay workspaces where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching liferay workspaces
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the liferay workspaces where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the liferay workspaces where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @return the range of matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the liferay workspaces where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay workspaces where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first liferay workspace in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
				orderByComparator)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the first liferay workspace in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns the last liferay workspace in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
				orderByComparator)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the last liferay workspace in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay workspace, or <code>null</code> if a matching liferay workspace could not be found
	 */
	public LiferayWorkspace fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns the liferay workspaces before and after the current liferay workspace in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param workspaceId the primary key of the current liferay workspace
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a liferay workspace with the primary key could not be found
	 */
	public LiferayWorkspace[] findByUuid_C_PrevAndNext(
			long workspaceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
				orderByComparator)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Removes all the liferay workspaces where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of liferay workspaces where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching liferay workspaces
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the liferay workspace in the entity cache if it is enabled.
	 *
	 * @param liferayWorkspace the liferay workspace
	 */
	public void cacheResult(LiferayWorkspace liferayWorkspace);

	/**
	 * Caches the liferay workspaces in the entity cache if it is enabled.
	 *
	 * @param liferayWorkspaces the liferay workspaces
	 */
	public void cacheResult(java.util.List<LiferayWorkspace> liferayWorkspaces);

	/**
	 * Creates a new liferay workspace with the primary key. Does not add the liferay workspace to the database.
	 *
	 * @param workspaceId the primary key for the new liferay workspace
	 * @return the new liferay workspace
	 */
	public LiferayWorkspace create(long workspaceId);

	/**
	 * Removes the liferay workspace with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace that was removed
	 * @throws NoSuchLiferayWorkspaceException if a liferay workspace with the primary key could not be found
	 */
	public LiferayWorkspace remove(long workspaceId)
		throws NoSuchLiferayWorkspaceException;

	public LiferayWorkspace updateImpl(LiferayWorkspace liferayWorkspace);

	/**
	 * Returns the liferay workspace with the primary key or throws a <code>NoSuchLiferayWorkspaceException</code> if it could not be found.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace
	 * @throws NoSuchLiferayWorkspaceException if a liferay workspace with the primary key could not be found
	 */
	public LiferayWorkspace findByPrimaryKey(long workspaceId)
		throws NoSuchLiferayWorkspaceException;

	/**
	 * Returns the liferay workspace with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param workspaceId the primary key of the liferay workspace
	 * @return the liferay workspace, or <code>null</code> if a liferay workspace with the primary key could not be found
	 */
	public LiferayWorkspace fetchByPrimaryKey(long workspaceId);

	/**
	 * Returns all the liferay workspaces.
	 *
	 * @return the liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findAll();

	/**
	 * Returns a range of all the liferay workspaces.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @return the range of liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the liferay workspaces.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay workspaces.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayWorkspaceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay workspaces
	 * @param end the upper bound of the range of liferay workspaces (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of liferay workspaces
	 */
	public java.util.List<LiferayWorkspace> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayWorkspace>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the liferay workspaces from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of liferay workspaces.
	 *
	 * @return the number of liferay workspaces
	 */
	public int countAll();

}