/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.sun.media.sound.SoftInstrument;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import net.sf.json.JSONObject;
import po.Journey;
import po.Users;
import pojo.JourneyAndMsg;
import pojo.JourneyAndUsers;
import pojo.ListJourneyAndMsg;
import pojo.ListJourneyAndUser;
import service.JourneyService;
import service.UserService;

@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/Journey")
public class JourneyController {
@Autowired
private JourneyService JourneyService;
@Autowired
private UserService UserService;
	int TotalNum;
	JSONObject jsonObject = new JSONObject();
/**
 * 
 * 编写者：鲍志强
 * 功能：随机获取默认交游信息
 * 参数：无
 *返回参数：一个或多个交游条目信息
 *日期：2.15
 */
@RequestMapping(value = "/defaultJourney")
@ResponseBody
public JourneyAndMsg GetJourney(){
	JourneyAndMsg journeyAndMsg=new JourneyAndMsg();
	journeyAndMsg.setJourneys(JourneyService.GetJourney());
	TotalNum=JourneyService.GetJourney().size();
	journeyAndMsg.setRows(JourneyService.GetJourneyCount());
	return  journeyAndMsg;
}

/**
 * 
 * 编写者：鲍志强
 * 功能：登入搜索界面
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/search")
@ResponseBody
 public  ModelAndView  main() throws Exception {
	// 返回ModelAndView
			ModelAndView modelAndView = new ModelAndView();
			 modelAndView.setViewName("/main/search");
			return modelAndView;

}
/**
 * 
 * 编写者：
 * 功能：返回搜索交游信息
 * 参数：
 *返回参数：
 *日期：
 */
@RequestMapping(value = "/GetJourney")
@ResponseBody
public JourneyAndMsg GetJourneys(String message){
	
	
	jsonObject= JSONObject.fromObject(message);
	String searchContent = jsonObject.getString("searchContent");
	String msg=jsonObject.getString("msg");
    //System.out.println(searchContent+msg);
	Journey journey=new Journey();
	journey.setMotif(searchContent);
	JourneyAndMsg journeyAndMsg=new JourneyAndMsg();
	journeyAndMsg.setJourneys(JourneyService.GetJorneys(journey));
	journeyAndMsg.setRows(JourneyService.GetJorneys(journey).size());
	System.out.println(journeyAndMsg);
	return  journeyAndMsg;
}

/**
 * 
 * 编写者：
 * 功能：通过jid获得交游信息
 * 参数：JId
 *返回参数：
 *日期：
 * @throws Exception 
 */
@RequestMapping(value = "/GetJourneyById")
@ResponseBody
public JourneyAndUsers GetJourneyById(String message) throws Exception{
	JSONObject jsonObject = new JSONObject();
	jsonObject= JSONObject.fromObject(message);
	String jidString = jsonObject.getString("jid");
	Integer  jid=Integer.valueOf(jidString);
   
	Journey journey=new Journey();
	journey=	JourneyService.GetJorneyById(jid);
	JourneyAndUsers journeyAndUsers=new JourneyAndUsers();
	journeyAndUsers.setJourney(journey);
	journeyAndUsers.setUsers(UserService.GetUsersById(journey.getIssuerid()));
	return journeyAndUsers;
}
/**
 * 
 * 编写者：
 * 功能：跳到任务详情页面
 * 参数：
 *返回参数：
 *日期：
 */

@RequestMapping(value = "/GetJourneyDetail")
@ResponseBody
public ModelAndView GetJourneyDetail(){
	// 返回ModelAndView
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("/main/JourneyDetail");
	return modelAndView;
}

/**
 * 
 * 编写者：
 * 功能：跳到发布交游信息
 * 参数：
 *返回参数：
 *日期：
 */

@RequestMapping(value = "/GetJourneyPublish")
@ResponseBody
public ModelAndView GetJourneyPublish(){
	// 返回ModelAndView
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("/main/Publish");
	return modelAndView;
}

/**
 * 
 * 编写者：
 * 功能：根据发布者id找到交游信息
 * 参数：issueid
 *返回参数：多条交游记录
 *日期：2.18
 */
@RequestMapping(value = "/GetJourneyByIssueId")
@ResponseBody
public ListJourneyAndMsg GetJourneyByIssueId(String  message) throws IOException{
	
	JSONObject jsonObject = new JSONObject();
	jsonObject= JSONObject.fromObject(message);
	String issueridString = jsonObject.getString("issuerid");
	Integer issuerid=Integer.valueOf(issueridString);
	String msg=jsonObject.getString("msg");
    //System.out.println(searchContent+msg);
	
	ListJourneyAndMsg listJourneyAndMsg=new ListJourneyAndMsg();
	listJourneyAndMsg.setJourneys(JourneyService.GetJourneyByIssueId(issuerid));
	listJourneyAndMsg.setRows(JourneyService.GetJourneyByIssueId(issuerid).size());
	
	return  listJourneyAndMsg;
}


/**
 * 
 * 编写者：
 * 功能：根据发布者id找到交游信息
 * 参数：issueid
 *返回参数：多条交游记录
 *日期：2.18
 */
@RequestMapping(value = "/getJourneyByRId")
@ResponseBody
public ListJourneyAndMsg getJourneyByRId(String  message) throws IOException{
	
	JSONObject jsonObject = new JSONObject();
	jsonObject= JSONObject.fromObject(message);
	String RIdString = jsonObject.getString("RId");
	Integer RId=Integer.valueOf(RIdString);
	String msg=jsonObject.getString("msg");
   // System.out.println("发布者id"+RIdString+msg);
	ListJourneyAndMsg listJourneyAndMsg=new ListJourneyAndMsg();
	listJourneyAndMsg.setJourneys(JourneyService.getJourneyByRId(RId));
	listJourneyAndMsg.setRows(JourneyService.getJourneyByRId(RId).size());
	//TotalNum=JourneyService.getJourneyByRId(RId).size();
	return  listJourneyAndMsg;
}




/**
 * 
 * 编写者：
 * 功能：根据页数找到交游信息
 * 参数：
 *返回参数：多条交游记录
 *日期：2.18
 */
@RequestMapping(value = "/GetjourneyByPage")
@ResponseBody
public ListJourneyAndMsg GetjourneyByPage(String  message) throws IOException{
	
	JSONObject jsonObject = new JSONObject();
	jsonObject= JSONObject.fromObject(message);
	String paginationNumString = jsonObject.getString("paginationNum");
	Integer paginationNum=Integer.valueOf(paginationNumString);
	String msg=jsonObject.getString("msg");
   // System.out.println("发布者id"+RIdString+msg);
	int pageBegin;
	int pageEnd;
	pageBegin =  paginationNum<=1 ?0 :(paginationNum-1)*10;
	pageEnd = paginationNum * 10 > TotalNum?TotalNum:pageBegin + 10- 1;
	System.out.println(pageBegin+"              "+pageEnd);
	ListJourneyAndMsg listJourneyAndMsg=new ListJourneyAndMsg();
	listJourneyAndMsg.setJourneys(JourneyService.GetjourneyByPage(pageBegin,10));
	listJourneyAndMsg.setRows(JourneyService.GetJourneyCount());
	//System.out.println(listJourneyAndMsg);
	return listJourneyAndMsg;
	//return  listJourneyAndMsg;
}
/*
 * 插入一条交游数据
 */

@RequestMapping(value = "/InsertJourneyTest")  
@ResponseBody  
public  ModelAndView  InsertJourneyTest(HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException {  
     //把带二进制表单数据的request对象交给spring转换 得到一个文件和普通数据分开的新request对象  
    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;  
    Journey journey=new Journey();
    // 获取from表单参数  
   journey.setMotif(multipartRequest.getParameter("motif"));
   journey.setAddress(multipartRequest.getParameter("address"));
   journey.setReward(Integer.valueOf(multipartRequest.getParameter("reward")));
    journey.setMaxquantity(Integer.valueOf(multipartRequest.getParameter("maxquantity")));
   journey.setExecutetime(multipartRequest.getParameter("executetime"));
   journey.setIssuerid(Integer.valueOf( multipartRequest.getParameter("issuerid")));
    journey.setIssuetime( multipartRequest.getParameter("issuetime"));
    journey.setTotime(multipartRequest.getParameter("totime"));
    //默认插入为未封停状态
    journey.setAstate(0);
        //获得Request中的图片 photo 是from表单文件的name  
   MultipartFile file = (MultipartFile) multipartRequest.getFile("photo");     
    //System.out.println("这是图片"+file);
   
    if(file != null && file.getOriginalFilename() != null && file.getOriginalFilename().length()>0){  
        //图片服务器路径  
         String file_path = "D:\\tomcat\\MyJourney\\"; 
         
        String originalFileName = file.getOriginalFilename();  
        //新文件名，添加原始文件名后缀  
        String newFileName =UUID.randomUUID()+originalFileName.substring(originalFileName.lastIndexOf("."));  
        File newFile = new File(file_path+ newFileName);  
        file.transferTo(newFile);  
        journey.setRequest(newFileName);
   }  
    Map<String, String> map = new HashMap<String, String>(); 
   ModelAndView modelAndView=new ModelAndView();
	if(JourneyService.InsertJourney(journey)==0){
		modelAndView.setViewName("/main/Publish");
		return modelAndView;
   }else{
	   modelAndView.setViewName("/My/MyPublish");
    	return  modelAndView;
}	
  
}



/**
 * 
 * 编写者：
 * 功能：随机显示四条广告
 * 参数：
 *返回参数：多条交游记录
 *日期：2.18
 */
@RequestMapping(value = "/GetjourneyByAdvertisement")
@ResponseBody
public ListJourneyAndMsg GetjourneyByAdvertisement() throws IOException{
	
	
	ListJourneyAndMsg listJourneyAndMsg=new ListJourneyAndMsg();
	listJourneyAndMsg.setJourneys(JourneyService.GetjourneyByPage(1, 4));
	listJourneyAndMsg.setRows(4);
	
	listJourneyAndMsg.setMsg("四条广告在此");
	return listJourneyAndMsg;
	//return  listJourneyAndMsg;
}
/**
 * 
 * 编写者：
 * 功能：拿到一些交游图片
 * 参数：
 *返回参数：多条交游记录
 *日期：2.18
 */
@RequestMapping(value = "/GetjourneyImg")
@ResponseBody
public void GetjourneyImg(HttpServletResponse response,HttpServletRequest request) throws IOException{
	

	String UUIDString=request.getParameter("UUIDString");
	// = jsonObject.getString("UUIDString");
	
	//应该是jid的
	//String path=""D:/tomcat/MyJourney/"+id+".jpg";
	 try{
	        FileInputStream fis = new FileInputStream("D:/tomcat/MyJourney/"+UUIDString); // 以byte流的方式打开文件 d:\1.gif   
	            int i=fis.available(); //得到文件大小   
	            byte data[]=new byte[i];   
	            fis.read(data);  //读数据   
	            response.setContentType("image/*"); //设置返回的文件类型   
	            OutputStream toClient=response.getOutputStream(); //得到向客户端输出二进制数据的对象   
	            toClient.write(data);  //输出数据   
	            toClient.flush();  
	            toClient.close();   
	            fis.close();
	        }catch(Exception e){
	        e.printStackTrace();
	        System.out.println("图片不存在");
	        }
	 
}

/**
 * 
 * 编写者：
 * 功能：撤销交游信息
 * 参数：
 *返回参数：
 *日期：2.18
 */
@RequestMapping(value = "/DelteteByID")
@ResponseBody
public void DeleteByID(HttpServletRequest request,String message) throws IOException{
	jsonObject= JSONObject.fromObject(message);
	//String paginationNumString = jsonObject.getString("paginationNum");
	//System.out.println(jsonObject.getString("id"));
	  JourneyService.DeleteByID(Integer.valueOf(jsonObject.getString("id")==null?"0000":jsonObject.getString("id")));
	//return  listJourneyAndMsg;
}
/*
 * 跳转更新交游信息界面
 */
@RequestMapping(value = "/updateModel")
@ResponseBody
public ModelAndView updateModel() throws IOException{
	ModelAndView modelAndView = new ModelAndView();
	 modelAndView.setViewName("/main/Publish");
	return modelAndView;
}


/*
 * 修改交游条目
 */
@RequestMapping(value = "/UpdateJourney")
@ResponseBody
public ModelAndView UpdateJourney(Journey journey) throws IOException{
	System.out.println(journey);
	int  flag=JourneyService.UpdateById(journey);
	ModelAndView modelAndView = new ModelAndView();
	 modelAndView.setViewName("/My/MyPublish");
	return modelAndView;
}

/*
 * 参与交游条目
 */
@RequestMapping(value = "/ReceJourney")
@ResponseBody
public ModelAndView ReceJourney(HttpServletRequest request) throws IOException{
	
	
	 ModelAndView modelAndView = new ModelAndView();
	 modelAndView.setViewName("/My/MyPublish");
	return modelAndView;
}


/**
 * 
 * 编写者：鲍志强
 * 功能：随机获取默认交游信息
 * 参数：无
 *返回参数：一个或多个交游条目信息
 *日期：2.15
 */
@RequestMapping(value = "/defaultJourneyAndUser")
@ResponseBody
public ListJourneyAndUser defaultJourneyAndUser(){
	
	ListJourneyAndUser ListjourneyAndMsg=new ListJourneyAndUser();
	ListjourneyAndMsg.setJourneys(JourneyService.GetJourneyAndUsers());
	ListjourneyAndMsg.setRows(JourneyService.GetJourneyAndUsers().size());
	
	return  ListjourneyAndMsg;
}

/**
 * 
 * 编写者：鲍志强
 * 功能：管理员获取所有交游信息
 * 参数：无
 *返回参数：一个或多个交游条目信息
 *日期：2.15
 */
@RequestMapping(value = "/adminGetAllJourney")
@ResponseBody
public List<Journey> adminGetAllJourney(){
	return  JourneyService.adminGetJourney();
}

/**
 * 
 * 编写者：鲍志强
 * 功能：管理员封停交游信息
 * 参数：无
 *返回参数：一个或多个交游条目信息
 *日期：2.15
 */
@RequestMapping(value = "/adminLockJourney")
@ResponseBody
public  int adminLockJourney(HttpServletRequest request){
	
	  String jid=request.getParameter("jid");
	  
	return  JourneyService.lock(Integer.valueOf(jid));
}

/**
 * 
 * 编写者：鲍志强
 * 功能：管理员封停交游信息
 * 参数：无
 *返回参数：一个或多个交游条目信息
 *日期：2.15
 */
@RequestMapping(value = "/adminUnLockJourney")
@ResponseBody
public  int adminUnLockJourney(HttpServletRequest request){
	
	  String jid=request.getParameter("jid");
	  
	return  JourneyService.unlock(Integer.valueOf(jid));
}
}

