/**
 * 
 */
package service;

import java.util.List;

import po.Comment;



/**
 * @author Administrator
 *
 */
public interface CommentService {
/*
 * 插入评论
 */
	public  int insert(Comment comment);
	
	 List<pojo.AllComment> AllComment(); 
	 /*删除评论*/
	 int delete(Integer  cid);
	 /*获取关于这个交游的所有评论*/
	 List<pojo.AllComment>     GetAllCommentByJid(Integer jid);
}
