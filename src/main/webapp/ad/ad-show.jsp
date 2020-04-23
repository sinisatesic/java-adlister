<%--
  Created by IntelliJ IDEA.
  User: sinisatesic
  Date: 4/22/20
  Time: 10:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Below:</title>
</head>
<body>
<div>
    <h1>Current ad: ${ad.title}</h1>
    <p>Price $${ad.priceInCents/100}</p>
    <h3>description</h3>
    <p>${ad.description}</p>
</div>
</body>
</html>
