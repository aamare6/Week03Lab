<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 1:16:09 PM
    Author     : 844817
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${title}</p>
        <br>
        <p>Contents: ${contents} </p>
   <br>
   <div>
       <a href="note?edit">Edit</a>
   </div>
    </body>
   
</html>
