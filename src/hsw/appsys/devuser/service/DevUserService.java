package hsw.appsys.devuser.service;

import hsw.appsys.entity.DevUser;

public interface DevUserService {
	/**
	 * ÓÃ»§µÇÂ½
	 * @return
	 */
	public DevUser login(String devCode,String devPassword);
	
}
