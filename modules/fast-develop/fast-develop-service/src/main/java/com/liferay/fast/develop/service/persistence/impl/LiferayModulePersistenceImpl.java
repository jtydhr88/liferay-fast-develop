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

package com.liferay.fast.develop.service.persistence.impl;

import com.liferay.fast.develop.exception.NoSuchLiferayModuleException;
import com.liferay.fast.develop.model.LiferayModule;
import com.liferay.fast.develop.model.impl.LiferayModuleImpl;
import com.liferay.fast.develop.model.impl.LiferayModuleModelImpl;
import com.liferay.fast.develop.service.persistence.LiferayModulePersistence;
import com.liferay.fast.develop.service.persistence.impl.constants.FASTDEPLOYPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the liferay module service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LiferayModulePersistence.class)
public class LiferayModulePersistenceImpl
	extends BasePersistenceImpl<LiferayModule>
	implements LiferayModulePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LiferayModuleUtil</code> to access the liferay module persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LiferayModuleImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the liferay modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching liferay modules
	 */
	@Override
	public List<LiferayModule> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LiferayModule> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<LiferayModule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<LiferayModule> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<LiferayModule> list = null;

		if (useFinderCache) {
			list = (List<LiferayModule>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LiferayModule liferayModule : list) {
					if (!uuid.equals(liferayModule.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LiferayModuleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<LiferayModule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule findByUuid_First(
			String uuid, OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByUuid_First(
			uuid, orderByComparator);

		if (liferayModule != null) {
			return liferayModule;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchLiferayModuleException(sb.toString());
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByUuid_First(
		String uuid, OrderByComparator<LiferayModule> orderByComparator) {

		List<LiferayModule> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule findByUuid_Last(
			String uuid, OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByUuid_Last(uuid, orderByComparator);

		if (liferayModule != null) {
			return liferayModule;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchLiferayModuleException(sb.toString());
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByUuid_Last(
		String uuid, OrderByComparator<LiferayModule> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<LiferayModule> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LiferayModule[] findByUuid_PrevAndNext(
			long moduleId, String uuid,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		uuid = Objects.toString(uuid, "");

		LiferayModule liferayModule = findByPrimaryKey(moduleId);

		Session session = null;

		try {
			session = openSession();

			LiferayModule[] array = new LiferayModuleImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, liferayModule, uuid, orderByComparator, true);

			array[1] = liferayModule;

			array[2] = getByUuid_PrevAndNext(
				session, liferayModule, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LiferayModule getByUuid_PrevAndNext(
		Session session, LiferayModule liferayModule, String uuid,
		OrderByComparator<LiferayModule> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(LiferayModuleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						liferayModule)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LiferayModule> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the liferay modules where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (LiferayModule liferayModule :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(liferayModule);
		}
	}

	/**
	 * Returns the number of liferay modules where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching liferay modules
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LIFERAYMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"liferayModule.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(liferayModule.uuid IS NULL OR liferayModule.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLiferayModuleException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule findByUUID_G(String uuid, long groupId)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByUUID_G(uuid, groupId);

		if (liferayModule == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchLiferayModuleException(sb.toString());
		}

		return liferayModule;
	}

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the liferay module where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof LiferayModule) {
			LiferayModule liferayModule = (LiferayModule)result;

			if (!Objects.equals(uuid, liferayModule.getUuid()) ||
				(groupId != liferayModule.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<LiferayModule> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					LiferayModule liferayModule = list.get(0);

					result = liferayModule;

					cacheResult(liferayModule);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUUID_G, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (LiferayModule)result;
		}
	}

	/**
	 * Removes the liferay module where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the liferay module that was removed
	 */
	@Override
	public LiferayModule removeByUUID_G(String uuid, long groupId)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = findByUUID_G(uuid, groupId);

		return remove(liferayModule);
	}

	/**
	 * Returns the number of liferay modules where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching liferay modules
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LIFERAYMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"liferayModule.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(liferayModule.uuid IS NULL OR liferayModule.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"liferayModule.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching liferay modules
	 */
	@Override
	public List<LiferayModule> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<LiferayModule> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<LiferayModule> list = null;

		if (useFinderCache) {
			list = (List<LiferayModule>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LiferayModule liferayModule : list) {
					if (!uuid.equals(liferayModule.getUuid()) ||
						(companyId != liferayModule.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LiferayModuleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<LiferayModule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public LiferayModule findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (liferayModule != null) {
			return liferayModule;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchLiferayModuleException(sb.toString());
	}

	/**
	 * Returns the first liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LiferayModule> orderByComparator) {

		List<LiferayModule> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LiferayModule findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (liferayModule != null) {
			return liferayModule;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchLiferayModuleException(sb.toString());
	}

	/**
	 * Returns the last liferay module in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LiferayModule> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<LiferayModule> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LiferayModule[] findByUuid_C_PrevAndNext(
			long moduleId, String uuid, long companyId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		uuid = Objects.toString(uuid, "");

		LiferayModule liferayModule = findByPrimaryKey(moduleId);

		Session session = null;

		try {
			session = openSession();

			LiferayModule[] array = new LiferayModuleImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, liferayModule, uuid, companyId, orderByComparator,
				true);

			array[1] = liferayModule;

			array[2] = getByUuid_C_PrevAndNext(
				session, liferayModule, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LiferayModule getByUuid_C_PrevAndNext(
		Session session, LiferayModule liferayModule, String uuid,
		long companyId, OrderByComparator<LiferayModule> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(LiferayModuleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						liferayModule)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LiferayModule> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the liferay modules where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (LiferayModule liferayModule :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(liferayModule);
		}
	}

	/**
	 * Returns the number of liferay modules where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching liferay modules
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LIFERAYMODULE_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"liferayModule.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(liferayModule.uuid IS NULL OR liferayModule.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"liferayModule.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByWorkspaceId;
	private FinderPath _finderPathWithoutPaginationFindByWorkspaceId;
	private FinderPath _finderPathCountByWorkspaceId;

	/**
	 * Returns all the liferay modules where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @return the matching liferay modules
	 */
	@Override
	public List<LiferayModule> findByWorkspaceId(long workspaceId) {
		return findByWorkspaceId(
			workspaceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end) {

		return findByWorkspaceId(workspaceId, start, end, null);
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
	@Override
	public List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return findByWorkspaceId(
			workspaceId, start, end, orderByComparator, true);
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
	@Override
	public List<LiferayModule> findByWorkspaceId(
		long workspaceId, int start, int end,
		OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByWorkspaceId;
				finderArgs = new Object[] {workspaceId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByWorkspaceId;
			finderArgs = new Object[] {
				workspaceId, start, end, orderByComparator
			};
		}

		List<LiferayModule> list = null;

		if (useFinderCache) {
			list = (List<LiferayModule>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LiferayModule liferayModule : list) {
					if (workspaceId != liferayModule.getWorkspaceId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

			sb.append(_FINDER_COLUMN_WORKSPACEID_WORKSPACEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LiferayModuleModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(workspaceId);

				list = (List<LiferayModule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule findByWorkspaceId_First(
			long workspaceId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByWorkspaceId_First(
			workspaceId, orderByComparator);

		if (liferayModule != null) {
			return liferayModule;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("workspaceId=");
		sb.append(workspaceId);

		sb.append("}");

		throw new NoSuchLiferayModuleException(sb.toString());
	}

	/**
	 * Returns the first liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByWorkspaceId_First(
		long workspaceId, OrderByComparator<LiferayModule> orderByComparator) {

		List<LiferayModule> list = findByWorkspaceId(
			workspaceId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module
	 * @throws NoSuchLiferayModuleException if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule findByWorkspaceId_Last(
			long workspaceId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByWorkspaceId_Last(
			workspaceId, orderByComparator);

		if (liferayModule != null) {
			return liferayModule;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("workspaceId=");
		sb.append(workspaceId);

		sb.append("}");

		throw new NoSuchLiferayModuleException(sb.toString());
	}

	/**
	 * Returns the last liferay module in the ordered set where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching liferay module, or <code>null</code> if a matching liferay module could not be found
	 */
	@Override
	public LiferayModule fetchByWorkspaceId_Last(
		long workspaceId, OrderByComparator<LiferayModule> orderByComparator) {

		int count = countByWorkspaceId(workspaceId);

		if (count == 0) {
			return null;
		}

		List<LiferayModule> list = findByWorkspaceId(
			workspaceId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LiferayModule[] findByWorkspaceId_PrevAndNext(
			long moduleId, long workspaceId,
			OrderByComparator<LiferayModule> orderByComparator)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = findByPrimaryKey(moduleId);

		Session session = null;

		try {
			session = openSession();

			LiferayModule[] array = new LiferayModuleImpl[3];

			array[0] = getByWorkspaceId_PrevAndNext(
				session, liferayModule, workspaceId, orderByComparator, true);

			array[1] = liferayModule;

			array[2] = getByWorkspaceId_PrevAndNext(
				session, liferayModule, workspaceId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LiferayModule getByWorkspaceId_PrevAndNext(
		Session session, LiferayModule liferayModule, long workspaceId,
		OrderByComparator<LiferayModule> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_LIFERAYMODULE_WHERE);

		sb.append(_FINDER_COLUMN_WORKSPACEID_WORKSPACEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(LiferayModuleModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(workspaceId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						liferayModule)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LiferayModule> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the liferay modules where workspaceId = &#63; from the database.
	 *
	 * @param workspaceId the workspace ID
	 */
	@Override
	public void removeByWorkspaceId(long workspaceId) {
		for (LiferayModule liferayModule :
				findByWorkspaceId(
					workspaceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(liferayModule);
		}
	}

	/**
	 * Returns the number of liferay modules where workspaceId = &#63;.
	 *
	 * @param workspaceId the workspace ID
	 * @return the number of matching liferay modules
	 */
	@Override
	public int countByWorkspaceId(long workspaceId) {
		FinderPath finderPath = _finderPathCountByWorkspaceId;

		Object[] finderArgs = new Object[] {workspaceId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LIFERAYMODULE_WHERE);

			sb.append(_FINDER_COLUMN_WORKSPACEID_WORKSPACEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(workspaceId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_WORKSPACEID_WORKSPACEID_2 =
		"liferayModule.workspaceId = ?";

	public LiferayModulePersistenceImpl() {
		setModelClass(LiferayModule.class);

		setModelImplClass(LiferayModuleImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the liferay module in the entity cache if it is enabled.
	 *
	 * @param liferayModule the liferay module
	 */
	@Override
	public void cacheResult(LiferayModule liferayModule) {
		entityCache.putResult(
			entityCacheEnabled, LiferayModuleImpl.class,
			liferayModule.getPrimaryKey(), liferayModule);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {liferayModule.getUuid(), liferayModule.getGroupId()},
			liferayModule);

		liferayModule.resetOriginalValues();
	}

	/**
	 * Caches the liferay modules in the entity cache if it is enabled.
	 *
	 * @param liferayModules the liferay modules
	 */
	@Override
	public void cacheResult(List<LiferayModule> liferayModules) {
		for (LiferayModule liferayModule : liferayModules) {
			if (entityCache.getResult(
					entityCacheEnabled, LiferayModuleImpl.class,
					liferayModule.getPrimaryKey()) == null) {

				cacheResult(liferayModule);
			}
			else {
				liferayModule.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all liferay modules.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LiferayModuleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the liferay module.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LiferayModule liferayModule) {
		entityCache.removeResult(
			entityCacheEnabled, LiferayModuleImpl.class,
			liferayModule.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((LiferayModuleModelImpl)liferayModule, true);
	}

	@Override
	public void clearCache(List<LiferayModule> liferayModules) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LiferayModule liferayModule : liferayModules) {
			entityCache.removeResult(
				entityCacheEnabled, LiferayModuleImpl.class,
				liferayModule.getPrimaryKey());

			clearUniqueFindersCache(
				(LiferayModuleModelImpl)liferayModule, true);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, LiferayModuleImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		LiferayModuleModelImpl liferayModuleModelImpl) {

		Object[] args = new Object[] {
			liferayModuleModelImpl.getUuid(),
			liferayModuleModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, liferayModuleModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		LiferayModuleModelImpl liferayModuleModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				liferayModuleModelImpl.getUuid(),
				liferayModuleModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((liferayModuleModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				liferayModuleModelImpl.getOriginalUuid(),
				liferayModuleModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new liferay module with the primary key. Does not add the liferay module to the database.
	 *
	 * @param moduleId the primary key for the new liferay module
	 * @return the new liferay module
	 */
	@Override
	public LiferayModule create(long moduleId) {
		LiferayModule liferayModule = new LiferayModuleImpl();

		liferayModule.setNew(true);
		liferayModule.setPrimaryKey(moduleId);

		String uuid = PortalUUIDUtil.generate();

		liferayModule.setUuid(uuid);

		liferayModule.setCompanyId(CompanyThreadLocal.getCompanyId());

		return liferayModule;
	}

	/**
	 * Removes the liferay module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module that was removed
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	@Override
	public LiferayModule remove(long moduleId)
		throws NoSuchLiferayModuleException {

		return remove((Serializable)moduleId);
	}

	/**
	 * Removes the liferay module with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the liferay module
	 * @return the liferay module that was removed
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	@Override
	public LiferayModule remove(Serializable primaryKey)
		throws NoSuchLiferayModuleException {

		Session session = null;

		try {
			session = openSession();

			LiferayModule liferayModule = (LiferayModule)session.get(
				LiferayModuleImpl.class, primaryKey);

			if (liferayModule == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLiferayModuleException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(liferayModule);
		}
		catch (NoSuchLiferayModuleException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected LiferayModule removeImpl(LiferayModule liferayModule) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(liferayModule)) {
				liferayModule = (LiferayModule)session.get(
					LiferayModuleImpl.class, liferayModule.getPrimaryKeyObj());
			}

			if (liferayModule != null) {
				session.delete(liferayModule);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (liferayModule != null) {
			clearCache(liferayModule);
		}

		return liferayModule;
	}

	@Override
	public LiferayModule updateImpl(LiferayModule liferayModule) {
		boolean isNew = liferayModule.isNew();

		if (!(liferayModule instanceof LiferayModuleModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(liferayModule.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					liferayModule);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in liferayModule proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LiferayModule implementation " +
					liferayModule.getClass());
		}

		LiferayModuleModelImpl liferayModuleModelImpl =
			(LiferayModuleModelImpl)liferayModule;

		if (Validator.isNull(liferayModule.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			liferayModule.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (liferayModule.getCreateDate() == null)) {
			if (serviceContext == null) {
				liferayModule.setCreateDate(now);
			}
			else {
				liferayModule.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!liferayModuleModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				liferayModule.setModifiedDate(now);
			}
			else {
				liferayModule.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (liferayModule.isNew()) {
				session.save(liferayModule);

				liferayModule.setNew(false);
			}
			else {
				liferayModule = (LiferayModule)session.merge(liferayModule);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {liferayModuleModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				liferayModuleModelImpl.getUuid(),
				liferayModuleModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {liferayModuleModelImpl.getWorkspaceId()};

			finderCache.removeResult(_finderPathCountByWorkspaceId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByWorkspaceId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((liferayModuleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					liferayModuleModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {liferayModuleModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((liferayModuleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					liferayModuleModelImpl.getOriginalUuid(),
					liferayModuleModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					liferayModuleModelImpl.getUuid(),
					liferayModuleModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((liferayModuleModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByWorkspaceId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					liferayModuleModelImpl.getOriginalWorkspaceId()
				};

				finderCache.removeResult(_finderPathCountByWorkspaceId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByWorkspaceId, args);

				args = new Object[] {liferayModuleModelImpl.getWorkspaceId()};

				finderCache.removeResult(_finderPathCountByWorkspaceId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByWorkspaceId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, LiferayModuleImpl.class,
			liferayModule.getPrimaryKey(), liferayModule, false);

		clearUniqueFindersCache(liferayModuleModelImpl, false);
		cacheUniqueFindersCache(liferayModuleModelImpl);

		liferayModule.resetOriginalValues();

		return liferayModule;
	}

	/**
	 * Returns the liferay module with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the liferay module
	 * @return the liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	@Override
	public LiferayModule findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLiferayModuleException {

		LiferayModule liferayModule = fetchByPrimaryKey(primaryKey);

		if (liferayModule == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLiferayModuleException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return liferayModule;
	}

	/**
	 * Returns the liferay module with the primary key or throws a <code>NoSuchLiferayModuleException</code> if it could not be found.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module
	 * @throws NoSuchLiferayModuleException if a liferay module with the primary key could not be found
	 */
	@Override
	public LiferayModule findByPrimaryKey(long moduleId)
		throws NoSuchLiferayModuleException {

		return findByPrimaryKey((Serializable)moduleId);
	}

	/**
	 * Returns the liferay module with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param moduleId the primary key of the liferay module
	 * @return the liferay module, or <code>null</code> if a liferay module with the primary key could not be found
	 */
	@Override
	public LiferayModule fetchByPrimaryKey(long moduleId) {
		return fetchByPrimaryKey((Serializable)moduleId);
	}

	/**
	 * Returns all the liferay modules.
	 *
	 * @return the liferay modules
	 */
	@Override
	public List<LiferayModule> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LiferayModule> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LiferayModule> findAll(
		int start, int end,
		OrderByComparator<LiferayModule> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LiferayModule> findAll(
		int start, int end, OrderByComparator<LiferayModule> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<LiferayModule> list = null;

		if (useFinderCache) {
			list = (List<LiferayModule>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LIFERAYMODULE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LIFERAYMODULE;

				sql = sql.concat(LiferayModuleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LiferayModule>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the liferay modules from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LiferayModule liferayModule : findAll()) {
			remove(liferayModule);
		}
	}

	/**
	 * Returns the number of liferay modules.
	 *
	 * @return the number of liferay modules
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LIFERAYMODULE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "moduleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LIFERAYMODULE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LiferayModuleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the liferay module persistence.
	 */
	@Activate
	public void activate() {
		LiferayModuleModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		LiferayModuleModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			LiferayModuleModelImpl.UUID_COLUMN_BITMASK |
			LiferayModuleModelImpl.MODULENAME_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			LiferayModuleModelImpl.UUID_COLUMN_BITMASK |
			LiferayModuleModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			LiferayModuleModelImpl.UUID_COLUMN_BITMASK |
			LiferayModuleModelImpl.COMPANYID_COLUMN_BITMASK |
			LiferayModuleModelImpl.MODULENAME_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByWorkspaceId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWorkspaceId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByWorkspaceId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, LiferayModuleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWorkspaceId",
			new String[] {Long.class.getName()},
			LiferayModuleModelImpl.WORKSPACEID_COLUMN_BITMASK |
			LiferayModuleModelImpl.MODULENAME_COLUMN_BITMASK);

		_finderPathCountByWorkspaceId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByWorkspaceId",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(LiferayModuleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = FASTDEPLOYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.liferay.fast.develop.model.LiferayModule"),
			true);
	}

	@Override
	@Reference(
		target = FASTDEPLOYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FASTDEPLOYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LIFERAYMODULE =
		"SELECT liferayModule FROM LiferayModule liferayModule";

	private static final String _SQL_SELECT_LIFERAYMODULE_WHERE =
		"SELECT liferayModule FROM LiferayModule liferayModule WHERE ";

	private static final String _SQL_COUNT_LIFERAYMODULE =
		"SELECT COUNT(liferayModule) FROM LiferayModule liferayModule";

	private static final String _SQL_COUNT_LIFERAYMODULE_WHERE =
		"SELECT COUNT(liferayModule) FROM LiferayModule liferayModule WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "liferayModule.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LiferayModule exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LiferayModule exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LiferayModulePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	static {
		try {
			Class.forName(FASTDEPLOYPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}