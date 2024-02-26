<%--
  Created by IntelliJ IDEA.
  User: RAZER
  Date: 2/23/2024
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form action="/usd" method="post">
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="0" style="margin-bottom: 20px"><br>
    <label>Rate: </label>
    <input type="text" name="rate" placeholder="Rate" value="24640" style="margin-bottom: 20px"><br>
    <input type="submit" value="Converter">
</form>
</body>
</html>
