package dynserv;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class FormValues extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest requestobj, HttpServletResponse responseobj) throws ServletException, IOException {
		responseobj.setContentType("text/html");//MIME TYPE
		
		PrintWriter out=responseobj.getWriter();
		out.println("<body bgcolor=lightgreen>");
		
		String a=requestobj.getParameter("u1");//username textbox
		String b=requestobj.getParameter("p1");//password textbox

		String c[]=requestobj.getParameterValues("c1");//checkbox language
		for(String i:c)
		{
			out.println("<h1>Languages:: "+i);
		}
		String d=requestobj.getParameter("r1");//radio gender
		String e[]=requestobj.getParameterValues("s1");//select option qualification
		for(String i:e)
		{
		out.println("<h1>Qualification:: "+i);
		}

		out.println("<h1>Username:: "+a + " "+ "Password:: "+b + " "+ "Gender:: "+d);



		
	}


}
