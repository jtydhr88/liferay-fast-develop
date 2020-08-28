create table FASTDEPLOY_LiferayModule (
	uuid_ VARCHAR(75) null,
	moduleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	moduleName VARCHAR(75) null,
	workspaceId LONG,
	location VARCHAR(500) null
);

create table FASTDEPLOY_LiferayWorkspace (
	uuid_ VARCHAR(75) null,
	workspaceId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	workspaceName VARCHAR(75) null,
	location VARCHAR(500) null,
	buildType VARCHAR(75) null
);