<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>

	<link rel="stylesheet" type="text/css" href="static/css/login.css">
	<title>优购-欢迎登陆</title>
</head>

<body>

<!-- header模块 start  -->
<div class="w">
	<div class="header">
		<div id="logo">
			<a href="#" class="fl"><img src="static/img/logo1.jpg" title="优购商城"></a>
			<span class="fl" style="margin-right:100px;" >欢迎登录</span>
		</div>
	</div>
</div>
<!-- header模块 end  -->

<div class="login-wrap">
	<div class="w">
		<div class="content">
			<div class="login-form">
				<!-- warning start -->
				<div class="warning-wrap">
					<div class="warning">
						<p><i><span class="iconfont lifeservice" style="line-height: 20px;font-size: 12px;">&#xe61e;</span></i>&nbsp; 优购不会以任何理由要求您转账汇款，谨防诈骗。</p>
					</div>
				</div>
				<!-- warning stop -->
				<div class="login-box h50">
					<!-- <div class="fl login-way"> 扫码登录 </div> -->
					<div class="fr login-way color-r"> 账户登录 </div>
				</div>

				<!-- form -->
				<form action="userServlet" method="post" id="search_form">
					<input type="hidden" name="action" value="login" />
					<div class="h252 pl20 pr20">
						<div class="w100p">
							<div class="h40 center">
								<div class="warning fs10 color-r">${ empty requestScope.msg ? "":requestScope.msg }</div>
							</div>

						</div>
						<div class="w100p">
							<div class="h50 center">
								<label for="username" id="username" class="itxt-icon login-label">
									<i><span class="iconfont ">&#xe65a;</span></i>
								</label>
								<input placeholder="请输入用户名" id="username" class="itxt" type="text"
									   name="username" autocomplete="off" value="${requestScope.username}">
							</div>
						</div>
						<div class="w100p">
							<div class="h50 center pt10">
								<label for="password" id="password" class="itxt-icon login-label">
									<i><span class="iconfont ">&#xe620;</span></i>
								</label>
								<input placeholder="请输入密码" id="password" class="itxt" type="password" name="password"
									   autocomplete="off">
							</div>
						</div>
						<div class="w100p">
							<div class="h32 right-link">
								<!-- <div class="fr fs10 pt10"><a href="">忘记密码</a></div> -->
							</div>
						</div>
						<div class="w100p">
							<div class="h50 center">
								<div class="login-btn">
									<a href="javascript:document:search_form.submit();" >登&nbsp;&nbsp;&nbsp;&nbsp;录</a>
								</div>
							</div>
						</div>
					</div>

				</form>
				<!-- wechat  -->
				<div class="w90p">
					<div class="login-plus h50 pt15">
						<ul>
							<!-- <li class="fl fs20 mr10">QQ</li>
                            <li class="fl fs20 mr10">|</li>
                            <li class="fl fs20 mr10">微信</li> -->
							<li class="fr fs20 "><a class="color-r fs20" href="pages/user/regist.jsp"><i><span class="iconfont color-r fs20">&#xe658;</span></i>立即注册</a> </li>
						</ul>
					</div>
				</div>
			</div>

		</div>

	</div>
</div>

<!-- 底部模块 -->

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp"%>
</body>

</html>

<script>
	$(function () {
		$(document).keyup(function(event){
			if(event.keyCode ==13){
				$("#search_form").submit();
			}
		});
	})
</script>
