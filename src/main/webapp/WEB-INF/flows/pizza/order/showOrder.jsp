<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spizza</title>
</head>
<body>
<h2>Pizza Status</h2>
<c:forEach var="pizza" items="${order.pizzas}">
${pizza.size}:
    <c:forEach items="${pizza.toppings}" var="topping">${topping.name}</c:forEach>
    <br>
</c:forEach>
<a href="${flowExecutionUrl}&_eventId=createPizza">Create Pizza</a>
<a href="${flowExecutionUrl}&_eventId=checkout">Checkout</a>
<a href="${flowExecutionUrl}&_eventId=cancel">Cancel</a>
</body>
</html>
