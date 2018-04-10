package hsw.appsys.devuser.dao;

import java.util.List;
import hsw.appsys.entity.AppInfo;
import hsw.appsys.entity.AppInfoPage;

public interface AppInfoDao {
	/**
	 * ��ȡӦ������
	 * @return
	 */
	public int getAppInfoTotal(AppInfoPage appInfoPage);
	/**
	 * ��ȡӦ���б�
	 * @param appInfo
	 * @return
	 */
	List<AppInfo> getAppInfoList(AppInfoPage appInfoPage);
	/**
	 * ��ȡ����Ӧ����Ϣ
	 * @param id
	 * @return
	 */
	AppInfo getAppInfo(Integer id);
}