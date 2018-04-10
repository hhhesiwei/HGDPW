package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hsw.appsys.devuser.service.AppInfoService;
import hsw.appsys.devuser.service.DataDictionaryService;
import hsw.appsys.entity.DataDictionary;

public class TestTypeName {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		List <DataDictionary> list = ac.getBean(DataDictionaryService.class).findDicList("À˘ Ù∆ΩÃ®");
		for (DataDictionary dataDictionary : list) {
			System.out.println(dataDictionary.getValueName());
		}
	}
}
