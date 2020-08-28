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
public class LiferayModuleSoap implements Serializable {

	public static LiferayModuleSoap toSoapModel(LiferayModule model) {
		LiferayModuleSoap soapModel = new LiferayModuleSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setModuleId(model.getModuleId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModuleName(model.getModuleName());
		soapModel.setWorkspaceId(model.getWorkspaceId());
		soapModel.setLocation(model.getLocation());

		return soapModel;
	}

	public static LiferayModuleSoap[] toSoapModels(LiferayModule[] models) {
		LiferayModuleSoap[] soapModels = new LiferayModuleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LiferayModuleSoap[][] toSoapModels(LiferayModule[][] models) {
		LiferayModuleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LiferayModuleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LiferayModuleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LiferayModuleSoap[] toSoapModels(List<LiferayModule> models) {
		List<LiferayModuleSoap> soapModels = new ArrayList<LiferayModuleSoap>(
			models.size());

		for (LiferayModule model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LiferayModuleSoap[soapModels.size()]);
	}

	public LiferayModuleSoap() {
	}

	public long getPrimaryKey() {
		return _moduleId;
	}

	public void setPrimaryKey(long pk) {
		setModuleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getModuleId() {
		return _moduleId;
	}

	public void setModuleId(long moduleId) {
		_moduleId = moduleId;
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

	public String getModuleName() {
		return _moduleName;
	}

	public void setModuleName(String moduleName) {
		_moduleName = moduleName;
	}

	public long getWorkspaceId() {
		return _workspaceId;
	}

	public void setWorkspaceId(long workspaceId) {
		_workspaceId = workspaceId;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	private String _uuid;
	private long _moduleId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _moduleName;
	private long _workspaceId;
	private String _location;

}