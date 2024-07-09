import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get all cookies from the request
        Cookie[] cookies = request.getCookies();

        // Set response content type
        response.setContentType("text/html");

        // Send response to the client
        response.getWriter().println("<html><body>");
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    response.getWriter().println("<h2>Welcome back, " + cookie.getValue() + "!</h2>");
                }
            }
        } else {
            response.getWriter().println("<h2>No cookies found</h2>");
        }
        response.getWriter().println("<a href='index.html'>Back</a>");
        response.getWriter().println("</body></html>");
    }
}
