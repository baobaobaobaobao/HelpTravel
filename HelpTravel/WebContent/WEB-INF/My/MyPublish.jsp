<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的发布</title>


</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img   style="width:100%; height:400px;"  src="/HelpTravel/resourses/images/My/User1.jpg"></img>
   <%@ include file="/WEB-INF/My/Common.jsp" %>
   <%@ include file="/WEB-INF/main/bottom.jsp" %>
</body>

<script type="text/javascript">
/*初始化执行*/
$(document).ready(function() {
	//获取用户信息，并显示我的发布信息
	GetAndShowMyPublish();
	
});	
//获取用户信息，并显示我的发布信息
function   GetAndShowMyPublish(){
	//取出sessionStorage中登录用户数据，然后使用它
	var users = sessionStorage.getItem('users');
	var user = JSON.parse(users);
	//alert(user.uid);
	var url="http://localhost:8080/HelpTravel/Journey/GetJourneyByIssueId";
	var issuerid=user.uid;
	var message = {'issuerid':issuerid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		DelMyPublish(data);
		
	});
}
function  DelMyPublish(data){
	//alert(JSON.stringify(data));
	var rows=data.rows;
	
	$("#MyPublishShow").empty();
	$("#rows").html(rows);
	for(var i=0;i<rows;i++)
	{	
		DelTable(data.journeys[i]);	
	}
	$('.table tbody').paginathing({
		  perPage: 10,
		  insertAfter: '.table',
		  pageNumbers: true
		});
}
//撤销交游信息
function   deleteByid(id){
	var url="http://localhost:8080/HelpTravel/Journey/DelteteByID";
	var message = {'id':id, 'msg':"我过来了"};
	
	if(confirm("你确定撤销?")==true)
		{
		 //alert("要撤销了!");
          com.meajax(url,message,function (data) {
		  
		   //刷新界面
		   location.reload(true);
		   });
		}
	else{
		alert("不喜欢!");
	}

	
	
	
}


function   updateByid(id){
	 
	  var url = '/HelpTravel/Journey/updateModel?id='+id;  
	   window.location.href = url; 
	
}
function DelTable(journey){
    $("#MyPublishShow").append("<tr><td>" + 
    	"<a href='/HelpTravel/Journey/GetJourneyDetail?jid="+journey.jid+"'>" +	journey.motif  +"</a>"+
    		"</td><td>"+journey.executetime+ 
    		"</td><td>"+journey.maxquantity+
    		"</td><td>"+"<button class='btn btn-default' onclick='deleteByid("+journey.jid+")'"+">撤销</button>"+
    	
    				"&nbsp;&nbsp;"+
    	    "<button   class='btn btn-default'  onclick='updateByid("+journey.jid+")'"+">修改</button>"+
    		"</td></tr>");
}
</script>
</html>