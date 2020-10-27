package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>BIBLIOTECA</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- SideBar -->\n");
      out.write("        <section class=\"full-box cover dashboard-sideBar\">\n");
      out.write("            <div class=\"full-box dashboard-sideBar-bg btn-menu-dashboard\"></div>\n");
      out.write("            <div class=\"full-box dashboard-sideBar-ct\">\n");
      out.write("                <!--SideBar Title -->\n");
      out.write("                <div class=\"full-box text-uppercase text-center text-titles dashboard-sideBar-title\">\n");
      out.write("                    ADMINISTRADOR<i class=\"zmdi zmdi-close btn-menu-dashboard visible-xs\"></i>\n");
      out.write("                </div>\n");
      out.write("                <!-- SideBar User info -->\n");
      out.write("                <div class=\"full-box dashboard-sideBar-UserInfo\">\n");
      out.write("                    <figure class=\"full-box\">\n");
      out.write("                        <img src=\"");
      out.print(session.getAttribute("usuario_foto"));
      out.write("\" alt=\"UserIcon\">\n");
      out.write("                        <figcaption class=\"text-center text-titles\">");
      out.print(session.getAttribute("usuario_nombres"));
      out.write("</figcaption>\n");
      out.write("                        <figcaption class=\"text-center text-titles\">");
      out.print(session.getAttribute("usuario_apellidos"));
      out.write("</figcaption>\n");
      out.write("                    </figure>\n");
      out.write("                    <ul class=\"full-box list-unstyled text-center\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Controlador?accion=AdminPerfil\" title=\"Mis datos\">\n");
      out.write("                                <i class=\"zmdi zmdi-account-circle\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Controlador?accion=AdminCuenta\" title=\"Mi cuenta\">\n");
      out.write("                                <i class=\"zmdi zmdi-settings\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\" title=\"Salir del sistema\" class=\"btn-exit-system\">\n");
      out.write("                                <i class=\"zmdi zmdi-power\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- SideBar Menu -->\n");
      out.write("                <ul class=\"list-unstyled full-box dashboard-sideBar-Menu\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Controlador?accion=AdminHistorial\">\n");
      out.write("                            <i class=\"zmdi zmdi-view-dashboard zmdi-hc-fw\"></i> Historial de Prestamos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("                            <i class=\"zmdi zmdi-case zmdi-hc-fw\"></i> Administración <i class=\"zmdi zmdi-caret-down pull-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"list-unstyled full-box\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Controlador?accion=Empresa\"><i class=\"zmdi zmdi-balance zmdi-hc-fw\"></i> Empresa</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Controlador?accion=Categoria\"><i class=\"zmdi zmdi-labels zmdi-hc-fw\"></i> Categorías</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Controlador?accion=Proveedores\"><i class=\"zmdi zmdi-truck zmdi-hc-fw\"></i> Proveedores</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\" class=\"btn-sideBar-SubMenu\">\n");
      out.write("                            <i class=\"zmdi zmdi-account-add zmdi-hc-fw\"></i> Usuarios <i class=\"zmdi zmdi-caret-down pull-right\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"list-unstyled full-box\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Controlador?accion=Administradores\"><i class=\"zmdi zmdi-account zmdi-hc-fw\"></i> Administradores</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Controlador?accion=Usuarios\"><i class=\"zmdi zmdi-male-female zmdi-hc-fw\"></i> Lectores</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Controlador?accion=AdminGestionarLibro\">\n");
      out.write("                            <i class=\"zmdi zmdi-book-image zmdi-hc-fw\"></i> Gestionar Catalogo\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        \n");
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
