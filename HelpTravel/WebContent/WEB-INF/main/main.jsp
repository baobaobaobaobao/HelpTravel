<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>交游主页</title>

 <link href="/HelpTravel/resourses/css/mainCss/full-screen-slide.min.css" rel="stylesheet" type="text/css">
 <link href="/HelpTravel/resourses/css/mainCss/normalize.css" rel="stylesheet" type="text/css">
 <link href="/HelpTravel/resourses/css/mainCss/page.css" rel="stylesheet" type="text/css">
      <link href="/HelpTravel/resourses/css/mainCss/main.css" rel="stylesheet" type="text/css">
<style>
	.slide-li{
		text-align: center;
	    font-size: 18px;
	    display: -webkit-box;
	    display: -webkit-flex;
	    display: flex;
	    -webkit-box-pack: center;
	    -ms-flex-pack: center;
	    -webkit-justify-content: center;
	    justify-content: center;
	    -webkit-box-align: center;
	    -ms-flex-align: center;
	    -webkit-align-items: center;
	    align-items: center;
	}
	.slide-li:nth-child(1){
		background: #01ad59;
	    color:#fff;
	}
	.slide-li:nth-child(3){
	background-color: #2F2F2F;
	color: #fff;
	}
	
	/*这个是我的广告文字的显示，是为了防止溢出多余的文字*/
	.AdvertisementMotif{
	
	width: 240px;
	height:60px;
	overflow:hidden;
	text-overflow:ellipsis;
	white-space:norwap;
	
	}
	/*让字体只显示两行*/
	.fontShow{
	white-space:norwap;
			overflow:hidden; 
		 text-overflow:ellipsis
		 display:-webkit-box; 
		-webkit-box-orient:vertical;
		-webkit-line-clamp:3; }
	/*旅游条目个人图片显示*/
	.travelShow{
	
			width: 130px;
			height:130px;
		   margin-top:30px;
		   margin-left:30px;
	}
	
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
   span.hover-yellow:hover{color:#FF7F00;}
	</style>

</head>
<body>
<%@ include file="/WEB-INF/main/top.jsp" %>


    
    	
          <div   class="middle"    style=" width: 80%;height:400px; margin-left:135px;">
           <!-- 轮播图 -->
          
				        <!-- 块状调用demo -->
					<div class="slide-box-full">
						<div class="slide-box ">
							<!-- 轮播图主体模块 -->
							<div class="slide-con">
								<div class="slide-out" id="Carousel">
									<a  id="ACarousel0"><div class="slide-li"><img  id="Carousel0" src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1330089000,2765756545&fm=200&gp=0.jpg" style="width: 100%" alt=""></div></a>
									<a id="ACarousel1"><div class="slide-li"><img  id="Carousel1"  src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1330089000,2765756545&fm=200&gp=0.jpg" style="width: 100%" alt=""></div></a>
								    <a id="ACarousel2"> <div class="slide-li"><img  id="Carousel2"  src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1330089000,2765756545&fm=200&gp=0.jpg" style="width: 100%" alt=""></div></a>
									<a id="ACarousel3"><div class="slide-li"><img  id="Carousel3"  src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1330089000,2765756545&fm=200&gp=0.jpg" style="width: 100%" alt=""></div></a>
								</div>
							</div>
							<!-- 自定义上一页下一页 -->
							<div class="slide-page">
								<div class="slide-button-prev"><i></i></div>
								<div class="slide-button-next"><i></i></div>
							</div>
						</div>	
					</div>
        
        
          
         </div>
         
         <!-- 广告显示 ，并列四个div-->
         <div  style="
            left:0;
            top: 20px;
            bottom: 0;right: 0;margin: auto;  width: 80%;height:300px;" >
         <div><h4>热门推荐</h4></div>
           <div     class='hover-yellow' style="float:left;width: 25%;height:290px;">
             <a id="AdvertisementHref0">
                <div    class="borderCommon"  style="width: 100%;height:200px;">
                  <img     id="AdvertisementImg0"  style="width: 250px;height:200px;" ></img>
                </div>
                <div class="AdvertisementMotif">
                        <span id="AdvertisementText0"  class='hover-yellow'   style="font-size:26px"   ></span>
                        <div    style="float:right;margin-right:10px;"        ><span   id="Advertisementmoneny0"></span>元</div>
                </div>
              </a>  
           </div>
           <div      style="float:left;width: 25%;height:290px;">
            <a  id="AdvertisementHref1" >
               <div   class="borderCommon"  style="width: 100%;height:200px;">
                  <img    id="AdvertisementImg1"  style="width: 250px;height:200px;" ></img>
                </div>
                 <div>
                 <span  id="AdvertisementText1"  class='hover-yellow'  style="font-size:26px"   ></span>
                  <div    style="float:right; margin-right:10px;"        ><span   id="Advertisementmoneny1"></span>元</div>
                </div>
               </a>
           </div>
           <div   class="borderCommon"  style="float:right;width: 25%;height:290px;">
            <a  id="AdvertisementHref2" >
              <div  class="borderCommon"  style="width: 100%;height:200px;">
               <img    id="AdvertisementImg2"  style="width: 250px;height:200px;" ></img>
                </div>
                 <div>
                 <span   id="AdvertisementText2"    class='hover-yellow' style="font-size:26px"  >      </span>
                  <div    style="float:right;margin-right:10px;"        ><span   id="Advertisementmoneny2"></span>元</div>
                </div>
               </a>
           </div>
           
           <div   class="borderCommon"  style="float:right;width: 25%;height:290px;">
             <a id="AdvertisementHref3">
                <div    class="borderCommon" style="width: 100%;height:200px;">
                         <img   id="AdvertisementImg3"  style="width: 250px;height:200px;" ></img>
                </div>
                 <div>
                 <span  id="AdvertisementText3"   class='hover-yellow' style="font-size:26px"  ></span>
                  <div    style="float:right; margin-right:10px;"        ><span   id="Advertisementmoneny3"></span>元</div>
                </div>
              </a>
           </div>
         
         
         </div>
         
    	  <!--条目显示-->
       <div    class="borderCommon"   class="behind"    style=" margin: 0% 20% 10% 10%;   height:1300px; width: 90%;    ">
          <!-- 左边的广告 -->
           <div   class="borderCommon" style="  height: 1000px;width: 20%; float:left;">
           
	             <div> 
	                <p style="font-size:20px;"> 最新交游活动</p>
	               <a href="/HelpTravel/Journey/GetJourneyDetail?jid=2"> <img  style=" width:250px;"   src="/HelpTravel/resourses/images/main/LeftAdvermen1.jpg"/></a>
	   
	             </div>
	               <br>
	              <div   style="height:500px;">
	                          <p style="font-size:20px;">游记最新动态 </p>
	                          <div >
										<div id="newTravelMessages">
												  <ol  class="list-group" >
												    <li    class="list-group-item  showBackgroud"  style="height:90px;"    v-for="TravelMessage in TravelMessages">
												    <!-- vue的字符拼接比较奇怪的。非要这样的才行。 -->
												      <a  class="hover-yellow"   :href= "'/HelpTravel/TravelMessage/hisTravelmessage?pid='+TravelMessage.datas.pid">  {{ TravelMessage.datas.title }}</a> 
												    <br/>
												     <span  class="fontShow"  style="height:auto;"> {{ TravelMessage.datas.text }}</span>
												  
												    </li>
												  </ol>
                                        </div>
								</div>
	               </div>
	             <div>
	               <p style="font-size:20px;"> 欢迎加入我们 </p>
	               <a  href="/HelpTravel/Journey/GetJourneyDetail?jid=2"><img  style=" width:250px;"    src="/HelpTravel/resourses/images/main/leftAdverment2.jpg"></img></a> 
	             </div>
	            <!--  <div>
	               <p style="font-size:20px;"> 加入我们的交游 </p>
	               <a  href="/HelpTravel/Journey/GetJourneyDetail?jid=3"><img  style=" width:250px;"    src="/HelpTravel/resourses/images/main/LeftAdverment3.png"></img></a> 
	             </div>
	             
	              --> 
	             
            
           </div>
          
              <div   class="borderCommon" style=" float:right;  height: 1500px;width: 80%;" >
             <!-- 右边自动显示和搜索显示 -->
                 <div   id="journey"  class="borderCommon"   style="  margin-left:10%; height: 1400px;width: 900px;">
              
                      
              
                 </div>
		         <div  style="height:50px;margin-bottom:1px; margin-left:100px;"  ><ul class="page" maxshowpageitem="5" pagelistcount="10"  id="page"></ul></div>
        
            </div>
     </div>
    
      <%@ include file="/WEB-INF/main/bottom.jsp" %>
    	
    	
    	
</body>
<script type="text/javascript"  src="/HelpTravel/resourses/js/common.js"></script>

<script src="/HelpTravel/resourses/js/main/full-screen-slide.min.js"></script>
<script src="/HelpTravel/resourses/js/main/page.js"></script>
<script type="text/javascript">
/*
 * 全局变量
 */
var row;
//就是分页啊
var Page = {
    "GetPaginationNum":function(paginationNum){
    	//设置分页参数
     
    	//发送页数
    	GetjourneyByPage(paginationNum);
    }
}
var i=0;
/*初始化执行*/

 /*组件使用来把最新游记title加入*/
 

$(document).ready(function() {
	DefaultShowTravelMessage(); 
	//默认显示轮播图片
	DefaultShowPicture();
	//默认显示一些详细交游信息
   DefaultShow();
	//默认显示四条广告
    DefaultShowAdvertisement(); 
	//显示左边我的游记
});	



function   DefaultShowPicture(){
	
	
	//默认只有四个div
	var url="http://localhost:8080/HelpTravel/Journey/GetjourneyByAdvertisement";
	var message="0";
	com.meajax(url,message,function (data) {
	
		for(var i=0;i<4;i++){
			
			$("#Carousel"+i).attr("src","/HelpTravel/Journey/GetjourneyImg?UUIDString="+data.journeys[i].request);
			$("#ACarousel"+i).attr("href","/HelpTravel/Journey/GetJourneyDetail?jid="+data.journeys[i].jid);
		}
		     
	});		
}

//显示四条广告信息
function DefaultShowAdvertisement(){

var url="http://localhost:8080/HelpTravel/Journey/GetjourneyByAdvertisement";
var message="0";
com.meajax(url,message,function (data) {
	  DefaultAdvertisement(data);
});	

}
//处理四条广告所用函数
function  DefaultAdvertisement(data){
	//alert(data);
	for(var i=0;i<4;i++){		
	$("#AdvertisementImg"+i).attr('src',"/HelpTravel/Journey/GetjourneyImg?UUIDString="+data.journeys[i].request);	 
	$("#AdvertisementText"+i).text(data.journeys[i].motif);
	$("#AdvertisementHref"+i).attr("href","/HelpTravel/Journey/GetJourneyDetail?jid="+data.journeys[i].jid);
	$("#Advertisementmoneny"+i).text(data.journeys[i].reward);
	}
}
//默认显示一些交游信息广告用
function DefaultShow(){
	var url="http://localhost:8080/HelpTravel/Journey/defaultJourneyAndUser";
	var message="0";
	com.meajax(url,message,function (data) {
		DealJourney(data);
	});	
}
//处理显示的交游信息
function DealJourney(data){
	//alert(JSON.stringify(data));
	var rows=data.rows;
	row=rows;
	
	//每页显示10个。
	$("#journey").empty();
	for(i=0;i<9;i++)
	{	
		createDiv(data.journeys[i],i);
	}
	//设置分页显示
	$("#page").initPage(row,1,Page.GetPaginationNum);
}
//根据当前页数显示交游信息
function GetjourneyByPage(paginationNum){
	var url="http://localhost:8080/HelpTravel/Journey/GetjourneyByPage";
	var message = {'paginationNum':paginationNum, 'msg':"我过来了"};
	com.meajax(url,message,function (data) {
		DealJourney(data);
	});	
}

//创建div
var obj = {};
obj.j=0;//增加一个属性CONST_A
function createDiv(data,i){
	var divString =
 		'<div class="rows">'+
 		'<div >'+
 		'<img    class="travelShow"  id="travelShow'+i+'"  ></img>'+
 		'<div   style=" width:70%;height:100%;  float:right;" >'+
 		'<div style="float:left;" >'+
 		'    <h3   ><span class="type"></span><span   class="title"></span></h3>'+
 		'    <div  style="margin-top:10px;margin-bottom:12px;"  class="details">'+
 		'        <span class="work-date span">游玩时间:&emsp;<span></span></span>'+
 		
 		'       &emsp; <span class="work-place span">游玩地点:&emsp;<span></span></span>'+
 		'<br>'+
 		'<div   >'+
 		'   <h4> <a class="contact" >查看详情</a></h4>'+
 		'</div>'+
 		'    </div>'+
 		'    <div class="salary">'+
 		'  发布人:&emsp;<a  class="publishman"> <span class="publishman  span"><span></span></span></a>'+
 		'  &emsp;  <span class="school  span">来自:&emsp;<span></span></span>'+
 		
 		'    </div>'+
 		
 		'</div>'+
 		'</div>'+
 		'</div>'+
 		'</a>'
 		;
	
	$div=$(divString);
	 $div.find('.title').html("<a   class='hover-yellow' href='/HelpTravel/Journey/GetJourneyDetail?jid="+data.jid+"'>"+data.motif+"</a>");// 标题
	 $(".jump").attr("href","/HelpTravel/Journey/GetJourneyDetail?jid="+data.jid);
	 // $(".travelShow"+i).attr("id","travelShowImg"+i);   
	 $(".publishman").attr("href","/HelpTravel/his/hisPublish?hisid="+data.uid);
	 $div.find('.work-date span').html(data.executetime);// 工作时间
     $div.find('.work-place span').html(data.address);// 工作地点
     $div.find('.set-count span').html(data.motif);// 主题
     $div.find('.content span').html(data.content);// 要求
     $div.find('.publishman span').html(data.name);// 发布人
     $div.find('.school  span').html(data.education);// 
     // 将div插入到<body>的尾部（插入到页面中）
     $div.find('.contact').attr("href","/HelpTravel/Journey/GetJourneyDetail?jid="+data.jid);
     $div.appendTo( $('div#journey') );
     console.log('div插入成功');
    
     $("#travelShow"+i).attr('src',"/HelpTravel/Journey/GetjourneyImg?UUIDString="+data.request);	
}

	
	
	// 块状轮播图
	$('.slide-box-full').setSlide({
		fullScreenw:false,
		fullScreenh:false,
		isBlock:true,
		switchingSpeed:400,
		slideTime: 3000,
	    autoPlay:true,
		prevEl:$('.slide-box-full').find('.slide-button-prev'),
		nextEl:$('.slide-box-full').find('.slide-button-next'),
		pagination:true,
		pagingTrigger:'hover',
		slideLiw:1100,
		slideLih:400,
		fn:function(index) {
			//alert(index);
		}
	});
var TravelMessages = new Vue({
		  el: '#newTravelMessages',
		  data: {
			  TravelMessages: [
		    ],
	         TravelMessagesPids:[]
		  }
		})
function   DefaultShowTravelMessage(){
	var url="http://localhost:8080/HelpTravel/TravelMessage/GetDefaultTravelMessage";
	var message = {'msg':"我过来了"};
	com.meajax(url,message,function (data) {
				//把游记的5个默认title放进去。
				for(var i=0;i<5;i++){
					TravelMessages.TravelMessages.push({ datas:data[i]});
		}
	});
}


</script>
</html>