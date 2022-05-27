<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/29
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>优购-管理员登录</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <link rel="stylesheet" href="layui/css/layui.css">
    <link rel="stylesheet" href="static/css/mLogin.css">
</head>

<body>

<div class="bg">

    <div class="login_from">
        <h1>管理员登录</h1>
        <form class="layui-form" action="managerServlet">
            <input type="hidden" name="action" value="login">
            <div class="layui-form-item">
                <label class="layui-form-label">账号：</label>
                <div class="layui-input-inline">
                    <input type="text" name="manager_name" required lay-verify="required" placeholder="请输入账号"
                           autocomplete="off" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">密码：</label>
                <div class="layui-input-inline">
                    <input type="password" name="password" required lay-verify="required" placeholder="请输入密码"
                           autocomplete="off" class="layui-input">
                </div>
            </div>


            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>
                    <button type="reset" class="layui-btn layui-btn-primary">清空</button>
                </div>
            </div>
        </form>



        <script src="layui/layui.js"></script>
        <script>
            //Demo
            // layui.use('form', function () {
            //     var form = layui.form;
            //
            //     //监听提交
            //     form.on('submit(formDemo)', function (data) {
            //         layer.msg(JSON.stringify(data.field));
            //         return true;
            //     });
            // });

            if(${not empty requestScope.msg}){
                layer.msg('账号或密码错误！！', {icon: 5});

            }
        </script>
    </div>

</div>


</body>

</html>
