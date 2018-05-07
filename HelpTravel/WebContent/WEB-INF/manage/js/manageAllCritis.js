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

		
/*举报原因信息显示*/

/*封停该评论*/
function stop(){
			
			var row = $('#allCritis').datagrid('getSelected');
			var  post=JSON.parse(JSON.stringify(row));
			//弹窗警告，确认删除
			if(row){
				$.messager.confirm('确认','您确认想要删除该评论吗？',function(data){    
   				if (data){    
        			url = '/HelpTravel/Comment/deleteComment';//后台servlet，删除
        		
					$.post(url,{cid:post.cid},function(data){	
						dealstop(data);
					
					},"text");   
    													}    
				});  
				}else{
					alert("请选择指定行！");
				}	
		}
		
/*
* 处理返回的封停评论
*/
function dealstop(data){
	if(data==1){
			//弹消息框
			$.messager.show({
				title:'消息',
				msg:"删除成功",
				timeout:5000,
				showType:'slide'
			  });
			$('#allCritis').datagrid('reload');
	}else{
		
		alert("删除失败");
	}
	}
	/*解封评论*/
function 	begin(){
	var row = $('#alluser').datagrid('getSelected');
	var post=JSON.parse(JSON.stringify(row));
	//弹窗警告，确认删除
	if(row){
		$.messager.confirm('确认','您确认想要解封该用户吗？',function(data){    
			if (data){    
			url = '/Parttimejob/PeopleServlet?method=deBlock';//后台servlet，删除
			//JSON格式
			$.post(url,{username:post.userName,state:"0"},function(data){
				dealbegin(data);//处理返回的解封数据
			},"text");   									}    
		});  
		}else{
			alert("请选择指定行！");
		}		
}
/*
 * 处理返回的解封数据
 */
function dealbegin(data){
	//编辑完后刷新数据
	var data=JSON.parse(data);

	//弹消息框
	$.messager.show({
		title:'消息',
		msg:data.msg,
		timeout:5000,
		showType:'slide'
	  });
	$('#alluser').datagrid('reload');
	
}

	
 
	