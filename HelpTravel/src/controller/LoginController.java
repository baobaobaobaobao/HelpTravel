package controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.accessibility.internal.resources.accessibility;

import net.sf.json.JSONObject;
import po.Administrator;
import po.Users;
import pojo.UserAndMsg;
import service.AdminService;
import service.LoginService;

@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService LoginService;
	@Autowired
	private AdminService  AdminService;
	
	/**

	* 说明：登录界面

	*

	* @param  

	* @return  登录界面

	* @throws 

	*/
@RequestMapping("/index")
public ModelAndView index(HttpServletRequest request) throws Exception {
	
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		//modelAndView.addObject("itemsList", itemsList);
		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		 modelAndView.setViewName("/login/index");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		//modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}
	/**

	* 说明：验证账号，密码

	*

	* @param   message中包含账号、密码

	* @return  返回0：账号密码错误  1：账号密码正确

	* @throws 

	*/
		
@RequestMapping(value = "testUser")
@ResponseBody
public UserAndMsg testUser(String message) throws Exception {
	   String username="0000";String password="0000";
			JSONObject jsonObject = new JSONObject();
			jsonObject= JSONObject.fromObject(message);
			if(jsonObject.getString("username")==null){
				 username ="00000";
			}else{
				 username =jsonObject.getString("username");
				
			}
			if(jsonObject.getString("password")==null){
				 password ="00000";
			}else{
				
				password =jsonObject.getString("password");
			}
			
			Users user=new Users();
			user.setUsername(username);
			user.setPassword(password);
             Users users= LoginService.loginTest(user);
             UserAndMsg userAndMsg=new UserAndMsg();
             if(users==null){
            	 userAndMsg.setUsers(users);
                 userAndMsg.setFlag("0");
                 userAndMsg.setMsg("登入失败");
             }else{
            	 
             
        	   userAndMsg.setUsers(users);
               userAndMsg.setFlag("1");
               userAndMsg.setMsg("登入成功");
        	    return  userAndMsg;
           }
			return userAndMsg;   
}

		
/**
 * 
 * 编写者：鲍志强
 * 功能：登入主界面
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/main")
@ResponseBody
 public  ModelAndView  main() throws Exception {
	// 返回ModelAndView
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("/main/main");
	return modelAndView;
}
/**
 * 
 * 编写者：鲍志强
 * 功能：登入管理员登录主界面
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "admin")
@ResponseBody
 public  ModelAndView  admin() throws Exception {
	// 返回ModelAndView
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("/manage/AdminLogin");
	return modelAndView;
}
/**
 * 
 * 编写者：鲍志强
 * 功能：验证管理员账号密码
 * 参数：无
 *返回参数：无
 *日期：2-14
 */

@RequestMapping(value = "testAdmin")
@ResponseBody
public String  testAdmin(String message) throws Exception {
	
			JSONObject jsonObject = new JSONObject();
			jsonObject= JSONObject.fromObject(message);
			String username = jsonObject.getString("username");
			String password=jsonObject.getString("password");
		    System.out.println(username+password);
			Administrator administrator=new Administrator();
			administrator.setAusername(username);
			administrator.setApassword(password);
          Administrator  administrator2=AdminService.loginTest(administrator);
          if(administrator.equals(null)){
        	  return  "0";//0表示失败了，没有用户
          }
          
		return "1";
        

		}


/**
 * 
 * 编写者：鲍志强
 * 功能：登入管理员登录主界面
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/AdminMain")
@ResponseBody
 public  ModelAndView  AdminMain() throws Exception {
	// 返回ModelAndView
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("/manage/manageIndex/Manage");
	return modelAndView;
}

/**
 * 
 * 编写者：鲍志强
 * 功能：登入管理员登录主界面
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/SignOut")
@ResponseBody
 public  ModelAndView  SignOut() throws Exception {
	// 返回ModelAndView
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("/login/index");
	return modelAndView;
}


@RequestMapping(value = "registerUser")
@ResponseBody
public int registerUser(String message) throws Exception {
	   String username="0000";String password="0000";
			JSONObject jsonObject = new JSONObject();
			jsonObject= JSONObject.fromObject(message);
			if(jsonObject.getString("registerusername")==null){
				 username ="00000";
			}else{
				 username =jsonObject.getString("registerusername");
				
			}
			if(jsonObject.getString("registerpassword")==null){
				 password ="00000";
			}else{
				
				password =jsonObject.getString("registerpassword");
			}
			
			Users user=new Users();
			user.setUsername(username);
			user.setPassword(password);
            int   flag=LoginService.registerUser(user);
             
			return flag;   
}
}

