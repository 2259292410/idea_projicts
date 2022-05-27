<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>优购商城-我的订单</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp" %>
	<link rel="stylesheet" href="static/css/order.css">

</head>
<body>

<%-- 静态包含 快捷导航栏模块  --%>
<%@ include file="/pages/common/shortcut.jsp" %>

<!-- header模块 start -->
<header class="header w">
	<!-- logo模块 -->
	<div class="logo">
		<h1>
			<a href="pages/client/index.jsp" title="优购商城"></a>
		</h1>
	</div>

	<!-- 搜索框模块 -->
	<div class="search" id="search" >
		<input class="commodity" type="search" name="" placeholder="">
		<button class="but_search">搜索</button>
	</div>

	<!-- shopcar购物车模块 -->
	<button class="shopcar">
		<span class="iconfont icon_shopcar">&#xe601;</span>
		<span style="float: left;">我的购物车</span>
	</button>
</header>
<!-- header模块 end -->

<div id="main" class="w">

	<table>
		<tr>
			<td>日期</td>
			<td>金额</td>
			<td>状态</td>
			<td>详情</td>
		</tr>

<%--		遍历我的订单--%>
		<c:forEach items="${sessionScope.orders}" var="order">
			<tr>
				<td>${order.createTime}</td>
				<td>${order.price}</td>

				<c:choose>
					<c:when test="${ order.status == 0 }">
						<td>未发货</td>
					</c:when>
					<c:when test="${ order.status == 1 }">
						<td>未签收</td>
					</c:when>
					<c:when test="${ order.status == 2 }">
						<td>已签收</td>
					</c:when>
				</c:choose>

				<td><a href="orderServlet?action=showMyOrderDetail&orderId=${order.orderId}&createTime=${order.createTime}&status=${order.status}&price=${order.price}">查看详情</a></td>
			</tr>
		</c:forEach>

	</table>


</div>

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>

<script>
	$(function () {

	})
</script>