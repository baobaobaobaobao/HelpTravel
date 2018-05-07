<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的交游</title>
</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>
<img style="width:100%; height:400px;" src="/HelpTravel/resourses/images/My/User1.jpg"></img>
 <%@ include file="/WEB-INF/My/Common.jsp" %>
<%@ include file="/WEB-INF/main/bottom.jsp" %>
<!-- 模态框（Modal） -->
<div class="modal fade" id="MyjourneyDetail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
            </div>
            <div class="modal-body">
                                           该交游执行时间为   <h5  id="times"></h5>
              </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <a type="button"   id="journeyDetail" class="btn btn-primary">查看详细</a>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

</body>
<script type="text/javascript">
/*初始化执行*/
$(document).ready(function() {
	//获取用户信息，并显示我的发布信息
	GetAndShowMyTravel();
	
});	
//获取用户信息，并显示我的接收信息
function   GetAndShowMyTravel(){  
	//设置标签页
	$("#publish").removeClass("active");
	$("#part").addClass("active");
	//取出sessionStorage中登录用户数据，然后使用它
	var users = sessionStorage.getItem('users');
	var user = JSON.parse(users);
	var url="http://localhost:8080/HelpTravel/Journey/getJourneyByRId";
	var RId=user.uid;
	var message = {'RId':RId, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		DelMyPublish(data);
		
	});
}
function  DelMyPublish(data){
	
	var rows=data.rows;
	
	$("#MyPublishShow").empty();
	//取消掉tr的操作选项，因为是我们的交游没有操作权限，只能举报等等。
	//$("#controller").remove();
	
	$("#time").text("地址");
	$("#rows").html(rows);
	//开始循环处理每一条数据
	for(var i=0;i<rows;i++)
	{	
		DelTable(data.journeys[i]);	
	}
	//初始化我们的分页插件
	$('.table tbody').paginathing({
		  perPage: 10,
		  insertAfter: '.table',
		  pageNumbers: true
		});
	
}
function DelTable(journey){
	//循环插入数据
    $("#MyPublishShow").append("<tr><td>" +
    		"<a href='/HelpTravel/Journey/GetJourneyDetail?jid="+journey.jid+"'>" +	journey.motif  +"</a>"+
    		"</td><td>"+journey.address+
    		"</td><td>"+journey.maxquantity+
    		"</td><td>"+
    		"<button class='btn btn-default'  data-toggle='modal' data-target='#MyjourneyDetail'   onclick='showTime("+journey.jid+")'"+">查看时间</button>"+
    		"</td></tr>");
}
function showTime(jid){
	/*查看这个交游一些信息*/
	var url="http://localhost:8080/HelpTravel/Journey/GetJourneyById";
	
	var message = {'jid':jid, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		$("#myModalLabel").text(data.journey.motif);
		$("#times").text(data.journey.executetime);
		$("#journeyDetail").attr("href","/HelpTravel/Journey/GetJourneyDetail?jid="+data.journey.jid);
		
	});
	
	
	//alert(jid); 
}
</script>
</html>