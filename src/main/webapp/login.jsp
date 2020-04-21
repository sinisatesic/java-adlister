<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sinisatesic
  Date: 4/21/20
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<c:choose>
    <c:when test="${param.username == 'admin' && param.password == 'password'}">
     <c:redirect url="./profile.jsp">
         <c:param name="username" value="${param.username}"></c:param>
         <c:param name="password" value="${param.password}"></c:param>
     </c:redirect>
    </c:when>
    <c:otherwise>

        <%@ include file="partials/login-form.jsp"%>

    </c:otherwise>
</c:choose>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> Wazzzuuuup</h1>

</body>
</html>
