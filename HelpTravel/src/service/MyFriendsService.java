/**
 * 
 */
package service;

import java.util.List;

import po.Friend;
import po.Users;
import pojo.AllMyfriend;

/**
 * @author Administrator
 *
 */
public interface MyFriendsService {
/*
 * 获取我的朋友用户
 */
	public List<AllMyfriend>  getAllMyFriends(Integer uid);
	/*加好友度*/
	public int addMyfriendship(Integer uidtwo,Integer uidone);
}
