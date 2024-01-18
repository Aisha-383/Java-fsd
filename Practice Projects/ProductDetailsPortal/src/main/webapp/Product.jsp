<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
    <form action="ProductProcessServlet" method="post">
        Product Name: <input type="text" name="productName" required><br>
        Price: <input type="number" name="price" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
