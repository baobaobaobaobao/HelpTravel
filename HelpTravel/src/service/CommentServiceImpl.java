/**
 * 
 */
package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import mapper.CommentMapper;
import po.Comment;


/**
 * @author Administrator
 *
 */
@Service
public class CommentServiceImpl implements CommentService {
@Autowired
private CommentMapper  CommentMapper;
	/* 
	 *  编写者：
	 * 功能：用户对某个交游进行评论
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		return CommentMapper.insert(comment);
		
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<pojo.AllComment> AllComment() {
		// TODO Auto-generated method stub
		return CommentMapper.allComment();
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int delete(Integer cid) {
		// TODO Auto-generated method stub
		return CommentMapper.deleteByPrimaryKey(cid);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<pojo.AllComment> GetAllCommentByJid(Integer jid) {
		// TODO Auto-generated method stub
		return CommentMapper.GetallCommentByJid(jid);
	}
	
	

}
