package hsw.appsys.devuser.service;

import hsw.appsys.entity.DevUser;

public interface DevUserService {
	/**
	 * �û���½
	 * @return
	 */
	public DevUser login(String devCode,String devPassword);
	
}
