package servletsAssignments;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	        String accno = request.getParameter("accno");
	        String password = request.getParameter("password");

	        if(accno.equals("23456") && password.equals("Vini123")) {
	            HttpSession session = request.getSession();
	            session.setAttribute("name", "Vinitha");
	            session.setAttribute("balance", 20000);

	            response.sendRedirect("balance");
	        } else {
	            PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            out.println("<h3>Invalid account number or password!</h3>");
	            out.println("<a href='loginQ4.html'>Try again</a>");
	            out.println("</body></html>");
	        }
	    }
	}