<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>他的发布</title>

<style>

html,body{  
    height: 100%;  
    width:100%
} 

body{
  font-family: "华文细黑";
  width: 100%;
  height:4000px;
  /*background:url("/HelpTravel/resourses/images/My/User.jpg") no-repeat  left top; */
 
  background-size: 100%;
}
.Usermiddle{
 background:url("/HelpTravel/resourses/images/My/User.jpg") no-repeat ;
 background-position: center center; 
 background-size: cover;
}
.UserMiddleCenter{
             width:1200px;
              height: 800px;
               position:relative;
             left:0;
             top: 20px;
             bottom: 0;
             right: 0;
             margin: auto;
            
}
</style>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img style="width:100%; height:400px;" src="/HelpTravel/resourses/images/My/User1.jpg"></img>
<!-- 个人信息展示界面 -->
<div   class="Usermiddle"  style=" height: 900px;width: 100%; "   id="hisMessage">


  <div     class="UserMiddleCenter" >


    <!-- 左边的个人信息面板 -->
    <%@ include file="/WEB-INF/his/hisSelfMessage.jsp" %>
       <!-- 右边加个人信息显示界面 -->
         <div  class="borderCommon" style="background-color:white;   height:800px; width:900px;margin-left: 300px; "  >
         
			   
			     <div    class="borderCommon" style="  width:100%;height:100px; background-color:white;   ">
						    
					
						<ul class="nav nav-tabs">
						  <li class="active" id="publish"><a href="/HelpTravel/My/MyPublish">他的发布</a></li>
						 
						 
						</ul>
			     </div>
			     <!-- 显示信息界面 -->
			          <div     class="borderCommon"  style="background-color:white;   height:300px; width:900px; ">
			                                        <div class="table-responsive">
																  <table class="table">
																    <caption  >他的发布</caption>
																    <thead>
																      <tr>
																        <th id="title">主题</th>
																        <th  id="time">执行日期</th>
																        <th   id="text">需求最大人数</th>
																        <th  id="haveTakepartin">已参加人数</th>
																         <th  id="controller">操作</th>
																        </tr>
																    </thead>
																    <tbody id="hisPublishShow">
																      
																    </tbody>
																  </table>
																</div>
												
			                                        </div>
			    
			  </div>
    
  </div>

</div>
<%@ include file="/WEB-INF/main/bottom.jsp" %>
</body>
<script type="text/javascript"  src="/HelpTravel/resourses/js/My/paginathing.js"></script>
<script   type="text/javascript">
/*初始化执行*/

 var hisid=GetQueryString("hisid");

$(document).ready(function() {
	//获取发布人的信息，

	GetAndShowHis();
	
	//显示他的发布
	GetAndShowhisPublish();
});	
function   GetAndShowHis(){
	//通过hisid找到他的个人信息
	var url="http://localhost:8080/HelpTravel/User/GetUsersMessageById";
	var message = {'uid':hisid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		/*专门循环用户所用函数*/
		eachUserMessage(data);
	});
}
//获取用户信息，并显示我的发布信息
function   GetAndShowhisPublish(){
	//取出sessionStorage中登录用户数据，然后使用它
	var url="http://localhost:8080/HelpTravel/Journey/GetJourneyByIssueId";
	
	var message = {'issuerid':hisid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		DelMyPublish(data);
		
	});
}
function  DelMyPublish(data){
	//alert(JSON.stringify(data));
	var rows=data.rows;
	//alert(rows);
	//alert(data.journey[1]);
	$("#hisPublishShow").empty();
	for(var i=0;i<rows;i++)
	{	
		DelTable(data.journeys[i]);	
	}
	
	//分页插件实现。
	$('.table tbody').paginathing({
		  perPage: 10,
		  insertAfter: '.table',
		  pageNumbers: true
		});
}
//撤销交游信息
function   GetByid(id){
	var url="http://localhost:8080/HelpTravel/Journey/GetJourneyDetail?jid="+id;
	 window.location.href = url; 
}
function DelTable(journey){
    $("#hisPublishShow").append("<tr><td>" + 
    	"<a href='/HelpTravel/Journey/GetJourneyDetail?jid="+journey.jid+"'>" +	journey.motif  +"</a>"+
    		"</td><td>"+journey.executetime+ 
    		"</td><td>"+journey.maxquantity+
    		
    		"</td><td>"+(journey.maxquantity-4)+
    		"&nbsp;&nbsp;"+
    		"</td><td>"+
    	     "<button   class='btn btn-default'  onclick='Prariseid("+journey.issuerid+")'"+">赞赏</button>"+
    		"</td></tr>");
}
function   Prariseid(issuerid){
	var url="http://localhost:8080/HelpTravel/User/praisebyid";
	var message = {'uid':issuerid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		if(data==1){
			alert("赞赏成功，他的星级将提升！！！");
		}else{
			alert("赞赏失败");
		}	
	});
}
</script>
</html>