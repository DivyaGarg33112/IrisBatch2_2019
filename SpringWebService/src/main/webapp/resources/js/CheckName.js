$(document).ready(function(){
  
    
  $("#pName").keyup(function(){
	  var pname=$("#pName").val();
	  
	  $.get("checkProductName?name="+pname, function(data, status){
		    $("#msg").text(data);
	  });
  });
});