//扩展
	$.extend($.fn.form.methods, {  
    serialize: function(jq){  
        var arrayValue = $(jq[0]).serializeArray();
        var json = {};
        $.each(arrayValue, function() {
            var item = this;
            if (json[item["name"]]) {
                json[item["name"]] = json[item["name"]] + "," + item["value"];
            } else {
                json[item["name"]] = item["value"];
            }
        });
        return json; 
    },
    getValue:function(jq,name){  
        var jsonValue = $(jq[0]).form("serialize");
        return jsonValue[name]; 
    },
    setValue:function(jq,name,value){
        return jq.each(function () {
                _b(this, _29);
                var data = {};
                data[name] = value;
                $(this).form("load",data);
        });
    }
});
		
		
$('#tab').tabs({
	tools:'#tab-tools'
});
/*
 *this method is produce two button,include LookAssigmentDetail and LookBereport
 */
function formatOper(val,row,index){  
		    return '<a class="look" onclick="LookAssDetail('+index+')"  target="_blank">查看详情</a>&nbsp;&nbsp;'+'<a  onclick="prosecute('+index+')">举报原因</a>';  
		} 
/*this method is lookAssimentDetail
 * pararm: this selected row
*return:   dialog to show return message  
*/
function  LookAssDetail(index){
    $('#allduty').datagrid('selectRow',index);// 关键在这里  
    var row = $('#allduty').datagrid('getSelected'); 
    var post=JSON.parse(JSON.stringify(row));
    var url = '/Parttimejob/AssignmentServlet?method=AssigmentShow';//后台servlet，删除
	$.post(url,{AId:post.AID},function(data){
	var data = JSON.parse(data);
		},"text");   
    //将这一行数据传到任务详情界面,数据存在localStorage
   localStorage.setItem("row", row); 
  $(".look").attr("href","/Parttimejob/jsps/dutyDetail.jsp?aid="+AID);
}
		
/* this method order to look Bereport reason message
* param:this selected row
*return: Bereport reason message
*/
function prosecute(index){
	$('#allduty').datagrid('selectRow',index);// get selected row
	var row = $('#allduty').datagrid('getSelected');
	var post=JSON.parse(JSON.stringify(row));
	 url = '/Parttimejob/AssignmentServlet?method=ReportReason';
	$.post(url,{AId:post.AID},function(data){//use ajax to send aid to behind code to deal
	dealprosecute(data);
	},"text");   
	if(row){
		$('#pro').dialog({    
	    closed: false,    
	    cache: false,    
	    modal: true,
	    left:10,
	    top:30,
	     title:'举报信息'   
		}); 
		
		//保存默认原始数据
		$('#proFrom').form('load',row);
	}else{
		alert("请选择指定行！!");
}
}
/*this method to deal return Bereport message
 * return: a dialog that include   bereport table message
 *  */
function dealprosecute(data){
	var data = JSON.parse(data);
	 $("#tbody").empty();
   	
   	for(var i=0;i<data.total;i++)
   	{
           $("#tbody").append("<tr><td>" + data.rows[i].nickname+":"+"&nbsp;"+"&nbsp;"+data.rows[i].reason+ "</td></tr>");
   	  
   	}
}
	
/*this method to blockade user
 * param: the selected row
 * return:a dialog include return message ,maybe are "bolockade success" or not
 */

		
function stop(){
	var row = $('#allduty').datagrid('getSelected');
	//弹窗警告，确认删除
	if(row){
		$.messager.confirm('确认','您确认想要封停该交游条目吗？',function(r){ 	
		if (r){    
			url = '/HelpTravel/Journey/adminLockJourney';//后台servlet，删除
			//JSON格式
			var post=JSON.parse(JSON.stringify(row));
			$.post(url,{jid:post.jid},function(data){
				if(data==1){
						$.messager.show({
							title:'消息',
							msg:data.msg,
							timeout:5000,
							showType:'slide'
						});
						$('#allduty').datagrid('load',null);
				}else{
					alert("封锁失败");
				}
			
			
			},"text");   
												}    
		});  
		}else{
			alert("请选择指定行！");
		    }	
}
/*this method to  Deblocking assigment
 * params: the select row
 * return: a dialog include "deblocking message" or "delocking message"
 */

function 	begin(){
		
var row = $('#allduty').datagrid('getSelected');
//弹窗警告，确认删除
if(row){
	$.messager.confirm('确认','您确认想要解封该交游条目吗？',function(r){    
	if (r){    
		url = '/HelpTravel/Journey/adminUnLockJourney';//后台servlet，删除
		//JSON格式
		var post=JSON.parse(JSON.stringify(row));
		var AID=post[8];
		$.post(url,{jid:post.jid},function(data){
		    if(data==1){
			//弹消息框
			$.messager.show({
				title:'消息',
				msg:"解封成功",
				timeout:5000,
				showType:'slide'
			});
		//编辑完后刷新数据
		$('#allduty').datagrid('reload');
		    }else{
		    	alert("解封失败");
				
				
			}
		},"text");
		
		}    
	});  
	}else{
		alert("请选择指定行！");
	}
}
/*
 * 添加标签
 * 
 * 
 */

	