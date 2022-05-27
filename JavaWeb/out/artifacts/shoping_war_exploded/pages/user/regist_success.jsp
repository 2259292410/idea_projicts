<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>

    <link rel="stylesheet" type="text/css" href="static/css/regist_success.css">

    <title>个人注册</title>
</head>
<body>

<!-- header模块 start  -->
<div class="w">
    <div class="header">
        <div id="logo">
            <a href="" class="fl"><img src="static/img/logo1.jpg" title="优购商城"></a>
            <span class="fl" style="margin-right:100px;">欢迎注册</span>
        </div>
    </div>
</div>

<!-- header模块 end  -->
<!-- widget header end -->
<div class="content w">
    <div class="t">
        <b class="i"></b>
        <p class="mt">恭喜您 ${sessionScope.user.username}</p>
        <p class="mm">您已成功注册为优购用户，祝您购物愉快~</p>
    </div>
    <div class="btn-con"
         onclick='top.location.href="index.jsp"'>
        <a href="#" class="btn">去购物</a>
    </div>

</div>

</div>


<!-- 底部模块 -->
<footer id="bottom">
    <div style="width: 100vw;">
            <span>
                优购商城.Copyright &copy;2021
            </span>
    </div>
</footer>

</body>

</html>