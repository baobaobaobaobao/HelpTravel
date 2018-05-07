/**
 * 
 */
package controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.bcel.internal.generic.NEW;

import net.sf.json.JSONObject;
import po.Report;
import po.Travelmessage;
import po.Users;
import pojo.ListTravelMessageAndMsg;
import service.TravelMessageService;
import sun.launcher.resources.launcher;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/TravelMessage")
public class TravelMessageController {

	@Autowired
	TravelMessageService travelMessageService;
	JSONObject jsonObject = new JSONObject();
	
	
	/*
	 * 举报交游信息
	 */
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：发布也兼具修改旅游游记
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/InsertTravelMessage")
	@ResponseBody
	public int InsertTravelMessage(String message) throws Exception {
		Travelmessage travelmessage=new  Travelmessage();
		jsonObject= JSONObject.fromObject(message);
	    travelmessage.setUid(jsonObject.getInt("uid"));
	    
	    
	    //判断是否有pid，如果为空就表示添加一条游记。不为空就是修改一条游记
	    if(Integer.valueOf(jsonObject.getString("pid"))==0){
	    	
	    	 travelmessage.setText(jsonObject.getString("TravelMessage"));
	 	    travelmessage.setTitle(jsonObject.getString("title"));
	 		return 	travelMessageService.insert(travelmessage);
	    }
	    //修改一条记录的话就简单很多了，根据pid修改
	    travelmessage.setText(jsonObject.getString("TravelMessage"));
 	    travelmessage.setTitle(jsonObject.getString("title"));
 	    travelmessage.setPid(Integer.valueOf(jsonObject.getString("pid")));
 		return 	travelMessageService.updateMessagebyid(travelmessage);
	   
	}
	
	/*
	 * 举报交游信息
	 */
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：所有游记信息
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/allMessage")
	@ResponseBody
	public ListTravelMessageAndMsg allMessage(String message) throws Exception {
		ListTravelMessageAndMsg ListTravelMessageAndMsg=new ListTravelMessageAndMsg();
		
		jsonObject= JSONObject.fromObject(message);
		ListTravelMessageAndMsg.setTravelmessages(travelMessageService.allTravelmessage(Integer.valueOf(jsonObject.getString("uid"))));
		ListTravelMessageAndMsg.setRows(travelMessageService.GetTravelMessageCount());
	     return 	ListTravelMessageAndMsg;
			
	}
	/*
	 * 举报交游信息
	 */
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：搜索
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/getMessageByid")
	@ResponseBody
	public Travelmessage getMessageByid(String message) throws Exception {
		jsonObject= JSONObject.fromObject(message);
	     return  travelMessageService.GetTravelMessagebyid(Integer.valueOf(jsonObject.getString("pid")));
			
	}
	
	
	
	/*
	 * 举报交游信息
	 */
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：default发缺省游记
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/GetDefaultTravelMessage")
	@ResponseBody
	public List<Travelmessage> GetDefaultTravelMessage(String message) throws Exception {
		 jsonObject= JSONObject.fromObject(message);
		 Random random = new Random();
		 int randomNum = Integer.valueOf(random.nextInt(5));      //r.nestInt(10)表示产生随机数的范围：0<= s <10,用集合表示s的范围就是:[0,10);
	     return travelMessageService.GetTravelmessageByAdvertisement(randomNum, randomNum+5);
			
	}
	
	/*
	 * 跳转别人游记界面
	 */
	
	/*
	 * 到管理员界面
	 */
	@RequestMapping("/hisTravelmessage")
	public ModelAndView index(HttpServletRequest request) throws Exception {
			ModelAndView modelAndView = new ModelAndView();
			 modelAndView.setViewName("/his/hisTravelMessage");
			return modelAndView;
		}
	/*
	 *    根据pid找到发表该游记的用户信息
	 */
	
	
	@RequestMapping("/GethisMessageByid")
	@ResponseBody
	public Users GethisMessageByid(String message) throws Exception {
		jsonObject= JSONObject.fromObject(message);
         String pid=jsonObject.getString("hispid");
		return travelMessageService.GetUserByPid(Integer.valueOf(pid));
		}
	
	/*
	 *    根据pid返回该游记信息
	 */
	
	
	@RequestMapping("/GetTravelMessageBypid")
	@ResponseBody
	public Travelmessage GetTravelMessageBypid(String message) throws Exception {
		jsonObject= JSONObject.fromObject(message);
         String pid=jsonObject.getString("pid");
         System.out.println(pid);
		return travelMessageService.GetTravelMessagebyid(Integer.valueOf(pid));
		}
}
