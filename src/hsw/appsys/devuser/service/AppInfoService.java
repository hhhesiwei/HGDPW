package hsw.appsys.devuser.service;

import java.util.List;

import hsw.appsys.entity.AppInfo;
import hsw.appsys.entity.AppInfoPage;

public interface AppInfoService {
	/**
	 * 获取应用数量
	 * @return
	 */
	public int getAppInfoTotal(AppInfoPage appInfoPage);
	/**
	 * 获取应用列表
	 * @param appInfo
	 * @return
	 */
	List<AppInfo> getAppInfoList(AppInfoPage appInfoPage);
	
	/**
	 * 获取单个应用信息
	 * @param id
	 * @return
	 */
	AppInfo getAppInfo(Integer id);
}
