<%-- 
    Document   : viewnote
    Created on : Sep 28, 2020, 6:03:08 PM
    Author     : 608787
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>View Note</h2>
        <form method="post" action="note">
            <strong>Title:</strong> ${title}<br>
            <strong>Contents:</strong><br>
            ${contents}
            
        </form>
    </body>
</html>
