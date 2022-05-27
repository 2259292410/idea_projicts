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
<form class="layui-form edit_form" action="bookServlet">
    <input type="hidden" name="action" value="${empty requestScope.book ? "addBook":"updateBook"}">
    <input type="hidden" name="id" value="${requestScope.book.id}">
    <div class="layui-form-item">
        <label class="layui-form-label">书名：</label>
        <div class="layui-input-inline">
            <input type="text" name="name" required lay-verify="required" autocomplete="off"
                   class="layui-input" value="${requestScope.book.name}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">价格：</label>
        <div class="layui-input-inline">
            <input type="text" name="price" required lay-verify="required" autocomplete="off"
                   class="layui-input price" value="${requestScope.book.price}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">作者：</label>
        <div class="layui-input-inline">
            <input type="text" name="author" required lay-verify="required" autocomplete="off"
                   class="layui-input" value="${requestScope.book.author}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">销量：</label>
        <div class="layui-input-inline">
            <input type="text" name="sales" required lay-verify="required" autocomplete="off"
                   class="layui-input" value="${requestScope.book.sales}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">库存：</label>
        <div class="layui-input-inline">
            <input type="text" name="stock" required lay-verify="required" autocomplete="off"
                   class="layui-input" value="${requestScope.book.stock}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">图片路径：</label>
        <div class="layui-input-inline">
            <c:if test="${not empty requestScope.book }">
                <input type="text" name="img_path" required lay-verify="required" autocomplete="off"
                       class="layui-input" value="${requestScope.book.img_path}">
            </c:if>
            <c:if test="${empty requestScope.book }">
                <input type="file" name="img_path" id="">
            </c:if>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">标题：</label>
        <div class="layui-input-inline">
            <input type="text" name="title" required lay-verify="required" autocomplete="off"
                   class="layui-input" value="${requestScope.book.title}">
        </div>
    </div>

    <%--    <div class="layui-form-item">--%>
    <%--        <div class="layui-input-block">--%>
    <%--            <button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>--%>
    <%--            <button type="reset" class="layui-btn layui-btn-primary">清空</button>--%>
    <%--        </div>--%>
    <%--    </div>--%>


</form>

</body>
</html>
<script>
    function sub() {
        $(".edit_form").submit();
    }
</script>
