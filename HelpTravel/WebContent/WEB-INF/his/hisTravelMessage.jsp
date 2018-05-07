<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>他的游记</title>

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

 <script type="text/javascript"  src="/HelpTravel/resourses/js/wangEditor.min.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img style="width:100%; height:400px;" src="/HelpTravel/resourses/images/My/User1.jpg"></img>
<!-- 个人信息展示界面 -->
<div   class="Usermiddle"  style=" height: 900px;width: 100%; " >


  <div     class="UserMiddleCenter" >

<%@ include file="/WEB-INF/his/hisSelfMessage.jsp" %>
   
       <!-- 右边加个人信息显示界面 -->
         <div  class="borderCommon" style="background-color:white;   height:800px; width:900px;margin-left: 300px; "  >
         
			   
			     <div    class="borderCommon" style="  width:100%;height:100px; background-color:white;   ">
						    
					
						<ul class="nav nav-tabs">
						  <li class="active" id="publish"><a href="/HelpTravel/My/MyPublish">他的游记</a></li>
						 
						 
						</ul>
			     </div>
			     <!-- 显示信息界面 -->
			          <div     class="borderCommon"  style="background-color:white;   height:300px; width:900px; ">
			                       <div  style="margin-left:200px;margin-right:auto;">这篇游记来自于<a id="his"><span  id="hisname"  ></span></a></div>
			                                         <div  id="Message">
												             <div class="input-group"   style="margin-left:5%;margin-top:5%;margin-bottom:5px;">
														            <span class="input-group-addon">标题</span>
														            <input type="text"  id="travelMessageTextTitle" class="form-control" placeholder="游记标题">
												             </div>
												             <div id="editor"  style="height:200px; width:800px;margin-left:5%;margin-right:auto;margin-top:5%;">
												                 <p  id="travelMessageText">请写下你的游记。。。</p>
												             </div>
												                  
												    <!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
												    
												         </div>
																								
			            </div>
			    
			  </div>
    
  </div>

</div>
<%@ include file="/WEB-INF/main/bottom.jsp" %>
</body>


<script   type="text/javascript">
/*初始化执行*/
 var E = window.wangEditor;
  var editor = new E('#editor');
 $(function(){ 
	 /*初始实行*/
	 init();
	 //显示所有交游游记
	
}); 
 
 /*初始执行，给编辑框隐藏*/
 function init(){
	
     editor.create();
    // $("#Message").hide();
    
 }
 var hisid=GetQueryString("hisid");
 /*获取游记id*/
var  hisPid=GetQueryString("pid");
$(document).ready(function() {
	//获取发布人的信息，
	
	//根据游记的pid显示他的个人信息
	GetAndShowHis(hisPid);
	//显示游记
	GetAndShowhisTravelMessage();
});	


//根据游记的pid显示他的个人信息
function   GetAndShowHis(hisPid){
	//通过hispid找到他的个人信息
	var url="http://localhost:8080/HelpTravel/TravelMessage/GethisMessageByid";
	
	var message = {'hispid':hisPid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		//显示他的名字，并且加id
		$('#hisname').html(data.name);
		$('#his').attr("href","/HelpTravel/his/hisPublish?hisid="+data.uid);
		eachUserMessage(data);
		
		
	});
	//alert(array.name);
	//将取出来的数据放在用户名位置
	
}
//获取用户信息，并显示我的发布信息
function   GetAndShowhisTravelMessage(){
	//取出sessionStorage中登录用户数据，然后使用它
	
	
	var url="http://localhost:8080/HelpTravel/TravelMessage/GetTravelMessageBypid";
	
	var message = {'pid':hisPid, 'msg':"我过来了"};
	 com.meajax(url,message,function (data) {
		 $("#travelMessageTextTitle").val(data.title);
		  $('#travelMessageTextTitle').attr('disabled',true);
    	   editor.txt.html(data.text); 
    	   
    	   editor.$textElem.attr('contenteditable', false)
	});
}

</script>
</html>