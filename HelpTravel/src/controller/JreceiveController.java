/**
 * 
 */
package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import po.Jreceive;
import service.JourneyService;
import service.JreceiveService;
import service.MyFriendsService;
import service.UserService;

/**
 * @author Administrator
 *
 */
@Controller

@RequestMapping("/Jreceive")
public class JreceiveController {
@Autowired
JreceiveService jreceiveService;
@Autowired
MyFriendsService myFriendsService;
@Autowired
JourneyService journeyService;
Jreceive Jreceive=new Jreceive();
JSONObject jsonObject = new JSONObject();
/*
 * 参加交游
 */
@RequestMapping(value = "/TakeInJourney")
@ResponseBody
public int ReceJourney(HttpServletRequest request,String message) throws IOException{
	jsonObject= JSONObject.fromObject(message);
	
	Jreceive.setJid(Integer.valueOf(jsonObject.getString("jid")));
	Jreceive.setRid(Integer.valueOf(jsonObject.getString("uid")));
	
	//验证是否已经有了这条记录了
	if(jreceiveService.IsTakePartIn(Jreceive)==1){
		//如果有的话
		return 0;
	}else{
		jreceiveService.TakePartIn(Jreceive);
		return 1;
	}
}
}
