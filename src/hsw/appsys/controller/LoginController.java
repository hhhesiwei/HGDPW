package hsw.appsys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import hsw.appsys.devuser.service.DevUserService;
import hsw.appsys.entity.DevUser;
import hsw.appsys.util.Constains;
@Controller
public class LoginController {
	@Autowired
	private DevUserService devUserService;
	
	public void setDevUserService(DevUserService devUserService) {
		this.devUserService = devUserService;
	}
	/**
	 * 跳转到登陆界面
	 * @return
	 */
	@RequestMapping(value="devLogin",method=RequestMethod.GET)
	public String devLogin(){
		return "dev/devLogin";
	}
	/**
	 * 判断账号密码是否匹配 如果匹配进去dev主界面,否则跳转到登陆界面并给出错误提示
	 * @param devCode
	 * @param devPassword
	 * @param request
	 * @return
	 */
	@RequestMapping(value="devLogin",method=RequestMethod.POST)
	public String devLogin(String devCode,String devPassword,HttpServletRequest request){
		DevUser user = devUserService.login(devCode, devPassword);
		if (null != user) {
			request.getSession().setAttribute(Constains.USER_SEESION, user);
			return "redirect:/dev/devMain";
		}
		request.setAttribute("errMsg", "用户名或密码不正确");
		return "dev/devLogin";
	}
	/**
	 * 跳转到dev主界面
	 * @return
	 */
	@RequestMapping(value="/dev/devMain")
	public String devMain(){
		return "dev/devMain";
	}
	/**
	 *退出登陆删除session 跳转到登录界面
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/dev/devLogout")
	public String devLogout(HttpServletRequest request){
		request.getSession().removeAttribute(Constains.USER_SEESION);
		return "dev/devLogin";
	}
	@RequestMapping(value="dev/devAppList")
	public String devAppList(){
		return "dev/devAppList";
	}
	@RequestMapping(value="dev/devAppView")
	public String devAppView(){
		return "dev/devAppView";
	}
}
