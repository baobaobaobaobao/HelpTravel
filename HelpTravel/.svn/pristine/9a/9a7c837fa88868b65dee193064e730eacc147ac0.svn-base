package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UsersMapper;
import po.Users;
import po.UsersExample;
import po.UsersExample.Criteria;
@Service
public class LoginServiceImpl implements LoginService {
@Autowired
private	UsersMapper UsersMapper;
	

/*
 * 
 *  编写者：鲍志强
 * 功能：登录测试
 * 参数：message（username和password）
 *返回参数：0 错误  1 正确
 *日期： 2.11
 */
	@Override
	public Users loginTest(Users user) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(user);
		UsersExample example = new UsersExample();    
		Criteria criteria = example.createCriteria();    
		criteria.andUsernameEqualTo(user.getUsername());    
		criteria.andPasswordEqualTo(user.getPassword());  
	
		List<Users>list = UsersMapper.selectByExample(example);    
		if(null == list || list.size() ==0 ){
			return null;
			
			}else{  
				System.out.println(list.get(0));
				return (Users) list.get(0);
}
}


	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int registerUser(Users user) {
		// TODO Auto-generated method stub
		
		  return  UsersMapper.insert(user);
		
	}
	
}
