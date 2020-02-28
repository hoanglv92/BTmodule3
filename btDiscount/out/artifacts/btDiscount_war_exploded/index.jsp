<%--
  Created by IntelliJ IDEA.
  User: hoanglv
  Date: 28/02/2020
  Time: 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tinh chiet khau</title>
  </head>
  <body>
  <h1>nhap thong tin san pham vao bang</h1>
  <form action="tinhtoan" method="post">
    <table>
      <tr>
        <th>
          mo ta san pham
        </th>
        <th>
          gia
        </th>
        <th>
          ti le chiet khau
        </th>
      </tr>
      <tr>
        <td>
          <input type="text" name="mota" value="nhap mo ta san pham">
        </td>
        <td>
          <input type="text" name="giasanpham" value="nhap gia san pham">
        </td>
        <td>
          <input type="text" name="tilechietkhau" value="nhap ti le chiet khau">
        </td>
      </tr>
      <tr>
        <td>
          <button type="submit">submit</button>
        </td>

      </tr>
    </table>
  </form>
  </body>
</html>
