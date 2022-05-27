<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/20
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <title>我的订单-订单详情</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>

    <link rel="stylesheet" href="static/css/orderDetails.css">
    <script src="../../static/script/jquery-1.7.2.js"></script>
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
        <input type="search" name="" placeholder="">
        <button class="commodity" class="but_search">搜索</button>
    </div>

    <!-- shopcar购物车模块 -->
    <button class="shopcar">
        <span class="iconfont icon_shopcar">&#xe601;</span>
        <span style="float: left;">我的购物车</span>
    </button>
</header>
<!-- header模块 end -->

<div class="c-container">
    <div class="w">
        <div class="cart-filter-bar">
            <em>我的订单</em>
        </div>
        <!-- 购物车主要核心区域 -->
        <div class="cart-warp">

            <div class="cart-thead">
                <div class="t-goods">订单详情</div>
                <div class="t-price">收货人</div>
                <div class="t-num">金额</div>
                <div class="t-sum">状态</div>
                <div class="t-action">操作</div>
            </div>

            <div class="cart-item check-cart-item">
                <div class="trth w">
                    <div>
                        <span class="gap"></span>
                        <span class="dealtime" title="${requestScope.createTime}" style="color: black;">
                            ${requestScope.createTime}
                        </span>
                        <span class="number">
                                订单号：<span style="color: black;">${requestScope.orderId}</span>
                            </span>
                    </div>
                </div>

                <c:forEach items="${sessionScope.orderItems}" var="items">
                    <div class="p-goods">
                        <div class="p-img">
                            <img src="${items.img_path}" alt="">
                        </div>
                        <div class="p-msg">${items.name} x${items.count}</div>
                    </div>
                    <div class="p-price">${sessionScope.user.username}</div>
                    <div class="p-num">
                        <div class="quantity-form">
                            <div class="p-sum">￥${items.totalPrice}</div>
                        </div>
                    </div>
                    <div class="p-sum">
                        <c:choose>
                            <c:when test="${ requestScope.status == 0 }">
                                未发货
                            </c:when>
                            <c:when test="${ requestScope.status == 1 }">
                                未签收
                            </c:when>
                            <c:when test="${ requestScope.status == 2 }">
                                已签收
                            </c:when>
                        </c:choose>
                    </div>
                    <div class="p-action"><a href="javascript:;">删除</a></div>
                </c:forEach>

            </div>

            <div class="toolbar-right" style="float: right;">
                <div class="price-sum ">总价： <em>￥${requestScope.orderTotalPrice}</em></div>
            </div>

        </div>
    </div>
</div>


<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>
</body>

</html>

<script>
    $(function () {
        // (1) 商品后面的删除按钮
        $(".p-action a").click(function () {
            // 删除的是当前的商品
            $(this).parents(".cart-item").remove();
        });
    })

    //跳转购物车页面
    $(".shopcar").click(function () {
        if(${empty sessionScope.user}){
            location.href="pages/user/login.jsp";
        }else {
            location.href="pages/shopCar/shopCar.jsp";
        }
    });

</script>
