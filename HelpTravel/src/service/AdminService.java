/**
 * 
 */
package service;

import po.Administrator;
import po.Users;

/**
 * @author Administrator
 *
 */
public interface AdminService {
/*
 * 验证AdminService账号和密码
 */
	public Administrator loginTest(Administrator administrator) throws Exception;
}
