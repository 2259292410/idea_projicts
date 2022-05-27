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
    <title>所有图书</title>
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
<button class="layui-btn add">新增用户</button>

<table class="layui-table" lay-size="sm">
    <colgroup>
        <%--        <col width="100">--%>
        <%--        <col width="100">--%>
        <%--        <col width="100">--%>
        <%--        <col width="50">--%>
        <%--        <col width="50">--%>
        <%--        <col width="50">--%>
        <%--        <col width="300">--%>
        <%--        <col width="200">--%>
        <%--        <col width="100">--%>
    </colgroup>
    <thead>
    <tr>
        <th>用户编号</th>
        <th>用户名</th>
        <th>邮箱号</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.user}" var="user">
        <tr>
            <td class="bookId">${user.id}</td>
            <td>${user.username}</td>
            <td>${user.email}</td>
            <td>
                <button class="layui-btn  layui-btn-danger del">删除</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>




<script src="layui/layui.js"></script>
<script>
    $(function () {

        //点击新增用户按钮
        $(".add").click(function () {
            var id=$(this).parent().siblings(".bookId").text();
            layer.open({
                type: 2
                , btn: ['新增', '取消']
                , title: ['新增用户信息', 'font-size:16px']
                ,area: ['360px', '270px']
                ,offset: '100px'
                , content: "pages/manager/user_edit.jsp"
                ,yes: function (index, layero) {
                    //do something
                    var iframeWin = window[layero.find('iframe')[0]['name']];
                    iframeWin.sub();
                    layer.close(index); //如果设定了yes回调，需进行手工关闭
                    location.href="userServlet?action=queryUser";
                }
            });
        });

        $(".del").click(function (){
            var id=$(this).parent().siblings(".bookId").text();
            layer.confirm('确定要删除该用户吗?', { icon: 2, title: '提示' }, function (index) {
                location.href= "userServlet?action=deleteUser&id="+id;
                layer.close(index);
            });
        })

    })

</script>

</body>

</html>
