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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LiferayWorkspaceSoap implements Serializable {

	public static LiferayWorkspaceSoap toSoapModel(LiferayWorkspace model) {
		LiferayWorkspaceSoap soapModel = new LiferayWorkspaceSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setWorkspaceId(model.getWorkspaceId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setWorkspaceName(model.getWorkspaceName());
		soapModel.setLocation(model.getLocation());
		soapModel.setBuildType(model.getBuildType());

		return soapModel;
	}

	public static LiferayWorkspaceSoap[] toSoapModels(
		LiferayWorkspace[] models) {

		LiferayWorkspaceSoap[] soapModels =
			new LiferayWorkspaceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LiferayWorkspaceSoap[][] toSoapModels(
		LiferayWorkspace[][] models) {

		LiferayWorkspaceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new LiferayWorkspaceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LiferayWorkspaceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LiferayWorkspaceSoap[] toSoapModels(
		List<LiferayWorkspace> models) {

		List<LiferayWorkspaceSoap> soapModels =
			new ArrayList<LiferayWorkspaceSoap>(models.size());

		for (LiferayWorkspace model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LiferayWorkspaceSoap[soapModels.size()]);
	}

	public LiferayWorkspaceSoap() {
	}

	public long getPrimaryKey() {
		return _workspaceId;
	}

	public void setPrimaryKey(long pk) {
		setWorkspaceId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getWorkspaceId() {
		return _workspaceId;
	}

	public void setWorkspaceId(long workspaceId) {
		_workspaceId = workspaceId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getWorkspaceName() {
		return _workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		_workspaceName = workspaceName;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getBuildType() {
		return _buildType;
	}

	public void setBuildType(String buildType) {
		_buildType = buildType;
	}

	private String _uuid;
	private long _workspaceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _workspaceName;
	private String _location;
	private String _buildType;

}