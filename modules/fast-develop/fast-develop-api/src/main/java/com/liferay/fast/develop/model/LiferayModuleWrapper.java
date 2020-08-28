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

package com.liferay.fast.develop.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LiferayModule}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayModule
 * @generated
 */
public class LiferayModuleWrapper
	extends BaseModelWrapper<LiferayModule>
	implements LiferayModule, ModelWrapper<LiferayModule> {

	public LiferayModuleWrapper(LiferayModule liferayModule) {
		super(liferayModule);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("moduleId", getModuleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("moduleName", getModuleName());
		attributes.put("workspaceId", getWorkspaceId());
		attributes.put("location", getLocation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long moduleId = (Long)attributes.get("moduleId");

		if (moduleId != null) {
			setModuleId(moduleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String moduleName = (String)attributes.get("moduleName");

		if (moduleName != null) {
			setModuleName(moduleName);
		}

		Long workspaceId = (Long)attributes.get("workspaceId");

		if (workspaceId != null) {
			setWorkspaceId(workspaceId);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}
	}

	/**
	 * Returns the company ID of this liferay module.
	 *
	 * @return the company ID of this liferay module
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this liferay module.
	 *
	 * @return the create date of this liferay module
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this liferay module.
	 *
	 * @return the group ID of this liferay module
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this liferay module.
	 *
	 * @return the location of this liferay module
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this liferay module.
	 *
	 * @return the modified date of this liferay module
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the module ID of this liferay module.
	 *
	 * @return the module ID of this liferay module
	 */
	@Override
	public long getModuleId() {
		return model.getModuleId();
	}

	/**
	 * Returns the module name of this liferay module.
	 *
	 * @return the module name of this liferay module
	 */
	@Override
	public String getModuleName() {
		return model.getModuleName();
	}

	/**
	 * Returns the primary key of this liferay module.
	 *
	 * @return the primary key of this liferay module
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this liferay module.
	 *
	 * @return the user ID of this liferay module
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this liferay module.
	 *
	 * @return the user name of this liferay module
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this liferay module.
	 *
	 * @return the user uuid of this liferay module
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this liferay module.
	 *
	 * @return the uuid of this liferay module
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the workspace ID of this liferay module.
	 *
	 * @return the workspace ID of this liferay module
	 */
	@Override
	public long getWorkspaceId() {
		return model.getWorkspaceId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this liferay module.
	 *
	 * @param companyId the company ID of this liferay module
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this liferay module.
	 *
	 * @param createDate the create date of this liferay module
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this liferay module.
	 *
	 * @param groupId the group ID of this liferay module
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this liferay module.
	 *
	 * @param location the location of this liferay module
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this liferay module.
	 *
	 * @param modifiedDate the modified date of this liferay module
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the module ID of this liferay module.
	 *
	 * @param moduleId the module ID of this liferay module
	 */
	@Override
	public void setModuleId(long moduleId) {
		model.setModuleId(moduleId);
	}

	/**
	 * Sets the module name of this liferay module.
	 *
	 * @param moduleName the module name of this liferay module
	 */
	@Override
	public void setModuleName(String moduleName) {
		model.setModuleName(moduleName);
	}

	/**
	 * Sets the primary key of this liferay module.
	 *
	 * @param primaryKey the primary key of this liferay module
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this liferay module.
	 *
	 * @param userId the user ID of this liferay module
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this liferay module.
	 *
	 * @param userName the user name of this liferay module
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this liferay module.
	 *
	 * @param userUuid the user uuid of this liferay module
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this liferay module.
	 *
	 * @param uuid the uuid of this liferay module
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the workspace ID of this liferay module.
	 *
	 * @param workspaceId the workspace ID of this liferay module
	 */
	@Override
	public void setWorkspaceId(long workspaceId) {
		model.setWorkspaceId(workspaceId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected LiferayModuleWrapper wrap(LiferayModule liferayModule) {
		return new LiferayModuleWrapper(liferayModule);
	}

}