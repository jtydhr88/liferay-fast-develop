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

import com.liferay.fast.develop.model.LiferayModule;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the liferay module service. This utility wraps <code>com.liferay.fast.develop.service.persistence.impl.LiferayModulePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayModulePersistence
 * @generated
 */
public class LiferayModuleUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LiferayModule liferayModule) {
		getPersistence().clearCache(liferayModule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, LiferayModule> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LiferayModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LiferayModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LiferayModule> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LiferayModule update(LiferayModule liferayModule) {
		return getPersistence().update(liferayModule);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LiferayModule update(
		LiferayModule liferayModule, ServiceContext serviceContext) {

		return getPersistence().update(liferayModule, serviceContext);
	}

	/**
	 * Returns all the liferay modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching liferay modules
	 */
	public static List<LiferayModule> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<LiferayModule> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<LiferayModule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<LiferayModule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByUuid_First(
			String uuid, OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByUuid_First(
		String uuid, OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByUuid_Last(
			String uuid, OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByUuid_Last(
		String uuid, OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the liferay modules before and after the current liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param moduleId the primary key of the current liferay module
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public static LiferayModule[] findByUuid_PrevAndNext(
			long moduleId, String uuid,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUuid_PrevAndNext(
			moduleId, uuid, orderByComparator);
	}

	/**
	 * Removes all the liferay modules where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of liferay modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching liferay modules
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLiferayModuleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByUUID_G(String uuid, long groupId)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the liferay module where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the liferay module that was removed
	 */
	public static LiferayModule removeByUUID_G(String uuid, long groupId)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of liferay modules where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching liferay modules
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching liferay modules
	 */
	public static List<LiferayModule> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static LiferayModule[] findByUuid_C_PrevAndNext(
			long moduleId, String uuid, long companyId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByUuid_C_PrevAndNext(
			moduleId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the liferay modules where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching liferay modules
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the liferay modules where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @return the matching liferay modules
	 */
	public static List<LiferayModule> findByWorkspaceId(long workspaceId) {
		return getPersistence().findByWorkspaceId(workspaceId);
	}

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
	public static List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end) {

		return getPersistence().findByWorkspaceId(workspaceId, start, end);
	}

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
	public static List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().findByWorkspaceId(
			workspaceId, start, end, orderByComparator);
	}

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
	public static List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByWorkspaceId(
			workspaceId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByWorkspaceId_First(
			long workspaceId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByWorkspaceId_First(
			workspaceId, orderByComparator);
	}

	/**
	 * Returns the first liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByWorkspaceId_First(
		long workspaceId, OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().fetchByWorkspaceId_First(
			workspaceId, orderByComparator);
	}

	/**
	 * Returns the last liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	public static LiferayModule findByWorkspaceId_Last(
			long workspaceId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByWorkspaceId_Last(
			workspaceId, orderByComparator);
	}

	/**
	 * Returns the last liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	public static LiferayModule fetchByWorkspaceId_Last(
		long workspaceId, OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().fetchByWorkspaceId_Last(
			workspaceId, orderByComparator);
	}

	/**
	 * Returns the liferay modules before and after the current liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param moduleId the primary key of the current liferay module
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public static LiferayModule[] findByWorkspaceId_PrevAndNext(
			long moduleId, long workspaceId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByWorkspaceId_PrevAndNext(
			moduleId, workspaceId, orderByComparator);
	}

	/**
	 * Removes all the liferay modules where workspaceId = &#63; from the database.
	 *
	 * @param workspaceId the workspace ID
	 */
	public static void removeByWorkspaceId(long workspaceId) {
		getPersistence().removeByWorkspaceId(workspaceId);
	}

	/**
	 * Returns the number of liferay modules where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @return the number of matching liferay modules
	 */
	public static int countByWorkspaceId(long workspaceId) {
		return getPersistence().countByWorkspaceId(workspaceId);
	}

	/**
	 * Caches the liferay module in the entity cache if it is enabled.
	 *
	 * @param liferayModule the liferay module
	 */
	public static void cacheResult(LiferayModule liferayModule) {
		getPersistence().cacheResult(liferayModule);
	}

	/**
	 * Caches the liferay modules in the entity cache if it is enabled.
	 *
	 * @param liferayModules the liferay modules
	 */
	public static void cacheResult(List<LiferayModule> liferayModules) {
		getPersistence().cacheResult(liferayModules);
	}

	/**
	 * Creates a new liferay module with the primary key. Does not add the liferay module to the database.
	 *
	 * @param moduleId the primary key for the new liferay module
	 * @return the new liferay module
	 */
	public static LiferayModule create(long moduleId) {
		return getPersistence().create(moduleId);
	}

	/**
	 * Removes the liferay module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module that was removed
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public static LiferayModule remove(long moduleId)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().remove(moduleId);
	}

	public static LiferayModule updateImpl(LiferayModule liferayModule) {
		return getPersistence().updateImpl(liferayModule);
	}

	/**
	 * Returns the liferay module with the primary key or throws a <code>NoSuchLiferayModuleException</code> if it could not be found.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	public static LiferayModule findByPrimaryKey(long moduleId)
		throws com.liferay.fast.develop.exception.NoSuchLiferayModuleException {

		return getPersistence().findByPrimaryKey(moduleId);
	}

	/**
	 * Returns the liferay module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module, or <code>null</code> if a liferay module with the primary key could not be found
	 */
	public static LiferayModule fetchByPrimaryKey(long moduleId) {
		return getPersistence().fetchByPrimaryKey(moduleId);
	}

	/**
	 * Returns all the liferay modules.
	 *
	 * @return the liferay modules
	 */
	public static List<LiferayModule> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<LiferayModule> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<LiferayModule> findAll(
		int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<LiferayModule> findAll(
		int start, int end, OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the liferay modules from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of liferay modules.
	 *
	 * @return the number of liferay modules
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LiferayModulePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LiferayModulePersistence, LiferayModulePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LiferayModulePersistence.class);

		ServiceTracker<LiferayModulePersistence, LiferayModulePersistence>
			serviceTracker =
				new ServiceTracker
					<LiferayModulePersistence, LiferayModulePersistence>(
						bundle.getBundleContext(),
						LiferayModulePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}