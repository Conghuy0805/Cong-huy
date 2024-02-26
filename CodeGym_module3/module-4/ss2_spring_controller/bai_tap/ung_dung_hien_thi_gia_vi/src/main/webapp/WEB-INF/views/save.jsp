<%--
  Created by IntelliJ IDEA.
  User: RAZER
  Date: 2/26/2024
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${condiment}" var="eat">
    <h1>${eat}</h1>
</c:forEach>
</body>
</html>
