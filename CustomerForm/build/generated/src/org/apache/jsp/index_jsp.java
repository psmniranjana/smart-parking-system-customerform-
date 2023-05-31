package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Vehicle Registration</title>\n");
      out.write("        <link href=\"Css/newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <img src=\"header image.jpg\" alt=\"\"/>\n");
      out.write("            <div class=\"txtcontainer\">\n");
      out.write("               <h1>Vehicle Registration</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <form method=\"Post\" action=\"FormConfig\">\n");
      out.write("            <label>ID</label>\n");
      out.write("            <label class=\"star\">*</label><br>\n");
      out.write("            <input type=\"text\" name=\"id\" required><br>\n");
      out.write("            <label>Name</label><br>\n");
      out.write("            <input type=\"text\" name=\"name\" required><br>\n");
      out.write("            <label>E-mail</label><br>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" required><br>\n");
      out.write("            <label>NIC</label><br>\n");
      out.write("            <input type=\"text\" name=\"nic\"><br>\n");
      out.write("            <label>Address</label><br>\n");
      out.write("            <input type=\"text\" name=\"address\"><br>\n");
      out.write("            \n");
      out.write("            <label>Registration Date(Today)</label><br>\n");
      out.write("            <input type=\"date\" id=\"date\" name=\"regdate\"><br>\n");
      out.write("                <script>\n");
      out.write("                  const currentDate = new Date().toISOString().split('T')[0];\n");
      out.write("                  document.getElementById('date').value = currentDate;\n");
      out.write("                </script>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("            <fieldset required>\n");
      out.write("                <legend>Select your vehicle type:</legend>\n");
      out.write("                <select name=\"v1\" required>\n");
      out.write("                    <option value=\"\">Select</option>\n");
      out.write("                    <option value=\"car\">Car</option>\n");
      out.write("                    <option value=\"motorcycle\">Motorcycle</option>\n");
      out.write("                    <option value=\"threewheeler\">Three Wheeler</option>\n");
      out.write("                    <option value=\"van\">Van</option>\n");
      out.write("                    <option value=\"other\">Other</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"plateNumber\">Enter your vehicle plate number:</label>\n");
      out.write("                <input type=\"text\" id=\"p1\" name=\"p1\" required>\n");
      out.write("            </fieldset>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Optional vehicle:</legend>\n");
      out.write("                <select name=\"v2\">\n");
      out.write("                    <option value=\"\">Select</option>\n");
      out.write("                    <option value=\"car\">Car</option>\n");
      out.write("                    <option value=\"motorcycle\">Motorcycle</option>\n");
      out.write("                    <option value=\"threewheeler\">Three Wheeler</option>\n");
      out.write("                    <option value=\"van\">Van</option>\n");
      out.write("                    <option value=\"other\">Other</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"plateNumber2\">Enter your vehicle plate number:</label>\n");
      out.write("                <input type=\"text\" id=\"p2\" name=\"p2\">\n");
      out.write("            </fieldset><br>\n");
      out.write("            \n");
      out.write("            <label>Contact Number</label><br>\n");
      out.write("            <input type=\"text\" name=\"number\" required><br>\n");
      out.write("            <div class=\"buttonc\">\n");
      out.write("                <input type=\"reset\" value=\"Clear\">\n");
      out.write("                <input type=\"Submit\" value=\"Next\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
