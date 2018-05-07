<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的游记</title>
 <script type="text/javascript"  src="/HelpTravel/resourses/js/wangEditor.min.js"></script>
 <style>
  table {  
            width:450px;  
            table-layout:fixed;  
        }  
        td {  
            white-space:nowrap;  
            overflow:hidden;  
                text-overflow: ellipsis;
        }  
        
       
 
 </style>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img   style="width:100%; height:400px;"  src="/HelpTravel/resourses/images/My/User1.jpg"></img>

 <%@ include file="/WEB-INF/My/Common.jsp" %>
<div  style=" height:800px;width:1000px; background-color:white; ">

      <!-- 下边的的写游记 -->
      <div style="   background-color:white; "  id="initMessage">
            
			<div  style="margin-left:50%;margin-right:auto;margin-top:0%;">
			   <img   src="/HelpTravel/resourses/images/MytravelDetail/travel8.png"></img>
			</div>
			<div  style="margin-left:70%;margin-right:auto;margin-top:10%;" >
			    <button  onclick="UpdateMessage()"> <img src="/HelpTravel/resourses/images/MytravelDetail/travel9.png" > </img </button>
			</div>

      </div>
      
        <!-- 写游记具体的东西 -->
         <div  id="Message">
             <div class="input-group"   style="margin-left:50%;margin-top:5%;margin-bottom:5px;">
		            <span class="input-group-addon">想个美丽的标题</span>
		            <input type="text"  id="travelMessageTextTitle" class="form-control" placeholder="游记标题">
             </div>
             <div id="editor"  style="height:200px; width:800px;margin-left:50%;margin-right:auto;margin-top:5%;">
                 <p  id="travelMessageText">请写下你的游记。。。</p>
             </div>
             <div style="margin-left:70%;margin-right:auto; margin-top:20%;">
                <button   id="PostMessage" onclick="PostMessage()"> <img src="/HelpTravel/resourses/images/MytravelDetail/travel10.png" >  </button> 
              </div>       
    <!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
    
         </div>
      
</div>

  <%@ include file="/WEB-INF/main/bottom.jsp" %>
</body>

<script type="text/javascript">
var users = sessionStorage.getItem('users');
var user = JSON.parse(users);
 var uid=user.uid;
 var pid=0;//需要等待赋值
  //编辑器初始化
  var E = window.wangEditor;
  var editor = new E('#editor');
 $(function(){ 
	 /*初始实行*/
	 init();
	 //显示所有交游游记
	 GetAndShowMyTravelMessage();
}); 
 
 /*初始执行，给编辑框隐藏*/
 function init(){
	
     editor.create();
     $("#Message").hide();
    
 }
       
   //点击换成编辑界面     
function   UpdateMessage(){
    $("#initMessage").hide();
     $("#Message").show();	
}
//发布兼修改功能
function  PostMessage(){
      	//alert(editor.txt.text());
        var json = editor.txt.getJSON();  // 获取 JSON 格式的内容
       // var jsonStr = JSON.stringify(json);
        
        var url="http://localhost:8080/HelpTravel/TravelMessage/InsertTravelMessage";
    	var message = {'uid':uid, 'TravelMessage':editor.txt.text(),'title':$('#travelMessageTextTitle').val(),'pid':pid};
    	
    	if(editor.txt.text() == ""||$('#travelMessageTextTitle').val() == ""){
			alert("您还有未填项，请填写完整！！！");
		}else{
    	com.meajax(url,message,function (data) {
    		if(data==1){
    			alert("发布成功");
    			location.reload();
    		}else{
    			alert("失败");
    		}
    		
    	});
		}
       
   
    }
    
    /*显示游记信息*/
    function   GetAndShowMyTravelMessage(){
    	/*修改表格th内容*/
    	$("#title").text("标题");
    	$("#time").text("创造时间");
    	$("#text").text("内容");
    	/*接下来就是显示的事了*/
    	var url="http://localhost:8080/HelpTravel/TravelMessage/allMessage";
    	
    	var message = {'uid':uid, 'msg':"我过来了"};
    	com.meajax(url,message,function (data) {
    		DelMyTravelMessage(data);
    		
    	});
    }
    function  DelMyTravelMessage(data){
    	
    	var rows=data.rows;
    	//alert(rows);
    	//alert(data.journey[1]);
    	$("#MyPublishShow").empty();
    	for(var i=0;i<rows;i++)
    	{	
    		DelTable(data.travelmessages[i]);	
    	}
    	$('.table tbody').paginathing({
    		  perPage: 10,
    		  insertAfter: '.table',
    		  pageNumbers: true
    		});
    	
    }
    function   DelTable(TravelMessage){
    	$("#MyPublishShow").append("<tr><td>" + 
    	    	"<a onclick=showslow("+TravelMessage.uid+")>" +	TravelMessage.title  +"</a>"+
    	    		"</td><td>"+sub(TravelMessage.createtime)+ 
    	    		"</td><td>"+TravelMessage.text+
    	    		"</td><td>"+
    	    	
    	    				"&nbsp;&nbsp;"+
    	    	    "<button   class='btn btn-default'  onclick='updateByid("+TravelMessage.pid+")'"+">修改</button>"+
    	    		"</td></tr>");
    	
    	
    }
   
    
    /*
    用于截取时间并且加-号，因为我的日期为20181212形式，而我需要的是2018-12-12形式
    
    */
    
    function   sub(str){
    	var sub1=str.substring(0,4);
    	var sub2=str.substring(4,6);
    	var sub3=str.substring(6,8);
    	return(sub1+'-'+sub2+'-'+sub3);
    	
    	
    
    }
    /*界面滑动下来并且修改东西*/
    function updateByid(updatepid)
    {
    	pid=updatepid;
    	//首先把底下的界面换掉
    	UpdateMessage();
    	//再就是把我们的这个id去后台搜到相应对应游记信息赋值呀。
    	var url="http://localhost:8080/HelpTravel/TravelMessage/getMessageByid";
    	var message = {'pid':pid, 'msg':"我过来了"};
    	com.meajax(url,message,function (data) {
    		//相应对应游记信息赋值
    		$("#travelMessageTextTitle").val(data.title);
        	editor.txt.html(data.text);
    	});
    	
    	
    	//然后往下滑
       $("html,body").animate({ scrollTop: 1300 }, 1000);//1500为滚动条的位置，1000为滚动的时延
    
    /*显示界面东西*/
    }
</script>
</html>