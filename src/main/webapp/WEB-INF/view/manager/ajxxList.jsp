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
			<a href="javascript:void(0);">功能列表</a> <a><cite>立案导入</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			onclick="location.reload()" title="刷新"> <i
			class="layui-icon layui-icon-refresh" style="line-height: 30px"></i>
		</a>
	</div>


	<div>

		<select id="sell" name="type"
			onchange="sel(this.options[selectedIndex].text)">

			<option value="1" selected="selected">立案导入</option>

			<!-- 默认显示此值 -->
			<option value="2">破案导入</option>

		</select>

		<script type="text/javascript">

			function sel(obj) {
				if (obj === "立案导入") {
					window.location.href = 'ajxxList';
				} else if (obj === "破案导入") {
					window.location.href = 'poanList';
					
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
								<input type="text" name="ajbh" placeholder="请输入案件编号"
									autocomplete="off" class="layui-input" value="${info.ajbh}">
							</div>
						
							<div class="layui-input-inline layui-show-xs-block">
								<button class="layui-btn" lay-submit="" lay-filter="sreach">
									<i class="layui-icon">&#xe615;</i>
								</button>
							</div>
							
						</div>



						<div class="layui-card-header">
							<span class="layui-btn"
								onclick="xadmin.open('导入文件','toUpload?type=15',800,600)" /> <i
								class="layui-icon"></i>导入Excel</input>
						</div>
						<div style="overflow: auto; width: 96%;" class="layui-card-body ">
							<table class="layui-table layui-form">
								<thead>
									<tr>
										<th width="8%">序号</th>
										<th>案件编号</th>
										<th>案件名称</th>
										<th>案件类别</th>
										<th>案件目录</th>
										<th>案件状态</th>
										<th>案件状态时间</th>

										<th>案件发现时间</th>
										<th>案件类型</th>
										<th>案件性质</th>
										<th>发案地点</th>
										<th>简要案情</th>
										<th>发案时间</th>

										<th>发案结束时间</th>
										<th>发案时段</th>
										<th>发案地域</th>
										<th>发案详细地址</th>
										<th>估计作案人数</th>
										<th>立案时间</th>

										<th>报案人姓名</th>
										<th>报案人性别</th>
										<th>报案人年龄</th>
										<th>报案人居住地区划</th>
										<th>报案人电话</th>
										<th>报案人实际居住地</th>

										<th>接警编号</th>
										<th>接报单位</th>
										<th>补充案别</th>
										<th>承办人</th>
										<th>接近手段</th>
										<th>街区社区</th>

										<th>解锁手段</th>
										<th>进入建筑空间方式及手段</th>
										<th>经度</th>
										<th>纬度</th>
										<th>冒充冒用手段</th>
										<th>窃取手段</th>

										<th>施暴手段</th>
										<th>实施手段</th>
										<th>实施手段2</th>
										<th>箱体空间突破手段</th>
										<th>胁迫手段</th>
										<th>选择部位</th>

										<th>选择处所</th>
										<th>引爆手段</th>
										<th>诈骗手段</th>
										<th>作案工具</th>
										<th>作案准备手段</th>
										<th>其它手段</th>

										<th>涉案级别</th>
										<th>涉案总价值</th>
										<th>损失总价值</th>
										<th>网络作案手段</th>
										<th>专案标识</th>
										<th>派出所管辖</th>

										<th>破案单位</th>
										<th>破案日期</th>
										<th>缴获总价值</th>
										<th>受理部门</th>
										<th>受理方式</th>
										<th>受理人</th>

										<th>受理时间</th>
										<th>抓获人员姓名时间</th>
										<th>现勘编号</th>
										<th>填报人</th>
										<th>录入单位</th>
										<th>录入时间</th>
										<th>录入分局</th>
										<th>时间戳</th>
								</thead>
								<tbody>
									<c:forEach items="${page.list}" var="item" varStatus="st">
										<tr>
											<td>${st.index + 1 }</td>
											<td>${item.ajbh}</td>
											<td>${item.ajmc}</td>
											<td>${item.ajlb}</td>
											<td>${item.lbml}</td>
											<td>${item.ajzt}</td>
											<td>${item.ajztsj}</td>

											<td>${item.ajfxsj}</td>
											<td>${item.ajlx}</td>
											<td>${item.ajxz}</td>
											<td>${item.fadd}</td>
											<td>${item.jyaq}</td>
											<td>${item.fasj}</td>

											<td>${item.fajssj}</td>
											<td>${item.fasd}</td>
											<td>${item.fady}</td>
											<td>${item.faxxdz}</td>
											<td>${item.gjzars}</td>
											<td>${item.lasj}</td>

											<td>${item.barxm}</td>
											<td>${item.barxb}</td>
											<td>${item.barnl}</td>
											<td>${item.barjzdqh}</td>
											<td>${item.bardh}</td>
											<td>${item.barsjjzd}</td>

											<td>${item.jjbh}</td>
											<td>${item.jbdw}</td>
											<td>${item.bcab}</td>
											<td>${item.cbr}</td>
											<td>${item.jjsd}</td>
											<td>${item.jqsq}</td>

											<td>${item.jssd}</td>
											<td>${item.jrjzkjfsjsd}</td>
											<td>${item.jd}</td>
											<td>${item.wd}</td>
											<td>${item.mcmysd}</td>
											<td>${item.qqsd}</td>

											<td>${item.sbsd}</td>
											<td>${item.sssd}</td>
											<td>${item.sssd2}</td>
											<td>${item.xtkjtpsd}</td>
											<td>${item.xpsd}</td>
											<td>${item.xzbw}</td>

											<td>${item.xzcs}</td>
											<td>${item.ybsd}</td>
											<td>${item.zpsd}</td>
											<td>${item.zagj}</td>
											<td>${item.zazbsd}</td>
											<td>${item.qtsd}</td>

											<td>${item.sajb}</td>
											<td>${item.sazjz}</td>
											<td>${item.sszjz}</td>
											<td>${item.wlzasd}</td>
											<td>${item.zabs}</td>
											<td>${item.pcsgx}</td>

											<td>${item.padw}</td>
											<td>${item.parq}</td>
											<td>${item.jhzjz}</td>
											<td>${item.slbm}</td>
											<td>${item.slfs}</td>
											<td>${item.slr}</td>

											<td>${item.slsj}</td>
											<td>${item.zhryxmsj}</td>
											<td>${item.xkbh}</td>
											<td>${item.tbr}</td>
											<td>${item.lrdw}</td>
											<td>${item.lrsj}</td>
											<td>${item.lrfj}</td>
											<td>${item.sjc}</td>
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
		form.on('submit(ajxxList)', function(data) {
			return false;
		});
	});
</script>
</html>