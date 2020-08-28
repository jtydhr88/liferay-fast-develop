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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the LiferayWorkspace service. Represents a row in the &quot;FASTDEPLOY_LiferayWorkspace&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LiferayWorkspaceModel
 * @generated
 */
@ImplementationClassName(
	"com.liferay.fast.develop.model.impl.LiferayWorkspaceImpl"
)
@ProviderType
public interface LiferayWorkspace
	extends LiferayWorkspaceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.fast.develop.model.impl.LiferayWorkspaceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<LiferayWorkspace, Long> WORKSPACE_ID_ACCESSOR =
		new Accessor<LiferayWorkspace, Long>() {

			@Override
			public Long get(LiferayWorkspace liferayWorkspace) {
				return liferayWorkspace.getWorkspaceId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<LiferayWorkspace> getTypeClass() {
				return LiferayWorkspace.class;
			}

		};

}