package hsw.appsys.devuser.service;

import java.util.List;
import java.util.Map;
import hsw.appsys.entity.AppCategory;
public interface AppCategoryService {
	/**
	 * ��ѯ����
	 * @param param 
	 * @return
	 * ��̬SQL�����ֻ����Map���������
	 * �����ǳ�������������String int double....
	 */
	List<AppCategory>
		findCategoryList(Map<String,Object> param);
	
}
