<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 27/02/2024
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 500px;
            border: 2px solid;
        }

        tr, td, th {
            border: 1px dotted;
        }
    </style>
</head>
<body>
<p>There are ${customer.size()} customers in list</p>
<h3>Customer List</h3>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach var="c" items="${customer}">
        <tr>
            <td>${c.id}</td>
            <td><a href="/customer/${c.id}">${c.name}</a></td>
            <td>${c.email}</td>
            <td>${c.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
