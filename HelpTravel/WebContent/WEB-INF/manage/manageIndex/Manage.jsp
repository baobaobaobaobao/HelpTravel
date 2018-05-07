<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html>
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>【交·游】 管理员</title>
         <link rel="stylesheet" type="text/css"href="/HelpTravel/resourses/easyui/themes/default/easyui.css">
	      <link rel="stylesheet" type="text/css" href="/HelpTravel/resourses/easyui/themes/icon.css">
	      <script type="text/javascript" src="/HelpTravel/resourses/easyui/jquery.min.js"></script>
	      <script type="text/javascript" src="/HelpTravel/resourses/easyui/jquery.easyui.min.js"></script>
	      <script type="text/javascript" src="/HelpTravel/resourses/easyui/locale/easyui-lang-zh_CN.js"></script>
	     <script type="text/javascript" src="/HelpTravel/resourses/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	     
	     <script  type="text/javascript" src="/HelpTravel/manage/js/ManageCommon.js" ></script>
    </head>
    <style>
    	ul li{
    	list-style: none;
    	margin-bottom: 10px;
   
    	}
    	a span{
    	color:graytext;
    	font-size:16px;
    	font-weight: bold;
    	font-family: "仿宋";
    	}
    </style>
    <body>
     
      <div class="easyui-layout" style="width:1350px;height:600px;">
		<div region="west" split="true" title="【交.游】 超级管理员" style="width:170px;background:url('/HelpTravel/manage/img/manageBg.jpg');">
			<ul>
				<li style="margin-top:50px;"><a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-user" plain="true"  onclick="addTab('所有用户','/HelpTravel/manage/manageSmall/allUser.html')" ><span>所有用户</span></a></li>
				<li><a href="#" class="easyui-linkbutton" iconCls="icon-task" plain="true"onclick="addTab('所有交游','/HelpTravel/manage/manageSmall/allduty.html')"><span>所有交游</span></a></li>
				
				<li><a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remark" plain="true"onclick="addTab('所有评论','/HelpTravel/manage/manageSmall/allCritis.html')"><span>所有评论</span></a></li>
				<li><a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remark" plain="true"onclick="addTab('所有投诉','/HelpTravel/manage/manageSmall/allReport.html')"><span>所有投诉</span></a></li>
			</ul>
		</div>
		<div id="content" region="center" title="功能"  style="width:1300px;height:600px;">
	       <div id="tt" class="easyui-tabs" style="width:1280px;height:598px;background:url('/HelpTravel/manage/img/manageBg.jpg');">	</div>				
		</div>
	 </div>
	</body>

 <script type="text/javascript" src="/HelpTravel/manage/js/manage.js"></script>
</html>