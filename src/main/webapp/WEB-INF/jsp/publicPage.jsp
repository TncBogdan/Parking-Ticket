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

    <%--    <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />--%>
    <%--    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>--%>
    <%--    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>--%>

    <%--    <script>--%>
    <%--        $(function() {--%>
    <%--            $( "#datepicker" ).datepicker();--%>
    <%--        });--%>
    <%--    </script>--%>
    <%--    <title>Test</title>--%>

    <%--<body>--%>

    <%--Date: <input type="text" id="datepicker" />--%>
    <%--</body>--%>

</head>

<body>

<div align="center">
    <h1>Enter</h1>
    <form action="/access" method="POST">
        <input id="input1" type="submit" value="Push here for parking acces">
        <br>
        <br>
        <input name="code"/>
        <c:out value="${message}"/>
    </form>
</div>

<br>
<br>

<div align="center">
    <h1>Buy Subscription</h1>

    <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css"/>
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

    <script>
        $(function () {
            $("#datepicker-1").datepicker();
        });
    </script>

    <script>
        $(function () {
            $("#datepicker-2").datepicker();
        });
    </script>


    <p>Start Date: <label for="datepicker-1"></label><input type="text" id="datepicker-1"/></p>
    <p>End Date: <label for="datepicker-2"></label><input type="text" id="datepicker-2"/></p>


    <form action="buy" method="POST">
        <input type="submit" value="Buy subscription">
        <br>
        <br>
        <textarea></textarea>
        <%--        <c:out value="${message}"/>--%>
    </form>
</div>
<br>
<br>
<div align="center">
    <h1>Exit</h1>
    <form action="exit" method="POST">
        <input type="submit" value="Scan here for exit">
        <br>
        <br>
        <input name="code">
        <c:out value="${message}"/>
    </form>
</div>

</body>
</html>