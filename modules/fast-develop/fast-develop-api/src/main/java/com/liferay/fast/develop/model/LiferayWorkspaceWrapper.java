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
 * This class is a wrapper for {@link LiferayWorkspace}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspace
 * @generated
 */
public class LiferayWorkspaceWrapper
	extends BaseModelWrapper<LiferayWorkspace>
	implements LiferayWorkspace, ModelWrapper<LiferayWorkspace> {

	public LiferayWorkspaceWrapper(LiferayWorkspace liferayWorkspace) {
		super(liferayWorkspace);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("workspaceId", getWorkspaceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("workspaceName", getWorkspaceName());
		attributes.put("location", getLocation());
		attributes.put("buildType", getBuildType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long workspaceId = (Long)attributes.get("workspaceId");

		if (workspaceId != null) {
			setWorkspaceId(workspaceId);
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

		String workspaceName = (String)attributes.get("workspaceName");

		if (workspaceName != null) {
			setWorkspaceName(workspaceName);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String buildType = (String)attributes.get("buildType");

		if (buildType != null) {
			setBuildType(buildType);
		}
	}

	/**
	 * Returns the build type of this liferay workspace.
	 *
	 * @return the build type of this liferay workspace
	 */
	@Override
	public String getBuildType() {
		return model.getBuildType();
	}

	/**
	 * Returns the company ID of this liferay workspace.
	 *
	 * @return the company ID of this liferay workspace
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this liferay workspace.
	 *
	 * @return the create date of this liferay workspace
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this liferay workspace.
	 *
	 * @return the group ID of this liferay workspace
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the location of this liferay workspace.
	 *
	 * @return the location of this liferay workspace
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the modified date of this liferay workspace.
	 *
	 * @return the modified date of this liferay workspace
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this liferay workspace.
	 *
	 * @return the primary key of this liferay workspace
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this liferay workspace.
	 *
	 * @return the user ID of this liferay workspace
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this liferay workspace.
	 *
	 * @return the user name of this liferay workspace
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this liferay workspace.
	 *
	 * @return the user uuid of this liferay workspace
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this liferay workspace.
	 *
	 * @return the uuid of this liferay workspace
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the workspace ID of this liferay workspace.
	 *
	 * @return the workspace ID of this liferay workspace
	 */
	@Override
	public long getWorkspaceId() {
		return model.getWorkspaceId();
	}

	/**
	 * Returns the workspace name of this liferay workspace.
	 *
	 * @return the workspace name of this liferay workspace
	 */
	@Override
	public String getWorkspaceName() {
		return model.getWorkspaceName();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the build type of this liferay workspace.
	 *
	 * @param buildType the build type of this liferay workspace
	 */
	@Override
	public void setBuildType(String buildType) {
		model.setBuildType(buildType);
	}

	/**
	 * Sets the company ID of this liferay workspace.
	 *
	 * @param companyId the company ID of this liferay workspace
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this liferay workspace.
	 *
	 * @param createDate the create date of this liferay workspace
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this liferay workspace.
	 *
	 * @param groupId the group ID of this liferay workspace
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the location of this liferay workspace.
	 *
	 * @param location the location of this liferay workspace
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the modified date of this liferay workspace.
	 *
	 * @param modifiedDate the modified date of this liferay workspace
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this liferay workspace.
	 *
	 * @param primaryKey the primary key of this liferay workspace
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this liferay workspace.
	 *
	 * @param userId the user ID of this liferay workspace
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this liferay workspace.
	 *
	 * @param userName the user name of this liferay workspace
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this liferay workspace.
	 *
	 * @param userUuid the user uuid of this liferay workspace
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this liferay workspace.
	 *
	 * @param uuid the uuid of this liferay workspace
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the workspace ID of this liferay workspace.
	 *
	 * @param workspaceId the workspace ID of this liferay workspace
	 */
	@Override
	public void setWorkspaceId(long workspaceId) {
		model.setWorkspaceId(workspaceId);
	}

	/**
	 * Sets the workspace name of this liferay workspace.
	 *
	 * @param workspaceName the workspace name of this liferay workspace
	 */
	@Override
	public void setWorkspaceName(String workspaceName) {
		model.setWorkspaceName(workspaceName);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected LiferayWorkspaceWrapper wrap(LiferayWorkspace liferayWorkspace) {
		return new LiferayWorkspaceWrapper(liferayWorkspace);
	}

}