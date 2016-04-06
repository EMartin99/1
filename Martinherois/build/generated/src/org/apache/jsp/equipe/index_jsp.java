package org.apache.jsp.equipe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/equipe/../cabecalho.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sistema Heróis</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../estilo.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"centro\">SUPER HEROES</h1>\n");
      out.write("        <nav class=\"centro\">\n");
      out.write("            <a href=\"../categoria\">Categoria</a> - \n");
      out.write("            <a href=\"../regiao\">Região</a>\n");
      out.write("        </nav>");
      out.write("\r\n");
      out.write("        <h1 class=\"centro\">Equipe</h1>\r\n");
      out.write("        <div>\r\n");
      out.write("                +<a href=\"add.jsp\">Novo</a><br />\r\n");
      out.write("                <form>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"digite o texto da pesquisa\" />\r\n");
      out.write("                    <input type=\"submit\" value=\"Pesquisar\"/><br />\r\n");
      out.write("                </form>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Código</th>\r\n");
      out.write("                            <th>Nome</th>\r\n");
      out.write("                           \r\n");
      out.write("                            <th>Ações</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>1</td>\r\n");
      out.write("                            <td>aaaaaaa</td>\r\n");
      out.write("                            \r\n");
      out.write("                            <td><a href=\"upd.jsp\">Editar</a>\r\n");
      out.write("                                <a href=\"del-ok.jsp\">Excluir</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            \r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                    </table>\r\n");
      out.write("                    \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
