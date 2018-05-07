<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<link
	href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script  src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<style>
	.borderCommon{
         /* border:3px solid #0000FF;*/
   }
   /*img变大效果*/
  #top img:hover{
    transform: scale(1.3);  
      transition: all 1s ease 0s;  
         -webkit-transform: scale(1.3);  
          -webkit-transform: all 1s ease 0s;  
        }
   .showBackgroud:hover{
	background-color:	#FFA500;
	
	}
	.showBackgroud{
	font-size:12px;
	}
</style>

<script>

/*防止别人窃取你的网页代码*/
try{
    
	　　if (top.location.hostname != window.location.hostname) {
	　　　　top.location.href =window.location.href;
	　　}
	}
	catch(e){
	　　top.location.href = window.location.href;
	}
</script>
</head>
<body>
<!--
    	作者：offline
    	时间：2017-06-28
    	描述：头部区域
    -->
    <div  class="head"  id="top"    class="borderCommon"   style=" width: 100%;height: 70px;">
       <!--描述：商标 -->
      <div class="head_left"   class="borderCommon"  style=" color:#F7ECB5;height: 65px;width: 200px; float: left;">
       	   <a   href="/HelpTravel/login/main"  style="display:block;"   >
       	       <div  style="float:right;"><img  style="vertical-align: bottom; width:130px;"  src="/HelpTravel/resourses/images/main/logo.png"/></div> 
       	       <div style="float:right;" > <span  style="float:right;"  class="showBackgroud">切换城市  【 武汉】</span></div>
       	    </a>
          </div>
      
       
           <!--描述：搜索框-->
            <div class="head_middle"   class="borderCommon"   style="  height: 65px;width:700px; float:left;  " >
       	   
				       	                <!--搜索输入框-->
									<input type="text"   class="borderCommon"   id="searchContent"  name="search"  style="   height: 50px; width: 300px;   float: left;   solid #0000FF;  margin: 10px    10% 10% 10%"  >
									   <!--搜索按钮-->
										<button   class="btn btn-primary btn-lg  showBackgroud" type="button" id="search" style=" float: left; margin-top:12px;"> 
										搜索
										</button>
									
								  <button type="button"  id="publish" class="btn btn-primary btn-lg  showBackgroud"  style="margin-top:12px;margin-left:15px;">发布</button>
									
								
       	   
            </div>
       
        <div   class="borderCommon"  class="head_right" style="width: 400px;height: 65px;float: right;">
		                <nav class="navbar navbar-default" role="navigation">
														    <div class="container-fluid ">
														    <div class="navbar-header  showBackgroud">
														        <a id="names" class="navbar-brand showBackgroud " href="#">用户名</a>
														    </div>
														    <div>
														        <ul class="nav navbar-nav">
														           
														           
														            <li class="dropdown showBackgroud">
														                <a href="#" class="dropdown-toggle  " data-toggle="dropdown"  >
														                         <img src="/HelpTravel/resourses/images/My/UserImage.jpg"    style="border-radius:12px;  width:30px;height:30px; "></img>          
														                    <b class="caret">  </b>
														                </a>
														                <ul class="dropdown-menu"  >
														                   
														                   
														                    <li><a href="/HelpTravel/My/MyTraver">我的交游</a></li>
														                    <li class="divider"></li>
														                       <li><a href="/HelpTravel/My/MyTraverMessage">我的游记</a></li>
														                      <li class="divider"></li>
														                    <li><a href="/HelpTravel/My/MyPublish">我的发布</a></li>
														                     <li class="divider"></li>
														                    <li><a href="/HelpTravel/My/Myself">Myself</a></li>
														                </ul>
														            </li>
														             <li  class="showBackgroud" ><a href="/HelpTravel/login/SignOut" >退出登录</a></li>
														        </ul>
														    </div>
														    </div>
														</nav>
						
		</div>
		</div>
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
	//获取用户信息，并显示姓名
	GetAndShow();
	//把http中中文参数searchContent给input框
	$("#searchContent").val(searchContent);
	//DelsearchContent();
});	
//获取用户信息，并显示姓名
function   GetAndShow(){
	//取出sessionStorage中登录用户数据，然后使用它
	var users = sessionStorage.getItem('users');
	var user = JSON.parse(users);
	uid=user.uid;
	//将取出来的数据放在用户名位置
	$("#names").text(user.name);
}
//给发布框加事件
$('#publish').click(function(){
	//var searchContent=$("#searchContent").val();
	var url = '/HelpTravel/Journey/GetJourneyPublish';  
    window.location.href = url; 
    //跳转界面后开始获取url中搜索内容，并开始寻找
   // DelsearchContent();

});

//给搜索框加事件
$('#search').click(function(){
	dealSearch($("#searchContent").val());
});
//给enter加确认效果
$("#searchContent").keypress(function (e) { 
var keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode; 
if (keyCode == 13){ 
dealSearch($("#searchContent").val());
} 
}); 

//处理发送搜索参数
function   dealSearch(searchContent){
	var url = '/HelpTravel/Journey/search?searchContent='+searchContent;  
    window.location.href = url; 
}

/*获取http的id参数*/
function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}
/*获取http中的中文参数*/

function getQueryString(key){
    var reg = new RegExp("(^|&)"+key+"=([^&]*)(&|$)");
    var result = window.location.search.substr(1).match(reg);
    return result?decodeURIComponent(result[2]):null;
  }
  
  /*本函数为遍历我们需要的用户信息，并且加星级*/
  /*
  传入data，必须为
  {uid: 2, username: "1", password: "1", nickname: "1", name: "1", addressu: "1", education: "1",…}格式
  返回就是把界面这个用户信息格式化好。
  */
  function    eachUserMessage(data){
	  var level;  //星级要额外判断。
		for (var item in data) {
			//item为data的键，而data[item]为对应的值，要求必须要对应的。
			if(item=="level"){
				level=data[item];
			}
		      $('#'+item).html(data[item]);
		}
		
		/*对他的星级进行评价*/
		  if(level>=100&&level<300){
			  $('#level').html("他的星级为"+1+"星级");
		  }else if(level>=300&&level<600){
			  $('#level').html("他的星级为"+2+"星级");
		  }else if(level>=600&&level<900){
			  $('#level').html("他的星级为"+3+"星级");
		  }else if(level>=900&&level<1200){
			  $('#level').html("他的星级为"+4+"星级");
		  }else{
			  $('#level').html("他的星级为"+5+"星级");
			  
		  }
	  
	  
	  
	  
	  
  }
</script>
</html>