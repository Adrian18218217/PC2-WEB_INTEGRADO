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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>REGISTRATE</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/fontawesome-all.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/gif\" href=\"https://mecdotkpublic.s3.amazonaws.com/theme_e0524/imagenes/favicon_opacodilo.ico\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <image src=\"http://bibliotecadigital.bnp.gob.pe/portal-bnp-web/static/img/logo-footer.51c9c26.png\">\n");
      out.write("        <div class=\" w3l-login-form\">\n");
      out.write("            <h2>INGRESAR</h2>\n");
      out.write("            <form action=\"Validar\" method=\"post\">\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Usuario:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input id=\"UserName\" type=\"text\" class=\"form-control\" placeholder=\"Usuario\" required=\"required\" name=\"txtusuario\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Contraseña:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\" name=\"txtcontrasena\" id=\"UserPass\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" name=\"menuadministrador\" value=\"Ingresar\">INGRESAR</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        <div class=\" w3l-login-form\">\n");
      out.write("            <h2>REGISTRATE</h2>\n");
      out.write("            <form action=\"#\" method=\"POST\">\n");
      out.write("                 <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Nombres:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Nombres\" required=\"required\"  name=\"rtxtnombres\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Apellidos:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Apellidos\" required=\"required\" name=\"rtxtapellidos\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Dni:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Dni\" required=\"required\" name=\"rtxtdni\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Telefono:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Telefono\" required=\"required\" name=\"rtxttelefono\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Usuario:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Usuario\" required=\"required\" name=\"rtxtusuario\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Genero(M/F):</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"M/F\" required=\"required\" name=\"rtxtgenero\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Correo:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"Correo\" required=\"required\" name=\"rtxtcorreo\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Contraseña:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\" name=\"rtxtcontrasena\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\" w3l-form-group\">\n");
      out.write("                    <label>Confirmar Contraseña:</label>\n");
      out.write("                    <div class=\"group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <button type=\"submit\" value=\"Registrar\" name=\"index\">REGISTRARME</button>\n");
      out.write("            </form>\n");
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
