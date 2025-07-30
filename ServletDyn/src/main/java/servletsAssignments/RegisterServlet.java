package servletsAssignments;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobby");

        out.println("<html><body>");
        out.println("<h2>Student Registration Details</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Course:</b> " + course + "</p>");
        out.println("<p><b>Gender:</b> " + gender + "</p>");
        out.print("<p><b>Hobbies:</b> ");
        if (hobbies != null) {
            for (String hobby : hobbies) {
                out.print(hobby + " ");
            }
        } else {
            out.print("None");
        }
        out.println("</p>");
        out.println("</body></html>");
    }
}
