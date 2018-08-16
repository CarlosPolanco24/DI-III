package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public final class Tareas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Tareas</title>\n");
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

        Models.clsTareas obclsTareas = new Models.clsTareas();

        if (request.getAttribute("obclsTareas") != null) {
            obclsTareas = (Models.clsTareas) request.getAttribute("obclsTareas");
        }

        List<Models.clsTareas> lstclsTareas
                = new ArrayList<Models.clsTareas>();

        //EXISTENCIA DE LA VARIABLE DE SESION
        if (session.getAttribute("session_lstclsTareas") != null) {

            //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION 
            lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");

        }

        if (request.getAttribute("stMensaje") != null
                && request.getAttribute("stTipo") != null) {

    
      out.write("\n");
      out.write("    <input type=\"text\" hidden=\"\" id=\"txtMensaje\"\n");
      out.write("           value=\"");
      out.print(request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("    <input type=\"text\" hidden=\"\" id=\"txtTipo\"\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    ");

        if (request.getAttribute("stMensaje") != null) {
    
      out.write("\n");
      out.write("    <input type=\"text\" \n");
      out.write("           hidden=\"\"\n");
      out.write("           name=\"txtMensaje\"\n");
      out.write("           value=\"");
      out.print( request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("    <input type=\"text\" \n");
      out.write("           hidden=\"\"\n");
      out.write("           name=\"txtTipo\"\n");
      out.write("           value=\"");
      out.print( request.getAttribute("stTipo"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var mensaje = document.getElementByName(\"txtMensaje\").value;\n");
      out.write("        var mensaje = document.getElementByName(\"txtTipo\").value;\n");
      out.write("\n");
      out.write("        swal(\"Mensaje\", mensaje, tipo);\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\" mx-auto mt-5\">\n");
      out.write("            <div class=\"card-header\">Crear Tarea</div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form action=\"TareasController\" method=\"POST\">\n");
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
      out.print( obclsTareas.getInCodigo() != 0 ? obclsTareas.getInCodigo() : "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                            </div>                                                                \n");
      out.write("                        </div>                            \n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <h1>Informacion Sobre La Tarea</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblTitularDeLaTarea\">Titular De La Tarea</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Titular De La Tarea\" \n");
      out.write("                                       name=\"txtTitularDeLaTarea\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTareas.getStTitularDeLaTarea() != null
                                               ? obclsTareas.getStTitularDeLaTarea() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblAsunto\">Asunto</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Asunto\" \n");
      out.write("                                       name=\"txtAsunto\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTareas.getStAsunto() != null
                                               ? obclsTareas.getStAsunto() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblFechaDeVencimiento\">Fecha De Vencimiento</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"dd/mm/aaaa\" \n");
      out.write("                                       name=\"txtFechaDeVencimiento\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTareas.getStFechaDeVencimiento() != null
                                               ? obclsTareas.getStFechaDeVencimiento() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblContacto\">Contacto</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Contacto\" \n");
      out.write("                                       name=\"txtContacto\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTareas.getStContacto() != null
                                               ? obclsTareas.getStContacto() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblCuenta\">Cuenta</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Cuenta\" \n");
      out.write("                                       name=\"txtCuenta\" \n");
      out.write("                                       class=\"form-control\" \n");
      out.write("                                       required=\"\"\n");
      out.write("                                       value=\"");
      out.print( obclsTareas.getStCuenta() != null
                                               ? obclsTareas.getStCuenta() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblEstado\">Estado</label>\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlEstado\">\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsTareas.obclsEstado != null ? obclsTareas.obclsEstado.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">-None-</option>\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsTareas.obclsEstado != null ? obclsTareas.obclsEstado.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">No Iniciado</option>\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsTareas.obclsEstado != null ? obclsTareas.obclsEstado.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Aplazado</option>\n");
      out.write("                                    <option value=\"4\" ");
      out.print( obclsTareas.obclsEstado != null ? obclsTareas.obclsEstado.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">En Curso</option>\n");
      out.write("                                    <option value=\"5\" ");
      out.print( obclsTareas.obclsEstado != null ? obclsTareas.obclsEstado.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Completado</option>\n");
      out.write("                                    <option value=\"6\" ");
      out.print( obclsTareas.obclsEstado != null ? obclsTareas.obclsEstado.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">En Espera de Entrada</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblPrioridad\">Prioridad</label>\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                <select class=\"form-control\" name=\"ddlPrioridad\">\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsTareas.obclsPrioridad != null ? obclsTareas.obclsPrioridad.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">-None-</option>\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsTareas.obclsPrioridad != null ? obclsTareas.obclsPrioridad.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Alto</option>\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsTareas.obclsPrioridad != null ? obclsTareas.obclsPrioridad.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Mas Alto</option>\n");
      out.write("                                    <option value=\"4\" ");
      out.print( obclsTareas.obclsPrioridad != null ? obclsTareas.obclsPrioridad.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">Bajo</option>\n");
      out.write("                                    <option value=\"5\" ");
      out.print( obclsTareas.obclsPrioridad != null ? obclsTareas.obclsPrioridad.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Mas Bajo</option>\n");
      out.write("                                    <option value=\"6\" ");
      out.print( obclsTareas.obclsPrioridad != null ? obclsTareas.obclsPrioridad.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">Normal</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblEnviarMensajedeCorreoElectronicoDeNotificacion\">\n");
      out.write("                                    <input type=\"checkbox\" \n");
      out.write("                                           name=\"chkEnviarMensajedeCorreoElectronicoDeNotificacion\"\n");
      out.write("                                           ");
      out.print( obclsTareas.getChEnviarMensajedeCorreoElectronicoDeNotificacion() == 'S' ? "ckecked" : "");
      out.write("/>\n");
      out.write("                                    Enviar Mensaje de Correo Electronico De Notificacion\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <label name=\"lblRepetir\">\n");
      out.write("                                    <input type=\"checkbox\" \n");
      out.write("                                           name=\"chkRepetir\"\n");
      out.write("                                           ");
      out.print( obclsTareas.getChRepetir() == 'S' ? "ckecked" : "");
      out.write("/>\n");
      out.write("                                    Repetir\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <label name=\"lblInformacionDeLaDescripcion\">Informacion De La Descripcion</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Informacion De La Descripcion\" \n");
      out.write("                                       name=\"txtInformacionDeLaDescripcion\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsTareas.getStInformacionDeLaDescripcion() != null
                                               ? obclsTareas.getStInformacionDeLaDescripcion() : "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--FILA-->        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-12\" >\n");
      out.write("                                <b>\n");
      out.write("                                    <i class=\"fa fa-clipboard\"></i>\n");
      out.write("                                    Registro:");
      out.print( lstclsTareas.size());
      out.write("\n");
      out.write("                                </b>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--FILA-->        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--COLUMNA-->\n");
      out.write("                                <div class=\"col-12\" >\n");
      out.write("                                    <table class=\"table table-bordered table-responsive\">\n");
      out.write("                                        <!--FILA-->\n");
      out.write("                                        <tr>\n");
      out.write("                                            <!--COLUMNAS-->   \n");
      out.write("                                            <td>Titular De La Tarea</td>\n");
      out.write("                                            <td>Asunto</td>\n");
      out.write("                                            <td>Fecha De Vencimiento</td>\n");
      out.write("                                            <td>Contacto</td>\n");
      out.write("                                            <td>Cuenta</td>\n");
      out.write("                                            <td>Estado</td>\n");
      out.write("                                            <td>Prioridad</td>\n");
      out.write("                                            <td>Enviar Mensaje de Correo Electronico De Notificacion</td>\n");
      out.write("                                            <td>Repetir</td>\n");
      out.write("                                            <td>Informacion De La Descripcion</td>     \n");
      out.write("                                            <td>Opciones</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            for (Models.clsTareas item : lstclsTareas) {
                                                Models.clsEstado obclsEstado = item.getObclsEstado();
                                                Models.clsPrioridad obclsPrioridad = item.getObclsPrioridad();
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <!--COLUMNA-->   \n");
      out.write("                                            <td>");
      out.print( item.getStTitularDeLaTarea());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStAsunto());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStFechaDeVencimiento());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStContacto());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStCuenta());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( obclsEstado.getStDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( obclsPrioridad.getStDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getChEnviarMensajedeCorreoElectronicoDeNotificacion());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getChRepetir());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStInformacionDeLaDescripcion());
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <a href=\"TareasController?stOpcion=M&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                   class=\"btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("                                                <a href=\"TareasController?stOpcion=E&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                   class=\"btn-danger btn-sm\">Eliminar</a>   \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
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
