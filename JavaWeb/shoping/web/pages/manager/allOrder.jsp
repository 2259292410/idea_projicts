<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/29
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有订单</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <link rel="stylesheet" href="layui/css/layui.css">
    <style>
        table{
            table-layout:fixed;/* 只有定义了表格的布局算法为fixed，下面td的定义才能起作用。 */
        }
        td{
            word-break:keep-all;/* 不换行 */
            white-space:nowrap;/* 不换行 */
            overflow:hidden;/* 内容超出宽度时隐藏超出部分的内容 */
            text-overflow:ellipsis;/* 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一起使用。*/
        }
    </style>
</head>

<body>

<table class="layui-table" lay-size="sm">
<%--    <colgroup>--%>
<%--                <col width="200">--%>
<%--                <col width="200">--%>
<%--                <col width="100">--%>
<%--                <col width="100">--%>
<%--                <col width="100">--%>
<%--                <col width="350">--%>
<%--    </colgroup>--%>
    <thead>
    <tr>
        <th>订单号</th>
        <th>订单创建时间</th>
        <th>订单价格</th>
        <th>订单状态</th>
        <th>用户编号</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.orders}" var="order">
        <tr>
            <td class="orderId">${order.orderId}</td>
            <td>${order.createTime}</td>
            <td>${order.price}</td>
            <c:choose>
                <c:when test="${ order.status == 0 }">
                    <td>未发货</td>
                </c:when>
                <c:when test="${ order.status == 1 }">
                    <td>未签收</td>
                </c:when>
                <c:when test="${ order.status == 2 }">
                    <td>已签收</td>
                </c:when>
            </c:choose>
            <td>${order.userId}</td>
            <td>
                <button class="layui-btn layui-btn-sm  layui-btn showDetails">查看详情</button>
                <button class="layui-btn layui-btn-sm layui-btn-normal send">发货</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>




<script src="layui/layui.js"></script>
<script>
    $(function () {

        //点击查看详情
        $(".showDetails").click(function (obj) {
            var orderId=$(this).parent().parent().find(".orderId").text();
            layer.open({
                type: 2
                , btn: ['关闭']
                , title: ['查看订单详情', 'font-size:16px']
                ,area: ['640px', '480px']
                ,offset: '0px'
                , content: "orderServlet?action=orderDetails&orderId="+orderId
                ,yes: function (index, layero) {
                    layer.close(index); //如果设定了yes回调，需进行手工关闭
                }
            });
        });

        //点击发货
        $(".send").click(function (){
            var status=$(this).parent().prev().prev().text();
            var orderId=$(this).parent().parent().find(".orderId").text();
            if(status=="未发货"){
                layer.msg('确定发货么？', {
                    time: 0 //不自动关闭
                    ,btn: ['确定', '取消']
                    ,yes: function(index){
                        location.href="orderServlet?action=sendOrder&orderId="+orderId;
                        layer.close(index); //如果设定了yes回调，需进行手工关闭
                    }
                });
            }else {
                layer.msg('该订单已发货！', function () {

                });
            }

            // layer.confirm('确定要删除该书吗？', { icon: 2, title: '提示' }, function (index) {
            //     location.href= "bookServlet?action=deleteBook&id="+id;
            //     layer.close(index);
            // });
        })

    })

</script>

</body>

</html>
