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
	 * ��ת����½����
	 * @return
	 */
	@RequestMapping(value="devLogin",method=RequestMethod.GET)
	public String devLogin(){
		return "dev/devLogin";
	}
	/**
	 * �ж��˺������Ƿ�ƥ�� ���ƥ���ȥdev������,������ת����½���沢����������ʾ
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
		request.setAttribute("errMsg", "�û��������벻��ȷ");
		return "dev/devLogin";
	}
	/**
	 * ��ת��dev������
	 * @return
	 */
	@RequestMapping(value="/dev/devMain")
	public String devMain(){
		return "dev/devMain";
	}
	/**
	 *�˳���½ɾ��session ��ת����¼����
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
