package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_002dorders_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            :root {\n");
      out.write("                --main-bg-color: #009d63 ;\n");
      out.write("                --main-text-color: #009d63;\n");
      out.write("                --second-text-color: #bbbec5;\n");
      out.write("                --second-bg-color: #c1efde;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .primary-text {\n");
      out.write("                color : var(--main-text-color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .second-text {\n");
      out.write("                color : var(--second-text-color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .primary-bg {\n");
      out.write("                background-color : var(--main-bg-color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .secondary-bg {\n");
      out.write("                background-color : var(--second-bg-color);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .rounded-full {\n");
      out.write("                border-radius: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #wrapper {\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                background-image: linear-gradient(\n");
      out.write("                    to right,\n");
      out.write("                    #baf3d7,\n");
      out.write("                    #c2f5de,\n");
      out.write("                    #cbf7e4,\n");
      out.write("                    #d4f8ea,\n");
      out.write("                    #ddfaef\n");
      out.write("                    );\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar-wrapper {\n");
      out.write("                min-height: 100vh;\n");
      out.write("                margin-left: -15rem;\n");
      out.write("                -webkit-transition: margin 0.25s ease-out;\n");
      out.write("                -moz-transition: margin 0.25s ease-out;\n");
      out.write("                -o-transition: margin 0.25s ease-out;\n");
      out.write("                transition: margin 0.25s ease-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar-wrapper .sidebar-heading {\n");
      out.write("                padding: 0.875rem 1.25rem;\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar-wrapper .list-group {\n");
      out.write("                width: 15rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #page-content-wrapper {\n");
      out.write("                min-width: 100vw;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #wrapper.toggled #sidebar-wrapper {\n");
      out.write("                margin-left: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #menu-toggle {\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .list-group-item {\n");
      out.write("                border: none;\n");
      out.write("                padding: 20px 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .list-group-item.active {\n");
      out.write("                background-color: transparent;\n");
      out.write("                color : var(--main-text-color);\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 768px) {\n");
      out.write("                #sidebar-wrapper {\n");
      out.write("                    margin-left: 0;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #page-content-wrapper {\n");
      out.write("                    min-width: 0;\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                #wrapper.toggled #sidebar-wrapper {\n");
      out.write("                    margin-left: -15rem;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .popup .overlay{\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                width: 100vw;\n");
      out.write("                height: 100vh;\n");
      out.write("                background: rgba(0,0,0,0.7);\n");
      out.write("                z-index: 1;\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .popup .content{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%,-50%) scale(0);\n");
      out.write("                background: #fff;\n");
      out.write("                width: 450px;\n");
      out.write("                height: 650px;\n");
      out.write("                z-index: 2;\n");
      out.write("                padding: 20px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .popup .content2{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%,-50%) scale(0);\n");
      out.write("                background: #fff;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 250px;\n");
      out.write("                z-index: 2;\n");
      out.write("                padding: 20px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .popup .close-btn{\n");
      out.write("                position: absolute;\n");
      out.write("                right: 20px;\n");
      out.write("                top: 20px;\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                background: #222;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                line-height: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .popup.active .overlay{\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .popup.active .content{\n");
      out.write("                transform: translate(-50%,-50%) scale(1);\n");
      out.write("                transition: all 300ms ease-in-out;\n");
      out.write("            }\n");
      out.write("            .popup.active .content2{\n");
      out.write("                transform: translate(-50%,-50%) scale(1);\n");
      out.write("                transition: all 300ms ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"radio\"] {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"radio\"] + label:before {\n");
      out.write("                content: \"\";\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 25px;\n");
      out.write("                height: 25px;\n");
      out.write("                padding: 6px;\n");
      out.write("                margin-right: 3px;\n");
      out.write("                background-clip: content-box;\n");
      out.write("                border: 2px solid #bbb;\n");
      out.write("                background-color: #e7e6e7;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"radio\"]:checked + label:before {\n");
      out.write("                background-color: #93e026;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sub-but{\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <div class=\"bg-white\" id=\"sidebar-wrapper\">\n");
      out.write("                <div class=\"sidebar-heading text-center py-4 primary-text fs-4 fw-bold text-uppercase border-bottom\"><i\n");
      out.write("                        class=\"fas fa-user-secret me-2\"></i>MANAGER PAGE</div>\n");
      out.write("                <div class=\"list-group list-group-flush my-3\">\n");
      out.write("                    <a href=\"dashboard\" class=\"list-group-item list-group-item-action bg-transparent second-text active\"><i\n");
      out.write("                            class=\"fas fa-tachometer-alt me-2\"></i>Dashboard</a>\n");
      out.write("                    <a href=\"list-orders-admin\" class=\"list-group-item list-group-item-action bg-transparent second-text fw-bold\"><i\n");
      out.write("                            class=\"fas fa-gift me-2\"></i>Orders</a>\n");
      out.write("                    <a href=\"feedback-admin\" class=\"list-group-item list-group-item-action bg-transparent second-text fw-bold\"><i\n");
      out.write("                            class=\"fas fa-comment-dots me-2\"></i>Feedback</a>\n");
      out.write("                    <a href=\"home-control\" class=\"list-group-item list-group-item-action bg-transparent text-danger fw-bold\"><i\n");
      out.write("                            class=\"fas fa-power-off me-2\"></i>Home page</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-transparent py-4 px-4\">\n");
      out.write("                    <div class=\"d-flex align-items-center\">\n");
      out.write("                        <i class=\"fas fa-align-left primary-text fs-4 me-3\" id=\"menu-toggle\"></i>\n");
      out.write("                        <h2 class=\"fs-2 m-0\">Orders management</h2>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                            data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid px-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row my-5\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <table class=\"table bg-white rounded shadow-sm  table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Order ID</th>\n");
      out.write("                                        <th>Account ID</th>\n");
      out.write("                                        <th>Shipping ID</th>\n");
      out.write("                                        <th>Created Date</th>\n");
      out.write("                                        <th>Total Price</th>\n");
      out.write("                                        <th>Note</th>\n");
      out.write("                                        <th>Status</th>\n");
      out.write("                                        <th>See details</th>\n");
      out.write("                                        <th>Update Status</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-content-wrapper -->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        var el = document.getElementById(\"wrapper\");\n");
      out.write("        var toggleButton = document.getElementById(\"menu-toggle\");\n");
      out.write("\n");
      out.write("        toggleButton.onclick = function () {\n");
      out.write("            el.classList.toggle(\"toggled\");\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            // Activate tooltip\n");
      out.write("            $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\n");
      out.write("            // Select/Deselect checkboxes\n");
      out.write("            var checkbox = $('table tbody input[type=\"checkbox\"]');\n");
      out.write("            $(\"#selectAll\").click(function () {\n");
      out.write("                if (this.checked) {\n");
      out.write("                    checkbox.each(function () {\n");
      out.write("                        this.checked = true;\n");
      out.write("                    });\n");
      out.write("                } else {\n");
      out.write("                    checkbox.each(function () {\n");
      out.write("                        this.checked = false;\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            checkbox.click(function () {\n");
      out.write("                if (!this.checked) {\n");
      out.write("                    $(\"#selectAll\").prop(\"checked\", false);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function togglePopup() {\n");
      out.write("            document.getElementById(\"popup-1\").classList.toggle(\"active\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function togglePopup2() {\n");
      out.write("            document.getElementById(\"popup-2\").classList.toggle(\"active\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orders}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.accountID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.shippingID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.createdDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.note}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td style=\"font-weight: bold; color: green\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <a href=\"see-order-admin?orderID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&shippingID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.shippingID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"view-modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"See\">&#xe019;</i></a>\n");
          out.write("                                        </td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <a href=\"update-status-order?orderID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"view-modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Update status\">&#xe019;</i></a>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"popup active\" id=\"popup-1\">\n");
        out.write("                <div class=\"overlay\"></div>\n");
        out.write("                <div class=\"content\">\n");
        out.write("                    <div class=\"close-btn\" onclick=\"togglePopup()\">&times;</div>\n");
        out.write("                    <p style=\"font-weight: bold\">---------------ORDER DETAIL----------------</p>\n");
        out.write("                    <p>Name: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shipping.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                    <p>Phone: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shipping.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                    <p>Address: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shipping.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("\n");
        out.write("                    <p>--------------------------------------------------------</p>\n");
        out.write("                    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("order");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <p>Product name: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <p>Product price: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <p>Quantity: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <p>--------------------------------------------------------</p>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ok != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"popup active\" id=\"popup-2\">\n");
        out.write("                <div class=\"overlay\"></div>\n");
        out.write("                <div class=\"content2\">\n");
        out.write("                    <div class=\"close-btn\" onclick=\"togglePopup2()\">&times;</div>\n");
        out.write("                    <p style=\"font-weight: bold; text-align: center\">EDIT STATUS</p><br>\n");
        out.write("                    <div>\n");
        out.write("                        <form action=\"update-status-order\" method=\"post\">\n");
        out.write("                            <input type=\"hidden\" name=\"orderID\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            <input type=\"radio\" name=\"status\" id=\"radio1\" checked=\"true\" value=\"PEND\"/>\n");
        out.write("                            <label class=\"radio\" for=\"radio1\">&nbsp; &nbsp; &nbsp; &nbsp;PENDING</label>\n");
        out.write("                            <input type=\"radio\" name=\"status\" id=\"radio2\" value=\"SUCC\"/>\n");
        out.write("                            <label for=\"radio2\">&nbsp; &nbsp; &nbsp; &nbsp;SUCCESSFUL</label>\n");
        out.write("                            <input type=\"radio\" name=\"status\" id=\"radio3\" value=\"FAIL\"/>\n");
        out.write("                            <label for=\"radio3\">&nbsp; &nbsp; &nbsp; &nbsp;FAIL</label> <br>\n");
        out.write("\n");
        out.write("                            <button type=\"submit\" class=\"btn btn-success sub-but\">Submit</button>\n");
        out.write("                        </form>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
