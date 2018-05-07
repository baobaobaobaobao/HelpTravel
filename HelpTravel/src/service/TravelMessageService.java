/**
 * 
 */
package service;

import java.util.List;

import po.Journey;
import po.Travelmessage;
import po.Users;

/**
 * @author Administrator
 *
 */
public interface TravelMessageService {

	
	public   int insert(Travelmessage travelmessage);
	public   List<Travelmessage>  allTravelmessage(Integer uid);
	public int GetTravelMessageCount();
	public Travelmessage GetTravelMessagebyid(Integer pid);
	public int updateMessagebyid(Travelmessage travelmessage);
	/*随机得到5条游记数据*/
	 public List<Travelmessage> GetTravelmessageByAdvertisement(Integer firstNum,Integer nextNum);
	 public Users GetUserByPid(Integer pid);
}
