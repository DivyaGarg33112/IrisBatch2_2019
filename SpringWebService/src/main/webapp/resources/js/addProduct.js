$(document).ready(function(){
				$("#addPro").click(function(){
					var a=$("#pName").val();
					var b=$("#price").val();
					
					
					var result=confirm("Are u sure u want to add Product : "+a+" "+b);
					if(result==true){
						$("#proForm").submit();
					}
					else {
						return false;
					}
				})
			});