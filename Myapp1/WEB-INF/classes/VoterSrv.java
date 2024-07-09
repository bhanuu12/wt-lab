import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

public class VoterSrv extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        // Set response content type
        res.setContentType("text/html");
        
        // Get PrintWriter object
        PrintWriter pw = res.getWriter();
        
        // Read form data from page as request parameters
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        
        // Check the age and generate appropriate response
        if (age >= 18) {
            pw.println("<font color='green' size='4'>Welcome " + name + " to this site</font>");
        } else {
            pw.println("<font color='red' size='4'>Hello " + name + ", you are not authorized to visit the site</font>");
        }
        
        // Add hyperlink to the dynamic page
        pw.println("<br><br><a href='index.html'>back</a>");
        
        // Close the stream
        pw.close();
    }
}
