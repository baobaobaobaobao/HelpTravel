<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索框</title>


<style>



.rows{
	
	width: 90%;
	height:156px;
   
	}
	/*加鼠标移上去背景变黄效果。*/
	.rows:hover{
	background-color:	#EAEAEA;
	}
	.showBackgroud:hover{
	background-color:	#EAEAEA;
	}
	
	/*鼠标悬浮变色*/
	.title:hover{
	 color:yellow;}


  a:hover{color:yellow;}
  a.hover-yellow:hover{color:#FF7F00;}
   span.hover-yellow:hover{color:#FF7F00;}</style>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<div   id="journey"    class="borderCommon" style="  height: 800px;width: 60%;  margin:10% 15% 10% 15%">
	</div>	
	
	<%@ include file="/WEB-INF/main/bottom.jsp" %>
</body>
<script type="text/javascript"  src="/HelpTravel/resourses/js/common.js"></script>
<script type="text/javascript">

/*
 * 全局变量
 * */
var searchContent=getQueryString("searchContent");
var uid=GetQueryString("uid");
/*初始化执行*/
$(document).ready(function() {
	//把http中中文参数searchContent给input框
	$("#searchContent").val(searchContent);
	DelsearchContent();
});	

//给搜索框加事件
$('#search').click(function(){
	
    //跳转界面后开始获取url中搜索内容，并开始寻找
    DelsearchContent();

});
function   DelsearchContent(){
	//先清空div原有的内容
	$("#journey").empty();
	var url="http://localhost:8080/HelpTravel/Journey/GetJourney";
	var searchContent=$(" #searchContent ").val();
	var message = {'searchContent':searchContent, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		DelReceContent(data);
	});
	
}
//处理返回的搜索到的数据
function  DelReceContent(data){
	//alert(JSON.stringify(data));
	var rows=data.rows;
	//alert(rows);
	for(var i=0;i<rows;i++)
	{	
		createDiv(data.journeys[i]);
	}
	
}
//创建div
function createDiv(data){
	$div=$(divString);
	 $div.find('.title').html("<a href='/HelpTravel/Journey/GetJourneyDetail?jid="+data.jid+"'>"+data.motif+"</a>");// 标题
     $div.find('.work-date span').html(data.executetime);// 工作时间
     $div.find('.work-place span').html(data.address);// 工作地点
     $div.find('.set-count span').html(data.SType);// 结算方式
     $div.find('.request span').html(data.request);// 要求
     $div.find('.price').html(data.reward);// 赏金
     // 将div插入到<body>的尾部（插入到页面中）
     $div.find('.contact').attr("href","/HelpTravel/Journey/GetJourneyDetail?jid="+data.jid);
     $div.appendTo( $('div#journey') );
     console.log('div插入成功')
}


var divString ='<a class="jump" href="#" >'+ '<div class="rows">'+
'    <h3><span class="type">推荐</span><span class="title"></span></h3>'+
'    <div class="details">'+
'        <span class="work-date span">游玩时间:<span></span></span>'+

'        <span class="work-place span">游玩地点:<span></span></span>'+
'        <span class="request span">特殊要求:<span></span></span>'+
'    </div>'+
'    <div class="salary">'+
'    <span class="price"></span>'+
'    </div>'+
'    <a class="contact" >查看详情</a>'+
'</div>';


</script>
</html>