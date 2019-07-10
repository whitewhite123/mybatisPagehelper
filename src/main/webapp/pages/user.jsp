<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/7/10
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table cellpadding="0">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>age</td>
        </tr>
        <c:forEach items="${userList}" var="u" >
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.age}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
