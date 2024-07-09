import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        // Create a cookie
        Cookie userCookie = new Cookie("username", username);

        // Set the maximum age to 24 hours
        userCookie.setMaxAge(24 * 60 * 60);

        // Add the cookie to the response
        response.addCookie(userCookie);

        // Set response content type
        response.setContentType("text/html");

        // Send response to the client
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Cookie has been set with username: " + username + "</h2>");
        response.getWriter().println("<a href='index.html'>Back</a>");
        response.getWriter().println("</body></html>");
    }
}
