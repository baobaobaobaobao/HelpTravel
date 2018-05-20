/**
 * 
 */
package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.math.IntRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.bcel.internal.generic.NEW;

import net.sf.json.JSONObject;
import po.Report;
import pojo.AllReport;
import service.ReportService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value = "/Report")
public class ReportController{
@Autowired
ReportService reportService;
JSONObject jsonObject = new JSONObject();

/*
 * 举报交游信息
 */
/**
 * 
 * 编写者：鲍志强
 * 功能：登入我的发布界面
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/ReportJourney")
@ResponseBody
 public int ReportJourney(String message) throws Exception {
	Report report=new Report();
	jsonObject= JSONObject.fromObject(message);
	//获取jid
	String jid=jsonObject.getString("jid");
	report.setJid(Integer.valueOf(jid));
	report.setUid(Integer.valueOf(jsonObject.getInt("uid")));
	report.setReason(jsonObject.getString("reason"));
		//进行举报，并反馈
	return 	reportService.InsertReport(report);
}


/**
 * 
 * 编写者：鲍志强
 * 功能：获取所有被举报的交游条目
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/AllReportJourney")
@ResponseBody
 public List<AllReport> AllReportJourney(String message) throws Exception {
	return 	reportService.AllRepot();
	
}

/**
 * 
 * 编写者：鲍志强
 * 功能：删除被举报的交游条目
 * 参数：无
 *返回参数：无
 *日期：2-14
 */
@RequestMapping(value = "/DeleteReportJourney")
@ResponseBody
 public int DeleteReportJourney(HttpServletRequest request) throws Exception {
	String ruid=request.getParameter("ruid");
	return reportService.deleteReport(Integer.valueOf(ruid));
}
}
