package hsw.appsys.devuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hsw.appsys.devuser.dao.AppInfoDao;
import hsw.appsys.entity.AppInfo;
import hsw.appsys.entity.AppInfoPage;

@Service
public class AppInfoServiceImp implements AppInfoService{
	@Autowired
	private AppInfoDao appInfoDao;
	
	public void setAppInfoDao(AppInfoDao appInfoDao) {
		this.appInfoDao = appInfoDao;
	}

	@Override
	public int getAppInfoTotal(AppInfoPage appInfoPage) {
		return appInfoDao.getAppInfoTotal(appInfoPage);
	}

	@Override
	public List<AppInfo> getAppInfoList(AppInfoPage appInfoPage) {
		return appInfoDao.getAppInfoList(appInfoPage);
	}

	@Override
	public AppInfo getAppInfo(Integer id) {
		return appInfoDao.getAppInfo(id);
	}
}
