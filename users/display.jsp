<!-- display.jsp -->
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<html>
<head>
    <title>Display Username and Date</title>
</head>
<body>
    <%
        // Get the username from the request
        String username = request.getParameter("username");

        // Get the current date and time
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy 'at' hh:mm:ss a");

        // Format the current date and time
        String formattedDate = formatter.format(now);
    %>

    <h2>Welcome, <%= username %>!</h2>
    <p>Current date and time: <%= formattedDate %></p>
    <br><br><a href="index.jsp">Back</a>
</body>
</html>
