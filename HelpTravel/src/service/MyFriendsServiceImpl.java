/**
 * 
 */
package service;

import java.util.List;

import org.apache.catalina.mbeans.UserMBean;
import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.tools.framedump;
import mapper.FriendMapper;
import mapper.UsersMapper;
import po.Friend;
import po.FriendExample;
import po.FriendExample.Criteria;
import po.Users;
import pojo.AllMyfriend;

/**
 * @author Administrator
 *
 */
 @Service
public class MyFriendsServiceImpl implements MyFriendsService {
	
	
	@Autowired
	private UsersMapper UsersMapper;
	@Autowired
	private FriendMapper FriendMapper;

	/* 
	 *  编写者：
	 * 功能：通过我的uid来获取我的朋友用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<AllMyfriend> getAllMyFriends(Integer uid) {
		// TODO Auto-generated method stub
		 
		  return UsersMapper.getAllFriends(uid);
	}

	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int addMyfriendship(Integer uidtwo, Integer uidone) {
		// TODO Auto-generated method stub
		return FriendMapper.addMyfriendShip(uidtwo, uidone);
	}

}
