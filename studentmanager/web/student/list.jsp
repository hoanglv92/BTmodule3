<%--
  Created by IntelliJ IDEA.
  User: hoanglv
  Date: 02/03/2020
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>danh sach sinh vien</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="students?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>id</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["students"]}' var="student">
        <tr>
            <td><a href="students?action=view&id=${student.getId()}">${student.getName()} </a></td>
            <td>${student.getId()}</td>
            <td>${student.getAddress()}</td>
            <td><a href="students?action=edit&id=${student.getId()}">edit</a></td>
            <td><a href="students?action=delete&id=${student.getId()}">delete</a></td>
            ${'students'}
        </tr>
    </c:forEach>
</table>
</body>
</html>
