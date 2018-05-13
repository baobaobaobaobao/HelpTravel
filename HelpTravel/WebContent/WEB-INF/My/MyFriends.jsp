<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img   style="width:100%; height:400px;"  src="/HelpTravel/resourses/images/My/User1.jpg"></img>
   <%@ include file="/WEB-INF/My/Common.jsp" %>
   <%@ include file="/WEB-INF/main/bottom.jsp" %>
</body>
<script>


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
<script  type="text/javascript">

/*vue学习组件化构建我的项目*/
var myfriends = new Vue({
	  el: '#myfriends',
	  created: function () {
		     //初始状态来初始化界面。
		  var users = sessionStorage.getItem('users');
			var user = JSON.parse(users);
			//alert(user.uid);
			var url="http://localhost:8080/HelpTravel/MyFriends/getMyFriends";
			var uid=user.uid;
			var message = {'uid':uid, 'msg':"我过来了"};
			com.meajax(url,message,function (data) {
				this.myfriends=data;
				this.DelMyfriends();
			});
			
		  },
	  data: {
		  myfriends:[],
	      
	  },
	  methods: {
		  DelMyfriends: function () {
			        var data=this.myfriends;
			    var rows=data.rows;
				
				$("#MyPublishShow").empty();
				$("#rows").html(rows);
				for(var i=0;i<rows;i++)
				{	
					alert(data.journeys[i]);
					//DelTable(data.journeys[i]);	
				}
				$('.table tbody').paginathing({
					  perPage: 10,
					  insertAfter: '.table',
					  pageNumbers: true
					});
	     
	    }
	    
	    
	  }
	})
</script>
</html>