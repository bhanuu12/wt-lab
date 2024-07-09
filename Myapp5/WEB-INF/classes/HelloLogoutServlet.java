import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloLogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("startTime", LocalDateTime.now());

        // Redirect to hello.jsp
        response.sendRedirect("hello.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String action = request.getParameter("action");

        if ("logout".equals(action)) {
            String name = (String) session.getAttribute("name");
            LocalDateTime startTime = (LocalDateTime) session.getAttribute("startTime");
            LocalDateTime endTime = LocalDateTime.now();
            Duration duration = Duration.between(startTime, endTime);
            long durationMinutes = duration.toMinutes();

            // Invalidate session
            session.invalidate();

            // Forward to logout.jsp with attributes
            request.setAttribute("name", name);
            request.setAttribute("durationMinutes", durationMinutes);
            request.getRequestDispatcher("logout.jsp").forward(request, response);
        }
    }
}
