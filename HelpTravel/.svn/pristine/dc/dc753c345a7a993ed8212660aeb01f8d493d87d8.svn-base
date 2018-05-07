/**
 * 
 */
package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.JreceiveMapper;
import po.Jreceive;
import po.JreceiveExample;
import po.JreceiveExample.Criteria;

/**
 * @author Administrator
 *
 */
@Service
public class JreceiveServiceImpl implements JreceiveService {

	
	@Autowired
	JreceiveMapper JreceiveMapper;
	JreceiveExample jreceiveExample=new JreceiveExample();
    Criteria criteria=jreceiveExample.createCriteria();
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int IsTakePartIn(Jreceive jreceive) {
		// TODO Auto-generated method stub
		
         criteria.andJidEqualTo(jreceive.getJid());
         criteria.andRidEqualTo(jreceive.getRid());
         return JreceiveMapper.countByExample(jreceiveExample);
		
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int TakePartIn(Jreceive jreceive) {
		// TODO Auto-generated method stub
		return  JreceiveMapper.insert(jreceive);
	}

}
