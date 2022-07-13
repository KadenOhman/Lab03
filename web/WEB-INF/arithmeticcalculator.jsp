
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
                <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second </label>
            <input type="text" name="second" value="${second}">
            <br>
            <input type="submit" name="math" value="+">
            <input type="submit" name="math" value="-">
            <input type="submit" name="math" value="*">
            <input type="submit" name="math" value="%">  
        </form>
        <p>Result: ${output}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
