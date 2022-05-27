<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>优购商城-购物车</title>

    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <link rel="stylesheet" href="static/css/shopCar.css">
    <script src="static/script/shopCar.js"></script>

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
    <div class="search" id="search">
        <input class="commodity" type="search" name=""  placeholder="">
        <button class="but_search">搜索</button>
    </div>



</header>
<!-- header模块 end -->

<c:if test="${empty sessionScope.shopCar.items}">
    <div class="kong w" id="main">
        <span style="font-size: 16px;">购物车空空的哦~，去看看心仪的商品吧~</span><br>
        <a class="goShop" href="pages/client/index.jsp">去购物
            <i><span class="iconfont lifeservice">&#xe658;</span></i>
        </a>
    </div>
</c:if>

<c:if test="${not empty sessionScope.shopCar.items}">

    <div class="c-container">
        <div class="w">
            <div class="cart-filter-bar">
                <em>全部商品</em>
            </div>
            <!-- 购物车主要核心区域 -->
            <div class="cart-warp">

                <!-- 头部全选模块 -->
                <div class="cart-thead">
                    <div class="t-checkbox">
                        <input type="checkbox" name="" id="" class="checkall" checked="checked"> 全选
                    </div>
                    <div class="t-goods">商品</div>
                    <div class="t-price">单价</div>
                    <div class="t-num">数量</div>
                    <div class="t-sum">小计</div>
                    <div class="t-action">操作</div>
                </div>
                <!-- 商品详细模块 -->

                <c:forEach items="${sessionScope.shopCar.items}" var="entry">
                    <div class="cart-item-list">
                        <div class="cart-item check-cart-item">
                            <div class="p-checkbox">
                                <input type="checkbox" name="" id="" checked class="j-checkbox">
                            </div>
                            <div class="p-goods">
                                <div class="p-img">
                                    <img src="${entry.value.img_path}" alt="">
                                </div>
                                <div class="p-msg">${entry.value.name}</div>
                            </div>
                            <div class="p-price">￥${entry.value.price}</div>
                            <div class="p-num">
                                <div class="quantity-form">
                                    <a href="javascript:;" class="decrement">-</a>
                                    <input type="text" class="itxt" value="${entry.value.count}" bookId="${entry.value.id}" oninput="value=value.replace(/[^\d]/g,'')" >
                                    <a href="javascript:;" class="increment">+</a>
                                </div>
                            </div>
                            <div class="p-sum">￥${entry.value.totalPrice}</div>
                            <div class="p-action"><a href="shopCarServlet?action=deleteItem&id=${entry.value.id}">删除</a></div>
                        </div>
                    </div>
                </c:forEach>

                <!-- 结算模块 -->
                <div class="cart-floatbar">
                    <div class="select-all">
                        <input type="checkbox" name="" id="" class="checkall" checked="checked">全选
                    </div>
                    <div class="operation">
                        <a href="javascript:;" class="remove-batch"> 删除选中的商品</a>
                        <a href="shopCarServlet?action=clear" class="clear-all">清理购物车</a>
                    </div>
                    <div class="toolbar-right">
                        <div class="amount-sum">已经选<em>1</em>件商品</div>
                        <div class="price-sum">总价： <em>￥${sessionScope.shopCar.items.totalPrice}</em></div>
                        <button id="checkout"><div class="btn-area">去结算</div></button>
                    </div>
                </div>
            </div>
        </div>

    </div>

</c:if>

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>