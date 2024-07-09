<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <%
        String username = request.getParameter("username");
        Date currentDate = new Date();
    %>
    <h2>Welcome, <%= username %>!</h2>
    <p>Current Date and Time: <%= currentDate.toString() %></p>
    <br>
    <a href="index.jsp">Back to Login Page</a>
</body>
</html>
