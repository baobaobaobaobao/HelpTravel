/**
 * 
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/My")
public class MyController {
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：登入我的发布界面
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/MyPublish")
	@ResponseBody
	 public  ModelAndView  MyPublish() throws Exception {
		// 返回ModelAndView
				ModelAndView modelAndView = new ModelAndView();
				 modelAndView.setViewName("/My/MyPublish");
				return modelAndView;

	}
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：登入我的发布界面
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/MyTraver")
	@ResponseBody
	 public  ModelAndView  MyTraverDetail() throws Exception {
		// 返回ModelAndView
				ModelAndView modelAndView = new ModelAndView();
				 modelAndView.setViewName("/My/MyTraver");
				return modelAndView;

	}
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：登入我的游记界面
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/MyTraverMessage")
	@ResponseBody
	 public  ModelAndView  MyTraverMessage() throws Exception {
		// 返回ModelAndView
				ModelAndView modelAndView = new ModelAndView();
				 modelAndView.setViewName("/My/MyTravelMessage");
				return modelAndView;

	}
	/**
	 * 
	 * 编写者：鲍志强
	 * 功能：登入我的游记界面
	 * 参数：无
	 *返回参数：无
	 *日期：2-14
	 */
	@RequestMapping(value = "/Myself")
	@ResponseBody
	 public  ModelAndView  MySelf() throws Exception {
		// 返回ModelAndView
				ModelAndView modelAndView = new ModelAndView();
				 modelAndView.setViewName("/My/Myself");
				return modelAndView;

	}
	
	
}
