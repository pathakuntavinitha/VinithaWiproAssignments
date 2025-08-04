package servletsAssignments;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
		        throws ServletException, IOException {

		        HttpSession session = request.getSession(false);
		        if(session != null) {
		            session.invalidate();
		        }

		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html><body>");
		        out.println("<h3>You have been logged out successfully.</h3>");
		        out.println("<a href='loginQ4.html'>Login Again</a>");
		        out.println("</body></html>");
		    }
		}
       
   