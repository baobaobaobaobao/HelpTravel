<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>交游详情页</title>
<style>
     body{
           margin:0;
           padding:0;
           background-image: url("../img/remarkbody.jpg");
           }
            #allRemark{
                margin-top:20px;
                width: 900px;
                height: 30px;
                margin-left:10%;
                font-size: 14px;
                font-weight: bold;
                margin-bottom: 3px;
            }
            #allRemark span{
            margin-left:3px;
            margin-right: 3px;
            }
        	#main-middle{
	        	border:2px solid #c0c0c0;
	        	width: 700px;
        		min-height:600px; 
        		height:auto!important; 
        		height:400px;
        		margin-left:20%;
        		position: absolute;
        		background:url(/HelpTravel/resourses/images/remark/remarkBg.jpg)repeat;
        		
        	}
        	.div{
        	border-bottom: 1px dashed #D3D3D3;
        	}
        	.remark{
        	width: 750px;
        	height: 100px;
        	margin-left:60px;
        	color: gray;
        	
        	}
        	.remark .top{
        	margin-bottom: 10px;
        	font-size: 20px;
        	font-weight: bold;
        	font-family: "楷体";
        	margin-top:5px;
        	}
        	.remark .top span{
        	display: inline-block;
        	}
        	.remark .top .username{
        	margin-left: 20px;
        	}
        	.remark .top .reamrkTime{
        	float:right;
        	}
        	.remark .content{
        	margin-top:10px;
        	font-size: 14px;
        	margin-left:23px;
        	}
        	#shensu{
        	height:30px;
        	width:100px;
        	background:#ffcd99;
        	font-weight:bold;
        	color:#ffffff;
        	float:right;
        	font-size:14px;
        	
        	}
        	/*悬浮窗的改变*/
      .fixed_div{

            position:fixed;
            left:1000px;
            right:200px;
            bottom:20px;
               height:300px;
            width:200px;

        }
        /*我们的鼠标移上去，出现背影*/
        .move:hover{
	    background-color:	#EAEAEA;
	}
</style>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<!-- 背景图片 -->
<div style="width: 100%;height:300px;">
 <img  style="width: 100%;height:400px;" src="/HelpTravel/resourses/images/MytravelDetail/travel4.gif"  ></img>
</div>
<div     style="width:100%,height:400px;"       >
 <!-- 图片显示 -->
		<div   class="borderCommon" style=" float:left; height: 400px;width: 400px;  margin:1px 15% 0% 10%">
		
		 
		    <img   id="JourneyDetailImg" style="width: 450px;height:400px;" ></img>
		 
		  
		   </div>
		<!-- 交游条目详情页面 -->
		 <div   id="journeyDetail"  class="borderCommon " style="  height: 400px;width: 65%;  margin:10% 15% 0% 45%">
		  
		  <div  >
					 <ul   style="outline:none;border:none;">
							    <li class="list-group-item" style="outline:none;border:none;"  > 主题&nbsp;&nbsp;&nbsp;&nbsp;<span     style="font-size:40px;"  id="motif" class="motif"></span></li>
							         <li class="list-group-item" style="outline:none;border:none;" > <img  src="/HelpTravel/resourses/images/MytravelDetail/travel1.png"></img></li>
							    <li class="list-group-item"  style="outline:none;border:none;">金额&nbsp;&nbsp;&nbsp;&nbsp;<span    style="font-size:40px;color : orange;" id="reward" class="reward"></span></li>
							
						
							     <li class="list-group-item"  style="outline:none;border:none;">  <span style="float:left;"> 预定须知 </span> <p  style="margin-left:3px;  font-size: 15px;color: #666;"> &nbsp;此交游条目还有  3 天就要开始了，抓紧时间参与哦</p></li>
							   
							   
							
							<li class="list-group-item"  style="outline:none;border:none;">     电话&nbsp;&nbsp;&nbsp;&nbsp;<span   id="tel" class="request"></span></li>
							
							<li  class="list-group-item"  style="outline:none;border:none;">发布者&nbsp;&nbsp;&nbsp;&nbsp;<a id="publishman"><span   id="Myname" class="request"></span></a>&nbsp;&nbsp;&nbsp;&nbsp;来自&nbsp;&nbsp;&nbsp;&nbsp;<span id="eduction"></span></li>
							<li  class="list-group-item" style="outline:none;border:none;" > <button type="button" class="btn btn-primary btn-lg "  onclick="TakePartIn()">立即参与</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
							 <button type="button"   data-toggle="modal" data-target="#Report"  id="RePort" class="btn btn-default btn-lg">举报 </button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
							 <button type="button"   data-toggle="modal" data-target="#Comment"  id="comment"  class="btn btn-default btn-lg">评论 </button>
							 </li>
			
			
			
			</ul>
		</div>
	</div>
	
