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
	


var fun = new Number();//记录选择的操作
/*this method order to produce two button 
 * 
 */
function formatOper(val,row,index){  
		 return '<a href="#" onclick="lookAllAss('+index+')">查看详情</a>';  
} 
/*查看任务详情*/
//参数：被选中行
//返回：弹框来显示
function  LookAssDetail(index){
			 $('#alluser').datagrid('selectRow',index);// 关键在这里  
			    var row = $('#alluser').datagrid('getSelected'); 
			    //将这一行数据传到任务详情界面,数据存在localStorage
			    localStorage.setItem("row", row); 
			    window.location.replace("/Parttimejob/jsps/dutyDetail.html");
}
		
/*举报原因信息显示*/
//选中这一行
//返回举报原因
function prosecute(index){
	 $('#alluser').datagrid('selectRow',index);// 关键在这里  
	 var row = $('#alluser').datagrid('getSelected');
	if(row){
		$('#pro').dialog({    
	    closed: false,    
	    cache: false,    
	    modal: true,
	    left:10,
	     title:'举报信息'   
		}); 
		
		//保存默认原始数据
		$('#proFrom').form('load',row);
	}else{
		alert("请选择指定行！!");
	}
	
			
			
}
/*封停该用户*/
function stop(){
			
			var row = $('#alluser').datagrid('getSelected');
			//弹窗警告，确认删除
			if(row){
				$.messager.confirm('确认','您确认想要封停该用户吗？',function(data){    
   				if (data){    
        			url = '/HelpTravel/User/deBlock';//后台servlet，删除
        		  var post=JSON.parse(JSON.stringify(row));
					$.post(url,{uid:post.uid,state:"1"},function(data){	
					if(data==1){
						dealstop(data);
					}else{
						alert("封停成功");
					}
						
					
					
					},"text");   
    													}    
				});  
				}else{
					alert("请选择指定行！");
				}	
		}
		
/*
* 处理返回的封停任务
*/
function dealstop(data){
	var data=JSON.parse(data);
	//弹消息框
	$.messager.show({
		title:'消息',
		msg:'封停成功',
		timeout:5000,
		showType:'slide'
	  });
	$('#alluser').datagrid('reload');
}
	/*解封任务*/
function 	unlockUser(){
	var row = $('#alluser').datagrid('getSelected');
	var post=JSON.parse(JSON.stringify(row));
	//弹窗警告，确认删除
	if(row){
		$.messager.confirm('确认','您确认想要解封该用户吗？',function(data){    
			if (data){    
			url = '/HelpTravel/User/unlockBlock';//后台servlet，删除
			//JSON格式
			$.post(url,{uid:post.uid,state:"0"},function(data){
				
				if(data==1){
					dealunlock(data);
				}else{
					alert("解封错误");
				}
				
			},"text");   									}    
		});  
		}else{
			alert("请选择指定行！");
		}		
}
/*
 * 处理返回的解封数据
 */
function dealunlock(data){
	//编辑完后刷新数据
	var data=JSON.parse(data);

	//弹消息框
	$.messager.show({
		title:'消息',
		msg:'解封成功',
		timeout:5000,
		showType:'slide'
	  });
	$('#alluser').datagrid('reload');
	
}
/*点击查看详情，列出这个人所有的被举报任务*/
function lookAllAss(index){
	 $('#alluser').datagrid('selectRow',index);// 关键在这里  
	  var row = $('#alluser').datagrid('getSelected');
	 
	 var post=JSON.stringify(row);
	 var obj = eval(row);//转为json对象
	   url = '/Parttimejob/AssignmentServlet?method=AssigmentIP';//后台servlet，删除
		$.post(url,{UId:obj.uid},function(data){
			dealBlock(data);
		
			},"text"); 
		//处理弹出框
				  if(row){
					$('#pro').dialog({    
				    closed: false,    
				    cache: false,    
				    modal: true,
				    left:10,
				     title:'举报信息'   
					}); 
					
		//保存默认原始数据
		$('#proFrom').form('load',row);
	}else{
		alert("请选择指定行！!");
	}	
}
/*
 * 处理返回举报信息
 
 */
function dealBlock(data){
	var data = JSON.parse(data);
	 $("#tbody").empty();
   	for(var i=0;i<data.total;i++){
         $("#tbody").append("<tr><td>" + data.rows[i].AId+"</td><td>"+data.rows[i].address+"</td><td>"+"&nbsp;"+data.rows[i].PNum+ "</td></tr>");
   	  
   	}
	
	
}
	
 
	