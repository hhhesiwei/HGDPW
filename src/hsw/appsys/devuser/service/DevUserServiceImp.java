package hsw.appsys.devuser.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hsw.appsys.devuser.dao.DevUserDao;
import hsw.appsys.entity.DevUser;
@Service
public class DevUserServiceImp implements DevUserService {
	@Autowired
	private DevUserDao userDao;
	public void setUserDao(DevUserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public DevUser login(String devCode,String devPassword) {
		DevUser user = userDao.login(devCode);
		if (null !=user) {
			if (devPassword.equals(user.getDevPassword())) {
				return user;
			}
		}
		return null;
	}
}
