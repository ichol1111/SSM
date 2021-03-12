<%--
  Created by IntelliJ IDEA.
  User: ichol
  Date: 8/12/2020
  Time: 6:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="user/insert">
        name:<input type="text" name="name"><br/>
        account:<input type="text" name="account"><br/>
        password:<input type="password" name="password"><br/>
        <input type="submit" value="insert">
    </form>
    <br/>
    <form method="post" action="user/delete">
        the id of user to be deleted:<input type="text" name="id"><br/>
        <input type="submit" value="delete">
    </form>
    <br/>
    <a href="user/findAll">See all users</a>
    <br/>
    <form method="post" action="user/update">
        id:<input type="text" name="id"><br/>
        name:<input type="text" name="name"><br/>
        account:<input type="text" name="account"><br/>
        password:<input type="password" name="password"><br/>
        <input type="submit" value="update">
    </form>
</body>
</html>
