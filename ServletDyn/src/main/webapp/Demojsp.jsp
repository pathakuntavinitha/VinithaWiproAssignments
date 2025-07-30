<body bgcolor=lightgreen>
 <hr color=red>
 
 <%!
int a1=100;
int add(int a, int b)
{
	return a+b;
}
 %>
   <%! 
 int sub(int a,int b)
 {
	 return a-b;
 }
 %>
 
    <%
 
  out.println("<H1><font color=red>Hello JSP");
  int dummy=100;
  out.println("Add:: "+add(12,12));
  out.println("<font color=blue>Declaration tag variables:: "+a1 + " "+dummy + "</font>");
   %>

 <%
 
 out.println("Sub:: "+sub(12,10));
 %>

 <h1>Expression Tag</h1>
 
 Add:: <%=12+12%>
 <%="Good day" %>
 <%=dummy %>
 Calling add method:: <%= add(55,10) %>
 
 