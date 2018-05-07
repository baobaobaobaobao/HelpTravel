<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>管理员</title>
		<!--用百度的静态资源库的cdn安装bootstrap环境-->
		<!-- Bootstrap 核心 CSS 文件 -->
		<link href="/HelpTravel/resourses/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
		<!--font-awesome 核心我CSS 文件-->
		<link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- 在bootstrap.min.js 之前引入 -->
		<script src="/HelpTravel/resourses/js/jquery-1.9.1.min.js"></script>
		<!-- Bootstrap 核心 JavaScript 文件 -->
		<script src="/HelpTravel/resourses/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<!--jquery.validate-->
		<script type="text/javascript" src="/HelpTravel/manage/js/jquery.validate.min.js" ></script>
		<link href="/HelpTravel/manage/css/login.css"  rel="stylesheet"/>
		 <script type="text/javascript"  src="/HelpTravel/resourses/js/common.js"></script>
		<!--<style type="text/css">
			body{background: url(img/4.jpg) no-repeat;background-size: cover;font-size: 16px;}
			.form{background: rgba(255,255,255,0.2);width:400px;margin:100px auto;}
			#login_form{display: block;}
			#register_form{display: none;}
			.fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}
			input[type="text"],input[type="password"]{padding-left:26px;}
			.checkbox{padding-left:21px;}
		</style>-->
	</head>
	<body  style="background: url(/HelpTravel/manage/img/4.jpg);"  > 
		<!--
			基础知识：
			网格系统:通过行和列布局
			行必须放在container内
			手机用col-xs-*
			平板用col-sm-*
			笔记本或普通台式电脑用col-md-*
			大型设备台式电脑用col-lg-*
			为了兼容多个设备，可以用多个col-*-*来控制；
		-->
		<!--
			从案例学知识，来做一个登录，注册页面
			用到font-awesome 4.3.0；bootstrap 3.3.0；jQuery Validate
		-->
	 <div class="container">
		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form">
				<h3 class="form-title">登录您的账户</h3>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i>
						<input class="form-control required" type="text" placeholder="Username"  id="username" name="username" autofocus="autofocus" maxlength="20"/>
					</div>
					<div class="form-group">
							<i class="fa fa-lock fa-lg"></i>
							<input class="form-control required" type="password" placeholder="Password"  id="password" name="password" maxlength="8"/>
					</div>
					<div class="form-group">
						<label class="checkbox">
							<input type="checkbox" name="remember" value="1"/> 记住我
						</label>
						<hr />
						
					</div>
					<div class="form-group">
						<input     type="button" onclick="login()" class="btn btn-success pull-right" value="Login "/>   
					</div>
				</div>
			</form>
		</div>

		<div class="form row">
			<form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="register_form">
				<h3 class="form-title">Login to your account</h3>
				<div class="col-sm-9 col-md-9">
					<div class="form-group">
						<i class="fa fa-user fa-lg"></i>
						<input class="form-control required" type="text" placeholder="Username" name="username" autofocus="autofocus"/>
					</div>
					<div class="form-group">
							<i class="fa fa-lock fa-lg"></i>
							<input class="form-control required" type="password" placeholder="Password" id="register_password" name="password"/>
					</div>
					<div class="form-group">
							<i class="fa fa-check fa-lg"></i>
							<input class="form-control required" type="password" placeholder="Re-type Your Password" name="rpassword"/>
					</div>
					<div class="form-group">
							<i class="fa fa-envelope fa-lg"></i>
							<input class="form-control eamil" type="text" placeholder="Email" name="email"/>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success pull-right" value="Sign Up "/>
						<input type="submit" class="btn btn-info pull-left" id="back_btn" value="Back"/>
					</div>
				</div>
			</form>
		</div>
		</div>
	
	</body>
	 <script type="text/javascript" >
	 //登录验证
	 function login(){
			var username=$("#username").val();
			var password=$("#password").val();
			if(username == ""||password == ""){
				alert("请输入和账号");
			}else{
				var message = {'username':$("#username").val(), 'password':$("#password").val()};
				var url="http://localhost:8080/HelpTravel/login/testAdmin";
				com.meajax(url,message,function (data) {
					 delLogmsgAdmin(data);
					
				});	
				
				
				
			}	
	}
	//处理登录后返回的数据
	 function  delLogmsgAdmin(result){
	 	//alert(JSON.stringify(result));
	 	sessionStorage.setItem("AdminUsers",JSON.stringify(result.users));//将登陆信息放入session中
	 	
	 	if(result==1){
	 		//登录成功
	 		//alert(result.msg);
	 		//登入界面
	 		var url = '/HelpTravel/login/AdminMain';  
	 	    window.location.href = url; 
	 	}else{
	 		//登入失败
	 		alert(result.msg);
	 	}	
	 }
	 
	 
	 
	 </script>
</html>