</div>	
<!-- 我们的交游详情界面 -->
<div style="height:4000px;"    >
  <div   style="width:100%,height:70px; float:left;margin-left:140px;">
   <img  style=" " src="/HelpTravel/resourses/images/MytravelDetail/product.png"  ></img>
  </div>
        <!-- 广告不动 -->
       
      <!-- 详情显示 -->
  <div  style="margin-top:50px;">
         <div   class="borderCommon" style="  height: auto;width: 300px;  margin:1px 15% 1% 20%">
		    <img   id="JourneyDetailImg1" style="width: 450px;height:400px;" ></img>
		           <div  class="move">    主题&nbsp;&nbsp;&nbsp;&nbsp;<span     style="font-size:30px;"  id="motif1" class="motif"></span></div>
		               <div  class="move">  主要内容：&nbsp;&nbsp;&nbsp;&nbsp;<span     style="font-size:40px;"  id="content1" class="motif"></span></div> 
		 </div>
		    <div class="fixed_div" style=" float:right; margin-right:300px; ">
                  <img   src="/HelpTravel/resourses/images/MytravelDetail/product3.png"  ></img>
             </div>

            
		 <div>
		    <img  style=" margin-left:170px;" src="/HelpTravel/resourses/images/MytravelDetail/product1.png"  ></img>
		   
		 </div>
         <div   style="  height: auto;width: 700px;  margin:50px 1% 1% 20%" >
					      <ul   style="outline:none;border:none;">
							                  <li class="list-group-item" class="move" >  <span style="float:left;"> 预定须知: </span> <p  style="margin-left:3px;  font-size: 15px;color: #666;"> &nbsp;此交游条目还有  3 天就要开始了，抓紧时间参与哦</p></li>
											<li class="list-group-item"  class="move"> 发布时间:&nbsp;&nbsp;&nbsp;&nbsp;<span   id="executetime1" class="executetime"></span></li>
										   <li class="list-group-item" >   最大人数:&nbsp;&nbsp;<span  id="maxquantity1" class="maxquantity1"></span>人</li>
																	   
																	   
																	
										<li class="list-group-item"  >     电话:&nbsp;&nbsp;&nbsp;&nbsp;<span   id="tel1" class="request"></span></li>
																	
									<li  class="list-group-item"  >发布者:&nbsp;&nbsp;&nbsp;&nbsp;<a id="publishman1"><span   id="Myname1" class="request"></span></a>&nbsp;&nbsp;&nbsp;&nbsp;来自&nbsp;&nbsp;&nbsp;&nbsp;<span id="eduction1"></span></li>  
									
				</ul>  
         </div>
         <div>
            <img  style=" margin-left:170px;" src="/HelpTravel/resourses/images/MytravelDetail/product2.png"  ></img>
         </div>
            <!-- 显示用户评论 -->
          <div  style="width:70%;height:2000px;">
		          <div id="allRemark">
								<span  style="margin-left:80px;">全部评价</span>(<span  class="total"></span>)
						</div>
						<div id="main-middle">
						</div>
		   </div>
  </div>
