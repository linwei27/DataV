<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet"
	href="<%=basePath%>static/lib/layui/css/layui.css" media="all">
</head>
<body>
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 30px;">
		<legend>上传文件夹</legend>
	</fieldset>
	<!-- 提交表单就是新的request请求，所以后端找不到参数了 解决办法：添加隐形域-->
	<form action="uploadFolder" method="post" enctype="multipart/form-data"
		class="layui-form" id="baseForm">
		<%--<input class="layui-input-inline" style="margin: 10px 20px;" type="file" name="folder" multiple webkitdirectory>--%>
		
		<input style="margin: 10px 20px;" id="folder" name="folder"
			type="file" multiple webkitdirectory> <span type="submit"
			class="layui-btn" onclick="uploadFolder();"><i
			class="layui-icon"></i>上传文件</span>
		<!--  <input type="hidden" name="type" value= ${requestScope.type } >  --> 
	</form>

</body>
<script type="text/javascript"
	src="<%=basePath%>static/js/jquery.min.js"></script>
<script src="<%=basePath%>static/lib/layui/layui.all.js" charset="utf-8"></script>

<script type="text/javascript">
	function uploadFolder(){
        $("#baseForm").submit();  //注意！此处要上传完成才能有其他操作，不能关闭此窗口
        //alert("上传成功"); 
        var index = parent.layer.getFrameIndex(window.name);
       /* parent.location.reload(); */
        //parent.layer.close(index);  //直接关闭
        
    }

</script>

</html>