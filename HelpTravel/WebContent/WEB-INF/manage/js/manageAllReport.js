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

/*删除该投诉*/
function stop(){
			
			var row = $('#allReport').datagrid('getSelected');
			var  post=JSON.parse(JSON.stringify(row));
			
			//弹窗警告，确认删除
			if(row){
				$.messager.confirm('确认','您确认想要删除该投诉吗？',function(data){    
   				if (data){    
        			url = '/HelpTravel/Report/DeleteReportJourney';//后台servlet，删除
        		
					$.post(url,{ruid:post.ruid},function(data){	
						if(data==1){
							 dealstop(data);
							
						}else{
							alert("删除失败");
						}
					
					},"text");   									}    
				});  
				}else{
					alert("请选择指定行！");
				}	
		}
		
/*
* 处理返回的封停评论
*/
function dealstop(data){
	
	//弹消息框
	$.messager.show({
		title:'消息',
		msg:'删除成功',
		timeout:5000,
		showType:'slide'
	  });
	$('#allReport').datagrid('reload');
}
	
	