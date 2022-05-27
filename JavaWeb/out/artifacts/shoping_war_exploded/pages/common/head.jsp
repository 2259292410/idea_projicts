<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";
%>

<!--写base标签，永远固定相对路径跳转的结果-->
<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="static/css/base.css" >
<link type="text/css" rel="stylesheet" href="static/css/common.css" >
<link rel="shortcut icon" href="favicon.ico" />
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
<script src="static/script/common.js"></script>