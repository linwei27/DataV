<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<title></title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link rel="stylesheet" href="<%=basePath%>static/css/font.css">
	<link rel="stylesheet" href="<%=basePath%>static/css/xadmin.css">
	<script src="<%=basePath%>static/lib/layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="<%=basePath%>static/js/xadmin.js"></script>
</head>
<body class="index">
<!-- 顶部开始 -->
<div class="container">
	<div class="logo">
	</div>
	<div class="left_open">
		<a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
	</div>
	<ul class="layui-nav right" lay-filter="">
		<li class="layui-nav-item">
			<a href="javascript:;">${user.userName}</a>
			<dl class="layui-nav-child">
				<dd>
					<a href="<%=basePath%>login/logout">退出</a>
				</dd>
			</dl>
		</li>

	</ul>
</div>
<div class="left-nav">
	<div id="side-nav">
		<ul id="nav">
			<li>
				<a href="javascript:;">
					<i class="iconfont left-nav-li" lay-tips="功能列表">&#xe723;</i>
					<cite>功能列表</cite>
					<i class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<c:forEach items="${resultList}" var="sub">
							<li>
								<a onclick="xadmin.add_tab('${sub.menuName }','<%=basePath%>${sub.menuUrl}')">
									<i class="iconfont">&#xe6a7;</i>
									<cite>${sub.menuName }</cite>
								</a>
							</li>
						</c:forEach>
				</ul>
			</li>
		</ul>
	</div>
</div>


<div class="page-content">
	<div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
		<ul class="layui-tab-title">
			<li class="home">
				<i class="layui-icon">&#xe68e;</i>我的桌面</li></ul>
		<div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
			<dl>
				<dd data-type="this">关闭当前</dd>
				<dd data-type="other">关闭其它</dd>
				<dd data-type="all">关闭全部</dd>
			</dl>
		</div>
		<div class="layui-tab-content">
			<div class="layui-tab-item layui-show">
				<iframe src='right.do' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
			</div>
		</div>
	</div>
</div>
</body>
</html>
