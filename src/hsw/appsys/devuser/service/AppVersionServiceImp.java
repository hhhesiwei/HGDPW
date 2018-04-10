package hsw.appsys.devuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hsw.appsys.devuser.dao.AppVersionDao;
import hsw.appsys.entity.AppVersion;
@Service
public class AppVersionServiceImp implements AppVersionService {
	@Autowired
	private  AppVersionDao appVersionDao;
	public void setAppVersionDao(AppVersionDao appVersionDao) {
		this.appVersionDao = appVersionDao;
	}
	@Override
	public List<AppVersion> getVersionList(Integer id) {
		return appVersionDao.getVersionList(id);
	}

}
