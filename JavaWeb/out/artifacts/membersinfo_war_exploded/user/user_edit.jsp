<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/30
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/common/head.jsp" %>
</head>
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
        background-color: #646566;
        width: 100%;
        text-align: center;
    }


</style>
<body>



<div>
    <form action="" method="get">
        <table border="1">

            <thead>
            <tr>
                <th colspan="5"></th>
            </tr>
            </thead>
            <tr>
                <td colspan="3">姓名</td>
                <td><input type="text" name="mname" class="username" value="${requestScope.membersinfo.mname}"/></td>
            </tr>
            <tr>
                <c:if test="${requestScope.membersinfo.mgender !='男'} ">
                    <h1>hh</h1>
                </c:if>
                <td colspan="3">性别</td>
                <td><input type="radio" name="mgender" class="mgender" value="男"/>男
                    <input type="radio" name="mgender" class="mgender" value="女"/>女
                </td>
            </tr>
            <tr>
                <td colspan="3">年龄</td>
                <td><input type="text" name="mage" class="mage" value="${requestScope.membersinfo.mage}"/></td>
            </tr>
            <tr>
                <td colspan="3">家庭住址</td>
                <td><input type="text" name="maddress" class="maddress" value="${requestScope.membersinfo.maddress}"/></td>
            </tr>
            <tr>
                <td colspan="3">Email</td>
                <td><input type="text" name="memail" class="memail" value="${requestScope.membersinfo.memail}"/></td>
            </tr>
            <tr>
                <td colspan="5">
                    <input type="button" value="修改" onclick="update()"/>
                    <input type="button" value="重置" onclick="closeval()"/>
                    <input type="button" value="添加" onclick="add()"/>
                </td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
<script type="text/javascript">
    $(function () {
        init();

    });

    //初始化数据
    function init() {
        var str = '${requestScope.membersinfo.mgender}';
        if (str == "男") {
            $('input:radio:first').attr('checked', 'checked');
        } else {
            $('input:radio:last').attr('checked', 'checked');
        }

    }

    //非空验证
    function fk() {
        if ($(".username").val() == "" || $(".age").val() == "") {
            alert("会员姓名、年龄不能为空");
            return false;
        }
        return true;
    }

    //修改用户信息
    function update() {
        if (fk()) {
            //window.location.href = "userServlet?action=update&id=${requestScope.membersinfo.id}";
            $.getJSON("userServlet",
                {   action:"update",
                    id:${requestScope.membersinfo.id},
                    mname:$(".username").val(),
                    mgender:$(".mgender:checked").val(),
                    mage:$(".mage").val(),
                    memail:$(".memail").val(),
                    maddress:$(".maddress").val()
                },
                function (data) {
                window.location.href ="userServlet?action=list";
                }
            )

        }
    }

</script>