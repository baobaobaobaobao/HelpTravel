/**
 * 
 */
package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.generic.NEW;

import mapper.AdministratorMapper;
import po.Administrator;
import po.AdministratorExample;
import po.AdministratorExample.Criteria;
import po.Users;



/**
 * @author Administrator
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
@Autowired
private AdministratorMapper AdministratorMapper;
AdministratorExample administratorExample=new AdministratorExample();
Criteria criteria = administratorExample.createCriteria(); 
List<Administrator>list=new  ArrayList<Administrator>();
/* 
 *  编写者：
 * 功能：验证账号密码
* 参数：
*返回参数：
*日期：
*/
@Override
public Administrator loginTest(Administrator administrator) throws Exception {
        // TODO Auto-generated method stub
	
		criteria.andAusernameEqualTo(administrator.getAusername()); 
		criteria.andApasswordEqualTo(administrator.getAusername());
		List<Administrator>list = AdministratorMapper.selectByExample(administratorExample);  
		if(null == list || list.size() ==0 ){
			return null;
		}else{  
			System.out.println(list.get(0));
		return (Administrator) list.get(0);
		}
					
	}

}
