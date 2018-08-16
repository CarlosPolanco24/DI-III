package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class Campana_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Campaña</title>\n");
      out.write("        <!-- Bootstrap core CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-white\">\n");
      out.write("    <!-- Zona de SCRIPTLETS -->\n");
      out.write("    <!---OBTENER LISTA DE OBJETOS EN SESION-->\n");
      out.write("    ");

        Models.clsCampaña obclsCampaña = new Models.clsCampaña();

        if (request.getAttribute("obclsCampaña") != null) {
            obclsCampaña = (Models.clsCampaña) request.getAttribute("obclsCampaña");
        }

        List<Models.clsCampaña> lstclsCampaña
                = new ArrayList<Models.clsCampaña>();

        //EXISTENCIA DE LA VARIABLE DE SESION
        if (session.getAttribute("session_lstclsCampaña") != null) {

            //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION 
            lstclsCampaña = (List<Models.clsCampaña>) session.getAttribute("session_lstclsCampaña");

        }

        if (request.getAttribute("stMensaje") != null
                && request.getAttribute("stTipo") != null) {

    
      out.write("\n");
      out.write("    <input type=\"text\"  id=\"txtMensaje\" hidden=\"\"\n");
      out.write("           value=\"");
      out.print(request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("    <input type=\"text\"  id=\"txtTipo\" hidden=\"\"\n");
      out.write("           value=\"");
      out.print(request.getAttribute("stTipo"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var mensaje = document.getElementById(\"txtMensaje\").value;\n");
      out.write("        var tipo = document.getElementById(\"txtTipo\").value;\n");
      out.write("\n");
      out.write("        swal(\"mensaje\", mensaje, tipo);\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\" mx-auto mt-5\">\n");
      out.write("            <div class=\"card-header\">Crear Campaña</div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form action=\"CampanaController\" method=\"POST\">\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input type=\"submit\" name=\"btnGuardar\" value=\"Guardar\" class=\"btn btn-primary\"/>  \n");
      out.write("                                <input type=\"submit\" name=\"btnModificar\" value=\"Modificar\" class=\"btn btn-primary\"/>  \n");
      out.write("                                <input type=\"submit\" name=\"btnCancelar\" value=\"Cancelar\" class=\"btn btn-primary\"/>   \n");
      out.write("                                <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                                <input type=\"text\" name=\"codigoModificar\" value=\"");
      out.print( obclsCampaña.getInCodigo() != 0 ? obclsCampaña.getInCodigo() : "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                            </div>                                                                \n");
      out.write("                        </div>                            \n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <h1>Informacion De Campaña</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblTipo\">Tipo</label>\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlTipo\">\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsCampaña.obclsTipo != null ? obclsCampaña.obclsTipo.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">-None-</option>\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsCampaña.obclsTipo != null ? obclsCampaña.obclsTipo.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Conferencia</option>\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsCampaña.obclsTipo != null ? obclsCampaña.obclsTipo.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Seminario Web</option>\n");
      out.write("                                    <option value=\"4\" ");
      out.print( obclsCampaña.obclsTipo != null ? obclsCampaña.obclsTipo.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">Exposicion Comercial</option>\n");
      out.write("                                    <option value=\"5\" ");
      out.print( obclsCampaña.obclsTipo != null ? obclsCampaña.obclsTipo.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Relaciones Publicas</option>\n");
      out.write("                                    <option value=\"6\" ");
      out.print( obclsCampaña.obclsTipo != null ? obclsCampaña.obclsTipo.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">Socios</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNombreDeCampana\">Nombre De Campaña</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Nombre De Campaña\" \n");
      out.write("                                       name=\"txtNombreDeCampana\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStNombreDeCampaña() != null
                                               ? obclsCampaña.getStNombreDeCampaña() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblEstado\">Estado</label>\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlEstado\">\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsCampaña.obclsEstado != null ? obclsCampaña.obclsEstado.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">-None-</option>\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsCampaña.obclsEstado != null ? obclsCampaña.obclsEstado.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Planificacion</option>\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsCampaña.obclsEstado != null ? obclsCampaña.obclsEstado.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Activo</option>\n");
      out.write("                                    <option value=\"4\" ");
      out.print( obclsCampaña.obclsEstado != null ? obclsCampaña.obclsEstado.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">Inactivo</option>\n");
      out.write("                                    <option value=\"5\" ");
      out.print( obclsCampaña.obclsEstado != null ? obclsCampaña.obclsEstado.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Completos</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFechaDeInicio\">Fecha De Inicio</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"dd/mm/aaaa\" \n");
      out.write("                                       name=\"txtFechaDeInicio\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStFechaDeInicio() != null
                                               ? obclsCampaña.getStFechaDeInicio() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFechaDeFin\">Fecha De Fin</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"dd/mm/aaaa\" \n");
      out.write("                                       name=\"txtFechaDeFin\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStFechaDeFin() != null
                                               ? obclsCampaña.getStFechaDeFin() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblIngresosEsperados\">Ingresos Esperados</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Ingresos Esperados\" \n");
      out.write("                                       name=\"txtIngresosEsperados\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStIngresosEsperados() != null
                                               ? obclsCampaña.getStIngresosEsperados() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblCostePresupuestado\">Coste Presupuestado</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Coste Presupuestado\" \n");
      out.write("                                       name=\"txtCostePresupuestado\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStCostePresupuestado() != null
                                               ? obclsCampaña.getStCostePresupuestado() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblCosteReal\">Coste Real</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Coste Real\" \n");
      out.write("                                       name=\"txtCosteReal\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStCosteReal() != null
                                               ? obclsCampaña.getStCosteReal() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblRespuestaEsperada\">Respuesta Esperada</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Respuesta Esperada\" \n");
      out.write("                                       name=\"txtRespuestaEsperada\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStRespuestaEsperada() != null
                                               ? obclsCampaña.getStRespuestaEsperada() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNumerosEnviados\">Numeros Enviados</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Numeros Enviados\" \n");
      out.write("                                       name=\"txtNumerosEnviados\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStNumerosEnviados() != null
                                               ? obclsCampaña.getStNumerosEnviados() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblDescripcion\">Descripcion</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Descripcion\" \n");
      out.write("                                       name=\"txtDescripcion\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsCampaña.getStDescripcion() != null
                                               ? obclsCampaña.getStDescripcion() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <!--FILA-->        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-12\" >\n");
      out.write("                                    <b>\n");
      out.write("                                        <i class=\"fa fa-clipboard\"></i>\n");
      out.write("                                        Registro:");
      out.print( lstclsCampaña.size());
      out.write("\n");
      out.write("                                    </b>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!--FILA-->        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("                                    <!--COLUMNA-->\n");
      out.write("                                    <div class=\"col-12\" >\n");
      out.write("                                        <table class=\"table table-bordered table-responsive\">\n");
      out.write("                                            <!--FILA-->\n");
      out.write("                                            <tr>\n");
      out.write("                                                <!--COLUMNAS-->   \n");
      out.write("                                                <td>Tipo</td>\n");
      out.write("                                                <td>Nombre De Campaña</td>\n");
      out.write("                                                <td>Estado</td>\n");
      out.write("                                                <td>Fecha De Inicio</td>\n");
      out.write("                                                <td>Fecha De Fin</td>\n");
      out.write("                                                <td>Ingresos Esperados</td>\n");
      out.write("                                                <td>Coste Presupuestado</td>\n");
      out.write("                                                <td>Coste Real</td>\n");
      out.write("                                                <td>Respuesta Esperada</td>\n");
      out.write("                                                <td>Numeros Enviados</td>\n");
      out.write("                                                <td>Descripcion</td>\n");
      out.write("                                                <td>Opciones</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                for (Models.clsCampaña item : lstclsCampaña) {
                                                    Models.clsTipo obclsTipo = item.getObclsTipo();
                                                    Models.clsEstado obclsEstado = item.getObclsEstado();
                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <!--COLUMNA-->   \n");
      out.write("                                                <td>");
      out.print( obclsTipo.getStDescripcion());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStNombreDeCampaña());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( obclsEstado.getStDescripcion());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStFechaDeInicio());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStFechaDeFin());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStIngresosEsperados());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStCostePresupuestado());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStCosteReal());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStRespuestaEsperada());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStNumerosEnviados());
      out.write(" </td>\n");
      out.write("                                                <td>");
      out.print( item.getStDescripcion());
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <a href=\"CampanaController?stOpcion=M&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                       class=\"btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("                                                    <a href=\"CampanaController?stOpcion=E&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                       class=\"btn-danger btn-sm\">Eliminar</a>   \n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
