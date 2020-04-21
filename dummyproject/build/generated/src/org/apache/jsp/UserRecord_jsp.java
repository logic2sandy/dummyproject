package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class UserRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
     Statement smt=con.createStatement();
     String selectQr="SELECT * FROM ganesh";
     ResultSet rs=smt.executeQuery(selectQr);
     

      out.write("s\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Display Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"skyblue\">\n");
      out.write("        <table BORDER=\"1px\" align=\"center\">\n");
      out.write("            <tr><th>s.no</th>\n");
      out.write("                <th>Roll Number</th>\n");
      out.write("                <th>User Id</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>Last Name</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>City</th>\n");
      out.write("                <th>Subject</th>\n");
      out.write("                <th>Mobile no.</th>\n");
      out.write("                <th>user type</th>\n");
      out.write("            </tr>\n");
      out.write("         ");
   
             
               int i=1;
               while(rs.next())
               { 
                  out.println("<tr>");
                  out.println("<td>"+i+"</td>");
                  out.println("<td>"+rs.getString(1)+"</td>");
                  out.println("<td>"+rs.getString(2)+"</td>");
                  out.println("<td>"+rs.getString(3)+"</td>");
                  out.println("<td>"+rs.getString(4)+"</td>");
                  out.println("<td>"+rs.getString(5)+"</td>");
                  out.println("<td>"+rs.getString(6)+"</td>");
                  out.println("<td>"+rs.getString(7)+"</td>");
                  out.println("<td>"+rs.getString(8)+"</td>");
                  out.println("<td>"+rs.getString(9)+"</td>");
                  out.println("<td>"+rs.getString(10)+"</td>");
                  out.println("<td>"+rs.getString(11)+"</td>");
                  out.println("</tr>");
                   i++;
               }  
               rs.close();
               con.close();
         
      out.write("\n");
      out.write("        </table>\n");
      out.write("     <br>   \n");
      out.write("    <a href=\"delete.html\">Press hear to delete record_?</a><br><br>\n");
      out.write("    <a href=\"edit.html\">Press hear to update record_?</a>\n");
      out.write("    \n");
      out.write("    </body>   \n");
      out.write("</html>    \n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
