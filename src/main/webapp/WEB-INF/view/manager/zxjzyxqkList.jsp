<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
			<a href="javascript:void(0);">功能列表</a> <a><cite>单元战况</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			onclick="location.reload()" title="刷新"> <i
			class="layui-icon layui-icon-refresh" style="line-height: 30px"></i>
		</a>
	</div>

<!-- 
	<div>

		<select name="type" onchange="sel(this.options[selectedIndex].text)">

			<option value="1" selected="selected">中心九组运行情况</option>
			
			<option value="2">派出所运行情况</option>
			<option value="3">警种运行情况</option>
		</select>

		<script type="text/javascript">

			function sel(obj) {
				
				if (obj === "中心九组运行情况") {
					window.location.href = 'zxjzyxqkList';
				} else if (obj === "派出所运行情况") {
					window.location.href = 'pcsyxqkList';
				} else if (obj === "警种运行情况") {
					window.location.href = 'jzyxqkList';
				}
			}
		</script>
	</div>
 -->
	

	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<form class="layui-form layui-col-space5">
					<div class="layui-card">
						<div class="layui-card-body ">
							<div class="layui-input-inline layui-show-xs-block">
								<input type="text" name="dw" placeholder="请输入单位"
									autocomplete="off" class="layui-input" value="${info.dw}">
							</div>

						
							<div class="layui-input-inline layui-show-xs-block">
								<button class="layui-btn" lay-submit="" lay-filter="sreach">
									<i class="layui-icon">&#xe615;</i>
								</button>
							</div>
						</div>



						<div class="layui-card-header">
							<span class="layui-btn"
								onclick="xadmin.open('导入文件','toUpload?type=7',800,600)" /> <i
								class="layui-icon"></i>导入Excel</input>
						</div>
						<div class="layui-card-body ">
							<table class="layui-table layui-form">
								<thead>
									<tr>
										<th width="8%">序号</th>
										<th>单位</th>
										<th>研判数</th>
										<th>刑事数</th>
										<th>治安数</th>
										<th>线索数</th>
										<th>抓捕数</th>
										<th>破案数</th>
								</thead>
								<tbody>
									<c:forEach items="${page.list}" var="item" varStatus="st">
										<tr>
											<td>${st.index + 1 }</td>
											<td>${item.dw}</td>
											<td>${item.yps}</td>
											<td>${item.xsajs}</td>
											<td>${item.zaajs}</td>
											<td>${item.xss}</td>
											<td>${item.zbs}</td>
											<td>${item.pas}</td>
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
		form.on('submit(zxjzyxqkList)', function(data) {
			return false;
		});
	});
</script>
</html>