package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Journey;
import po.Travelmessage;
import po.TravelmessageExample;
import po.Users;

public interface TravelmessageMapper {
    int countByExample(TravelmessageExample example);

    int deleteByExample(TravelmessageExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Travelmessage record);

    int insertSelective(Travelmessage record);

    List<Travelmessage> selectByExample(TravelmessageExample example);

    Travelmessage selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Travelmessage record, @Param("example") TravelmessageExample example);

    int updateByExample(@Param("record") Travelmessage record, @Param("example") TravelmessageExample example);

    int updateByPrimaryKeySelective(Travelmessage record);

    int updateByPrimaryKey(Travelmessage record);
    
    //缺省显示5条游记数据
    List<Travelmessage> DefaultGetTravelMessage(@Param("fisrtNum")Integer fisrtNum,@Param("nextNum")Integer  nextNum);
    
    /*根据pid拿到他的用户信息*/
    Users  GetUserByPid(Integer  pid);
}