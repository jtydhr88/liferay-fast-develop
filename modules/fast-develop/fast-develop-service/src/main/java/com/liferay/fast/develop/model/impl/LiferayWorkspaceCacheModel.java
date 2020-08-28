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

import com.liferay.fast.develop.model.LiferayWorkspace;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LiferayWorkspace in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LiferayWorkspaceCacheModel
	implements CacheModel<LiferayWorkspace>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiferayWorkspaceCacheModel)) {
			return false;
		}

		LiferayWorkspaceCacheModel liferayWorkspaceCacheModel =
			(LiferayWorkspaceCacheModel)obj;

		if (workspaceId == liferayWorkspaceCacheModel.workspaceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, workspaceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", workspaceId=");
		sb.append(workspaceId);
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
		sb.append(", workspaceName=");
		sb.append(workspaceName);
		sb.append(", location=");
		sb.append(location);
		sb.append(", buildType=");
		sb.append(buildType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LiferayWorkspace toEntityModel() {
		LiferayWorkspaceImpl liferayWorkspaceImpl = new LiferayWorkspaceImpl();

		if (uuid == null) {
			liferayWorkspaceImpl.setUuid("");
		}
		else {
			liferayWorkspaceImpl.setUuid(uuid);
		}

		liferayWorkspaceImpl.setWorkspaceId(workspaceId);
		liferayWorkspaceImpl.setGroupId(groupId);
		liferayWorkspaceImpl.setCompanyId(companyId);
		liferayWorkspaceImpl.setUserId(userId);

		if (userName == null) {
			liferayWorkspaceImpl.setUserName("");
		}
		else {
			liferayWorkspaceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			liferayWorkspaceImpl.setCreateDate(null);
		}
		else {
			liferayWorkspaceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			liferayWorkspaceImpl.setModifiedDate(null);
		}
		else {
			liferayWorkspaceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (workspaceName == null) {
			liferayWorkspaceImpl.setWorkspaceName("");
		}
		else {
			liferayWorkspaceImpl.setWorkspaceName(workspaceName);
		}

		if (location == null) {
			liferayWorkspaceImpl.setLocation("");
		}
		else {
			liferayWorkspaceImpl.setLocation(location);
		}

		if (buildType == null) {
			liferayWorkspaceImpl.setBuildType("");
		}
		else {
			liferayWorkspaceImpl.setBuildType(buildType);
		}

		liferayWorkspaceImpl.resetOriginalValues();

		return liferayWorkspaceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		workspaceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		workspaceName = objectInput.readUTF();
		location = objectInput.readUTF();
		buildType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(workspaceId);

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

		if (workspaceName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workspaceName);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (buildType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildType);
		}
	}

	public String uuid;
	public long workspaceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String workspaceName;
	public String location;
	public String buildType;

}