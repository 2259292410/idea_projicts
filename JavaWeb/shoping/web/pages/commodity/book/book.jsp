<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/10
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
        <link rel="stylesheet" href="static/css/book.css">
    <title>商品搜索-${requestScope.commodity}-优购商城</title>
</head>

<body>

<%-- 静态包含 快捷导航栏模块  --%>
<%@ include file="/pages/common/shortcut.jsp" %>


<!-- header模块 start -->
<header class="header w">
    <!-- logo模块 -->
    <div class="logo">
        <h1>
            <a href="index.jsp" title="优购商城"></a>
        </h1>
    </div>

    <!-- 搜索框模块 -->
    <div class="search">
        <input class="commodity" type="search" name="" id="" placeholder="请输入要搜索的商品" value="${requestScope.commodity}">
        <button class="but_search">搜索</button>
    </div>

    <!-- hotwords模块制作 -->
    <div class="hotwords">
        <a href="#" class="style_red">优购首发</a>
        <a href="#">亿元优惠</a>
        <a href="#">9.9团购</a>
        <a href="#">满99减30</a>
        <a href="#">办公用品</a>
        <a href="#">电脑</a>
        <a href="#">通信</a>
    </div>

    <!-- shopcar购物车模块 -->
    <button class="shopcar">
        <span class="iconfont icon_shopcar">&#xe601;</span>
        <span style="float: left;" >我的购物车</span>
    </button>

</header>
<!-- header模块 end -->

<!-- nav模块 start -->
<nav class="nav">
    <div class="w">
        <div class="dropdown">
            <div class="dt">全部商品分类</div>
            <div class="dd" style="display: none;">
                <ul>
                    <li><a href="#">手机&nbsp;&nbsp;</a><a href="#">数码&nbsp;&nbsp;</a><a href="#">通信</a></li>
                    <li><a href="#">电脑、办公</a></li>
                    <li><a href="#">家居、家具、家装、厨具</a></li>
                    <li><a href="#">男装、女装、童装、内衣</a></li>
                    <li><a href="#">个户化妆、清洁用品、宠物</a></li>
                    <li><a href="#">鞋靴、箱包、珠宝、奢侈品</a></li>
                    <li><a href="#">运动户外、钟表</a></li>
                    <li><a href="#">汽车、汽车用品</a></li>
                    <li><a href="#">母婴、玩具乐器</a></li>
                    <li><a href="#">食品、酒类、生鲜、特产</a></li>
                    <li><a href="#">医药保健</a></li>
                    <li><a href="#">图书、音像、电子书</a></li>
                    <li><a href="#">彩票、旅行、充值、票务</a></li>
                    <li><a href="#">理财、众筹、白条、保险</a></li>
                </ul>
            </div>
        </div>
        <div class="nacitems">
            <ul>
                <li><strong><a href="#" class="style_red">秒杀</a></strong></li>
                <li><strong><a href="#" class="style_red">优惠券</a></strong></li>
                <li><a href="#">优购会员</a></li>
                <li><a href="bookServlet?action=page">优购图书</a></li>
                <li><a href="#">品牌闪购</a></li>
                <li><a href="#">拍卖</a></li>
                <li><a href="#">优购家电</a></li>
                <li><a href="#">优购服装</a></li>
            </ul>
        </div>
    </div>
</nav>
<!-- nav模块 end -->

