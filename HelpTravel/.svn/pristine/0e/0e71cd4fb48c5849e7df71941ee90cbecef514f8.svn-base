/**
 * 
 */
package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ReportMapper;
import po.Report;
import po.ReportExample;
import po.ReportExample.Criteria;
import po.Travelmessage;
import po.TravelmessageExample;
import pojo.AllReport;

/**
 * @author Administrator
 *
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	ReportMapper ReportMapper;
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int InsertReport(Report report) {
		// TODO Auto-generated method stub
		return ReportMapper.insert(report);
		
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public List<AllReport> AllRepot() {
		// TODO Auto-generated method stub
		return ReportMapper.AllRepot();
	}
	/* 
	 *  编写者：
	 * 功能：
	 * 参数：
	 *返回参数：
	 *日期：
	 */
	@Override
	public int deleteReport(Integer ruid) {
		// TODO Auto-generated method stub
		ReportExample reportExample=new ReportExample();
			Criteria criteria=	reportExample.createCriteria();
			criteria.andRuidEqualTo(ruid);
		return ReportMapper.deleteByExample(reportExample);
	}


}
