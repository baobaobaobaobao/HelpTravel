/**
 * 
 */
package service;

import java.util.List;

import po.Report;
import po.Travelmessage;
import pojo.AllReport;

/**
 * @author Administrator
 *
 */
public interface ReportService {
/*举报交游条目*/
public  int   InsertReport(Report  report);	
/*查看所有的被举报交游条目*/
 List<AllReport>  AllRepot();
 /*根据ruid删除被举报交游条目*/
 int deleteReport(Integer ruid);
}
