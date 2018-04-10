package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hsw.appsys.devuser.service.AppVersionService;
import hsw.appsys.entity.AppVersion;

public class test001 {
	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		AppVersionService as = ac.getBean(AppVersionService.class);
		List<AppVersion> list= as.getVersionList(58);
		for (AppVersion appVersion : list) {
			System.out.println(appVersion.getApkFileName());
		}
	
	}
}
