<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
<style>
/* Custom Styles */
    ul.nav-tabs{
        width: 140px;
        margin-top: 20px;
        border-radius: 4px;
        border: 1px solid #ddd;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    }
    ul.nav-tabs li{
        margin: 0;
        border-top: 1px solid #ddd;
    }
    ul.nav-tabs li:first-child{
        border-top: none;
    }
    ul.nav-tabs li a{
        margin: 0;
        padding: 8px 16px;
        border-radius: 0;
    }
    ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
        color: #fff;
        background: #0088cc;
        border: 1px solid #0088cc;
    }
    ul.nav-tabs li:first-child a{
        border-radius: 4px 4px 0 0;
    }
    ul.nav-tabs li:last-child a{
        border-radius: 0 0 4px 4px;
    }
    ul.nav-tabs.affix{
        top: 30px; /* Set the top position of pinned element */
    }
</style>

</head>
<body  data-spy="scroll" data-target="#myScrollspy">
<%@ include file="/WEB-INF/main/top.jsp" %>

<div class="container">
   <div class="jumbotron">
        <h1>This  is  my  message</h1>
    </div>
    <div class="row">
        <div class="col-xs-3" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" data-spy="affix" id="myAffix">
                <li class="active"><a href="#section-1">我的信息</a></li>
                <li><a href="#section-2">账号安全</a></li>
                <li><a href="#section-3">黑名单管理</a></li>
               
               
            </ul>
        </div>
        <div class="col-xs-9"  >
           <div     id="user" >
               <h2 id="section-1">Myself             Message</h2>
                   <form    action="/HelpTravel/User/updateUser"   method="post"   id="Usermessage"     >
                     <div class="form-group"     >
						    <label for="firstname" class="col-sm-2 control-label">名字</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" name="name"   v-model="message.name"  id="firstname" placeholder="请输入名字">
						    </div>
						  </div>
						  
						   <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">昵称</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"  v-model="message.nicename"  name="nickname"  id="firstname" placeholder="请输入昵称">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">地址</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"   v-model="message.address" name="address"  id="firstname" placeholder="请输入地址">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">电话</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"   v-model="message.tel" name="tel"    id="firstname"   placeholder="请输入电话">
						    </div>
						  </div>
						  
						   <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">QQ</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"   v-model="message.qq"  name="qq"  id="firstname" placeholder="请输入QQ">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">学校</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"   v-model="message.education"  name="education"  id="firstname" placeholder="请输入学校">
						    </div>
						  </div>
						  
						   <input   type="hidden" class="form-control"   v-model="message.uid"  name="uid"  id="firstname" >
						  
						  <button type="submit" class="btn btn-primary" >修改提交</button>

                   </form>
            
                <hr>
           </div>
           <div     >
            <h2 id="section-2">Account security</h2>
              
                <div    id="changeMessage" >
                          <span>密码</span>   <button type="button"  v-on:click="shows" class="btn btn-default">修改密码</button>
                      <div id="changeMessageInput"    style="display:none;">
                        <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">原密码</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"    name="qq"  id="firstInputPassword" placeholder="请输入原密码">
						    </div>
						  </div>
						  
						  <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">新密码</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"    name="qq"  id="newpassword" placeholder="请输入新密码">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">再次输入新密码</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control"    name="qq"  id="nextpassword" placeholder="请再次输入新密码">
						    </div>
						  </div>
						   <button type="button" class="btn btn-primary"   v-on:click="changeMypassword" id="changePasswordSubmit">提交修改</button>
						   
						 </div>
                </div>
                
              <hr>
            </div>
             <div  id="changeBlackList"  >
                 <div>
                    
                       <div>    <h2 id="section-3">Blacklist management</h2></div>
                       <div>黑名单 <button type="button" v-on:click="showBlackList"   class="btn btn-default">黑名单管理</button></div>
					          <div    id="BlackList" style="display:none;height:300px; ">
							         
							         <div  style=" height:300px;width:300px;float: left;border:1px solid #C0C0C0;">
							             <div class="input-group">
									           
									             <input type="text"   id="blackSearch"   class="form-control" placeholder="请输入名字">
									               <button  v-on:click="BlackListSearch"   class="btn btn-default">搜索用户</button>
									              
									     </div> 
									     <div>
									               <ul >
													  <li v-for="user in Usersitems" >
													     {{ user.name }}  
													      <div class="btn-group btn-group-xs">
													       <button    v-on:click="intoBlackList('{{ user.uid }}')"  class="btn btn-default" >拉黑</button>
													        </div>
													  </li>
													</ul>
									     </div>
									  </div>
                                        
							 
							              
							          
							          <div  style="height:300px;width:300px;float: left;border:1px solid #C0C0C0;" >
							          
									              
									               <button   class="btn btn-default"  v-on:click="myBlackList" >我的黑名单</button>
									               <div>
											                 <ul >
															  <li v-for="Blackuser in BlackLists">
															     {{ Blackuser.name }}
															  </li>
															</ul>
									               </div>
									      
							          </div>
					          
					            </div>
					  </div>
			           
            </div>
           
         </div>
    </div>
