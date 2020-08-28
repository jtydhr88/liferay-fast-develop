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

package com.liferay.fast.develop.service.impl;

import com.liferay.fast.develop.model.LiferayWorkspace;
import com.liferay.fast.develop.service.base.LiferayWorkspaceLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the liferay workspace local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.fast.develop.service.LiferayWorkspaceLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspaceLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.fast.develop.model.LiferayWorkspace",
	service = AopService.class
)
public class LiferayWorkspaceLocalServiceImpl
	extends LiferayWorkspaceLocalServiceBaseImpl {

	public LiferayWorkspace addLiferayWorkspace(
			String liferayWorkspaceName, String buildType,
			ServiceContext serviceContext)
		throws PortalException {

		long liferayWorkspaceId = counterLocalService.increment();

		LiferayWorkspace liferayWorkspace = liferayWorkspacePersistence.create(
			liferayWorkspaceId);

		Date now = new Date();

		liferayWorkspace.setUserId(serviceContext.getUserId());
		liferayWorkspace.setCompanyId(serviceContext.getCompanyId());
		liferayWorkspace.setCreateDate(serviceContext.getCreateDate(now));
		liferayWorkspace.setModifiedDate(serviceContext.getModifiedDate(now));

		liferayWorkspace.setWorkspaceName(liferayWorkspaceName);
		liferayWorkspace.setBuildType(buildType);

		return liferayWorkspaceLocalService.updateLiferayWorkspace(
			liferayWorkspace);
	}

	public LiferayWorkspace deleteLiferayWorkspace(long workspaceId)
		throws PortalException {

		// TODO

		return super.deleteLiferayWorkspace(workspaceId);
	}

	public LiferayWorkspace updateLocation(long workspaceId, String location) {
		LiferayWorkspace liferayWorkspace =
			liferayWorkspacePersistence.fetchByPrimaryKey(workspaceId);

		liferayWorkspace.setLocation(location);

		return liferayWorkspaceLocalService.updateLiferayWorkspace(
			liferayWorkspace);
	}

}