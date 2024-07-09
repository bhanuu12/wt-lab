<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        if (age < 18) {
    %>
        <font color="red" size="4">Hello <%= name %>, you are not authorized to visit the site</font>
    <% 
        } else {
    %>
        <font color="green" size="4">Welcome <%= name %> to this site</font>
    <%
        }
    %>
    <br><br><a href="index.jsp">Back</a>
</body>
</html>
