package hsw.appsys.devuser.service;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hsw.appsys.devuser.dao.AppCategoryDao;
import hsw.appsys.entity.AppCategory;
@Service
public class AppCategoryServiceImp implements AppCategoryService{
	@Autowired
	private AppCategoryDao appCategoryDao;
	@Override
	public List<AppCategory> findCategoryList(Map<String, Object> param) {
		return appCategoryDao.findCategoryList(param);
	}
}
