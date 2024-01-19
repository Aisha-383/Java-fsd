<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Railway Crossing Status - Registration</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.container {
	text-align: center;
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
}

form {
	margin-top: 20px;
	text-align: left; /* Align form content to the left */
}

label {
	display: block;
	margin-bottom: 8px;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 8px;
	border: 1px solid #ccc;
	box-sizing: border-box;
	border-radius: 5px;
}

input[type="submit"] {
	background-color: green;
	color: #fff;
	padding: 10px;
	border: none;
	border-radius: 25px;
	cursor: pointer;
	width: 100%;
}

a {
	color: #007bff;
	text-decoration: none;
	margin-top: 10px;
	display: block;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Railway Crossing</h1>
		<p>user registration</p>

		<form action="register" method="post">
			<label for="name">Enter Name:</label> 
			<input type="text" id="name" name="name" placeholder="aisha" required> 
				<label for="email">Enter Email:</label> 
				<input type="text" id="email" name="email"	placeholder="abc@gmail.com" required> 
				<label for="password">Enter Password:</label>
				 <input type="password" id="password" name="password" placeholder="xxxxx" required> <input type="submit" value="Register">
		</form>

		<p>Already have an account!!</p>
		<a href="UserLogin.jsp">Sign In instead</a>
	</div>
</body>
</html>
