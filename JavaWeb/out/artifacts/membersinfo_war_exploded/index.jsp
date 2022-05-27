<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/29
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getRequestDispatcher("userServlet?action=list").forward(request,response);%>