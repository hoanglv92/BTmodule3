<%--
  Created by IntelliJ IDEA.
  User: hoanglv
  Date: 02/03/2020
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Student</title>
</head>
<body>
<h1>Student details</h1>
<p>
    <a href="students">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${students.getName()}</td>
    </tr>
    <tr>
        <td>id: </td>
        <td>${students.getId()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${students.getAddress()}</td>
    </tr>
</table>
</body>
</html>
