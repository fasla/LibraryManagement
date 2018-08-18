package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public final class SearchBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
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
      out.write("            <center><h1 id =\"welcomeHeading\">SEARCH BOOK DETAILS</h1></center>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    <div class=\"container\" >\n");
      out.write("        <form action=\"SearchBookController\" method=\"get\">\n");
      out.write("        <label for=\"Book Id\"><b>Book Id</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Book id\" name=\"bookId\" >\n");
      out.write("\n");
      out.write("        <label for=\"Title\"><b>Title</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Book Title\" name=\"title\" >\n");
      out.write("        \n");
      out.write("        <label for=\"Author\"><b>Author</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter Author\" name=\"author\" >\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <button class=\"btn btn-primary\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("    <footer class=\"footer\">\n");
      out.write("            \n");
      out.write("    </footer> \n");
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
