<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<html class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
	<link rel="stylesheet" href="<%=basePath%>static/css/font.css">
	<link rel="stylesheet" href="<%=basePath%>static/css/xadmin.css">
	<script src="<%=basePath%>static/lib/layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="<%=basePath%>static/js/xadmin.js"></script>
</head>
<body>
<div class="x-nav">
	<span class="layui-breadcrumb">
		<a href="javascript:void(0);">首页</a>
		<a href="javascript:void(0);">功能列表</a>
		<a><cite>值班民警排班计划</cite></a>
	</span>
	<a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
		<i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
	</a>
</div>

<div class="layui-fluid">
	<div class="layui-row layui-col-space15">
		<div class="layui-col-md12">
			<form class="layui-form layui-col-space5">
				<div class="layui-card">
					<div class="layui-card-body ">
						<div class="layui-input-inline layui-show-xs-block">
							<input type="text" name="sj" placeholder="请输入时间" autocomplete="off" class="layui-input" value="${info.sj}">
						</div>
						<div class="layui-input-inline layui-show-xs-block">
							<button class="layui-btn" lay-submit="" lay-filter="sreach">
								<i class="layui-icon">&#xe615;</i>
							</button>
						</div>
					</div>
					<div class="layui-card-header">
						<span class="layui-btn" onclick="xadmin.open('导入文件','toUpload?type=3',800,600)" />
						<i class="layui-icon"></i>导入Excel</input>
					</div>
					<div style="overflow: auto; width: 96%;" class="layui-card-body ">
						<table class="layui-table layui-form">
							<thead>
							<tr>
								<th width="8%">序号</th>
								<th>时间</th>
								<th>岗位</th>
								<th>名称</th>
								<th>电话</th>
							</thead>
							<tbody>
							<c:forEach items="${page.list}"  var="item" varStatus="st">
							<tr>
								<td>${st.index + 1 }</td>
								<td>${item.sj}</td>
								<td>${item.gw}</td>
								<td>${item.mc}</td>
								<td>${item.tel}</td>
							</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="page">
					<%@ include file="../common/navigate.jsp"%>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
<script>
	layui.use(['laydate', 'form'],
    function() {
        var form = layui.form;
        //监听提交
        form.on('submit(zbmjpbjhList)', function(data){
            return false;
        });
    });
</script>
</html>