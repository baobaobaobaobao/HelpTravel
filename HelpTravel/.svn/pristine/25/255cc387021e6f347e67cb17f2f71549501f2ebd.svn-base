/**
 * 
 */
package controller;

import java.rmi.server.UID;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import mapper.UsersMapper;
import net.sf.json.JSONObject;
import po.Users;
import pojo.ListUserAndMsg;
import pojo.UserAndMsg;
import service.UserService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/User")
public class UsersController {
	
@Autowired
private UsersMapper UsersMapper;
@Autowired
private UserService userService;

JSONObject jsonObject = new JSONObject();
ListUserAndMsg listUserAndMsg=new ListUserAndMsg();
/**
 * 
 * 编写者：鲍志强
 * 功能:页面根据id找到用户
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/GetUsersById")
@ResponseBody
public UserAndMsg GetUsersById(String message) throws Exception {
			JSONObject jsonObject = new JSONObject();
			jsonObject= JSONObject.fromObject(message);
			String IssueIdString = jsonObject.getString("IssueId");
			Integer IssueId=Integer.valueOf(IssueIdString);
			Users user=new Users();
           Users users=userService.GetUsersById(IssueId);
         UserAndMsg userAndMsg=new UserAndMsg(); 
           if(users.getUsername().equals(null)){  
               userAndMsg.setFlag("0");
               userAndMsg.setMsg("登入失败");  
        	   return  userAndMsg;
           }else{
        	   userAndMsg.setUsers(users);
               userAndMsg.setFlag("1");
               userAndMsg.setMsg("登入成功");
        	  return  userAndMsg;
           }
}
/**
 * 
 * 编写者：鲍志强
 * 功能:页面根据id找到用户
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/GetUsersMessageById")
@ResponseBody
public Users GetUsersMessageById(String message) throws Exception {
	
	
			JSONObject jsonObject = new JSONObject();
			jsonObject= JSONObject.fromObject(message);
			String uid = jsonObject.getString("uid");
			System.out.println("uid"+uid);
			Users user=new Users();
	           Users users=userService.GetUsersById(Integer.valueOf(uid));
			return users;
}

/**
 * 
 * 编写者：鲍志强
 * 功能:页面根据id找到用户
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/SearchByUsername")
@ResponseBody
public ListUserAndMsg SearchByUsername(String message) throws Exception {
	    jsonObject= JSONObject.fromObject(message);
			String Username = jsonObject.getString("Username");
			int size=userService.SearchByUsername(Username).size();
		     if(size==0){
			   listUserAndMsg.setRows(0);
		     }else{
		    	 listUserAndMsg.setRows(size);
		    	 listUserAndMsg.setUsers(userService.SearchByUsername(Username));
		     }
			return  listUserAndMsg;
  }


/**
 * 
 * 编写者：鲍志强
 * 功能:页面根据id找到用户
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/SearchBlackListByUid")
@ResponseBody
public ListUserAndMsg SearchBlackListByUid(String message) throws Exception {
	    jsonObject= JSONObject.fromObject(message);
			String uid = jsonObject.getString("uid");
			 
			int size=userService.SearchBlackListByUid(Integer.valueOf(uid)).size();
		     if(size==0){
			   listUserAndMsg.setRows(0);
		     }else{
		    	 listUserAndMsg.setRows(size);
		    	 listUserAndMsg.setUsers(userService.SearchBlackListByUid(Integer.valueOf(uid)));
		     }
			return  listUserAndMsg;
  }
/**
 * 
 * 编写者：鲍志强
 * 功能:管理员查看所有用户
 * 参数：
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/getAllUser")
@ResponseBody
public List<Users> getAllUser() throws Exception {
	
	
	  return  userService.GetAllUser();
			 
}


/**
 * 
 * 编写者：鲍志强
 * 功能:根据id封停它
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/deBlock")
@ResponseBody
public int deBlock(HttpServletRequest request) throws Exception {
			String uid = request.getParameter("uid");
			int flag=userService.deBlock(Integer.valueOf(uid));
	        if(flag==1)
	         return 1;
			return 0;
}

/**
 * 
 * 编写者：鲍志强
 * 功能:根据id解封它
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/unlockBlock")
@ResponseBody
public int unlockBlock(HttpServletRequest request) throws Exception {
			String uid = request.getParameter("uid");
			int flag=userService.UnlockBlock(Integer.valueOf(uid));
	        if(flag==1)
	            return 1;
			return 0;
}



/**
 * 
 * 编写者：鲍志强
 * 功能:根据id加分
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/praisebyid")
@ResponseBody
public int praisebyid(String  message) throws Exception {
	 jsonObject= JSONObject.fromObject(message);
		String uid = jsonObject.getString("uid");
			int flag=userService.praisebyid(Integer.valueOf(uid));
	        if(flag==1)
	            return 1;
			return 0;
}


/**
 * 
 * 编写者：鲍志强
 * 功能:根据id加分
 * 参数：id
 *返回参数：用户信息
 *日期：
 */

@RequestMapping(value = "/changeMypasswordByid")
@ResponseBody
public int changeMypasswordByid(String  message) throws Exception {
	 jsonObject= JSONObject.fromObject(message);
		String uid = jsonObject.getString("uid");
		String firstpassword= jsonObject.getString("firstpassword");
    	String newpassword=jsonObject.getString("newpassword");
    	String nextpassword=jsonObject.getString("newpassword");
		   Users users=new Users();
		   users.setUid(Integer.valueOf(uid));
		   users.setPassword(firstpassword);
		  int flag= userService.isTruePassword(users);
		  if(flag==0){
			  //原密码错误
			  return 0;
		  }else{
			  //原密码正确
			  users.setPassword(newpassword);
			  userService.changePassword(users) ;
			  return 1;
		  }
	   
			
		
}
@RequestMapping(value = "/updateUser")
@ResponseBody
public ModelAndView updateUser(HttpServletRequest request) throws Exception {
	
	        Users users=new Users();
	        users.setAddressu(request.getParameter("address"));
	        users.setEducation(request.getParameter("education"));
	        users.setName(request.getParameter("name"));
	        users.setNickname(request.getParameter("nickname"));
	        users.setQq(request.getParameter("qq"));
	        users.setTel(request.getParameter("tel"));
	        users.setUid(Integer.valueOf(request.getParameter("uid")));  
			int flag=userService.changeUser(users);
			// 返回ModelAndView
			ModelAndView modelAndView = new ModelAndView();
			 modelAndView.setViewName("/My/Myself");
			return modelAndView;
}

}