</div>


<!-- 举报模态框（Modal） -->
<div class="modal fade" id="Report" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">真的要举报吗？</h4>
            </div>
            <div class="modal-body">
				           <div class="well well-sm"><a  onclick="RePort('信息虚假')">信息虚假 </a></div>
				           <div class="well well-sm"><a  onclick="RePort('企业冒用')">企业冒用</a></div>
				           <div class="well well-sm"><a  onclick="RePort('电话虚假')">电话虚假</a></div>
				           <div class="well well-sm"><a  onclick="RePort('信息不良')">信息不良</a></div>
				            <div class="well well-sm"><a   onclick="RePort('收取费用')">收取费用</a></div>
				            <div class="well well-sm"><a   onclick="RePort('电话被冒用')">电话被冒用</a></div>
            
            
             </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
               <!--   <button type="button"   onclick="RePort()"  class="btn btn-primary">提交更改</button>  -->
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<!-- 评论模态框（Modal） -->
<div class="modal fade" id="Comment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">请填写您关于本交游条目的评论</h4>
            </div>
            <div class="modal-body">
				           
             <input id="commentTake"   name="mytextarea" style="width:500px;height:200px;"  />
            
            
             </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
               <button type="button"   onclick="Comment()"  class="btn btn-primary">提交更改</button>  
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
	<%@ include file="/WEB-INF/main/bottom.jsp" %></body>

<script type="text/javascript"  src="/HelpTravel/resourses/js/common.js"></script>
<script type="text/javascript">
/*
 * 全局变量
 * */
var searchContent=getQueryString("searchContent");
var jid=GetQueryString("jid");
//获取用户id还有给参与的按钮赋值
var users = sessionStorage.getItem('users');
var user = JSON.parse(users);
//alert(array.name);
//将取出来的数据放在用户名位置
  var uid=user.uid;
/*初始化执行*/
$(document).ready(function() {
	//$('#fix').css('position', 'fixed');
	//根据jid找数据
	var url="http://localhost:8080/HelpTravel/Journey/GetJourneyById";
	var message = {'jid':jid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		DelReceJourneyDetail(data);
	});
});	
//获取交游条目详细信息，并显示在界面上
function DelReceJourneyDetail(data){
	$("#JourneyDetailImg").attr('src',"/HelpTravel/Journey/GetjourneyImg?UUIDString="+data.journey.request);
	$("#JourneyDetailImg1").attr('src',"/HelpTravel/Journey/GetjourneyImg?UUIDString="+data.journey.request);
	$('#motif').html(data.journey.motif);
	$('#motif1').html(data.journey.motif);
	$('#reward').html(data.journey.reward);
	$('#executetime').html(data.journey.reward);
	$('#executetime1').html(data.journey.reward);
	$('#maxquantity').html(data.journey.maxquantity);
	$('#maxquantity1').html(data.journey.maxquantity);
	$('#astate').html(data.journey.astate);
	$('#request').html(data.journey.request);
	$('#tel').html(data.users.tel);
	$('#tel1').html(data.users.tel);
	$('#Myname').html(data.users.name);
	$('#Myname1').html(data.users.name);
	$('#eduction').html(data.users.education);
	$('#eduction1').html(data.users.education);
	$('#content').html(data.users.content);
	 $("#publishman").attr("href","/HelpTravel/his/hisPublish?hisid="+data.users.uid);
	 $("#publishman1").attr("href","/HelpTravel/his/hisPublish?hisid="+data.users.uid);

}
/*参与交游显示*/
function  TakePartIn(){
	
	  var url="http://localhost:8080/HelpTravel/Jreceive/TakeInJourney";
		var message = {'jid':jid, 'uid':uid};
		com.meajax(url,message,function (data) {
			if(data==1)
			alert("参与成功！！！");
			else 
				alert("你已经参与过了！");
		});
}

