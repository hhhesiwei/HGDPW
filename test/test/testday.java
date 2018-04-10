package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hsw.appsys.devuser.service.DevUserService;
import hsw.appsys.entity.DevUser;

public class testday {
	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		DevUserService userService 
			= ac.getBean(DevUserService.class);
		DevUser user = userService.login("test001", "123456");
		System.out.println(user.getDevName());
	}
}
