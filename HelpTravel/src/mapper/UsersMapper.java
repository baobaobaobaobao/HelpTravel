package mapper;

import java.util.List;

import org.apache.commons.lang.math.IntRange;
import org.apache.ibatis.annotations.Param;

import po.Users;
import po.UsersExample;

public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    List<Users>   queryblackUser(Integer uid);
    
    /*封停该用户   */
    int        updateBlockByUid(Integer uid);
    /*解封用户   */
    int       UnlockBlockByUid(Integer uid);
    /*给一个用户加分*/
    int    praisebyid(Integer uid);    
    
    List<Users>  getAllFriends(Integer uid);
}