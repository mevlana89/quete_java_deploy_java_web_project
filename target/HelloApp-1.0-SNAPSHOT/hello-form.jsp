<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="simple-hello" method="post" class="form-example">
    <div class="form-example">
        <label for="name">Enter your name: </label>
        <input type="text" name="name" id="name" required>
    </div>
    <div class="form-example">
        <label for="surname">Enter your surname: </label>
        <input type="text" name="surname" id="surname" required>
    </div>
    <div class="form-example">
        <label for="hour">Enter hour: </label>
        <input type="number" name="hour" id="hour" required>
    </div>
    <div class="form-example">
        <input type="submit" value="Subscribe!">
    </div>
</form>
</body>
</html>