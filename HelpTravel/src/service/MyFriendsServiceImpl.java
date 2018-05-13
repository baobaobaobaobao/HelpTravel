/**
 * 
 */
package service;

import java.util.List;

import org.apache.catalina.mbeans.UserMBean;
import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;
import org.springframework.beans.factory.annotation.Autowired;

import mapper.FriendMapper;
import mapper.UsersMapper;
import po.Friend;
import po.FriendExample;
import po.FriendExample.Criteria;
import po.Users;

/**
 * @author Administrator
 *
 */
public class MyFriendsServiceImpl implements MyFriendsService {
	
	
	@Autowired
	private UsersMapper UsersMapper;

	/* 
	 *  编写者：
	 * 功能：通过我的uid来获取我的朋友用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Users> getAllMyFriends(Integer uid) {
		// TODO Auto-generated method stub
		 
		  return UsersMapper.getAllFriends(uid);
	}

}
