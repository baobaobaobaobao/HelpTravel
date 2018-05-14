/**
 * 
 */
package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scripting.jruby.JRubyScriptUtils.JRubyExecutionException;
import org.springframework.stereotype.Service;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import mapper.JourneyMapper;
import mapper.JreceiveMapper;
import po.Journey;
import po.JourneyExample;
import po.JourneyExample.Criteria;
import pojo.AllMyfriend;
import pojo.JourneyAndUser;
import pojo.JourneyAndUsers;
import sun.tools.jar.resources.jar;




/**
 * @author Administrator
 *
 */
@Service
public class JourneyServiceImpl implements JourneyService {
	@Autowired
	private JourneyMapper JourneyMapper;
	@Autowired
	private JreceiveMapper JreceiveMapper;
	


	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> GetJourney() {
		// TODO Auto-generated method stub
		
		//JourneyExample example=new JourneyExample();
		//Criteria criteria = example.createCriteria();
		List<Journey> list = JourneyMapper.selectAllJourney();
		System.out.println(list);
		if(null == list || list.size() ==0 ){
			System.out.println("没有数据");
			return null;
			
			}else{  
				
				System.out.println("有数据");
				return list;
				
	}

}
	/*
	 * 
	 *  编写者：
	 * 功能：返回交游数据总数
	 * 参数：无
	 *返回参数：
	 *日期：
	 */
	@Override
	public int GetJourneyCount() {
	JourneyExample example=new JourneyExample();
	Criteria criteria=example.createCriteria();
	return JourneyMapper.countByExample(example);
		
	}
	
	/*
	 * 
	 *  编写者：
	 * 功能：根据主题获取内容
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	
	@Override
	public List<Journey> GetJorneys(Journey journey) {
		// TODO Auto-generated method stub
		JourneyExample example=new JourneyExample();
		Criteria criteria=example.createCriteria();
		//System.out.print(journey.getMotif());
		criteria.andMotifEqualTo(journey.getMotif());
		List<Journey> list = JourneyMapper.selectByExample(example);
		return list;
	}
	/*
	 * 
	 *  编写者：
	 * 功能：根据id找到相应信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public Journey GetJorneyById(Integer JId) {
		// TODO Auto-generated method stub
		return	JourneyMapper.selectByPrimaryKey(JId);
		
	}
	
	/*
	 * 
	 *  编写者：
	 * 功能：插入信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int InsertJourney(Journey journey) {
		// TODO Auto-generated method stub
	int	    flag=JourneyMapper.insert(journey);
		return flag;
	}
	/*
	 * 
	 *  编写者：
	 * 功能：根据issuerid找到相应的交游信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> GetJourneyByIssueId(Integer issuerid) {
		// TODO Auto-generated method stub
		
		JourneyExample example=new JourneyExample();
		Criteria criteria=example.createCriteria();
		//System.out.print(journey.getMotif());

   criteria.andIssueridEqualTo(issuerid);
		List<Journey> list = JourneyMapper.selectByExample(example);
		return list;
		
	}
	/*
	 * 
	 *  编写者：
	 * 功能：根据接受者id找到相应的交游信息
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> getJourneyByRId(Integer RId) {
		// TODO Auto-generated method stub
		return JreceiveMapper.getJourneyByRId(RId);
	}
	/* 
	 * 编写者：鲍志强
	 * 功能：根据页数找到页数
	 * 参数：页数
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> GetjourneyByPage(Integer firstNum, Integer nextNum) {
		// TODO Auto-generated method stub
		List<Journey> journeys=new ArrayList<>();
				
		journeys=	JourneyMapper.GetjourneyByPage(firstNum, nextNum);
		System.out.println(journeys);
		return journeys;
		
	}
	/* 
	 *  编写者：鲍志强
	 * 功能：回四个广告
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> GetjourneyByAdvertisement(Integer firstNum, Integer nextNum) {
		// TODO Auto-generated method stub
	
		return JourneyMapper.GetjourneyByAdvertisement(firstNum, nextNum);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int DeleteByID(Integer id) {
		// TODO Auto-generated method stub
		return  JourneyMapper.deleteByPrimaryKey(id);
		
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int UpdateById(Journey journey) {
		// TODO Auto-generated method stub
		return 	JourneyMapper.updateByPrimaryKey(journey);
		
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<JourneyAndUser> GetJourneyAndUsers() {
		// TODO Auto-generated method stub
		return JourneyMapper.GetjourneyAndUser();
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> adminGetJourney() {
		// TODO Auto-generated method stub
	
		JourneyExample example=new JourneyExample();
		Criteria criteria=example.createCriteria();
		//System.out.print(journey.getMotif())
		return JourneyMapper.selectByExample(example);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int lock(Integer jid) {
		// TODO Auto-generated method stub
		return         JourneyMapper.updateBlockByjid(jid);
		
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int unlock(Integer jid) {
		// TODO Auto-generated method stub
		return         JourneyMapper.UnlockBlockByjid(jid);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Journey> getALlMyfriendTakepartIn(Integer uidtwo, Integer uidone) {
		// TODO Auto-generated method stub
		return JourneyMapper.getALlMyfriendTakepartIn(uidtwo, uidone);
	}

}
