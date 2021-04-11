<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
<h2>Take Payment</h2>
<form:form modelAttribute="paymentDetails">
    <form:input path="amount" disabled="true"/>
    <form:checkboxes path="paymentType" items="${paymentTypeList}" delimiter="$lt;br/$gt;"/><br><br>
    <input type="submit" class="button" name="_eventId_paymentSubmitted" value="Submit"/>
    <input type="submit" class="button" name="_eventId_cancel" value="Cancel"/>
</form:form>
</body>
</html>
