/**
 * 
 */
package service;

import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import po.Journey;
import po.Users;
import pojo.AllMyfriend;
import pojo.JourneyAndUser;

/**
 * @author Administrator
 *
 */
public interface JourneyService {
    //默认获取交游条目
	public  List<Journey> GetJourney();
	//获取交游条目
	public int GetJourneyCount();
	// 根据搜索的数据来获取交游条目
	public List<Journey> GetJorneys( Journey journey);
	//根据id找到相应的交游条目信息
    public Journey GetJorneyById(Integer JId);
    //插入journey条目信息
    public int InsertJourney(Journey journey);
    //根据发布者id找到相应的交游条目信息
    public List<Journey> GetJourneyByIssueId(Integer issuerid);
    //根据接受者id找到他的交游条目信息
    public List<Journey> getJourneyByRId(Integer RId);
    //根据页数找到相应的交游信息
    public List<Journey>  GetjourneyByPage(Integer  firstNum,Integer nextNum);
    
    //四个广告
   public List<Journey> GetjourneyByAdvertisement(Integer firstNum,Integer nextNum);
   //撤销交游信息
   public int DeleteByID(Integer id);
   public int UpdateById(Journey journey);
   //默认获取交游条目有发布者信息的
  	public  List<JourneyAndUser> GetJourneyAndUsers();
  	//管理员获取所有交游条目
  	public List<Journey>   adminGetJourney();
  	//封锁该交游
  	public int lock(Integer jid);
  	
  //解锁该交游
  	public int unlock(Integer jid);
  	//得到所有朋友的参与项目
  	public List<Journey>  getALlMyfriendTakepartIn(Integer uidtwo,Integer uidone);
  	}
