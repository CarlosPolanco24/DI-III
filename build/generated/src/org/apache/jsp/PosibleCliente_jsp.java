package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class PosibleCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Posibles Clientes</title>\n");
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
      out.write("    <body>\n");
      out.write("        <!-- Zona de SCRIPTLETS -->\n");
      out.write("        <!---OBTENER LISTA DE OBJETOS EN SESION-->\n");
      out.write("        ");

            Models.clsPosiblecliente obclsPosiblecliente = new Models.clsPosiblecliente();

            if (request.getAttribute("obclsPosiblecliente") != null) {
                obclsPosiblecliente = (Models.clsPosiblecliente) request.getAttribute("obclsPosiblecliente");
            }

            List<Models.clsPosiblecliente> lstclsPosiblecliente
                    = new ArrayList<Models.clsPosiblecliente>();

            //EXISTENCIA DE LA VARIABLE DE SESION
            if (session.getAttribute("session_lstclsPosiblecliente") != null) {

                //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION 
                lstclsPosiblecliente = (List<Models.clsPosiblecliente>) session.getAttribute("session_lstclsPosiblecliente");

            }

            if (request.getAttribute("stMensaje") != null
                    && request.getAttribute("stTipo") != null) {

        
      out.write("\n");
      out.write("        <input type=\"text\"  id=\"txtMensaje\" hidden=\"\"\n");
      out.write("               value=\"");
      out.print(request.getAttribute("stMensaje"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("        <input type=\"text\" id=\"txtTipo\" hidden=\"\"\n");
      out.write("               value=\"");
      out.print(request.getAttribute("stTipo"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var mensaje = document.getElementById(\"txtMensaje\").value;\n");
      out.write("            var tipo = document.getElementById(\"txtTipo\").value;\n");
      out.write("\n");
      out.write("            swal(\"mensaje\", \"mensaje\", \"success\");\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\" mx-auto mt-5\">\n");
      out.write("                <div class=\"card-header\">Crear Posibles Clientes</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form action=\"PosibleclienteController\" method=\"POST\">\n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input type=\"submit\" name=\"btnGuardar\" value=\"Guardar\" class=\"btn btn-primary\"/>  \n");
      out.write("                                    <input type=\"submit\" name=\"btnModificar\" value=\"Modificar\" class=\"btn btn-primary\"/>  \n");
      out.write("                                    <input type=\"submit\" name=\"btnCancelar\" value=\"Cancelar\" class=\"btn btn-primary\"/> \n");
      out.write("                                    <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\n");
      out.write("                                    <input type=\"text\" name=\"codigoModificar\" value=\"");
      out.print( obclsPosiblecliente.getInCodigo() != 0 ? obclsPosiblecliente.getInCodigo() : "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\">\n");
      out.write("                                        <a class=\"nav-link\" href=\"Index.jsp\">\n");
      out.write("                                            <span class=\"btn btn-primary\">Volver</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </div>                                \n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <h1>Informacion de Posible Cliente</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblEmpresa\">Empresa</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Empresa\" \n");
      out.write("                                           name=\"txtEmpresa\" \n");
      out.write("                                           class=\"form-control\" required=\"\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStEmpresa() != null
                                                   ? obclsPosiblecliente.getStEmpresa() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNombre\">Nombre</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Nombre\" \n");
      out.write("                                           name=\"txtNombre\" \n");
      out.write("                                           class=\"form-control\" \n");
      out.write("                                           required=\"\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStNombre() != null
                                                   ? obclsPosiblecliente.getStNombre() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblApellidos\">Apellidos</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Apellidos\" \n");
      out.write("                                           name=\"txtApellidos\" \n");
      out.write("                                           class=\"form-control\" \n");
      out.write("                                           required=\"\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStApellidos() != null
                                                   ? obclsPosiblecliente.getStApellidos() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTitulo\">Titulo</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Titulo\" \n");
      out.write("                                           name=\"txtTitulo\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStTitulo() != null
                                                   ? obclsPosiblecliente.getStTitulo() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCorreoElectronico\">Correo Electronico</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Correo Electronico\" \n");
      out.write("                                           name=\"txtCorreoElectronico\" \n");
      out.write("                                           class=\"form-control\" \n");
      out.write("                                           required=\"\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStCorreoElectronico() != null
                                                   ? obclsPosiblecliente.getStCorreoElectronico() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTelefono\">Telefono</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Telefono\"\n");
      out.write("                                           name=\"txtTelefono\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStTelefono() != null
                                                   ? obclsPosiblecliente.getStTelefono() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFax\">Fax</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Fax\" \n");
      out.write("                                           name=\"txtFax\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStFax() != null
                                                   ? obclsPosiblecliente.getStFax() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblMovil\">Movil</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Movil\" \n");
      out.write("                                           name=\"txtMovil\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStMovil() != null
                                                   ? obclsPosiblecliente.getStMovil() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>               \n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblSitioWeb\">Sitio Web</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Sitio Web\" \n");
      out.write("                                           name=\"txtSitioWeb\" \n");
      out.write("                                           class=\"form-control\" \n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStSitioWeb() != null
                                                   ? obclsPosiblecliente.getStSitioWeb() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblFuenteDePosibleCliente\">Fuente De Posible Cliente</label>\n");
      out.write("                                    <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlFuenteDePosibleCliente\">\n");
      out.write("                                        <option value=\"1\" ");
      out.print( obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\" ");
      out.print( obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Aviso</option>\n");
      out.write("                                        <option value=\"3\" ");
      out.print( obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Llamada No Solicitada</option>\n");
      out.write("                                        <option value=\"4\" ");
      out.print( obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">Recomendacion De Empleado</option>\n");
      out.write("                                        <option value=\"5\" ");
      out.print( obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Recomendacion Externa</option>\n");
      out.write("                                        <option value=\"6\" ");
      out.print( obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">Tienda En Linea</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblEstadoDePosibleCliente\">Estado De Posible Cliente</label>\n");
      out.write("                                    <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlEstadoDePosibleCliente\">\n");
      out.write("                                        <option value=\"1\" ");
      out.print( obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\" ");
      out.print( obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Intento De Contacto</option>\n");
      out.write("                                        <option value=\"3\" ");
      out.print( obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Contactar En El Futuro</option>\n");
      out.write("                                        <option value=\"4\" ");
      out.print( obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">Contactado</option>\n");
      out.write("                                        <option value=\"5\" ");
      out.print( obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Posible Cliente No Solicitado</option>\n");
      out.write("                                        <option value=\"6\" ");
      out.print( obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">Posible Cliente Perdido</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblSector\">Sector</label>\n");
      out.write("                                    <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlSector\">\n");
      out.write("                                        <option value=\"1\" ");
      out.print( obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\" ");
      out.print( obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">ASP (Proveedor De Servicios De Aplicacion)</option>\n");
      out.write("                                        <option value=\"3\" ");
      out.print( obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">OEM De Datos</option>\n");
      out.write("                                        <option value=\"4\" ");
      out.print( obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">ERP (Planificacion De Recursos De Empresa)</option>\n");
      out.write("                                        <option value=\"5\" ");
      out.print( obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Gobierno/Ejercito</option>\n");
      out.write("                                        <option value=\"6\" ");
      out.print( obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">Empresa Grande</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCantidadDeEmpleados\">Cantidad De Empleados</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Cantidad De Empleados\" \n");
      out.write("                                           name=\"txtCantidadDeEmpleados\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getInCantidadDeEmpleados() != 0
                                                   ? obclsPosiblecliente.getInCantidadDeEmpleados() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblIngresosAnuales\">Ingresos Anuales</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Ingresos Anuales\" \n");
      out.write("                                           name=\"txtIngresosAnuales\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getDbIngresosAnuales() != 0
                                                   ? obclsPosiblecliente.getDbIngresosAnuales() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblCalificacion\">Calificacion</label>\n");
      out.write("                                    <i class=\"fa fa-search-minus\"></i>\n");
      out.write("                                    <select class=\"form-control\" name=\"ddlCalificacion\">\n");
      out.write("                                        <option value=\"1\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 1 ? "selected" : "" : "");
      out.write(">Ninguno</option>\n");
      out.write("                                        <option value=\"2\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 2 ? "selected" : "" : "");
      out.write(">Adquirido</option>\n");
      out.write("                                        <option value=\"3\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 3 ? "selected" : "" : "");
      out.write(">Activo</option>\n");
      out.write("                                        <option value=\"4\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 4 ? "selected" : "" : "");
      out.write(">Contactado</option>\n");
      out.write("                                        <option value=\"5\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 5 ? "selected" : "" : "");
      out.write(">Fallo De Mercado</option>\n");
      out.write("                                        <option value=\"6\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 6 ? "selected" : "" : "");
      out.write(">Proyecto Cancelado</option>\n");
      out.write("                                        <option value=\"7\" ");
      out.print( obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 7 ? "selected" : "" : "");
      out.write(">Apagar</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblNoParticipacionCorreoElectronico\">\n");
      out.write("                                        <input type=\"checkbox\" \n");
      out.write("                                               name=\"chkNoParticipacionCorreoElectronico\"\n");
      out.write("                                               ");
      out.print( obclsPosiblecliente.getChNoParticipacionCorreoElectronico() == 'S' ? "ckecked" : "");
      out.write(" />\n");
      out.write("                                        No Participacion Correo Electronico\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                        <!--Esto es una Fila-->\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblIDDeSkype\">ID De Skype</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"ID De Skype\" \n");
      out.write("                                           name=\"txtIDDeSkype\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStIDDeSkype() != null
                                                   ? obclsPosiblecliente.getStIDDeSkype() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-3\">\n");
      out.write("                                    <label name=\"lblTwitter\">Twitter</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Twitter\" \n");
      out.write("                                           name=\"txtTwitter\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStTwitter() != null
                                                   ? obclsPosiblecliente.getStTwitter() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <!--Esto es una Columna-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label name=\"lblCorreoElectronicoSecundario\">Correo Electronico Secundario</label>\n");
      out.write("                                    <input type=\"text\" \n");
      out.write("                                           placeholder=\"Correo Electronico Secundario\" \n");
      out.write("                                           name=\"txtCorreoElectronicoSecundario\" \n");
      out.write("                                           class=\"form-control\"\n");
      out.write("                                           value=\"");
      out.print( obclsPosiblecliente.getStCorreoElectronicoSecundario() != null
                                                   ? obclsPosiblecliente.getStCorreoElectronicoSecundario() : "");
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--FILA-->        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"col-12\" >\n");
      out.write("                                    <b>\n");
      out.write("                                        <i class=\"fa fa-clipboard\"></i>\n");
      out.write("                                        Registro:");
      out.print( lstclsPosiblecliente.size());
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
      out.write("                                                <td>Empresa</td>\n");
      out.write("                                                <td>Nombre</td>\n");
      out.write("                                                <td>Apellido</td>\n");
      out.write("                                                <td>Titulo</td>\n");
      out.write("                                                <td>Correo Electronico</td>\n");
      out.write("                                                <td> Telefono</td>\n");
      out.write("                                                <td>Fax</td>\n");
      out.write("                                                <td>Movil</td>\n");
      out.write("                                                <td>Sitio Web</td>\n");
      out.write("                                                <td>Fuente de posible cliente</td>\n");
      out.write("                                                <td>Estado de posible cliente</td>\n");
      out.write("                                                <td>Sector</td>\n");
      out.write("                                                <td>Cantidad de empleados</td>\n");
      out.write("                                                <td>Ingresos anuales</td>\n");
      out.write("                                                <td>Calificacion</td>\n");
      out.write("                                                <td>No participacion correo Electronico</td>\n");
      out.write("                                                <td>ID de Skipe</td>\n");
      out.write("                                                <td>Twiter</td>\n");
      out.write("                                                <td>Correo Electronico Secundario</td>\n");
      out.write("                                                <td>Opciones</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            ");

                                                for (Models.clsPosiblecliente item : lstclsPosiblecliente) {
                                                    Models.clsFuenteDePosibleCliente obclsFuenteDePosibleCliente = item.getObclsFuenteDePosibleCliente();
                                                    Models.clsEstadoDePosibleCliente obclsEstadoDePosibleCliente = item.getObclsEstadoDePosibleCliente();
                                                    Models.clsSector obclsSector = item.getObclsSector();
                                                    Models.clsCalificacion obclsCalificacion = item.getObclsClasificacion();

                                            
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <!--COLUMNA-->   \n");
      out.write("                                                <td>");
      out.print( item.getStEmpresa());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStNombre());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStApellidos());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStTitulo());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStCorreoElectronico());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStTelefono());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStFax());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStMovil());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStSitioWeb());
      out.write(" </td>\n");
      out.write("                                                <td>");
      out.print(obclsFuenteDePosibleCliente.getStDescripcion());
      out.write("  </td>\n");
      out.write("                                                <td>");
      out.print(obclsEstadoDePosibleCliente.getStDescripcion());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(obclsSector.getStDescripcion());
      out.write(" </td>\n");
      out.write("                                                <td>");
      out.print( item.getInCantidadDeEmpleados());
      out.write(" </td>\n");
      out.write("                                                <td>");
      out.print( item.getDbIngresosAnuales());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(obclsCalificacion.getStDescripcion());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getChNoParticipacionCorreoElectronico());
      out.write(" </td>\n");
      out.write("                                                <td>");
      out.print( item.getStIDDeSkype());
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print( item.getStTwitter());
      out.write(" </td>\n");
      out.write("                                                <td>");
      out.print( item.getStCorreoElectronicoSecundario());
      out.write(" </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <a href=\"PosibleclienteController?stOpcion=M&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                       class=\"btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("                                                    <a href=\"PosibleclienteController?stOpcion=E&codigoSeleccionado=");
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
      out.write("                    </form>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
