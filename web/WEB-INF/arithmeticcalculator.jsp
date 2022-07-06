<%-- 
    Document   : arithmeticcalculator
    Created on : 4-Jul-2022, 7:34:11 AM
    Author     : Kaden
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
                <form method="POST" action="age">
            <label>First: </label>
            <input type="text" name="first" value="">
            <br>
            <label>Second </label>
            <input type="text" name="second" value="">
            <br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="*">
            <input type="submit" name="divide" value="%">  
        </form>
        <p>Result: ${output}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
