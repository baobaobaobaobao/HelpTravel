package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Journey;
import po.JourneyExample;
import pojo.AllMyfriend;
import pojo.JourneyAndUser;

public interface JourneyMapper {
    int countByExample(JourneyExample example);

    int deleteByExample(JourneyExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(Journey record);

    int insertSelective(Journey record);

    List<Journey> selectByExample(JourneyExample example);
    List<Journey> selectAllJourney();
    Journey selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") Journey record, @Param("example") JourneyExample example);

    int updateByExample(@Param("record") Journey record, @Param("example") JourneyExample example);

    int updateByPrimaryKeySelective(Journey record);

    int updateByPrimaryKey(Journey record);
    //
    List<Journey> GetjourneyByPage(@Param("fisrtNum")Integer fisrtNum,@Param("nextNum")Integer  nextNum);

   //根据广告回复四个广告
    List<Journey> GetjourneyByAdvertisement(@Param("fisrtNum")Integer fisrtNum,@Param("nextNum")Integer  nextNum);
    
    List<JourneyAndUser> GetjourneyAndUser();
    //锁着该交游
     int   updateBlockByjid(Integer  jid);
    //解锁该交游
    int UnlockBlockByjid(Integer jid);
    /*返回我和好友共同参与的交游项目*/
    //前一个参数为好友id，后一个参数为我的id
    List<Journey> getALlMyfriendTakepartIn(@Param("uidtwo")Integer  uidtwo,@Param("uidone")Integer uidone);
}