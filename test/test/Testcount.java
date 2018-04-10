package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hsw.appsys.devuser.service.AppInfoService;
import hsw.appsys.entity.AppInfo;
import hsw.appsys.entity.AppInfoPage;

public class Testcount {
	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		AppInfoPage appInfo = new AppInfoPage();
		AppInfoService app= ac.getBean(AppInfoService.class);
		int num = app.getAppInfoTotal(appInfo);
		System.out.println(num);
	
	}
}	
