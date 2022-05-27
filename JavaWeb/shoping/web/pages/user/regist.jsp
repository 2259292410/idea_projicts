<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp" %>
    <%--	<link rel="shortcut icon" href="favicon.ico" />--%>
    <link rel="stylesheet" href="static/css/regist.css">
    <title>优购-个人注册</title>

    <script type="text/javascript">
        $(function () {
            var successful = true;

            // 给注册绑定单击事件
            $("#sub_btn").click(function () {
                // 验证用户名：必须由字母，数字下划线组成，并且长度为5到12位


                if(!successful){
                    $("span.errMsgUsername").html("<i class='error_icon'></i>用户名以存在！");
                    return false;
                }
                //1 获取用户名输入框里的内容
                var usernameText = $("#username").val();
                //2 创建正则表达式对象
                var usernamePatt = /^\w{5,12}$/;
                //3 使用test方法验证
                if (!usernamePatt.test(usernameText)) {
                    //4 提示用户结果
                    $("span.errMsgUsername").html("<i class='error_icon'></i>用户名不合法！");
                    return false;
                } else {
                    $("span.errMsgUsername").html("");

                }
                // 验证密码：必须由字母，数字下划线组成，并且长度为5到12位
                //1 获取用户名输入框里的内容
                var passwordText = $("#password").val();
                //2 创建正则表达式对象
                var passwordPatt = /^\w{5,12}$/;
                //3 使用test方法验证
                if (!passwordPatt.test(passwordText)) {
                    //4 提示用户结果
                    $("span.errMsgPwd").html("<i class='error_icon'></i>密码不合法！");

                    return false;
                } else {
                    $("span.errMsgPwd").html("");

                }

                // 验证确认密码：和密码相同
                //1 获取确认密码内容
                var repwdText = $("#repwd").val();
                //2 和密码相比较
                if (repwdText != passwordText) {
                    //3 提示用户
                    $("span.errMsgRePwd").html("<i class='error_icon'></i>确认密码和密码不一致！");

                    return false;
                } else {
                    $("span.errMsgRePwd").html("");

                }

                // 邮箱验证：xxxxx@xxx.com
                //1 获取邮箱里的内容
                var emailText = $("#email").val();
                //2 创建正则表达式对象
                var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
                //3 使用test方法验证是否合法
                if (!emailPatt.test(emailText)) {
                    //4 提示用户
                    $("span.errMsgEmail").html("<i class='error_icon'></i>邮箱格式不合法！");

                    return false;
                } else {
                    $("span.errMsgEmail").html("");

                }

                // 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。
                var codeText = $("#code").val();

                //去掉验证码前后空格
                // alert("去空格前：["+codeText+"]")
                codeText = $.trim(codeText);
                // alert("去空格后：["+codeText+"]")

                if (codeText == null || codeText == "") {
                    //4 提示用户
                    $("span.errMsgCode").html("<i class='error_icon'></i>验证码不能为空！");

                    return false;
                } else {
                    $("span.errMsgCode").html("");

                }

                //判断用户协议是否勾选
                if (!$("#agreement").get(0).checked) {
                    $(".errMsgAgreement").html("<i class='error_icon'></i>请阅读并同意协议！");
                    return false;
                }
<% int s =0;%>
<%=s%>

            });

            //判断用户名是否存在
            $("#username").blur(function () {
                var username = this.value;
                if (username == "") {
                    $("span.errMsgUsername").html("<i class='error_icon'></i>用户名不能为空");
                    return;
                }
                //以JSON的形式向服务器放Ajax请求
                $.getJSON("<%=basePath%>" + "userServlet", "action=existsUsername&username=" + username, function (date) {
                    if (date.result == 1) {
                        $("span.errMsgUsername").html("<i class='error_icon'></i>用户名已存在");
                        successful = false;

                    } else {
                        $(".errMsgUsername").html("<span class='success errMsgUsername'> <i class='success_icon'></i>用户名可用</span>");
                        successful = true;
                    }
                })
            });


            // 给验证码的图片，绑定单击事件
            $("#code_img").click(function () {
                // 在事件响应的 function 函数中有一个 this 对象。这个 this 对象，是当前正在响应事件的 dom 对象
                // src 属性表示验证码 img 标签的 图片路径。它可读，可写
                // alert(this.src);
                this.src = "${basePath}kaptcha.jpg?d=" + new Date();
            });

            //按下回车按钮
            // $(document).keyup(function(event){
            //     if(event.keyCode ==13){
            //         $("#regist_from").submit();
            //     }
            // });
        })
    </script>
</head>

<body>
<div class="w">

    <!-- header start -->
    <header class="header ">
        <!-- logo模块 -->
        <div class="logo">
            <h1>
                <a href="index.jsp" title="优购商城"></a>
            </h1>
        </div>
    </header>
    <!-- header end -->

    <div class="registerarea">
        <h3>注册新用户
            <div class="login">我有账号，去<a href="pages/user/login.jsp">登陆</a></div>
        </h3>
        <div class="reg_form">
            <form action="userServlet" method="post" id="regist_from">
                <input type="hidden" name="action" value="regist">
                <ul>
                    <li><label for="">用户名称：</label>
                        <input type="text" class="inp" name="username" id="username" value="${requestScope.username}" autocomplete="off">
                        <span class="error errMsgUsername"> </span>
                    </li>
                    <li><label for="">登录密码：</label> <input type="password" class="inp" name="password" id="password" value="${requestScope.password}" autocomplete="off">
                        <span class="error errMsgPwd">   </span>
                    </li>
                    <li><label for="">确认密码：</label> <input type="password" class="inp" name="ok_password" id="repwd" value="${requestScope.password}" autocomplete="off">
                        <span class="error errMsgRePwd"> </span>
                    </li>
                    <li><label for="">电子邮箱：</label> <input type="email" class="inp" name="email" id="email"
                                                           value="${requestScope.email}" autocomplete="off">
                        <span class="error errMsgEmail"></span>
                    </li>
                    <li><label for="">验证码：</label> <input type="text" class="inp" style="width: 160px;" id="code"
                                                          name="code" autocomplete="off">
                        <img id="code_img" src="http://localhost:8080/shoping/kaptcha.jpg" alt=""
                             style="width: 80px;height: 40px;">
                        <span class="error errMsgCode">${requestScope.msg} </span>
                    </li>
                    <li class="agree"><input type="checkbox" name="" id="agreement">
                        同意协议并注册 <a href="#">《知晓用户协议》</a>
                        <span class="error errMsgAgreement"></span>
                    </li>
                    <li>
                        <input style="cursor:pointer;" type="submit" value="完成注册" class="btn" id="sub_btn" autocomplete="off">
                    </li>
                </ul>
            </form>
        </div>
    </div>
</div>

<!-- 底部模块 -->

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp" %>

</body>

</html>