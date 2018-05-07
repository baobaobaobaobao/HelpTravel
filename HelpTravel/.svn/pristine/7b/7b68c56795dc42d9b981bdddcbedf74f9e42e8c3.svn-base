/**
 * 
 */
package service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.BlacklistMapper;
import mapper.UsersMapper;
import po.Users;
import po.UsersExample;
import po.UsersExample.Criteria;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersMapper UsersMapper;
	
	private BlacklistMapper BlacklistMapper;

	/* 
	 *  编写者：鲍志强
	 * 功能：根据id返回发布者信息
	 * 参数：id
	 *返回参数：用户信息
	 *日期：
	 */
	@Override
	public Users GetUsersById(Integer IssueId) {
		// TODO Auto-generated method stub
		return UsersMapper.selectByPrimaryKey(IssueId);
		
		
	}


	/* 
	 *  编写者：
	 * 功能：根据名字模糊查询我们的黑名单用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Users> SearchByUsername(String Username) {
		 // TODO Auto-generated method stub
		 UsersExample usersExample=new UsersExample();
	     Criteria criteria=usersExample.createCriteria();
	     criteria.andNameLike(Username);
		 return UsersMapper.selectByExample(usersExample);
	}


	/* 
	 *  编写者：
	 * 功能：根据uid找到他的所有黑名单用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Users> SearchBlackListByUid(Integer uid) {
		// TODO Auto-generated method stub
		 UsersExample usersExample=new UsersExample();
	     Criteria criteria=usersExample.createCriteria();
	     criteria.andUidEqualTo(uid);
		 return UsersMapper.queryblackUser(uid);
	}


	/* 
	 *  编写者：
	 * 功能：管理员看到所有用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<Users> GetAllUser() {
		// TODO Auto-generated method stub
		 UsersExample usersExample=new UsersExample();
	     Criteria criteria=usersExample.createCriteria();
	    
		 return UsersMapper.selectByExample(usersExample);
		
	}


	/* 
	 *  编写者：
	 * 功能：封停用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int deBlock(Integer uid) {
		// TODO Auto-generated method stub
		    Users  users=new Users();
		     users.setUid(uid);
		     users.setState(1);
		     return     UsersMapper.updateBlockByUid(uid);
		
	}


	/* 
	 *  编写者：
	 * 功能：解封该用户
	 * 参数：
	 *返回参数：
	 *日期：
	 */
@Override
public int UnlockBlock(Integer  uid) {
// TODO Auto-generated method stub
		 Users  users=new Users();
	     users.setUid(uid);
	     return    UsersMapper.UnlockBlockByUid(uid);
	}


/* 
 *  编写者：
 * 功能：
 * 参数：
 *返回参数：
 *日期：
 */
@Override
public int praisebyid(Integer uid) {
	// TODO Auto-generated method stub
	return UsersMapper.praisebyid(uid);
}


/* 
 *  编写者：
 * 功能：
 * 参数：
 *返回参数：
 *日期：
 */
@Override
public int isTruePassword(Users users) {
	// TODO Auto-generated method stub
	
	// TODO Auto-generated method stub
			System.out.println(users);
			UsersExample example = new UsersExample();    
			Criteria criteria = example.createCriteria();
			criteria.andUidEqualTo(users.getUid());
		
			criteria.andPasswordEqualTo(users.getPassword());  
		
			List<Users>list = UsersMapper.selectByExample(example);    
			if(null == list || list.size() ==0 ){
				//密码错误失败返回0
				return 0;
				
				}else{  
					System.out.println(list.get(0));
					//密码正确成功返回1
					return 1;
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
public int changePassword(Users users) {
	// TODO Auto-generated method stub
	return UsersMapper.updateByPrimaryKeySelective(users);
}


/* 
 *  编写者：
 * 功能：
 * 参数：
 *返回参数：
 *日期：
 */
@Override
public int changeUser(Users users) {
	// TODO Auto-generated method stub
	return UsersMapper.updateByPrimaryKeySelective(users);
}

}
