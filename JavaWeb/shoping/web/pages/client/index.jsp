<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/10
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>优购商城首页</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <link rel="stylesheet" href="static/css/index.css">
    <script src="static/script/index.js"></script>

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
        <span style="float: left;">我的购物车</span>
    </button>

</header>
<!-- header模块 end -->

<!-- nav模块 start -->
<nav class="nav">
    <div class="w">
        <div class="dropdown">
            <div class="dt">全部商品分类</div>
            <div class="dd">
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

<!-- 首页专有模块 main start -->
<div class="w">
    <div class="main">
        <!-- 轮播图 -->
        <div id="div1">
            <ul>
                <li class="ac">
                    <a>
                        <img src="https://img13.360buyimg.com/pop/s590x470_jfs/t1/221980/32/5382/50022/61b1bb7fE047f493a/2b01bccb143cf62a.jpg.webp" />
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://imgcps.jd.com/ling4/100014794825/5LyB5Lia5pqW5b-D5a2j/5LiA5Lu35YWo5YyF/p-5bd8253082acdd181d02fa40/79b46970/cr/s/q.jpg" />
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://imgcps.jd.com/ling4/100018640796/6auY5oCn6IO95omL5py657K-6YCJ/54iG5qy-55u06ZmN/p-5bd8253082acdd181d02fa4b/61e05220/cr/s/q.jpg" />
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://imgcps.jd.com/ling4/100000499657/5b-D5b-D5b-15b-155qE6Zu26aOf/54iG5qy-55u06ZmN/p-5bd8253082acdd181d02fa5f/19e081ce/cr/s/q.jpg" />
                    </a>
                </li>
                <li>
                    <a>
                        <img src="https://img12.360buyimg.com/pop/s590x470_jfs/t1/205354/16/17988/82004/61b1dc96Ee600f3f3/9ffa616349105df0.png.webp" />
                    </a>
                </li>
            </ul>
            <ol>
                <li class="ac"></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ol>
            <a href="javascript:;" id="goPrev">&laquo;</a>
            <a href="javascript:;" id="goNext">&raquo;</a>
        </div>
        <div class="newsflash">
            <div class="user_login">
                <div class="login_logo">
                    <div class="denglu_logo">
                        <a href=""></a>
                    </div>
                    <div class="denglu">

                        <c:if test="${empty sessionScope.user}">
                            <p><a href="#">Hi~欢迎光临逛优购！</a></p>
                        </c:if>

                        <c:if test="${not empty sessionScope.user}">
                            <p><a href="#">Hi,${sessionScope.user.username}</a></p>
                        </c:if>


                        <ul>
                            <c:if test="${empty sessionScope.user}">
                                <li><a href="pages/user/login.jsp">登录</a></li>
                                <li></li>
                                <li><a href="pages/user/regist.jsp">注册</a></li>
                            </c:if>

                            <c:if test="${not empty sessionScope.user}">
                                <p><a href="userServlet?action=logout"><i><span class="iconfont lifeservice">&#xe603;</span></i></a>
                                    <a href="userServlet?action=logout">退出</a>
                                </p>
                            </c:if>


                        </ul>
                    </div>
                </div>
                <div class="user_fuli">
                    <%--如果登录--%>
                    <c:if test="${ empty sessionScope.user}">
                        <a href="#">新人福利</a>
                        <a href="#" class="huiyuan">优购会员</a>
                    </c:if>
                    <%--如果未登录--%>
                    <c:if test="${not empty sessionScope.user}">
                        <a href="#" class="login_ok">开通优购会员 平均省1210/年</a>
                    </c:if>
                </div>
            </div>
            <div class="news">
                <div class="news-hd">
                    <h5>优购快报</h5>
                    <a href="#" class="iconfont more">更多&nbsp;&#xe62b;</a>
                </div>
                <div class="news-bd">
                    <ul>
                        <li><a href="#">
                            <span class="news_tag">重磅</span>
                            联想拯救者全网最低价，赶快下单吧
                        </a></li>
                        <li><a href="#">
                            <span class="news_tag">推荐</span>
                            开智小锌酵母锌口服液评测：好吸收，浓浓椰香
                        </a></li>
                        <li><a href="#">
                            <span class="news_tag">热门</span>
                            有了360儿童电话手表，再也不怕孩子乱跑了
                        </a></li>
                        </li>
                        <li><a href="#">
                            <span class="news_tag">HOT</span>
                            每一本好书都是一次人生经历，用海信阅读手机品味人生感悟
                        </a></li>
                        </li>
                        <li><a href="#">
                            <span class="news_tag">最新</span>
                            爱用好物：白龙马电动牙刷M12
                        </a></li>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="lifeservice">
                <ul>
                    <a href="">
                        <li>
                            <i><span class="iconfont lifeservice">&#xef54;</span></i>
                            <p>话费</p>
                        </li>
                    </a>
                    <a href="">
                        <li>
                            <i><span class="iconfont lifeservice">&#xef56;</span></i>
                            <p>机票</p>
                        </li>
                    </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef53;</span></i>
                        <p>电影票</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef52;</span></i>
                        <p>游戏</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef5b;</span></i>
                        <p>彩票</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef58;</span></i>
                        <p>加油卡</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef59;</span></i>
                        <p>酒店</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef57;</span></i>
                        <p>火车票</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef5d;</span></i>
                        <p>众筹</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef55;</span></i>
                        <p>理财</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef5c;</span></i>
                        <p>礼品卡</p>
                    </li>
                </a><a href="">
                    <li>
                        <i><span class="iconfont lifeservice">&#xef5a;</span></i>
                        <p>白条</p>
                    </li>
                </a>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- 首页专有模块 main end -->

