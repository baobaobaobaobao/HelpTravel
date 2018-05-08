<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>

html,body{  
    height: 100%;  
    width:100%
} 

body{
  font-family: "华文细黑";
  width: 100%;
  height:1100px;
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
             top: 10px;
             bottom: 0;
             right: 0;
             margin: auto;
            
}
</style>
</head>
<body>
<!-- 个人信息展示界面 -->
<div   class="Usermiddle"  style=" height: 1000px;width: 100%; " >


  <div     class="UserMiddleCenter" >


    <!-- 左边的个人信息面板 -->
      <div    class="borderCommon"  style=" height:800px;width:300px; background-color:white;    float:left;">
                 <div  style=" height:100px;width:150px; margin: 0% 15% 5% 15%;  background-color:white;   ">
                     
                     <img  src="/HelpTravel/resourses/images/My/UserImage.jpg"  alt="上海鲜花港 - 郁金香" />
                 
                 </div>   
                 <br>
                 <div>
                 
                  <div class="panel panel-default">
						    <div class="panel-heading">
						   我的名字
						    </div>
						    <div class="panel-body">
						                   <span  id="name"></span> 
						    </div>
						</div>
						<div class="panel panel-default">
						    <div class="panel-heading">
						        我的星级（星级为用户赞赏所得，赞赏越多，星级越高）
						    </div>
						    <div class="panel-body">
						                 <span  id="level">本课件课件</span>    
						    </div>
						</div>
						  <div class="panel panel-default">
						    <div class="panel-heading">
						     我的昵称
						    </div>
						    <div class="panel-body">
						                   <span  id="nickname"></span> 
						    </div>
						</div>
						 
						
						
						<div class="panel panel-default">
						    <div class="panel-heading">
						         我的QQ
						    </div>
						    <div class="panel-body">
						                      <span  id="qq"></span>  
						    </div>
						</div>
						<div class="panel panel-default">
						    <div class="panel-heading">
						       我的学校
						    </div>
						    <div class="panel-body">
						                 <span  id="eduction"></span>    
						    </div>
						</div>
						
						
						
						
						<div class="panel panel-default">
						    <div class="panel-heading">
						       我的电话
						    </div>
						    <div class="panel-body">
						                 <span  id="tel"></span>    
						    </div>
						</div>
						
						
             
                 </div>               
                                  
                               
      </div>
       <!-- 右边加个人信息显示界面 -->
         <div  class="borderCommon" style="background-color:white;   height:800px; width:900px;margin-left: 300px; "  >
         
			   
			     <div    class="borderCommon" style="  width:100%;height:60px; background-color:white;   ">
						    
					
						<ul class="nav nav-tabs">
						  <li class="active" id="publish"><a href="/HelpTravel/My/MyPublish">我的发布</a></li>
						  <li    id="part"  ><a href="/HelpTravel/My/MyTraver"  >我参与的</a></li>
						  <li    id="part"  ><a href="/HelpTravel/My/MyTraverMessage"  >我的游记</a></li>
						 
						</ul>
			     </div>
			     <!-- 显示信息界面 -->
			          <div     class="borderCommon"  style="background-color:white;   height:300px; width:900px; ">
			                                        <div class="table-responsive">
																  <table class="table">
																    <caption  id="caption" >
																 我已经参与了 &emsp; <span id="rows"></span>&emsp;篇交游信息
																    </caption>
																    <thead>
																      <tr>
																        <th id="title">主题</th>
																        <th  id="time">执行日期</th>
																        <th   id="text">参加人数</th>
																        <th  id="controller">操作</th>
																        </tr>
																    </thead>
																    <tbody id="MyPublishShow">
																      
																    </tbody>
																  </table>
																</div>
												
			                                        </div>
			    
			  </div>
    
  </div>

</div>
</body>
<script type="text/javascript"  src="/HelpTravel/resourses/js/My/paginathing.js"></script>
<script>

$(document).ready(function() {
	//获取用户信息，并显示姓名
	GetAndShowUser();
	
});	
function   GetAndShowUser(){
	//取出sessionStorage中登录用户数据，然后使用它
	var users = sessionStorage.getItem('users');
	var user = JSON.parse(users);
	eachUserMessage(user);
}
</script>
</html>