
function getDicList(obj,keyword){
	var	url = path + "/dev/getDicList";
	var	data = "typeCode="+keyword;
	$.getJSON(url,data,function(data){
	  //创建需要加载的选项
	  for(var i =0;i < data.length;i++){
		  var $option = $("<option></option>");
		  $option.attr("value",data[i].valueId);
		  $option.text(data[i].valueName);
		  obj.append($option);
	  }
	})
}
function getCategoryList(obj,keyword){
	var url = path +"/dev/getCategoryList/" + keyword;
	$.getJSON(url,"",function(data){
		//清除多于选项
//		obj.chidren().not(":first").remove();
		//创建需要加载的选项
		for(var i =0;i<data.length;i++){
			var $option = $("<option></option>");
			$option.attr("value",data[i].id);
			$option.text(data[i].categoryName);
			obj.append($option);
		}
	})
}