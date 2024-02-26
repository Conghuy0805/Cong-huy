<%--
  Created by IntelliJ IDEA.
  User: RAZER
  Date: 2/26/2024
  Time: 7:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/caculator" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <p>
        <input type="submit" name="calculation" value="Addition(+)">
        <input type="submit" name="calculation" value="Subtraction(-)">
        <input type="submit" name="calculation" value="Multiplication(X)">
        <input type="submit" name="calculation" value="Division(/)">
    </p>
</form>
<h2>Result ${cal}: ${result}</h2>
</body>
</html>
