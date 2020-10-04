<%-- 
    Document   : editnote
    Created on : Oct 1, 2020, 1:16:25 PM
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
          <h2>Edit</h2>
    <form method="post" action="note"> 
    <lable>Title: </lable>
    <input type="text" name="titleBox" value="${title}">
    <br>
    <br>
    <label>Contents: </label>
    <textarea name="contentsBox" value="${contents}"></textarea>
    <br>
    <input type="submit" name="savebutton" value="Save">
     </form>
    </body>
   
</html>
