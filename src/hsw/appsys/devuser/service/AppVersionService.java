package hsw.appsys.devuser.service;

import java.util.List;

import hsw.appsys.entity.AppVersion;

public interface AppVersionService {
	List<AppVersion> getVersionList(Integer id);
}
