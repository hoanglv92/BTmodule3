<%--
  Created by IntelliJ IDEA.
  User: hoanglv
  Date: 27/02/2020
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>wweb</title>
  <style>
    .text-view{
      color: mediumblue;
      text-align: center;
    }
  </style>
</head>
<body>
<h1 class="text-view" id="hienthi"><p>xin chao day la noi hien thi gio</p></h1>
<button  type="button" onclick="getTime()">click</button>
<div id="hien"></div>
<script>
  function getTime() {
    var d=new Date();
    var show=d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getFullYear();
    document.getElementById("hienthi").innerHTML=show;
  }
</script>
</body>
</html>
