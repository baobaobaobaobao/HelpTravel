package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import po.Journeytypes;
import po.JourneytypesExample;

public interface JourneytypesMapper {
    int countByExample(JourneytypesExample example);

    int deleteByExample(JourneytypesExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Journeytypes record);

    int insertSelective(Journeytypes record);

    List<Journeytypes> selectByExample(JourneytypesExample example);

    Journeytypes selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Journeytypes record, @Param("example") JourneytypesExample example);

    int updateByExample(@Param("record") Journeytypes record, @Param("example") JourneytypesExample example);

    int updateByPrimaryKeySelective(Journeytypes record);

    int updateByPrimaryKey(Journeytypes record);
}