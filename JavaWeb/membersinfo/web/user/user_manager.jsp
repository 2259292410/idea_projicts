<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<style>
    * {
        margin: 0px;
        padding: 0px;
        text-decoration: none;
    }

    div {
        width: 95%;
        margin: 0px auto;
        margin-top: 5px;
    }

    div > p {
        font-weight: bold;
        text-align: center;
        padding: 5px 0px;
        background-color: rgb(106, 106, 104);
    }

    table {
        width: 100%;
        text-align: center;
    }
</style>

<head>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/common/head.jsp" %>
</head>

<body>

<div id="main" style="padding-top: 20px">
    <c:if test="${sessionScope.msg=='msg'}">
        <div id="msg" style="text-align: right;margin-bottom: 5px">
            更新会员信息成功
        </div>
    </c:if>
    <p>俱乐部会员信息</p>
    <table border="1">
        <thead>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>家庭住址</td>
            <td>Email</td>
            <td>操作</td>
        <tr>
        </thead>
        <tbody></tbody>

        <c:forEach items="${requestScope.membersinfos}" var="membersinfo">
            <thead>
            <tr>
                <td>
                    <a href="userServlet?action=getUser&id=${membersinfo.id}">
                            ${membersinfo.id}
                    </a>
                </td>
                <td>${membersinfo.mname}</td>
                <td>${membersinfo.mgender}</td>
                <td>${membersinfo.mage}</td>
                <td>${membersinfo.maddress}</td>
                <td>${membersinfo.memail}</td>
                <td><a href="userServlet?action=delete&id=${membersinfo.id}" class="deleteClass">删除</a></td>
            <tr>
            </thead>
            <tbody></tbody>
        </c:forEach>

    </table>

</div>
</body>
</html>
<script type="text/javascript">
    $(function () {
        $("a.deleteClass").click(function () {
            return confirm("你确定要删除【】吗？");
        })

    });
</script>
