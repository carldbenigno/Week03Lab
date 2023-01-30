<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 29, 2023, 5:26:07 PM
    Author     : espresso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="num1" value="${num1}"><br>
            Second: <input type="text" name="num2" value="${num2}"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <p>${message}</p>
        <p>${calculation}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
