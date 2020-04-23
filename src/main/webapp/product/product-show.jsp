<%--
  Created by IntelliJ IDEA.
  User: sinisatesic
  Date: 4/22/20
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

        <title>Product Show Page</title>
</head>
<body>
<div class="container">
    <h1>Current product: ${product.title}</h1>
    <p>Price: $${product.priceInCents/100}</p>
    <h3>Description</h3>
    <p>${product.description}</p>


</div>
</body>
</html>
