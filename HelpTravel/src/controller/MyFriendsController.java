/**
 * 
 */
package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import po.Users;
import pojo.AllMyfriend;
import service.JourneyService;
import service.MyFriendsService;

/**
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/MyFriends")
public class MyFriendsController {
	
	@Autowired
	 MyFriendsService myFriendsService;
	
	
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：跳转我的朋友界面
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/MyFriends")
	@ResponseBody
	 public  ModelAndView  MyPublish() throws Exception {
		// 返回ModelAndView
				ModelAndView modelAndView = new ModelAndView();
				 modelAndView.setViewName("/My/MyFriends");
				return modelAndView;
	}
	
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：返回我的朋友信息
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/getMyFriends")
	@ResponseBody
	 public  List<AllMyfriend>  MyPublish(String message) throws Exception {
		// 返回ModelAndView
		JSONObject jsonObject = new JSONObject();
		jsonObject= JSONObject.fromObject(message);
		 Integer uid =Integer.valueOf(jsonObject.getString("uid")) ;
		    
		   return myFriendsService.getAllMyFriends(uid);
	}

	
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：返回我的朋友信息
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/addMyFriendship")
	@ResponseBody
	 public int  addMyFriendship(String message) throws Exception {
		// 返回ModelAndView
		JSONObject jsonObject = new JSONObject();
		jsonObject= JSONObject.fromObject(message);
		 Integer uidone =Integer.valueOf(jsonObject.getString("uidone")) ;
		  Integer uidtwo=Integer.valueOf(jsonObject.getString("uidtwo")) ;
		   return myFriendsService.addMyfriendship(uidtwo, uidone);
	}

}
