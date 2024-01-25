<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
    <form action="/SpringSetup/user/update" method="post">
        <input type="hidden" name="id" value="${user.id}">
        Username: <input type="text" name="username" value="${user.username}">
        Email: <input type="text" name="email" value="${user.email}">
        <input type="submit" value="Update">
    </form>
</body>
</html>
