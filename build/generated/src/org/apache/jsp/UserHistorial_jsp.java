package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserHistorial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>MI HISTORIAL</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <!-- Content page-->\n");
      out.write("        <section class=\"full-box dashboard-contentPage\" style=\" padding-left: 0\">\n");
      out.write("            <!-- NavBar -->\n");
      out.write("            <nav class=\"full-box dashboard-Navbar\">\n");
      out.write("                <ul class=\"full-box list-unstyled text-right\">\n");
      out.write("                    <li class=\"pull-left\">\n");
      out.write("                        <a href=\"#!\" class=\"btn-menu-dashboard\"><i class=\"zmdi zmdi-more-vert\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"search.html\" class=\"btn-search\">\n");
      out.write("                            <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <!-- Content page -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h1 class=\"text-titles\">System <small>Tiles</small></h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"full-box text-center\" style=\"padding: 30px 10px;\">\n");
      out.write("                <article class=\"full-box tile\">\n");
      out.write("                    <div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("                        Admin\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"full-box tile-icon text-center\">\n");
      out.write("                        <i class=\"zmdi zmdi-account\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"full-box tile-number text-titles\">\n");
      out.write("                        <p class=\"full-box\">7</p>\n");
      out.write("                        <small>Register</small>\n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("                <article class=\"full-box tile\">\n");
      out.write("                    <div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("                        Teacher\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"full-box tile-icon text-center\">\n");
      out.write("                        <i class=\"zmdi zmdi-male-alt\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"full-box tile-number text-titles\">\n");
      out.write("                        <p class=\"full-box\">10</p>\n");
      out.write("                        <small>Register</small>\n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("                <article class=\"full-box tile\">\n");
      out.write("                    <div class=\"full-box tile-title text-center text-titles text-uppercase\">\n");
      out.write("                        Student\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"full-box tile-icon text-center\">\n");
      out.write("                        <i class=\"zmdi zmdi-face\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"full-box tile-number text-titles\">\n");
      out.write("                        <p class=\"full-box\">70</p>\n");
      out.write("                        <small>Register</small>\n");
      out.write("                    </div>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h1 class=\"text-titles\">System <small>TimeLine</small></h1>\n");
      out.write("                </div>\n");
      out.write("                <section id=\"cd-timeline\" class=\"cd-container\">\n");
      out.write("                    <div class=\"cd-timeline-block\">\n");
      out.write("                        <div class=\"cd-timeline-img\">\n");
      out.write("                            <img src=\"assets/avatars/StudetMaleAvatar.png\" alt=\"user-picture\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cd-timeline-content\">\n");
      out.write("                            <h4 class=\"text-center text-titles\">1 - Name (Admin)</h4>\n");
      out.write("                            <p class=\"text-center\">\n");
      out.write("                                <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                                <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                            </p>\n");
      out.write("                            <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"cd-timeline-block\">\n");
      out.write("                        <div class=\"cd-timeline-img\">\n");
      out.write("                            <img src=\"assets/avatars/StudetMaleAvatar.png\" alt=\"user-picture\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cd-timeline-content\">\n");
      out.write("                            <h4 class=\"text-center text-titles\">2 - Name (Teacher)</h4>\n");
      out.write("                            <p class=\"text-center\">\n");
      out.write("                                <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                                <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                            </p>\n");
      out.write("                            <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cd-timeline-block\">\n");
      out.write("                        <div class=\"cd-timeline-img\">\n");
      out.write("                            <img src=\"assets/avatars/StudetMaleAvatar.png\" alt=\"user-picture\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cd-timeline-content\">\n");
      out.write("                            <h4 class=\"text-center text-titles\">3 - Name (Student)</h4>\n");
      out.write("                            <p class=\"text-center\">\n");
      out.write("                                <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                                <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                            </p>\n");
      out.write("                            <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cd-timeline-block\">\n");
      out.write("                        <div class=\"cd-timeline-img\">\n");
      out.write("                            <img src=\"assets/avatars/StudetMaleAvatar.png\" alt=\"user-picture\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cd-timeline-content\">\n");
      out.write("                            <h4 class=\"text-center text-titles\">4 - Name (Personal Ad.)</h4>\n");
      out.write("                            <p class=\"text-center\">\n");
      out.write("                                <i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i> Start: <em>7:00 AM</em> &nbsp;&nbsp;&nbsp; \n");
      out.write("                                <i class=\"zmdi zmdi-time zmdi-hc-fw\"></i> End: <em>7:17 AM</em>\n");
      out.write("                            </p>\n");
      out.write("                            <span class=\"cd-date\"><i class=\"zmdi zmdi-calendar-note zmdi-hc-fw\"></i> 07/07/2016</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>   \n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--====== Scripts -->\n");
      out.write("        <script src=\"./js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"./js/sweetalert2.min.js\"></script>\n");
      out.write("        <script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"./js/material.min.js\"></script>\n");
      out.write("        <script src=\"./js/ripples.min.js\"></script>\n");
      out.write("        <script src=\"./js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script src=\"./js/main.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $.material.init();\n");
      out.write("        </script>\n");
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
