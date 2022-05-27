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
    <style type="text/css">
        #main {
            margin-top: 20px;
            height: 440px;
            width: 1200px;
            border: 1px #b1191a solid;
            overflow: auto;
        }
        .order {
            text-align: center;
            margin-top: 150px;
            height: 200px;
        }
        .search {
            position: absolute;
            left: 655px;
            top: 36px;
            width: 325px;
            height: 29px;
            border: 2px solid #b1191a;
        }

        .search input {
            float: left;
            width: 260px;
            height: 25px;
            padding-left: 10px;
        }
    </style>
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
        <input class="commodity" type="search"   placeholder="">
        <button  class="but_search">搜索</button>
    </div>

    <!-- shopcar购物车模块 -->
    <button class="shopcar">
        <span class="iconfont icon_shopcar">&#xe601;</span>
        <span style="float: left;">我的购物车</span>
    </button>
</header>
<!-- header模块 end -->

<div  id="main" class="w">
    <h1 class="order">你的订单已结算，订单号为${sessionScope.orderId}</h1>
</div>

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>
</body>
</html>
<script>
    $(function () {
        //点击我的购物车
        $(".shopcar").click(function () {
            if(${empty sessionScope.user}){
                location.href="pages/user/login.jsp";
            }else {
                location.href="pages/shopCar/shopCar.jsp";
            }
        });
    })
</script>