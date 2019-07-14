<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Parking</title>
    <link rel="stylesheet" type="text/css" href="publicPage.css">
</head>

<body>

<div align="center">
    <h1>Hello</h1>
    <form action="/access" method="POST">
        <input id="input1" type="submit" value="Push here for parking acces">
        <br>
        <br>
        <input name="code"/>
        <c:out value="${message}"/>
    </form>
</div>

</body>
</html>