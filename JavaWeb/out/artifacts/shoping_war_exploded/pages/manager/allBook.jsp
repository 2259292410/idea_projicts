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
<button class="layui-btn add">新增图书</button>

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
        <th>图书编号</th>
        <th>书名</th>
        <th>价格</th>
        <th>作者</th>
        <th>销量</th>
        <th>库存</th>
        <th>图片路径</th>
        <th>标题</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${requestScope.books}" var="book">
    <tr>
        <td class="bookId">${book.id}</td>
        <td>${book.name}</td>
        <td>${book.price}</td>
        <td>${book.author}</td>
        <td>${book.sales}</td>
        <td>${book.stock}</td>
        <td>${book.img_path}</td>
        <td>${book.title}</td>
        <td>
            <button class="layui-btn layui-btn-xs layui-btn-normal update">修改</button>
            <button class="layui-btn layui-btn-xs layui-btn-danger del">删除</button>
        </td>
    </tr>
</c:forEach>
    </tbody>
</table>




<script src="layui/layui.js"></script>
<script>
    $(function () {

        //点击新增图书按钮
        $(".add").click(function () {
            var id=$(this).parent().siblings(".bookId").text();
            layer.open({
                type: 2
                , btn: ['新增', '取消']
                , title: ['新增书本信息', 'font-size:16px']
                ,area: ['440px', '480px']
                ,offset: '0px'
                , content: "bookServlet?action=getBook"
                ,yes: function (index, layero) {
                    //do something
                    var iframeWin = window[layero.find('iframe')[0]['name']];
                    iframeWin.sub();
                    layer.close(index); //如果设定了yes回调，需进行手工关闭
                }
            });
        });

        //点击修改按钮
        $(".update").click(function () {
            var id=$(this).parent().siblings(".bookId").text();
            layer.open({
                type: 2
                , btn: ['修改', '取消']
                , title: ['修改书本信息', 'font-size:16px']
                ,area: ['440px', '480px']
                ,offset: '0px'
                , content: "bookServlet?action=getBook&id="+id
                ,success:function (layero,index) {
                    }
                ,yes: function (index, layero) {
                    //do something
                    var iframeWin = window[layero.find('iframe')[0]['name']];
                    iframeWin.sub();
                    location.href="managerServlet?action=listBook";
                    // layer.close(index); //如果设定了yes回调，需进行手工关闭
                }
            });
        });
            //点击删除按钮
        $(".del").click(function (){
          var id=$(this).parent().siblings(".bookId").text();
            layer.confirm('确定要删除该书吗？', { icon: 2, title: '提示' }, function (index) {
               location.href= "bookServlet?action=deleteBook&id="+id;
                // layer.close(index);
            });
        })

    })

</script>

</body>

</html>
