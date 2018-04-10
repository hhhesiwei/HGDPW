package hsw.appsys.devuser.service;

import java.util.List;
import java.util.Map;
import hsw.appsys.entity.AppCategory;
public interface AppCategoryService {
	/**
	 * 查询分类
	 * @param param 
	 * @return
	 * 动态SQL的入参只能是Map或者类对象
	 * 不能是常用数据类型如String int double....
	 */
	List<AppCategory>
		findCategoryList(Map<String,Object> param);
	
}
