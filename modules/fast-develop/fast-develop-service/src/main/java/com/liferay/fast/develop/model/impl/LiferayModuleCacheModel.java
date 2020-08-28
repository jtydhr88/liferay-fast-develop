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

package com.liferay.fast.develop.model.impl;

import com.liferay.fast.develop.model.LiferayModule;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LiferayModule in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LiferayModuleCacheModel
	implements CacheModel<LiferayModule>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiferayModuleCacheModel)) {
			return false;
		}

		LiferayModuleCacheModel liferayModuleCacheModel =
			(LiferayModuleCacheModel)obj;

		if (moduleId == liferayModuleCacheModel.moduleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, moduleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", moduleId=");
		sb.append(moduleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", moduleName=");
		sb.append(moduleName);
		sb.append(", workspaceId=");
		sb.append(workspaceId);
		sb.append(", location=");
		sb.append(location);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LiferayModule toEntityModel() {
		LiferayModuleImpl liferayModuleImpl = new LiferayModuleImpl();

		if (uuid == null) {
			liferayModuleImpl.setUuid("");
		}
		else {
			liferayModuleImpl.setUuid(uuid);
		}

		liferayModuleImpl.setModuleId(moduleId);
		liferayModuleImpl.setGroupId(groupId);
		liferayModuleImpl.setCompanyId(companyId);
		liferayModuleImpl.setUserId(userId);

		if (userName == null) {
			liferayModuleImpl.setUserName("");
		}
		else {
			liferayModuleImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			liferayModuleImpl.setCreateDate(null);
		}
		else {
			liferayModuleImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			liferayModuleImpl.setModifiedDate(null);
		}
		else {
			liferayModuleImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (moduleName == null) {
			liferayModuleImpl.setModuleName("");
		}
		else {
			liferayModuleImpl.setModuleName(moduleName);
		}

		liferayModuleImpl.setWorkspaceId(workspaceId);

		if (location == null) {
			liferayModuleImpl.setLocation("");
		}
		else {
			liferayModuleImpl.setLocation(location);
		}

		liferayModuleImpl.resetOriginalValues();

		return liferayModuleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		moduleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		moduleName = objectInput.readUTF();

		workspaceId = objectInput.readLong();
		location = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(moduleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (moduleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(moduleName);
		}

		objectOutput.writeLong(workspaceId);

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}
	}

	public String uuid;
	public long moduleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String moduleName;
	public long workspaceId;
	public String location;

}