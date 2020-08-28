create index IX_7CB0A5D8 on FASTDEPLOY_LiferayModule (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A958C25A on FASTDEPLOY_LiferayModule (uuid_[$COLUMN_LENGTH:75$], groupId);
create index IX_E7BA3E5C on FASTDEPLOY_LiferayModule (workspaceId);

create index IX_4E72BDDD on FASTDEPLOY_LiferayWorkspace (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B25B179F on FASTDEPLOY_LiferayWorkspace (uuid_[$COLUMN_LENGTH:75$], groupId);