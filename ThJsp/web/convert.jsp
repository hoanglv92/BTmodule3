<%--
  Created by IntelliJ IDEA.
  User: hoanglv
  Date: 28/02/2020
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bo hoang</title>
</head>
<body>
<%
    Float usd=Float.parseFloat(request.getParameter("usd"));
    Float rate=Float.parseFloat(request.getParameter("rate"));
    Float vnd=usd*rate;
%>
<h1>Rate : <%=rate%> </h1>
<h1>Usd : <%=usd%></h1>
<h1>VND :<%=vnd%></h1>
</body>
</html>