<!-- 推荐服务模块 start -->
<div class="recommend w">
    <div class="recom-hd fl">
        <img data-lazy-src="static/img/recom.png" alt="">
        <!-- <h3>今日推荐</h3>s -->
    </div>
    <div class="recom-bd fl">
        <ul>
            <li>
                <a href="#">
                    <img data-lazy-src="static/img/pic.jpg" alt="">
                </a>
            </li>
            <li>
                <a href="#">
                    <img data-lazy-src="static/img/pic.jpg" alt="">
                </a>
            </li>
            <li>
                <a href="#">
                    <img data-lazy-src="static/img/pic.jpg" alt="">
                </a>
            </li>
            <li class="last">
                <a href="#">
                    <img data-lazy-src="static/img/pic.jpg" alt="">
                </a>
            </li>

        </ul>
    </div>
</div>
<!-- 推荐服务模块 end -->

<!-- 楼层区 start -->
<div class="floor">
    <div class="jiadian w">
        <div class="box-hd">
            <h3>家用电器</h3>
            <div class="tab-list">
                <ul>
                    <li><a href="#" class="style-red">热门</a>|</li>
                    <li><a href="#">大家电</a>|</li>
                    <li><a href="#">生活电器</a>|</li>
                    <li><a href="#">厨房电器</a>|</li>
                    <li><a href="#">个护健康</a>|</li>
                    <li><a href="#">应季电器</a>|</li>
                    <li><a href="#">空气/净水</a>|</li>
                    <li><a href="#">新奇特</a>|</li>
                    <li><a href="#">高端电器</a></li>
                </ul>
            </div>
        </div>
        <div class="box-bd">
            <ul class="tab-con">
                <li class="w209">
                    <ul class="tab-con-list">
                        <li>
                            <a href="#">节能补贴</a>
                        </li>
                        <li>
                            <a href="#">4K电视</a>
                        </li>
                        <li>
                            <a href="#">空气净化器</a>
                        </li>
                        <li>
                            <a href="#">IH电饭煲</a>
                        </li>
                        <li>
                            <a href="#">滚筒洗衣机</a>
                        </li>
                        <li>
                            <a href="#">电热水器</a>
                        </li>
                    </ul>
                    <img data-lazy-src="static/img/floor-1-1.png" alt="">
                </li>
                <li class="w329">
                    <img data-lazy-src="static/img/pic1.jpg" alt="">
                </li>
                <li class="w219">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-2.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-3.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-4.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-5.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-6.png" alt="">
                        </a>
                    </div>
                </li>
            </ul>
            <!-- <ul class="tab-con">
                        <li>1</li>
                        <li>2</li>
                        <li>3</li>
                        <li>4</li>
                        <li>5</li>
                    </ul> -->
        </div>
    </div>
    <div class="shouji w">
        <div class="box-hd">
            <h3>手机通讯</h3>
            <div class="tab-list">
                <ul>
                    <li><a href="#" class="style-red">热门</a>|</li>
                    <li><a href="#">大家电</a>|</li>
                    <li><a href="#">生活电器</a>|</li>
                    <li><a href="#">厨房电器</a>|</li>
                    <li><a href="#">个护健康</a>|</li>
                    <li><a href="#">应季电器</a>|</li>
                    <li><a href="#">空气/净水</a>|</li>
                    <li><a href="#">新奇特</a>|</li>
                    <li><a href="#">高端电器</a></li>
                </ul>
            </div>
        </div>
        <div class="box-bd">
            <ul class="tab-con">
                <li class="w209">
                    <ul class="tab-con-list">
                        <li>
                            <a href="#">节能补贴</a>
                        </li>
                        <li>
                            <a href="#">4K电视</a>
                        </li>
                        <li>
                            <a href="#">空气净化器</a>
                        </li>
                        <li>
                            <a href="#">IH电饭煲</a>
                        </li>
                        <li>
                            <a href="#">滚筒洗衣机</a>
                        </li>
                        <li>
                            <a href="#">电热水器</a>
                        </li>
                    </ul>
                    <img data-lazy-src="static/img/floor-1-1.png" alt="">
                </li>
                <li class="w329">
                    <img data-lazy-src="static/img/pic1.jpg" alt="">
                </li>
                <li class="w219">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-2.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-3.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-4.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-5.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-6.png" alt="">
                        </a>
                    </div>
                </li>
            </ul>
            <!-- <ul class="tab-con">
                        <li>1</li>
                        <li>2</li>
                        <li>3</li>
                        <li>4</li>
                        <li>5</li>
                    </ul> -->
        </div>
    </div>
    <div class="diannao w">
        <div class="box-hd">
            <h3>电脑办公</h3>
            <div class="tab-list">
                <ul>
                    <li><a href="#" class="style-red">热门</a>|</li>
                    <li><a href="#">大家电</a>|</li>
                    <li><a href="#">生活电器</a>|</li>
                    <li><a href="#">厨房电器</a>|</li>
                    <li><a href="#">个护健康</a>|</li>
                    <li><a href="#">应季电器</a>|</li>
                    <li><a href="#">空气/净水</a>|</li>
                    <li><a href="#">新奇特</a>|</li>
                    <li><a href="#">高端电器</a></li>
                </ul>
            </div>
        </div>
        <div class="box-bd">
            <ul class="tab-con">
                <li class="w209">
                    <ul class="tab-con-list">
                        <li>
                            <a href="#">节能补贴</a>
                        </li>
                        <li>
                            <a href="#">4K电视</a>
                        </li>
                        <li>
                            <a href="#">空气净化器</a>
                        </li>
                        <li>
                            <a href="#">IH电饭煲</a>
                        </li>
                        <li>
                            <a href="#">滚筒洗衣机</a>
                        </li>
                        <li>
                            <a href="#">电热水器</a>
                        </li>
                    </ul>
                    <img data-lazy-src="static/img/floor-1-1.png" alt="">
                </li>
                <li class="w329">
                    <img data-lazy-src="static/img/pic1.jpg" alt="">
                </li>
                <li class="w219">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-2.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-3.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-4.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-5.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-6.png" alt="">
                        </a>
                    </div>
                </li>
            </ul>
            <!-- <ul class="tab-con">
                            <li>1</li>
                            <li>2</li>
                            <li>3</li>
                            <li>4</li>
                            <li>5</li>
                        </ul> -->
        </div>
    </div>
    <div class="jiaju w">
        <div class="box-hd">
            <h3>精品家具</h3>
            <div class="tab-list">
                <ul>
                    <li><a href="#" class="style-red">热门</a>|</li>
                    <li><a href="#">大家电</a>|</li>
                    <li><a href="#">生活电器</a>|</li>
                    <li><a href="#">厨房电器</a>|</li>
                    <li><a href="#">个护健康</a>|</li>
                    <li><a href="#">应季电器</a>|</li>
                    <li><a href="#">空气/净水</a>|</li>
                    <li><a href="#">新奇特</a>|</li>
                    <li><a href="#">高端电器</a></li>
                </ul>
            </div>
        </div>
        <div class="box-bd">
            <ul class="tab-con">
                <li class="w209">
                    <ul class="tab-con-list">
                        <li>
                            <a href="#">节能补贴</a>
                        </li>
                        <li>
                            <a href="#">4K电视</a>
                        </li>
                        <li>
                            <a href="#">空气净化器</a>
                        </li>
                        <li>
                            <a href="#">IH电饭煲</a>
                        </li>
                        <li>
                            <a href="#">滚筒洗衣机</a>
                        </li>
                        <li>
                            <a href="#">电热水器</a>
                        </li>
                    </ul>
                    <img data-lazy-src="static/img/floor-1-1.png" alt="">
                </li>
                <li class="w329">
                    <img data-lazy-src="static/img/pic1.jpg" alt="">
                </li>
                <li class="w219">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-2.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-3.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-4.png" alt="">
                        </a>
                    </div>
                </li>
                <li class="w220">
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-5.png" alt="">
                        </a>
                    </div>
                    <div class="tab-con-item">
                        <a href="#">
                            <img data-lazy-src="static/img/floor-1-6.png" alt="">
                        </a>
                    </div>
                </li>
            </ul>
            <!-- <ul class="tab-con">
                                <li>1</li>
                                <li>2</li>
                                <li>3</li>
                                <li>4</li>
                                <li>5</li>
                            </ul> -->
        </div>
    </div>
