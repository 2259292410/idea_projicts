<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有订单</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <link rel="stylesheet" href="layui/css/layui.css">
    <style>
        table {
            table-layout: fixed; /* 只有定义了表格的布局算法为fixed，下面td的定义才能起作用。 */
        }

        td {
            word-break: keep-all; /* 不换行 */
            white-space: nowrap; /* 不换行 */
            overflow: hidden; /* 内容超出宽度时隐藏超出部分的内容 */
            text-overflow: ellipsis; /* 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一起使用。*/
        }
    </style>
</head>

<body>

<table class="layui-table" lay-size="sm">
    <colgroup>
        <col width="200">
        <col width="200">
    </colgroup>
    <thead>
    <tr>
        <th>订单号</th>
        <th>书名</th>
        <th>价格</th>
        <th>数量</th>
        <th>总价</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.orderItems}" var="orderItem">
        <tr>
            <td>${orderItem.orderId}</td>
            <td>${orderItem.name}</td>
            <td>${orderItem.price}</td>
            <td>${orderItem.count}</td>
            <td>${orderItem.totalPrice}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="layui/layui.js"></script>
</body>

</html>
