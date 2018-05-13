/**
 * 
 */
package service;

import java.util.List;

import po.Friend;
import po.Users;

/**
 * @author Administrator
 *
 */
public interface MyFriendsService {
/*
 * 获取我的朋友用户
 */
	public List<Users>  getAllMyFriends(Integer uid);
}