</div>
<!-- 楼层区 end -->

<!-- 固定电梯导航 -->
<div class="fixedtool">
    <ul>
        <li class="current">家用电器</li>
        <li>手机通讯</li>
        <li>电脑办公</li>
        <li>精品家具</li>

    </ul>
</div>

<!-- 必须在这里引入懒加载插件 -->
<script src="static/script/EasyLazyload.min.js"></script>
<script>
    lazyLoadInit({
        showTime: 1100,
        onLoadBackEnd: function (i, e) {
            console.log("onLoadBackEnd:" + i);
        },
        onLoadBackStart: function (i, e) {
            console.log("onLoadBackStart:" + i);
        }
    });
</script>

<script>
    // 1 获取节点
    let div1Obj = document.getElementById('div1');
    let ulLisObj = div1Obj.firstElementChild.children;
    let olLisObj = document.querySelectorAll('ol li');

    let prevObj = document.getElementById('goPrev');
    let nextObj = document.getElementById('goNext');

    // 当前图片下标
    let index = 0;
    // 上一张图片下标
    let lastIndex = 0;
    let tiems = '';

    // 将伪数组转化为数组
    //console.log(olLisObj);

    Array.from(olLisObj).forEach((li, key) => {
        // console.log(val);
        li.onclick = function () {
            //console.log(key);
            // 将index值给lastIndex
            lastIndex = index;
            // 将当前按钮下标给
            index = key
            change();
        }

    });

    /****右边按钮,下一张的实现******/
    nextObj.onclick = function () {
        // 当前索引给lastIndex
        lastIndex = index;
        index++;
        // 判断是否超出最后一张
        if (index == ulLisObj.length) index = 0;
        change();
    }

    /*******左边按钮上一张的实现*****/
    prevObj.onclick = function () {
        lastIndex = index;
        index--;
        if (index < 0) index = ulLisObj.length - 1;
        change();
    }

    // 自动播放
    function autoPlay() {
        times = setInterval(() => {
            nextObj.onclick();
        }, 2000)
    }
    autoPlay();


    // 鼠标移入则停止
    div1Obj.onmouseover = () => {
        clearInterval(times)
    }
    div1Obj.onmouseout = () => {
        autoPlay();
    }
    // 当前图片的显示,上一张隐藏
    function change() {
        // 图片的隐藏显示
        ulLisObj[lastIndex].classList.remove('ac');
        // 显示当前图片
        ulLisObj[index].classList.add('ac');

        //   // 按钮的显示隐藏
        olLisObj[lastIndex].classList.remove('ac')
        olLisObj[index].classList.add('ac');
    }
