package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Journey;
import po.Jreceive;
import po.JreceiveExample;

public interface JreceiveMapper {
    int countByExample(JreceiveExample example);

    int deleteByExample(JreceiveExample example);

    int deleteByPrimaryKey(Integer jrid);

    int insert(Jreceive record);

    int insertSelective(Jreceive record);

    List<Jreceive> selectByExample(JreceiveExample example);

    Jreceive selectByPrimaryKey(Integer jrid);

    int updateByExampleSelective(@Param("record") Jreceive record, @Param("example") JreceiveExample example);

    int updateByExample(@Param("record") Jreceive record, @Param("example") JreceiveExample example);

    int updateByPrimaryKeySelective(Jreceive record);

    int updateByPrimaryKey(Jreceive record);
    List<Journey> getJourneyByRId(Integer RId);
}