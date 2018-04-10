package hsw.appsys.devuser.dao;

import java.util.List;

import hsw.appsys.entity.AppVersion;

public interface AppVersionDao {
	List<AppVersion> getVersionList(Integer id);
}