</script>

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp"%>
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




    <%--轮播图的实现--%>
    // 1 获取节点
    let div1Obj = document.getElementById('div1');
    let ulLisObj = div1Obj.firstElementChild.children;
    let olLisObj = document.querySelectorAll('ol li');

    let prevObj = document.getElementById('goPrev');
    let nextObj = document.getElementById('goNext');

    // 当前图片下标
    let index = 0;
    // 上一张图片下标
    let lastIndex = 0;
    let tiems = '';

    // 将伪数组转化为数组
    //console.log(olLisObj);

    Array.from(olLisObj).forEach((li, key) => {
        // console.log(val);
        li.onclick = function () {
            //console.log(key);
            // 将index值给lastIndex
            lastIndex = index;
            // 将当前按钮下标给
            index = key
            change();
        }

    });

    /****右边按钮,下一张的实现******/
    nextObj.onclick = function () {
        // 当前索引给lastIndex
        lastIndex = index;
        index++;
        // 判断是否超出最后一张
        if (index == ulLisObj.length) index = 0;
        change();
    }

    /*******左边按钮上一张的实现*****/
    prevObj.onclick = function () {
        lastIndex = index;
        index--;
        if (index < 0) index = ulLisObj.length - 1;
        change();
    }

    // 自动播放
    function autoPlay() {
        times = setInterval(() => {
            nextObj.onclick();
        }, 2000)
    }
    autoPlay();


    // 鼠标移入则停止
    div1Obj.onmouseover = () => {
        clearInterval(times)
    }
    div1Obj.onmouseout = () => {
        autoPlay();
    }
    // 当前图片的显示,上一张隐藏
    function change() {
        // 图片的隐藏显示
        ulLisObj[lastIndex].classList.remove('ac');
        // 显示当前图片
        ulLisObj[index].classList.add('ac');

        //   // 按钮的显示隐藏
        olLisObj[lastIndex].classList.remove('ac')
        olLisObj[index].classList.add('ac');
    }



</script>