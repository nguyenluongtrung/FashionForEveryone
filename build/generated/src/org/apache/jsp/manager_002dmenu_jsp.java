package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_002dmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            .demo{ background: #F2F2F2; }\n");
      out.write("            .form-container{\n");
      out.write("                background: #ecf0f3;\n");
      out.write("                font-family: 'Nunito', sans-serif;\n");
      out.write("                padding: 40px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-shadow: 14px 14px 20px #cbced1, -14px -14px 20px white;\n");
      out.write("            }\n");
      out.write("            .form-container .form-icon{\n");
      out.write("                color: #ac40ab;\n");
      out.write("                font-size: 55px;\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 100px;\n");
      out.write("                width: 100px;\n");
      out.write("                height:100px;\n");
      out.write("                margin: 0 auto 15px;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                box-shadow: 7px 7px 10px #cbced1, -7px -7px 10px #fff;\n");
      out.write("            }\n");
      out.write("            .form-container .title{\n");
      out.write("                color: #ac40ab;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 700;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 0 0 20px;\n");
      out.write("            }\n");
      out.write("            .form-container .form-horizontal .form-group{ margin: 0 0 25px 0; }\n");
      out.write("            .form-container .form-horizontal .form-group label{\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("            .form-container .form-horizontal .form-control{\n");
      out.write("                color: #333;\n");
      out.write("                background: #ecf0f3;\n");
      out.write("                font-size: 15px;\n");
      out.write("                height: 50px;\n");
      out.write("                padding: 20px;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px #fff;\n");
      out.write("                display: inline-block;\n");
      out.write("                transition: all 0.3s ease 0s;\n");
      out.write("            }\n");
      out.write("            .form-container .form-horizontal .form-control:focus{\n");
      out.write("                box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px #fff;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            .form-container .form-horizontal .form-control::placeholder{\n");
      out.write("                color: #808080;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .form-container .form-horizontal .btn{\n");
      out.write("                color: #000;\n");
      out.write("                background-color: #ac40ab;\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 15px 11px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                box-shadow: 6px 6px 6px #cbced1, -6px -6px 6px #fff;\n");
      out.write("                border: none;\n");
      out.write("                transition: all 0.5s ease 0s;\n");
      out.write("            }\n");
      out.write("            .form-container .form-horizontal .btn:hover,\n");
      out.write("            .form-container .form-horizontal .btn:focus{\n");
      out.write("                color: #fff;\n");
      out.write("                letter-spacing: 3px;\n");
      out.write("                box-shadow: none;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            .form-container{\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                position: fixed;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"form-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                        <div style=\"width:500px; height:400px\" class=\"form-container\">\n");
      out.write("                            <div class=\"form-icon\"><i class=\"fa fa-user\"></i></div>\n");
      out.write("                            <h3 class=\"title\">Manager menu</h3>\n");
      out.write("                            <form class=\"form-horizontal\">  \n");
      out.write("                                <a href=\"list-orders\" class=\"btn btn-default\">Manage orders</a><br> <br>\n");
      out.write("                                <a href=\"list-product\" class=\"btn btn-default\">Manage products</a>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
