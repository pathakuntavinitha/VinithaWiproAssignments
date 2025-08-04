package servletsAssignments;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String productName = req.getParameter("productName");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        int total = price * quantity;

        out.println("<html><body bgcolor='lightgreen'>");
        out.println("<h2>Order Receipt</h2>");
        out.println("<p><b>Product:</b> " + productName + "</p>");
        out.println("<p><b>Price per item:</b> ₹" + price + "</p>");
        out.println("<p><b>Quantity:</b> " + quantity + "</p>");
        out.println("<hr>");
        out.println("<h3>Total Amount: ₹" + total + "</h3>");
        out.println("</body></html>");
    }
}
