package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Friend;
import po.FriendExample;

public interface FriendMapper {
    int countByExample(FriendExample example);

    int deleteByExample(FriendExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Friend record);

    int insertSelective(Friend record);

    List<Friend> selectByExample(FriendExample example);

    Friend selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Friend record, @Param("example") FriendExample example);

    int updateByExample(@Param("record") Friend record, @Param("example") FriendExample example);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
    //前面为我们的uidtwo，发布者id，后面为用户id
    int addMyfriendShip(@Param("uidtwo") Integer uidtwo,@Param("uidone")  Integer uidone);
}