/*
 * 举报按钮
 */
 function RePort(reportMessage){
	 var url="http://localhost:8080/HelpTravel/Report/ReportJourney";
		var message = {'jid':jid, 'uid':uid,'reason':reportMessage};
		com.meajax(url,message,function (data) {
			if(data==1)
			alert("举报成功！！！");
			else 
				alert("你已经举报过了！");
		});
}
 
 /*
  * 评论按钮
  */
  function Comment(){
 	 var url="http://localhost:8080/HelpTravel/Comment/InsertComment";
 	 
 	 var  comment=$('#commentTake').val();
 	 //alert(comment);
 	 if(comment!=""){
 		var message = {'jid':jid, 'uid':uid,'comment':comment};
 		com.meajax(url,message,function (data) {
 			if(data==1)
 			alert("评论成功！！！");
 			else 
 				alert("你已经评论过了！");
 		});
 	 }else{
 		 
 		 alert("请填写评论");
 	 }
 		
 }
 
 
 
  
</script>


<script type="text/javascript">
/*根据用户id查找到所有他的所有评论信息*/
		

$(document).ready(function() {
	//根据jid找到这个交游对应的所有评论信息
	 var url="http://localhost:8080/HelpTravel/Comment/GetAllCommentByJid";
		var message = {'jid':jid};
		com.meajax(url,message,function (data) {
			 dealRemark(data);   
		});
});
/*
 * 处理返回的评论
 */
 function dealRemark(result){
	//alert(result.length);
	var response= result;
	  var total=response.length;
	
	  $(".total").html(total);
		
		for(var i=0;i<total;i++)
		{
			createDiv(response[i]);
		}
	
}

function createDiv(data){
	 $div=$(divString);
	 $div.find(".username").html("<a href='/Parttimejob/jsps/identify.jsp?uid="+data.uid+"'>"+data.name+"</a>");// 标题
     $div.find(".content").html("评价道：&emsp;"+data.content);// 工作时间
     $div.find(".motif").html(data.motif);// 工作时间
   
      //alert(JSON.parse(sessionStorage.userInfo).uid);
    //因为查看他们评论界面跟自己界面都是一个界面，所以要判断是否同一个人，如果是同一人，就是用户查看自己评论，可以显示申诉按钮。
    //否则不是同一人的话，就是查看他们信息，不显示申诉按钮
 if(uid==null){
	 $div.find(".Bereport").html("<button id='shensu' onclick='report("+data.CId+")'>申&nbsp;&nbsp;诉</button>");// 加申诉按钮
     
 }
    // 将div插入到<body>的尾部（插入到页面中）
    $div.appendTo( $("div#main-middle") );
    console.log('div插入成功');
}

var divString ="<div class='div'>"+
"    <div class='remark'>"+
"    <div class='details'>"+
"       		<div class='top'>"+
"       	<span class='username'></span> &emsp;对&emsp;&emsp;<span class='motif'></span>"+
"       </div>"+
"       <div class='content'>"+
"    </div>"+
"    <span  class='contents'></span>"+
"<span class='Bereport'></span>"+
"    	</div>"+
"    </div>"+
"</div>";

/*滚动条到一个位置，那个div自动消失*/
$(function () {              
    //绑定滚动条事件  
      //绑定滚动条事件  
    $(window).bind("scroll", function () {  
        var sTop = $(window).scrollTop();  
        var sTop = parseInt(sTop);  
        if (sTop >= 1000) {  
            if (!$(".fixed_div").is(":visible")) {  
                try {  
                    $(".fixed_div").slideDown();  
                } catch (e) {  
                    $(".fixed_div").show();  
                }                        
            }  
        }  
        else {  
            if ($(".fixed_div").is(":visible")) {  
                try {  
                    $(".fixed_div").slideUp();  
                } catch (e) {  
                    $(".fixed_div").hide();  
                }                         
            }  
        }   
    });  
})  
</script>
</html>