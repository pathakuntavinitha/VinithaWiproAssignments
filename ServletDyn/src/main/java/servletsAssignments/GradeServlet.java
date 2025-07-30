package servletsAssignments;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/grade")
public class GradeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest requestobj, HttpServletResponse responseobj)
            throws ServletException, IOException {

        responseobj.setContentType("text/html");
        PrintWriter out = responseobj.getWriter();

        String name = (String) requestobj.getAttribute("name");
        String marksStr = (String) requestobj.getAttribute("marks");

        int marks = 0;
        try {
            marks = Integer.parseInt(marksStr);
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid marks input!</h3>");
            return;
        }

        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        out.println("<html><body bgcolor='lightblue'>");
        out.println("<h2>Student Grade Report</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Marks:</b> " + marks + "</p>");
        out.println("<p><b>Grade:</b> " + grade + "</p>");
        out.println("</body></html>");
    }
}
