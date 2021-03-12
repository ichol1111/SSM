<%--
  Created by IntelliJ IDEA.
  User: ichol
  Date: 8/12/2020
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <c:forEach items="${users}" var="user">
            ${user.name},${user.account},${user.password}<br/>
        </c:forEach>
</body>
</html>
