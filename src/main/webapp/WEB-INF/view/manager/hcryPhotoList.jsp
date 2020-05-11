<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<html class="x-admin-sm">
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="stylesheet" href="<%=basePath%>static/css/font.css">
<link rel="stylesheet" href="<%=basePath%>static/css/xadmin.css">
<script src="<%=basePath%>static/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=basePath%>static/js/xadmin.js"></script>
</head>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="javascript:void(0);">首页</a>
			<a href="javascript:void(0);">功能列表</a> <a><cite id="cite">未成年犯罪照片</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			onclick="location.reload()" title="刷新"> <i
			class="layui-icon layui-icon-refresh" style="line-height: 30px"></i>
		</a>
	</div>

	<div>

		<select id="sell" name="type"
			onchange="sel(this.options[selectedIndex].text)">

			<option value="1" selected="selected">未成年犯罪照片</option>

			<!-- 默认显示此值 -->
			<option value="2">抓捕人员照片</option>

		</select>

		<script type="text/javascript">

			function sel(obj) {
				if (obj === "未成年犯罪照片") {
					window.location.href = 'hcryPhotoList';
				} else if (obj === "抓捕人员照片") {
					window.location.href = 'byzbPhotoList';
					
				} 
			}
			
		</script>
	</div>

	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<form class="layui-form layui-col-space5">
					<div class="layui-card">
						<div class="layui-card-body ">
							<div class="layui-input-inline layui-show-xs-block">
								<input type="text" name="sfzh" placeholder="请输入身份证号"
									autocomplete="off" class="layui-input" value="${info.sfzh}">
							</div>
							<div class="layui-input-inline layui-show-xs-block">
								<button class="layui-btn" lay-submit="" lay-filter="sreach">
									<i class="layui-icon">&#xe615;</i>
								</button>
							</div>
						</div>
						<div class="layui-card-header">
							<span class="layui-btn"
								onclick="xadmin.open('导入文件','toUpload?type=13',800,600)" /> <i
								class="layui-icon"></i>导入文件夹</input>
						</div>
						<div class="layui-card-body ">
							<table class="layui-table layui-form">
								<thead>
									<tr>
										<th width="8%">序号</th>
										<th>头像</th>
										<th>身份证号</th>
										<th>文件名称</th>
								</thead>
								<tbody>
									<c:forEach items="${page.list}" var="item" varStatus="st">
										<tr>
											<td>${st.index + 1 }</td>
											<td><img src="show?fileName=${item.destFileName}&type=13"
												style="width: 50px" /> <%--<img src="file:${item.destFilePath}" style="width: 50px"/>--%>
											</td>
											<td>${item.sfzh}</td>
											<td>${item.fileName}</td>
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
	layui.use([ 'laydate', 'form' ], function() {
		var form = layui.form;
		//监听提交
		form.on('submit(hcryPhotoList)', function(data) {
			return false;
		});
	});
</script>
</html>