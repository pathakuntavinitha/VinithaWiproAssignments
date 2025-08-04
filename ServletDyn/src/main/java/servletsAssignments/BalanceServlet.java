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
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            int balance = (int) session.getAttribute("balance");

            out.println("<html><body>");
            out.println("<h2>Welcome, " + name + "</h2>");
            out.println("<p>Your current balance is: ₹" + balance + "</p>");
            out.println("<a href='logout'>Logout</a>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h3>Session expired. Please <a href='loginQ4.html'>login</a> again.</h3>");
            out.println("</body></html>");
        }
    }
}