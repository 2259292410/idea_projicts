<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/13
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 快捷导航栏模块 start -->
<section class="shortcut">
    <div class="w">
        <div class="fl">
            <ul>
                <%--如果用户还没有登录，显示     【登录 和注册的菜单】 --%>
                <c:if test="${empty sessionScope.user}">
                    <li>
                        <a href="pages/user/login.jsp">优购商城欢迎您！&nbsp;请登录</a> &nbsp;
                        <a href="pages/user/regist.jsp" class="style_red">免费注册</a>
                    </li>
                </c:if>
                    
                <%--如果已经登录，则显示 登录 成功之后的用户信息。--%>
                <c:if test="${not empty sessionScope.user}">
                    <li>欢迎，${sessionScope.user.username}&nbsp; <a href="userServlet?action=logout">退出</a></li>
                </c:if>
            </ul>
        </div>
        <div class="fr">
            <ul>
                <li class="my_order" style="cursor:pointer;"><a >我的订单</a></li>
                <li></li>
                <li><a href="#">优购会员</a></li>
                <li></li>
                <li><a href="">企业采购</a></li>
                <li></li>
                <li><a href="">关注优购</a></li>
            </ul>
        </div>
    </div>
</section>
<!-- 快捷导航栏模块 start -->
<script>
    $(function () {
        $(".my_order").click(function (){
            if (${empty sessionScope.user}){
                location.href="pages/user/login.jsp";
            }else {
                location.href= "orderServlet?action=showMyOrder";
            }
        });
    })
</script>

