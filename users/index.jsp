<!-- index.jsp -->
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="LoginServlet" method="post">
        <fieldset style="width:20%; background-color:#80ffcc">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
