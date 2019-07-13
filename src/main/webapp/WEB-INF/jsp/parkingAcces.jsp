<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Parking</title>
    <link rel="stylesheet" type="text/css" href="parkingAccess.css">
</head>

<body>

<div align="center">
    <h1>Hello</h1>
    <input type="button" value="Push here for parking acces">
    <br>
    <br>
    <textarea rows="2" cols="20" >
        <c:out value="${ticketCodeMessage}"/>
    </textarea>
</div>

</body>
</html>