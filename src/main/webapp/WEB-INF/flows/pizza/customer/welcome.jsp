<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
<h2>Welcome to Spizza!!!</h2>
<form>
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <input type="text" name="phoneNumber"/><br>
    <input type="submit" name="_eventId_phoneEntered" value="Lookup Customer"/>
</form>
</body>
</html>
