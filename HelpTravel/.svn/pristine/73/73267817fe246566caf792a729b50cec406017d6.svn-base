/**
 * 
 */
package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.TravelmessageMapper;
import po.JourneyExample;
import po.Report;
import po.Travelmessage;
import po.TravelmessageExample;
import po.TravelmessageExample.Criteria;
import po.Users;

/**
 * @author Administrator
 *
 */
@Service
public class TravelMessageServiceImpl implements TravelMessageService {

	@Autowired
	TravelmessageMapper travelmessageMapper;
	
	
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int insert(Travelmessage travelmessage) {
		// TODO Auto-generated method stub
		TravelmessageExample travelmessageExample=new TravelmessageExample();
		Criteria criteria=travelmessageExample.createCriteria();
		return travelmessageMapper.insert(travelmessage);
	}
	/* 
	 *  编写者：
	 * 功能：获取所有游记
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Travelmessage> allTravelmessage(Integer uid) {
		TravelmessageExample travelmessageExample=new TravelmessageExample();
		Criteria criteria=travelmessageExample.createCriteria();
		criteria.andUidEqualTo(uid);
		return travelmessageMapper.selectByExample(travelmessageExample);
	}
	/* 
	 *  编写者：
	 * 功能：获取游记总数
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int GetTravelMessageCount() {
		// TODO Auto-generated method stub
		TravelmessageExample travelmessageExample=new TravelmessageExample();
		Criteria criteria=travelmessageExample.createCriteria();
		return travelmessageMapper.countByExample(travelmessageExample);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public Travelmessage GetTravelMessagebyid(Integer pid) {
		// TODO Auto-generated method stub
		TravelmessageExample travelmessageExample=new TravelmessageExample();
		Criteria criteria=travelmessageExample.createCriteria();
		criteria.andUidEqualTo(pid);
		
		return travelmessageMapper.selectByPrimaryKey(pid);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int updateMessagebyid(Travelmessage travelmessage) {
		// TODO Auto-generated method stu
		return travelmessageMapper.updateByPrimaryKey(travelmessage);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Travelmessage> GetTravelmessageByAdvertisement(Integer firstNum, Integer nextNum) {
		// TODO Auto-generated method stub
		return travelmessageMapper.DefaultGetTravelMessage(firstNum, nextNum);
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public Users GetUserByPid(Integer pid) {
		// TODO Auto-generated method stub
		return travelmessageMapper.GetUserByPid(pid);
	}

}
