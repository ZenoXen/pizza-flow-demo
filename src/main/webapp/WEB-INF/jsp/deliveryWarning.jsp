<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
<h2>Delivery Unavailable</h2>
<p>The address is outside of our delivery area. You may still place the order, but you will need to pick it up yourself.</p>
<a href="${flowExecutionUrl}&_eventId=accept">Continue, I'll pick up the order</a>
<a href="${flowExecutionUrl}&_eventId=cancel">Never mind</a>
</body>
</html>
