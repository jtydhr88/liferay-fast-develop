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

import com.liferay.fast.develop.exception.NoSuchLiferayModuleException;
import com.liferay.fast.develop.model.LiferayModule;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the liferay module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayModuleUtil
 * @generated
 */
@ProviderType
public interface LiferayModulePersistence
	extends BasePersistence<LiferayModule> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LiferayModuleUtil} to access the liferay module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the liferay modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid(String uuid);

	/**
	 * Returns a range of all the liferay modules where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @return the range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the liferay modules where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay modules where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns the liferay modules before and after the current liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param moduleId the primary key of the current liferay module
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public LiferayModule[] findByUuid_PrevAndNext(
			long moduleId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Removes all the liferay modules where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of liferay modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching liferay modules
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLiferayModuleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByUUID_G(String uuid, long groupId)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the liferay module where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the liferay module that was removed
	 */
	public LiferayModule removeByUUID_G(String uuid, long groupId)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the number of liferay modules where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching liferay modules
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @return the range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns the liferay modules before and after the current liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param moduleId the primary key of the current liferay module
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public LiferayModule[] findByUuid_C_PrevAndNext(
			long moduleId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Removes all the liferay modules where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching liferay modules
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the liferay modules where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @return the matching liferay modules
	 */
	public java.util.List<LiferayModule> findByWorkspaceId(long workspaceId);

	/**
	 * Returns a range of all the liferay modules where workspaceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param workspaceId the workspace ID
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @return the range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end);

	/**
	 * Returns an ordered range of all the liferay modules where workspaceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param workspaceId the workspace ID
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay modules where workspaceId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param workspaceId the workspace ID
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching liferay modules
	 */
	public java.util.List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByWorkspaceId_First(
			long workspaceId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the first liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByWorkspaceId_First(
		long workspaceId,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns the last liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public LiferayModule findByWorkspaceId_Last(
			long workspaceId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the last liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public LiferayModule fetchByWorkspaceId_Last(
		long workspaceId,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns the liferay modules before and after the current liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param moduleId the primary key of the current liferay module
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public LiferayModule[] findByWorkspaceId_PrevAndNext(
			long moduleId, long workspaceId,
			com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
				orderByComparator)
		throws NoSuchLiferayModuleException;

	/**
	 * Removes all the liferay modules where workspaceId = &#63; from the database.
	 *
	 * @param workspaceId the workspace ID
	 */
	public void removeByWorkspaceId(long workspaceId);

	/**
	 * Returns the number of liferay modules where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @return the number of matching liferay modules
	 */
	public int countByWorkspaceId(long workspaceId);

	/**
	 * Caches the liferay module in the entity cache if it is enabled.
	 *
	 * @param liferayModule the liferay module
	 */
	public void cacheResult(LiferayModule liferayModule);

	/**
	 * Caches the liferay modules in the entity cache if it is enabled.
	 *
	 * @param liferayModules the liferay modules
	 */
	public void cacheResult(java.util.List<LiferayModule> liferayModules);

	/**
	 * Creates a new liferay module with the primary key. Does not add the liferay module to the database.
	 *
	 * @param moduleId the primary key for the new liferay module
	 * @return the new liferay module
	 */
	public LiferayModule create(long moduleId);

	/**
	 * Removes the liferay module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module that was removed
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public LiferayModule remove(long moduleId)
		throws NoSuchLiferayModuleException;

	public LiferayModule updateImpl(LiferayModule liferayModule);

	/**
	 * Returns the liferay module with the primary key or throws a <code>NoSuchLiferayModuleException</code> if it could not be found.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public LiferayModule findByPrimaryKey(long moduleId)
		throws NoSuchLiferayModuleException;

	/**
	 * Returns the liferay module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module, or <code>null</code> if a liferay module with the primary key could not be found
	 */
	public LiferayModule fetchByPrimaryKey(long moduleId);

	/**
	 * Returns all the liferay modules.
	 *
	 * @return the liferay modules
	 */
	public java.util.List<LiferayModule> findAll();

	/**
	 * Returns a range of all the liferay modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @return the range of liferay modules
	 */
	public java.util.List<LiferayModule> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the liferay modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of liferay modules
	 */
	public java.util.List<LiferayModule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator);

	/**
	 * Returns an ordered range of all the liferay modules.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LiferayModuleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of liferay modules
	 * @param end the upper bound of the range of liferay modules (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of liferay modules
	 */
	public java.util.List<LiferayModule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiferayModule>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the liferay modules from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of liferay modules.
	 *
	 * @return the number of liferay modules
	 */
	public int countAll();

}