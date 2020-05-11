<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>layui</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="<%=basePath%>static/lib/layui/css/layui.css"  media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
	<legend>拖拽上传</legend>
</fieldset>

<div class="layui-upload-drag" id="test10">
	<i class="layui-icon"></i>
	<p>点击上传，或将文件拖拽到此处,自动上传</p>
</div>
<input type="hidden" id="type" value="${type}">
<script src="<%=basePath%>static/lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('upload', function () {
        var upload = layui.upload,layer = layui.layer,$ = layui.jquery;
        var loading ;
        upload.render({
            elem: '#test10' ,
            url: 'uploadFile?type='+$("#type").val(),
            multiple: true,
            accept: 'file',
            before:function(){
                loading = layer.msg('正在导入中。。。。。', {icon: 16, shade: 0.3, time:0});
			},
            done: function(res){
                layer.close(loading); //关闭loading
				layer.close(layer.index); //它获取的始终是最新弹出的某个层，值是由layer内部动态递增计算的
				
				layer.msg(res.msg, {icon: 1,time:2*1000},function () {
					parent.location.reload();
				});
            },
			error: function(index, res){
               console.log(res);
            }
        });
    });
</script>
</body>
</html>