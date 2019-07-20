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

    <%--    href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">--%>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>

<body>

<div align="center">
    <h1>Enter</h1>
    <form action="/access" method="POST">
        <input id="input1" type="submit" value="Push here for parking acces">
        <br>
        <br>
        <textarea><c:out value="${message}"/></textarea>
        <br>
        <br>
        <input name="code"/>

    </form>
</div>

<br>
<br>

<div align="center">
    <h1>Buy Subscription</h1>

    <form action="/buy" method="POST">
        <p>Start Date: <label for="datepicker-1"></label><input type="text" name="startDate" id="datepicker-1"/></p>

        <p>End Date: <label for="datepicker-2"></label><input type="text" name="endDate" id="datepicker-2"/></p>
        <input id="input" type="submit" value="Buy subscription">
        <br>
        <br>
        <textarea><c:out value="${buyMessage}"/></textarea>

    </form>
</div>
<br>
<br>
<%--<div align="center">--%>
<%--    <h1>Exit</h1>--%>
<%--    <form action="exit" method="POST">--%>
<%--        <input type="submit" value="Scan here for exit">--%>
<%--        <br>--%>
<%--        <br>--%>
<%--        <input name="code">--%>
<%--        <c:out value="${message}"/>--%>
<%--    </form>--%>
<%--</div>--%>

<script>
    $(function () {
        $("#datepicker-1").datepicker();
    });

    $(function () {
        $("#datepicker-2").datepicker();
    });
</script>
</body>
</html>