<%--
  Created by IntelliJ IDEA.
  User: hoanglv
  Date: 04/03/2020
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <script src="../js/jsforcreate.js" type="text/javascript"></script>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="users?action=users">List All Users</a>
        <p >
            <c:if test='${requestScope["message"] !=null}'>
                ${requestScope["message"]}
            </c:if>
        </p>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Search  User By Country</h2>
            </caption>
            <tr>
                <th>Country:</th>
                <td>
                    <input type="text" name="country" id="country" size="15" value="${country}" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input  type="submit" value="search" onclick="checkkitu()" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
