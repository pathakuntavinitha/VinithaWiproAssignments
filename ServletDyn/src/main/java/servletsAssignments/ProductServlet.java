package servletsAssignments;


import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product=request.getParameter("product");
        int price=0;

        switch (product) {
            case "Mobile":
                price=10000;
                break;
            case "Headphones":
                price=3000;
                break;
            case "Laptop":
                price=40000;
                break;
        }

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        out.println("<html><body bgcolor='lightblue'>");
        out.println("<h2>Enter Quantity</h2>");
        out.println("<form action='OrderServlet' method='post'>");
        out.println("Quantity: <input type='number' name='quantity' min='1' required><br><br>");
        out.println("<input type='hidden' name='productName' value='" + product + "'>");
        out.println("<input type='hidden' name='price' value='" + price + "'>");
        out.println("<input type='submit' value='Generate Bill'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
