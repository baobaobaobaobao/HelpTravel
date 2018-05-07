/**
 * 
 */
package service;

import java.util.List;

import org.apache.catalina.User;

import po.Users;

/**
 * @author Administrator
 *
 */
public interface UserService {

	//根据id找到用户
	
	public  Users GetUsersById(Integer IssueId);
	//根据名字模糊查询
	public  List<Users>    SearchByUsername(String Username);
	//通过自己id找到黑名单
	public   List<Users>    SearchBlackListByUid(Integer uid);
	public List<Users>   GetAllUser();	
	//封停用户
	public   int    deBlock(Integer  uid);
	//解封用户
	public   int       UnlockBlock(Integer  uid);
	/*给用户加分*/
	public int praisebyid(Integer uid);
	/*验证原密码*/
	public int isTruePassword(Users users);
	/*修改密码*/
	public int changePassword(Users users);
	public int changeUser(Users users);
		
}
