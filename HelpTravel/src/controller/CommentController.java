/**
 * 
 */
package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;
import po.Comment;
import po.Journey;
import pojo.AllComment;
import pojo.JourneyAndMsg;
import service.CommentService;

@Controller
@RequestMapping("/Comment")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	/**
	 * 
	 * 编写者：
	 * 功能：插入评论信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@RequestMapping(value = "/InsertComment")
	@ResponseBody
	public int GetJourneys(String message){
		
		JSONObject jsonObject=new JSONObject();
		jsonObject= JSONObject.fromObject(message);
		String jid = jsonObject.getString("jid");
		String uid=jsonObject.getString("uid");
		String comment=jsonObject.getString("comment");
		Comment comments=new Comment();
		comments.setJid(Integer.valueOf(jid));
		comments.setCform(Integer.valueOf(uid));
		comments.setContent(comment);
	    //System.out.println(searchContent+msg);
		
		return  commentService.insert(comments);
	}
	
	
	/**
	 * 
	 * 编写者：
	 * 功能：返回所有评论信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@RequestMapping(value = "/AllComment")
	@ResponseBody
	public List<AllComment> GetJourneys(){
		
		
		
		return  commentService.AllComment();
	}
	
	/**
	 * 
	 * 编写者：
	 * 功能：删除评论信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@RequestMapping(value = "/deleteComment")
	@ResponseBody
	public int deleteComment(HttpServletRequest request){
		
		String cid=request.getParameter("cid");
		
		return  commentService.delete(Integer.valueOf(cid));
	}
	
	/**
	 * 
	 * 编写者：
	 * 功能：根据交游获取所有评论
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@RequestMapping(value = "/GetAllCommentByJid")
	@ResponseBody
	public  List<AllComment> GetAllCommentByJid(String message){
		
		JSONObject jsonObject=new JSONObject();
		jsonObject= JSONObject.fromObject(message);
		String jid = jsonObject.getString("jid");
		
		return  commentService.GetAllCommentByJid(Integer.valueOf(jid));
	}

}
