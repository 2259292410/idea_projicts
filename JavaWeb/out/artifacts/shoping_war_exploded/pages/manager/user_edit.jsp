<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/31
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <link rel="stylesheet" href="layui/css/layui.css">

</head>
<body>
<form class="layui-form edit_form" action="userServlet">
    <input type="hidden" name="action" value="addUser">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名：</label>
        <div class="layui-input-inline">
            <input type="text" name="username" required lay-verify="required"  autocomplete="off"
                   class="layui-input" >
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码：</label>
        <div class="layui-input-inline">
            <input type="text" name="password"  required lay-verify="required"  autocomplete="off"
                   class="layui-input price" >
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">邮箱号：</label>
        <div class="layui-input-inline">
            <input type="text" name="email" required lay-verify="required"  autocomplete="off"
                   class="layui-input" >
        </div>
    </div>


</form>

</body>
</html>
<script>
    function sub(){
        $(".edit_form").submit();
    }
</script>
