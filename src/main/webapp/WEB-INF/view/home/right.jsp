<%@ page contentType="text/html; charset=UTF-8"%>
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
<div class="layui-fluid">
	<div class="layui-row layui-col-space15">
		<div class="layui-col-md12">
			<div class="layui-card">
				<div class="layui-card-body ">
					<blockquote class="layui-elem-quote">欢迎管理员：
						<span class="x-red">${user.loginName}</span>！
					</blockquote>
				</div>
			</div>
		</div>
		<div class="layui-col-md12">
			<div class="layui-card">
				<div class="layui-card-header">数据统计</div>
				<div class="layui-card-body ">
					<ul class="layui-row layui-col-space10 layui-this x-admin-carousel x-admin-backlog">
						<li class="layui-col-md2 layui-col-xs6">
							<a href="javascript:;" class="x-admin-backlog-body">
								<h3>案件信息总数</h3>
								<p><cite>${item.ajxx}</cite></p>
							</a>
						</li>
						<li class="layui-col-md2 layui-col-xs6">
							<a href="javascript:;" class="x-admin-backlog-body">
								<h3>未成年人照片总数</h3>
								<p><cite>${item.hcryPhoto}</cite></p>
							</a>
						</li>
						<li class="layui-col-md2 layui-col-xs6">
							<a href="javascript:;" class="x-admin-backlog-body">
								<h3>值班民警排班计划总数</h3>
								<p><cite>${item.zbmjpbjh}</cite></p>
							</a>
						</li>
						<li class="layui-col-md2 layui-col-xs6">
							<a href="javascript:;" class="x-admin-backlog-body">
								<h3>合成作战总数</h3>
								<p><cite>${item.hczz}</cite></p>
							</a>
						</li>
						<li class="layui-col-md2 layui-col-xs6">
							<a href="javascript:;" class="x-admin-backlog-body">
								<h3>单元战况总数</h3>
								<p><cite>${item.zxjzyxqk}</cite></p>
							</a>
						</li>
						<li class="layui-col-md2 layui-col-xs6 ">
							<a href="javascript:;" class="x-admin-backlog-body">
								<h3>抓捕人员照片总数</h3>
								<p><cite>${item.byzbPhoto}</cite></p>
							</a>
						</li>
					</ul>
				</div>
			</div>
		</div>

		<div class="layui-col-md12">
			<div class="layui-card">
				<div class="layui-card-header">系统信息</div>
				<div class="layui-card-body ">
					<table class="layui-table">
						<tbody>
						<tr>
							<th>当前Spring Boot 版本</th>
							<td>Spring Boot v1.5.6.RELEASE</td></tr>
						<tr>
							<th>服务器地址</th>
							<td>127.0.0.1</td></tr>
						<tr>
							<th>操作系统</th>
							<td>Linux</td></tr>
						<tr>
							<th>内置插件</th>
							<td>Apache Tomcat/8.5.16</td></tr>
						<tr>
							<th>JAVA版本</th>
							<td>1.8 JAR</td></tr>
						<tr>
							<th>JAVA运行方式</th>
							<td>JAVA -C </td></tr>
						<tr>
							<th>MYSQL版本</th>
							<td>5.5.53</td>
						</tr>
						<tr>
							<th>上传附件限制</th>
							<td>500M</td></tr>
						<tr>
							<th>执行时间限制</th>
							<td>30s</td></tr>
						<tr>
							<th>剩余空间</th>
							<td>6015.2M</td></tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="layui-col-md12">
			<div class="layui-card">
				<div class="layui-card-header">开发团队</div>
				<div class="layui-card-body ">
					<table class="layui-table">
						<tbody>
						<tr>
							<th>版权所有</th>
							<td>重庆晨科信息技术有限公司</td>
						</tr>
						<tr>
							<th>开发者</th>
							<td>重庆晨科信息技术有限公司</td></tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
</body>
</html>
