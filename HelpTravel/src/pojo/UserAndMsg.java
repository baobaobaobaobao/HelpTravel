/**
 * 
 */
package pojo;

import po.Users;

/**
 * 
 * 包装类，用来返回登录界面数据
 *
 */
public class UserAndMsg {

	
	private Users users;
	private String flag;
	private String msg;
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
