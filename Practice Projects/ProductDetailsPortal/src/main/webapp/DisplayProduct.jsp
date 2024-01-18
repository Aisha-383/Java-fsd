<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.operations.ProductOperations" %>
<%@ page import="com.entity.Product" %>

<%
    // Get the productId from the request parameter
    int productId = Integer.parseInt(request.getParameter("productId"));
    Product product = ProductOperations.getProductById(productId);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h2>Product Details</h2>
    <p>Product ID: <%= product.getId() %></p>
    <p>Product Name: <%= product.getProductName() %></p>
    <p>Price: <%= product.getPrice() %></p>
</body>
</html>
