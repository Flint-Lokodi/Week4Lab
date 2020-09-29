<%-- 
    Document   : editnote
    Created on : Sep 28, 2020, 6:03:23 PM
    Author     : 608787
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            <strong>Title:</strong> <input type="text" name="title" value="${title}"><br>
            <strong>Contents:</strong><textarea name="contents">${contents}</textarea><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