<!-- main 模块 statr  -->
<div class="w">
    <div id="main">
        <div id="book">
            <ul>
                <c:forEach items="${requestScope.page.items}" var="book">
                    <li>
                        <div class="b_list">
                            <div class="b_list_wrap">
                                <div class="img_div">
                                    <img class="book_img" alt=""
                                         src="${book.img_path}"/>
                                </div>
                                <div class="p-price">
                                    <strong>
                                        <em>￥</em><i>${book.price}</i>
                                    </strong>
                                </div>
                                <div class="book_info">
                                    <div class="p-name">
                                        <a title="${book.title}"
                                           href="#">
                                            <em>${book.name} </em>
                                            <i class="promo-words"></i>
                                        </a>
                                    </div>
                                    <div class="book_author">
                                        <span class="sp1">作者:</span>
                                        <span class="sp2">${book.author}</span>
                                    </div>
                                    <div class="book_sales">
                                        <span class="sp1">销量:</span>
                                        <span class="sp2">${book.sales}</span>
                                    </div>
                                    <div class="book_stock">
                                        <span class="sp1">库存:</span>
                                        <span class="sp2">${book.stock}</span>
                                    </div>
                                    <div class="book_add">
                                        <button bookId="${book.id}" class="addToCart"><i><span
                                                class="iconfont lifeservice style_red">&#xe69c;</span></i>&nbsp; 加入购物车
                                        </button>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </li>
                </c:forEach>
            </ul>

        </div>

        <%--分页条的开始--%>
        <div id="page_nav">
            <%--大于首页，才显示--%>
            <c:if test="${requestScope.page.pageNo > 1}">
                <a href="${ requestScope.page.url }&pageNo=1">首页</a>
                <a href="${ requestScope.page.url }&pageNo=${requestScope.page.pageNo-1}">上一页</a>
            </c:if>
            <%--页码输出的开始--%>
            <c:choose>
                <%--情况1：如果总页码小于等于5的情况，页码的范围是：1-总页码--%>
                <c:when test="${ requestScope.page.pageTotal <= 5 }">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="${requestScope.page.pageTotal}"/>
                </c:when>
                <%--情况2：总页码大于5的情况--%>
                <c:when test="${requestScope.page.pageTotal > 5}">
                    <c:choose>
                        <%--小情况1：当前页码为前面3个：1，2，3的情况，页码范围是：1-5.--%>
                        <c:when test="${requestScope.page.pageNo <= 3}">
                            <c:set var="begin" value="1"/>
                            <c:set var="end" value="5"/>
                        </c:when>
                        <%--小情况2：当前页码为最后3个，8，9，10，页码范围是：总页码减4 - 总页码--%>
                        <c:when test="${requestScope.page.pageNo > requestScope.page.pageTotal-3}">
                            <c:set var="begin" value="${requestScope.page.pageTotal-4}"/>
                            <c:set var="end" value="${requestScope.page.pageTotal}"/>
                        </c:when>
                        <%--小情况3：4，5，6，7，页码范围是：当前页码减2 - 当前页码加2--%>
                        <c:otherwise>
                            <c:set var="begin" value="${requestScope.page.pageNo-2}"/>
                            <c:set var="end" value="${requestScope.page.pageNo+2}"/>
                        </c:otherwise>
                    </c:choose>
                </c:when>
            </c:choose>

            <c:forEach begin="${begin}" end="${end}" var="i">
                <c:if test="${i == requestScope.page.pageNo}">
                    【${i}】
                </c:if>
                <c:if test="${i != requestScope.page.pageNo}">
                    <a href="${ requestScope.page.url }&pageNo=${i}">${i}</a>
                </c:if>
            </c:forEach>
            <%--页码输出的结束--%>


            <%-- 如果已经 是最后一页，则不显示下一页，末页 --%>
            <c:if test="${requestScope.page.pageNo < requestScope.page.pageTotal}">
                <a href="${ requestScope.page.url }&pageNo=${requestScope.page.pageNo+1}">下一页</a>
                <a href="${ requestScope.page.url }&pageNo=${requestScope.page.pageTotal}">末页</a>
            </c:if>

            共${ requestScope.page.pageTotal }页，${ requestScope.page.pageTotalCount }条记录
            到第<input value="${page.pageNo}" name="pn" id="pn_input" />页
            <input id="searchPageBtn" type="button" value="确定">

            <script type="text/javascript">

                $(function () {
                    // 跳到指定的页码
                    $("#searchPageBtn").click(function () {

                        var pageNo = $("#pn_input").val();

                        <%--var pageTotal = ${requestScope.page.pageTotal};--%>
                        <%--alert(pageTotal);--%>

                        // javaScript语言中提供了一个location地址栏对象
                        // 它有一个属性叫href.它可以获取浏览器地址栏中的地址
                        // href属性可读，可写
                        location.href = "${pageScope.basePath}${ requestScope.page.url }&pageNo=" + pageNo;

                    });
                });

            </script>

        </div>
        <%--分页条的结束--%>

    </div>
</div>
<!-- main 模块 end  -->

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>

</body>

</html>

<script>
    $(function () {
        $(".addToCart").click(function () {
            var bookId = $(this).attr("bookId");
            var bookName=$(this).parent().parent().find(".p-name").find("em").text();

            $.getJSON("shopCarServlet","action=addItem&bookId="+bookId,function (data) {
                if(data==false){
                    location.href="pages/user/login.jsp";
                }else {
                    alert("成功将"+bookName+"添加到购物车");
                }
            })
        });

        //跳转购物车页面
        $(".shopcar").click(function () {
            if(${empty sessionScope.user}){
                location.href="pages/user/login.jsp";
            }else {
                location.href="pages/shopCar/shopCar.jsp";
            }
        });
    })
</script>