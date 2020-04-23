<%--
  Created by IntelliJ IDEA.
  User: sinisatesic
  Date: 4/22/20
  Time: 11:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads below</title>
</head>
<body>
<div>
    <h1>ads</h1>

    <c:forEach var="ad" items="${ads}">
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </c:forEach>


    <%@include file="/partials/decorative-objects.jsp"%>

            <%@include file="/css/decorative-objects.css"%>


</body>
</html>
