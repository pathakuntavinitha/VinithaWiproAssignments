package servletsAssignments;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest requestobj, HttpServletResponse responseobj)
            throws ServletException, IOException {

        // Receive data
        String name = requestobj.getParameter("name");
        String marks = requestobj.getParameter("marks");

        // Set attributes to forward
        requestobj.setAttribute("name", name);
        requestobj.setAttribute("marks", marks);

        // Forward to GradeServlet
        RequestDispatcher rd = requestobj.getRequestDispatcher("grade");
        rd.forward(requestobj, responseobj);
    }
}