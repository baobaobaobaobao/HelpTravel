/*封装公共ajax方法*/
	var com = {

			
		    meajax:function(murl,mdata,success){
		        $.post(murl,{
					message:JSON.stringify(mdata)
				},function(result){
		        	 success?success(result):function(){};	
				})
		    }
		}


	
	