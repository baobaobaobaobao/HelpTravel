/**
 * 
 */
package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import po.Administrator;
import service.AdminService;
import service.LoginService;

/**
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private LoginService LoginService;
	@Autowired
	private AdminService  AdminService;
	
	/*
	 * 到管理员界面
	 */
	@RequestMapping("/adminlogin")
	public ModelAndView index(HttpServletRequest request) throws Exception {
		
			
			ModelAndView modelAndView = new ModelAndView();
			
			 modelAndView.setViewName("/manage/AdminLogin");
			return modelAndView;

		}
/*登入界面和验证都写了，哈哈哈*/

}
