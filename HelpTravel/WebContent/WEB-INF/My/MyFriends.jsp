<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的好友</title>
	<style>
	#popupcontent{ 
			position: absolute; 
			visibility: hidden; 
			overflow: hidden; 
			border:1px solid #CCC; 
			border:1px solid #333; 
			padding:5px;
			text-align: center;
			background-image:url("/HelpTravel/resourses/images/My/list.jpg") ; 
} 
.title{
  margin-top:10px;
  font-size:18px;
  color:red;
}
.table{
margin-left:50px;
}

.table tbody{


}	
.close{
margin-top:20px;
background:red;
width: 100px;
height:30px;
color:white;
border-radius:5px;
font-weight: bold;

}
	</style>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img   style="width:100%; height:400px;"  src="/HelpTravel/resourses/images/My/User1.jpg"></img>
   <%@ include file="/WEB-INF/My/Common.jsp" %>
  
   <%@ include file="/WEB-INF/main/bottom.jsp" %>
    <!-- 弹出层 -->
    <div id="popupcontent">
     <div class="title"><span>您和好友共同参与的交游</span></div>
	</div> 
</body>
<script>


function DelTable(journey){
    $("#MyPublishShow").append("<tr><td>" + 
    	"<a href='/HelpTravel/Journey/GetJourneyDetail?jid="+journey.jid+"'>" +	journey.motif  +"</a>"+
    		"</td><td>"+journey.executetime+ 
    		"</td><td>"+journey.maxquantity+
    		"</td><td>"+"<button class='btn btn-default' onclick='deleteByid("+journey.jid+")'"+">撤销</button>"+
    	
    				"&nbsp;&nbsp;"+
    	    "<button   class='btn btn-default'  onclick='showPopup("+journey.jid+")'"+">修改</button>"+
    		"</td></tr>");
}

</script>
<script  type="text/javascript">
/*全局变量*/
var users = sessionStorage.getItem('users');
var user = JSON.parse(users);

var uid=user.uid;
/*初始化执行*/
$(document).ready(function() {
	//获取用户信息，并显示我的发布信息
	GetAndShowMyUsermessage();
	
});	

function  GetAndShowMyUsermessage(){
//初始状态来初始化界面。
		  
			var url="http://localhost:8080/HelpTravel/MyFriends/getMyFriends";
			
			var message = {'uid':uid, 'msg':"我过来了"};
			com.meajax(url,message,function (data) {
				 DelMyfriends(data);
});
	
}
	
function DelMyfriends(data) {
  
    var rows=data.length;
    $("#title").text("好友名字");
	$("#time").text("好友星级");
	$("#text").text("亲密度");
	$("#MyPublishShow").empty();
	
	for(var i=0;i<rows;i++)
	{	
		
		DelTable(data[i]);	
	}
	$('.table tbody').paginathing({
		  perPage: 10,
		  insertAfter: '.table',
		  pageNumbers: true
		});

}
/*返回我们的好友信息显示在table中*/
function DelTable(user){
    $("#MyPublishShow").append("<tr><td>" + 
    	"<a href='/HelpTravel/his/hisPublish?hisid="+user.uid+"'>" +user.name  +"</a>"+
    		"</td><td>"+hisLevel(user.level)+ 
    		"</td><td>"+friendShip(user.friendship)+
    		"</td><td>"+"<button class='btn btn-default' onclick='takeoutMyTakepartin("+user.uid+")'"+">详情</button>"+		
    		"</td></tr>");
}


/*封装好友等级的函数*/
function hisLevel(level){
	 if(level>=100&&level<300){
		 return 1;
	  }else if(level>=300&&level<600){
		  return 2;
	  }else if(level>=600&&level<900){
		  return 3;
	  }else if(level>=900&&level<1200){
		  return 4;
	  }else{
		  return 5;
		  
	  }
}
/*封装亲密度的函数*/
function  friendShip(friendship){
	
	 if(friendship>=100&&friendship<300){
		 return '50%';
	  }else if(friendship>=300&&friendship<600){
		  return '60%';
	  }else if(friendship>=600&&friendship<900){
		  return '70%';
	  }else if(friendship>=900&&friendship<1200){
		  return '80%';
	  }else{
		  return '90%';
		  
	  }
}
/*弹出层，出现我参与他的所有交游*/
var baseText = null; 
 //造个轮子，可以再弹出层循环出现某一列东西。哈哈哈
function takeoutMyTakepartin(frienduid){
	 /*
	 * 接下来是弹出任务申请框
	 */
	showPopup(700,"auto");//显示弹出框
	//发送请求啊
	var url="http://localhost:8080/HelpTravel/Journey/getALlMyfriendTakepartIn";
	
	var message = {'uidtwo':frienduid,'uidone':uid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		 DelMyfriendsJournye(data);
});
}
function  DelMyfriendsJournye(data){
	    var rows=data.length;
		$("#friendAndmeJourney").empty();
		for(var i=0;i<rows;i++)
		{	
			DelJourneyTable(data[i]);	
		}
}
function  DelJourneyTable(journey){
	 $("#friendAndmeJourney").append("<tr><td>" + 
		    	"<a href='/HelpTravel/Journey/GetJourneyDetail?jid="+journey.jid+"'>" +journey.motif  +"</a>"+
		    		"</td><td>"+journey.executetime+ 
		    		
		    		"</td><td>"+"<a class='btn btn-default' href='/HelpTravel/Journey/GetJourneyDetail?jid="+"("+user.uid+")'"+">详情<a>"+		
		    		"</td></tr>");
}
/*弹出层*/
function showPopup(w,h){ 
	var popUp = document.getElementById("popupcontent"); 
	popUp.style.top = "599px"; 
	popUp.style.left = "500px"; 
	popUp.style.width = w + "px"; 
	popUp.style.height = h; 
	if (baseText == null) baseText = popUp.innerHTML; 
	popUp.innerHTML = baseText + 
	 "<div class='classfify'>"+
       "<table class='table'  width='440px'>"+
	 "<tr><td>参与的交游</td><td>时间</td><td>详细</td></tr>"+
	 "<tbody id='friendAndmeJourney'></tbody>"+
									
		"</table>"+
		"<div id=\"statusbar\"><button class='close' onclick=\"hidePopup();\">关闭界面<button></div>"
	; 
	var sbar = document.getElementById("statusbar"); 
	sbar.style.marginTop = (parseInt(h)-40) + "px"; 
	popUp.style.visibility = "visible"; 
} 
/*
 * 隐藏界面
 */
function hidePopup(){ 
	var popUp = document.getElementById("popupcontent"); 
	popUp.style.visibility = "hidden"; 
} 
</script>
</html>