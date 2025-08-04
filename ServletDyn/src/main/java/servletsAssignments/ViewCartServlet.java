package servletsAssignments;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            Cookie[] cookies = request.getCookies();

            out.println("<html><body>");
            out.println("<h2>Your Shopping Cart:</h2>");

            if (cookies != null) {
                boolean found = false;
                for (Cookie cookie : cookies) {
                    if (cookie.getName().startsWith("item_")) {
                        out.println("<li>" + cookie.getValue() + "</li>");
                        found = true;
                    }
                }
                if (!found) {
                    out.println("<p>Cart is empty.</p>");
                }
            } else {
                out.println("<p>No items in cart.</p>");
            }

            out.println("<br><a href='index.html'>Back to Cart</a>");
            out.println("</body></html>");
        }
    }