</div>
<%@ include file="/WEB-INF/main/bottom.jsp" %>
 
</body>
<script>
$(document).ready(function(){
	
	//get  the uid  and get   user's   message show in desktop
	            var url="http://localhost:8080/HelpTravel/User/GetUsersMessageById";
				var message = {'uid':uid, 'msg':"我过来了"};
				com.meajax(url,message,function (data) {
					DelMyselfMessage(data);
					//处理用户信息并显示
	});
				
 });


function   DelMyselfMessage(data){
	
	/*组件设计*/
var Myself= new Vue({
		  el: '#user',
		  data: {
		    message: {
		    	 name: data.name,
		    	 nicename: data.nickname,
		    	 address: data.addressu,
		    	 tel: data.tel,
		    	 qq: data.qq,
		    	 uid:data.uid,
		    	 education:data.education
		  }
		  },
		  methods:{
			  changeMy:function(){
				  
				  
			  }
			  
			  
		  }
		})
var changepassword = new Vue({
		  el: '#changeMessage',
		  data: {
		    name: 'Vue.js'
		  },
		  // 在 `methods` 对象中定义方法
		  methods: {
			 shows:function(){ 
				 
				   $("#changeMessageInput").show();
			     },
			 changeMypassword:function(){
			    	 var url="http://localhost:8080/HelpTravel/User/changeMypasswordByid";
			    	 var firstpassword=$("#firstInputPassword").val();
			    	 var newpassword=$("#newpassword").val();
			    	 var nextpassword=$("#nextpassword").val();
			    	 var message = {'uid':uid, 'firstpassword':firstpassword,'newpassword':newpassword,'nextpassword':nextpassword};
			    	 if (!judge(message)) {
			    	        alert("还有未填项");
			    	    } else {
						com.meajax(url,message,function (data) {
										if(data==1){
											alert("修改成功");
										}else{
											alert("原密码错误导致修改失败");
										}
					     
						});
						
			 }
			    	
			    }
			 }
	})
var changeBlackList = new Vue({
	  el: '#changeBlackList',
	  data: {
		  Usersitems: [
		     
		    ],
		    UsersIds:[
		    	
		    ],
		  BlackLists:[
			  
		  ]
	  },
	  created: function () {
		    // `this` 指向 vm 实例  
		    //显示我的黑名单。
		   
		    
		   
		   
		  },
	  methods: {
		 showBlackList:function(){ 
			 
			   $("#BlackList").show();
		      },
	     BlackListSearch:function(){ 
	    	 var url="http://localhost:8080/HelpTravel/User/SearchByUsername";
	    	    var Username=$("#blackSearch").val();
				var message = {'Username':Username, 'msg':"我过来了"};
				com.meajax(url,message,function (data) {
					if(data.rows==0){
						alert("没有您所要查找用户！！！");
					}else{
					
					  for(var i=0;i<data.rows;i++){
						  
					   changeBlackList.Usersitems.push({ name:data.users[i].name});
					  changeBlackList. UsersIds.push({ uid:data.users[i].uid});
					  }
					}
					
	              });
	     },
	     myBlackList:function(){
	    	 
	    	 
	    	 var url="http://localhost:8080/HelpTravel/User/SearchBlackListByUid";
	    	  
				var message = {'uid':uid, 'msg':"我过来了"};
				com.meajax(url,message,function (data) {
					if(data.rows==0){
						alert("黑名单为空！！！");
					}else{
					
					  for(var i=0;i<data.rows;i++)
					  changeBlackList.BlackLists.push({ name:data.users[i].name});
					}
					
	              });
	              },
	              
	         intoBlackList:function(uid){
	        	 alert("拉黑成功");
	        
	        	 
	        	 
	         }
		      
		      
		      
		}
	})
	
	
	
}



/*
 * 功能：判断传入的对象里面每个值是否为空。
 * 传入参数为对象 ，里面键值对形式。
 *  message = {'registerusername':registerUsername, 'registerpassword':registerpassword};
 *返回为提示有空值信息空值或者true
 */
function judge(NumOrString) {
    var flag = new Boolean();
    flag = true;
    for (var key in NumOrString) {
        if (NumOrString[key]) {} else {
            flag = false;
        }
    }

    if (!flag) {
        alert("有空值");
    } else {

        return true;
    }
}







</script>
</html>