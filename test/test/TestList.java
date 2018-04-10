package test;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import hsw.appsys.devuser.service.AppInfoService;
import hsw.appsys.entity.AppCategory;
import hsw.appsys.entity.AppInfo;
import hsw.appsys.entity.AppInfoPage;
public class TestList {
	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		AppInfoPage appInfoPage = new AppInfoPage();
		AppInfoService app= ac.getBean(AppInfoService.class);
		AppCategory appc = new AppCategory();
		appc.setId(2);
		appInfoPage.setCateLevel1(appc);
		
		List<AppInfo> list =app.getAppInfoList(appInfoPage);
		for (AppInfo appInfo : list) {
			System.out.println(appInfo.getSoftwareName());
		}
	}
}
