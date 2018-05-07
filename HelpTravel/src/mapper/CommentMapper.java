package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Comment;
import po.CommentExample;
import pojo.AllComment;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
    /*获取所有评论*/
    List<AllComment>    allComment();
    /*根据交游获取他的所有评论*/
     List<AllComment>   GetallCommentByJid(Integer jid);
    }