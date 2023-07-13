package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            html {\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p {\n");
      out.write("                color: grey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #heading {\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #673AB7;\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msform {\n");
      out.write("                text-align: center;\n");
      out.write("                position: relative;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msform fieldset {\n");
      out.write("                background: white;\n");
      out.write("                border: 0 none;\n");
      out.write("                border-radius: 0.5rem;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("\n");
      out.write("                /*stacking fieldsets above each other*/\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-card {\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Hide all except first fieldset*/\n");
      out.write("            #msform fieldset:not(:first-of-type) {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msform input, #msform textarea {\n");
      out.write("                padding: 8px 15px 8px 15px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 0px;\n");
      out.write("                margin-bottom: 25px;\n");
      out.write("                margin-top: 2px;\n");
      out.write("                width: 100%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: montserrat;\n");
      out.write("                color: #2C3E50;\n");
      out.write("                background-color: #ECEFF1;\n");
      out.write("                font-size: 16px;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msform input:focus, #msform textarea:focus {\n");
      out.write("                -moz-box-shadow: none !important;\n");
      out.write("                -webkit-box-shadow: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                border: 1px solid #673AB7;\n");
      out.write("                outline-width: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Next Buttons*/\n");
      out.write("            #msform .action-button {\n");
      out.write("                width: 100px;\n");
      out.write("                background: #673AB7;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: white;\n");
      out.write("                border: 0 none;\n");
      out.write("                border-radius: 0px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 10px 5px;\n");
      out.write("                margin: 10px 0px 10px 5px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msform .action-button:hover, #msform .action-button:focus {\n");
      out.write("                background-color: #311B92;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Previous Buttons*/\n");
      out.write("            #msform .action-button-previous {\n");
      out.write("                width: 100px;\n");
      out.write("                background: #616161;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: white;\n");
      out.write("                border: 0 none;\n");
      out.write("                border-radius: 0px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                padding: 10px 5px;\n");
      out.write("                margin: 10px 5px 10px 0px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msform .action-button-previous:hover, #msform .action-button-previous:focus {\n");
      out.write("                background-color: #000000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*The background card*/\n");
      out.write("            .card {\n");
      out.write("                z-index: 0;\n");
      out.write("                border: none;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*FieldSet headings*/\n");
      out.write("            .fs-title {\n");
      out.write("                font-size: 25px;\n");
      out.write("                color: #673AB7;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                font-weight: normal;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .purple-text {\n");
      out.write("                color: #673AB7;\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Step Count*/\n");
      out.write("            .steps {\n");
      out.write("                font-size: 25px;\n");
      out.write("                color: gray;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                font-weight: normal;\n");
      out.write("                text-align: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Field names*/\n");
      out.write("            .fieldlabels {\n");
      out.write("                color: gray;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Icon progressbar*/\n");
      out.write("            #progressbar {\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                color: lightgrey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #progressbar .active {\n");
      out.write("                color: #673AB7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #progressbar li {\n");
      out.write("                list-style-type: none;\n");
      out.write("                font-size: 15px;\n");
      out.write("                width: 25%;\n");
      out.write("                float: left;\n");
      out.write("                position: relative;\n");
      out.write("                font-weight: 400;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Icons in the ProgressBar*/\n");
      out.write("            #progressbar #account:before {\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                content: \"\\f13e\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #progressbar #personal:before {\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                content: \"\\f007\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #progressbar #payment:before {\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                content: \"\\f030\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #progressbar #confirm:before {\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                content: \"\\f00c\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Icon ProgressBar before any progress*/\n");
      out.write("            #progressbar li:before {\n");
      out.write("                width: 50px;\n");
      out.write("                height: 50px;\n");
      out.write("                line-height: 45px;\n");
      out.write("                display: block;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #ffffff;\n");
      out.write("                background: lightgray;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                margin: 0 auto 10px auto;\n");
      out.write("                padding: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*ProgressBar connectors*/\n");
      out.write("            #progressbar li:after {\n");
      out.write("                content: '';\n");
      out.write("                width: 100%;\n");
      out.write("                height: 2px;\n");
      out.write("                background: lightgray;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                top: 25px;\n");
      out.write("                z-index: -1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Color number of the step and the connector before it*/\n");
      out.write("            #progressbar li.active:before, #progressbar li.active:after {\n");
      out.write("                background: #673AB7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Animated Progress Bar*/\n");
      out.write("            .progress {\n");
      out.write("                height: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .progress-bar {\n");
      out.write("                background-color: #673AB7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Fit image in bootstrap div*/\n");
      out.write("            .fit-image{\n");
      out.write("                width: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-11 col-sm-9 col-md-7 col-lg-6 col-xl-5 text-center p-0 mt-3 mb-2\">\n");
      out.write("                    <div class=\"card px-0 pt-4 pb-0 mt-3 mb-3\">\n");
      out.write("                        <h2 id=\"heading\">Add new product</h2>\n");
      out.write("                        <p>Fill all form field to go to next step</p>\n");
      out.write("\n");
      out.write("                        <form id=\"msform\" style=\"padding: 3%\" action=\"add-product\" method=\"post\">\n");
      out.write("                            <!-- progressbar -->\n");
      out.write("                            <ul id=\"progressbar\">\n");
      out.write("                                <li class=\"active\" id=\"account\"><strong>Step 1</strong></li>\n");
      out.write("                                <li id=\"personal\"><strong>Step 2</strong></li>\n");
      out.write("                                <li id=\"payment\"><strong>Step 3</strong></li>\n");
      out.write("                                <li id=\"confirm\"><strong>Finish</strong></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-striped progress-bar-animated\" role=\"progressbar\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <!-- fieldsets -->\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"form-card\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-7\">\n");
      out.write("                                            <h2 class=\"fs-title\">Product Information:</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-5\">\n");
      out.write("                                            <h2 class=\"steps\">Step 1</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label class=\"fieldlabels\">Product name: *</label>\n");
      out.write("                                    <input type=\"text\" name=\"pname\" placeholder=\"Product name\"/>\n");
      out.write("                                    <label class=\"fieldlabels\">Quantity: *</label>\n");
      out.write("                                    <input type=\"text\" name=\"pquantity\" placeholder=\"Quantity\"/>\n");
      out.write("                                    <label class=\"fieldlabels\">Price: *</label>\n");
      out.write("                                    <input type=\"text\" name=\"pprice\" placeholder=\"Price\"/>\n");
      out.write("                                    <label class=\"fieldlabels\">Description: *</label>\n");
      out.write("                                    <input type=\"text\" name=\"pdescription\" placeholder=\"Description\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"button\" name=\"next\" class=\"next action-button\" value=\"Next\"/>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"form-card\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-7\">\n");
      out.write("                                            <h2 class=\"fs-title\">Product Information:</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-5\">\n");
      out.write("                                            <h2 class=\"steps\">Step 2</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label class=\"fieldlabels\">Image URL: *</label>\n");
      out.write("                                    <input type=\"text\" name=\"purl\" placeholder=\"Image URL\"/>\n");
      out.write("                                    <label class=\"fieldlabels\">Category: *</label>\n");
      out.write("                                    <select name=\"pcategory\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"button\" name=\"next\" class=\"next action-button\" value=\"Next\"/>\n");
      out.write("                                <input type=\"button\" name=\"previous\" class=\"previous action-button-previous\" value=\"Previous\"/>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"form-card\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-7\">\n");
      out.write("                                            <h2 class=\"fs-title\">Product Information:</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-5\">\n");
      out.write("                                            <h2 class=\"steps\">Step 3</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label class=\"fieldlabels\">Size: </label>\n");
      out.write("                                    <select name=\"psize\">\n");
      out.write("                                        <option value=\"S\">S</option>\n");
      out.write("                                        <option value=\"M\">M</option>\n");
      out.write("                                        <option value=\"XL\">XL</option>\n");
      out.write("                                        <option value=\"2XL\">2XL</option>\n");
      out.write("                                        <option value=\"3XL\">3XL</option>\n");
      out.write("                                    </select><br>\n");
      out.write("                                    <label class=\"fieldlabels\">Color: </label>\n");
      out.write("                                    <input type=\"text\" name=\"pcolor\">\n");
      out.write("                                    <label class=\"fieldlabels\">Seller id: </label>\n");
      out.write("                                    <input type=\"text\" name=\"pseller_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.accountID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" name=\"next\" class=\"next action-button\" value=\"Submit\"/>\n");
      out.write("                                <input type=\"button\" name=\"previous\" class=\"previous action-button-previous\" value=\"Previous\"/>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"form-card\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-7\">\n");
      out.write("                                            <h2 class=\"fs-title\">Finish:</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-5\">\n");
      out.write("                                            <h2 class=\"steps\">Step 4</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <br><br>\n");
      out.write("                                    <h2 class=\"purple-text text-center\"><strong>SUCCESS !</strong></h2>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"row justify-content-center\">\n");
      out.write("                                        <div class=\"col-3\">\n");
      out.write("                                            <img src=\"https://i.imgur.com/GwStPmg.png\" class=\"fit-image\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <br><br>\n");
      out.write("                                    <div class=\"row justify-content-center\">\n");
      out.write("                                        <div class=\"col-7 text-center\">\n");
      out.write("                                            <h5 class=\"purple-text text-center\">You Have Successfully Added Product</h5>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                var current_fs, next_fs, previous_fs; //fieldsets\n");
      out.write("                var opacity;\n");
      out.write("                var current = 1;\n");
      out.write("                var steps = $(\"fieldset\").length;\n");
      out.write("\n");
      out.write("                setProgressBar(current);\n");
      out.write("\n");
      out.write("                $(\".next\").click(function () {\n");
      out.write("\n");
      out.write("                    current_fs = $(this).parent();\n");
      out.write("                    next_fs = $(this).parent().next();\n");
      out.write("\n");
      out.write("                    //Add Class Active\n");
      out.write("                    $(\"#progressbar li\").eq($(\"fieldset\").index(next_fs)).addClass(\"active\");\n");
      out.write("\n");
      out.write("                    //show the next fieldset\n");
      out.write("                    next_fs.show();\n");
      out.write("                    //hide the current fieldset with style\n");
      out.write("                    current_fs.animate({opacity: 0}, {\n");
      out.write("                        step: function (now) {\n");
      out.write("                            // for making fielset appear animation\n");
      out.write("                            opacity = 1 - now;\n");
      out.write("\n");
      out.write("                            current_fs.css({\n");
      out.write("                                'display': 'none',\n");
      out.write("                                'position': 'relative'\n");
      out.write("                            });\n");
      out.write("                            next_fs.css({'opacity': opacity});\n");
      out.write("                        },\n");
      out.write("                        duration: 500\n");
      out.write("                    });\n");
      out.write("                    setProgressBar(++current);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\".previous\").click(function () {\n");
      out.write("\n");
      out.write("                    current_fs = $(this).parent();\n");
      out.write("                    previous_fs = $(this).parent().prev();\n");
      out.write("\n");
      out.write("                    //Remove class active\n");
      out.write("                    $(\"#progressbar li\").eq($(\"fieldset\").index(current_fs)).removeClass(\"active\");\n");
      out.write("\n");
      out.write("                    //show the previous fieldset\n");
      out.write("                    previous_fs.show();\n");
      out.write("\n");
      out.write("                    //hide the current fieldset with style\n");
      out.write("                    current_fs.animate({opacity: 0}, {\n");
      out.write("                        step: function (now) {\n");
      out.write("                            // for making fielset appear animation\n");
      out.write("                            opacity = 1 - now;\n");
      out.write("\n");
      out.write("                            current_fs.css({\n");
      out.write("                                'display': 'none',\n");
      out.write("                                'position': 'relative'\n");
      out.write("                            });\n");
      out.write("                            previous_fs.css({'opacity': opacity});\n");
      out.write("                        },\n");
      out.write("                        duration: 500\n");
      out.write("                    });\n");
      out.write("                    setProgressBar(--current);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function setProgressBar(curStep) {\n");
      out.write("                    var percent = parseFloat(100 / steps) * curStep;\n");
      out.write("                    percent = percent.toFixed();\n");
      out.write("                    $(\".progress-bar\")\n");
      out.write("                            .css(\"width\", percent + \"%\")\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $(\".submit\").click(function () {\n");
      out.write("                    return false;\n");
      out.write("                })\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
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
}