package hsw.appsys.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONArray;
import hsw.appsys.devuser.service.AppCategoryService;
import hsw.appsys.devuser.service.AppInfoService;
import hsw.appsys.devuser.service.AppVersionService;
import hsw.appsys.devuser.service.DataDictionaryService;
import hsw.appsys.entity.AppCategory;
import hsw.appsys.entity.AppInfo;
import hsw.appsys.entity.AppInfoPage;
import hsw.appsys.entity.AppVersion;
import hsw.appsys.entity.DataDictionary;
import hsw.appsys.entity.DevUser;
import hsw.appsys.util.Constains;

@Controller
public class AjaxController {
	@Autowired
	private DataDictionaryService dataDictionaryService;
	@Autowired
	private AppCategoryService appCategoryService;
	@Autowired
	private AppInfoService appInfoService;
	@Autowired
	private AppVersionService appVersionService;
	
	public void setAppVersionService(AppVersionService appVersionService) {
		this.appVersionService = appVersionService;
	}
	public void setAppCategoryService(AppCategoryService appCategoryService) {
		this.appCategoryService = appCategoryService;
	}
	public void setDataDictionaryService(DataDictionaryService dataDictionaryService) {
		this.dataDictionaryService = dataDictionaryService;
	}
	
	public void setAppInfoService(AppInfoService appInfoService) {
		this.appInfoService = appInfoService;
	}
	@RequestMapping(value="/dev/getDicList",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Object getDicList(String typeCode){
		List<DataDictionary> dataDictionaryList = dataDictionaryService.findDicList(typeCode);
		Object result = JSONArray.toJSONString(dataDictionaryList);
		return result;
	}
	@RequestMapping(value="/dev/getCategoryList/{id}",method=RequestMethod.GET,produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Object getCategoryList(@PathVariable("id") String parentId){
		Map<String, Object> param = new HashMap<String,Object>();
			if (null !=parentId &&!"0".equals(parentId)){ 
				param.put("parentId", parentId);
			}
		List<AppCategory> cateList = appCategoryService.findCategoryList(param);
		Object result = JSONArray.toJSONString(cateList);
		return result;
	}
	@RequestMapping(value="/dev/getAppInfoList")
	public String getAppInfoList(AppInfoPage appInfoPage,HttpServletRequest request){
		DevUser loginUser = 
				(DevUser) request.getSession().getAttribute(Constains.USER_SEESION);
		appInfoPage.setDevId(loginUser.getId());
		if (appInfoPage.getSoftwareName().equals("\'\'")) {
			appInfoPage.setSoftwareName(null);
		}
		int pageRows = 5;
		int pageNow = 1;
		if (request.getParameter("pageNow") != null) {
			pageNow = Integer.valueOf(request.getParameter("pageNow"));
			if (pageNow ==0) {
				appInfoPage.setStartIndex(0);
			}else{
				appInfoPage.setStartIndex((pageNow-1)*pageRows);
			}
		
		}else{
			appInfoPage.setStartIndex(0);
		}
		appInfoPage.setPageRows(pageRows);
		//总记录数
		int count = appInfoService.getAppInfoTotal(appInfoPage);
		//总页数
		int pageCount = (int) Math.ceil(1.0*count / pageRows);
		List<AppInfo> appList = appInfoService.getAppInfoList(appInfoPage);
		request.setAttribute("appList", appList);//设置APP信息列表
		request.setAttribute("pageNow", pageNow);//设置当前页数
		request.setAttribute("pageCount", pageCount);//设置总页数
		request.setAttribute("fromIndex", (pageNow-1)*pageRows);
		request.setAttribute("endIndex", pageNow*pageRows);
		request.setAttribute("aig", appInfoPage);
		return "/dev/devAppList";
	}
	@RequestMapping(value="/dev/getAppInfo/{id}")
	public String getAppInfo(@PathVariable("id") Integer id,HttpServletRequest request){
		AppInfo appInfo = appInfoService.getAppInfo(id);
		List<AppVersion> appVersionsList =appVersionService.getVersionList(id);
		for (AppVersion appVersion : appVersionsList) {
			System.out.println(appVersion.getApkFileName());
		}
		request.setAttribute("appVersionsList", appVersionsList);
		request.setAttribute("appInfo", appInfo);
		return "dev/devAppView";
	}
}
