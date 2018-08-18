package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateSubClassification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  \n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      .dropdown-submenu {\n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write(".dropdown-submenu>.dropdown-menu {\n");
      out.write("    top:0;\n");
      out.write("    left:100%;\n");
      out.write("    margin-top:-6px;\n");
      out.write("    margin-left:-1px;\n");
      out.write("    -webkit-border-radius:0 6px 6px 6px;\n");
      out.write("    -moz-border-radius:0 6px 6px 6px;\n");
      out.write("    border-radius:0 6px 6px 6px;\n");
      out.write("}\n");
      out.write(".dropdown-submenu:hover>.dropdown-menu {\n");
      out.write("    display:block;\n");
      out.write("}\n");
      out.write(".dropdown-submenu>a:after {\n");
      out.write("    display:block;\n");
      out.write("    content:\" \";\n");
      out.write("    float:right;\n");
      out.write("    width:0;\n");
      out.write("    height:0;\n");
      out.write("    border-color:transparent;\n");
      out.write("    border-style:solid;\n");
      out.write("    border-width:5px 0 5px 5px;\n");
      out.write("    border-left-color:#cccccc;\n");
      out.write("    margin-top:5px;\n");
      out.write("    margin-right:-10px;\n");
      out.write("}\n");
      out.write(".dropdown-submenu:hover>a:after {\n");
      out.write("    border-left-color:red;\n");
      out.write("}\n");
      out.write(".dropdown-submenu.pull-left {\n");
      out.write("    float:none;\n");
      out.write("}\n");
      out.write(".dropdown-submenu.pull-left>.dropdown-menu {\n");
      out.write("    left:-100%;\n");
      out.write("    margin-left:10px;\n");
      out.write("    -webkit-border-radius:6px 0 6px 6px;\n");
      out.write("    -moz-border-radius:6px 0 6px 6px;\n");
      out.write("    border-radius:6px 0 6px 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#welcomeHeading{\n");
      out.write("    font: bold italic 2em Georgia , Times, \"Times New Roman\", serif;\n");
      out.write("    color:#87CEEB;\n");
      out.write("/* border-bottom: 2px dashed #008B8B;\n");
      out.write(" border-top: 10px solid #008B8B;*/\n");
      out.write(" margin: 0;\n");
      out.write(" padding: 0.5em 0 0.5em 0;\n");
      out.write(" font-size: 1.5em;\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("    position: fixed;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height:4px;\n");
      out.write("    background-color: black;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"navbar navbar-inverse\" width=\"100%\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"disable\">\n");
      out.write("                                    <a href=\"HomeDisplay.jsp\">HOME</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item dropdown\" >\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">BOOK<b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"BookAddDisplay.jsp\" class=\"dropdown-toggle\" > ADD BOOKS</a>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"UpdateBook.jsp\" class=\"dropdown-toggle\" >UPDATE BOOKS</a>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"DeleteBookDisplay.jsp\" class=\"dropdown-toggle\" >DELETE BOOKS</a>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"SearchBookDisplay.jsp\" class=\"dropdown-toggle\" >FIND BOOKS</a>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"menu-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">CLASSIFICATION<b class=\"caret\"></b></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"menu-item dropdown dropdown-submenu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">MAIN CLASSIFICATION</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"AddMainClassify.jsp\">Add Main Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"UpdateMainClassify.jsp\"> Update Main Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"#\"> Delete Main Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"SearchMainClassify.jsp\">Search Main Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu-item dropdown dropdown-submenu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">SUB CLASSIFICATION</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"AddSubClassify.jsp\">Add Sub Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"UpdateSubClassify.jsp\">Update Sub Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"#\">Delete Sub Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"menu-item \">\n");
      out.write("                                    <a href=\"SearchSubClassify.jsp\">Search Sub Classification</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("        <div>\n");
      out.write("            <center><h1 id =\"welcomeHeading\">ADD BOOK DETAILS</h1></center>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    <div class=\"container\" >\n");
      out.write("        <form action=\"BookController\" method=\"get\">\n");
      out.write("        <label for=\"Book Id\"><b>Sub Book Id</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Book id\" name=\"bookId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <table class=\"classify\" cellpadding=\"10\">\n");
      out.write("            <tr> <td style=\"width:150px;\"><label for=\"Main classification\"><b>Main classification</b></label></td>\n");
      out.write("        \n");
      out.write("                <td> <select style=\"width:300px;\" name=\"mainClassification\" onchange=\"selectvalue(form);\">\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("                    </select></td>\n");
      out.write("         </table> \n");
      out.write("        <label for=\"Book Id\"><b>Sub Classification Name</b></label>\n");
      out.write("        \n");
      out.write("         <input type=\"text\" placeholder=\"Enter Book id\" name=\"bookId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <button class=\"btn btn-primary\" type=\"submit\" name=\"AddBookButton\">Submit form</button>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("    <footer class=\"footer\">\n");
      out.write("            \n");
      out.write("    </footer> \n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("            function selectvalue(form) {\n");
      out.write("                form.action = \"PopSubDropdown\";\n");
      out.write("                form.submit();                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.mainId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(">\n");
          out.write("                                \n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.mainName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </option>\n");
          out.write("                            ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.mainId eq mainId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
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
}
