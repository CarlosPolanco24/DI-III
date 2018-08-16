package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class Contactos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contactos</title>\n");
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

        Models.clsContactos obclsContactos = new Models.clsContactos();

        if (request.getAttribute("obclsContactos") != null) {
            obclsContactos = (Models.clsContactos) request.getAttribute("obclsContactos");
        }

        List<Models.clsContactos> lstclsContactos
                = new ArrayList<Models.clsContactos>();

        //EXISTENCIA DE LA VARIABLE DE SESION
        if (session.getAttribute("session_lstclsContactos") != null) {

            //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION 
            lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");

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
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\" mx-auto mt-5\">\n");
      out.write("            <div class=\"card-header\">Crear Contacto</div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form action=\"ContactosController\" method=\"POST\">\n");
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
      out.print( obclsContactos.getInCodigo() != 0 ? obclsContactos.getInCodigo() : "");
      out.write("\" hidden=\"\"/>\n");
      out.write("                            </div>                                                                \n");
      out.write("                        </div>                            \n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <h1>Informacion De Contacto</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <label name=\"lblNombre\">Nombre</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Nombre\" \n");
      out.write("                                       name=\"txtNombre\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStNombre()!= null
                                               ? obclsContactos.getStNombre(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <label name=\"lblApellidos\">Apellidos</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Apellidos\" \n");
      out.write("                                       name=\"txtApellidos\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStApellidos()!= null
                                               ? obclsContactos.getStApellidos(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <label name=\"lblNumeroDeCuenta\">Numero De Cuenta</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Numero De Cuenta\" \n");
      out.write("                                       name=\"txtNumeroDeCuenta\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStNumeroDeCuenta()!= null
                                               ? obclsContactos.getStNumeroDeCuenta(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblTitulo\">Titulo</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Titulo\" \n");
      out.write("                                       name=\"txtTitulo\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStTitulo()!= null
                                               ? obclsContactos.getStTitulo(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblCorreoElectronico\">Correo Electronico</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Correo Electronico\" \n");
      out.write("                                       name=\"txtCorreoElectronico\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStCorreoElectronico()!= null
                                               ? obclsContactos.getStCorreoElectronico(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblDepartamento\">Departamento</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Departamento\" \n");
      out.write("                                       name=\"txtDepartamento\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStDepartamento()!= null
                                               ? obclsContactos.getStDepartamento(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblTelefono\">Telefono</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Telefono\" \n");
      out.write("                                       name=\"txtTelefono\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStTelefono()!= null
                                               ? obclsContactos.getStTelefono(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblTelefonoParticular\">Telefono Particular</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Telefono Particular\" \n");
      out.write("                                       name=\"txtTelefonoParticular\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStTelefonoParticular()!= null
                                               ? obclsContactos.getStTelefonoParticular(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblOtroTelefono\">Otro Telefono</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Otro Telefono\" \n");
      out.write("                                       name=\"txtOtroTelefono\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStOtroTelefono()!= null
                                               ? obclsContactos.getStOtroTelefono(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFax\">Fax</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Fax\" \n");
      out.write("                                       name=\"txtFax\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStFax()!= null
                                               ? obclsContactos.getStFax(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblMovil\">Movil</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Movil\" \n");
      out.write("                                       name=\"txtMovil\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStMovil()!= null
                                               ? obclsContactos.getStMovil(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblFechaDeNacimiento\">Fecha De Nacimiento</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"dd/mm/aaaa\" \n");
      out.write("                                       name=\"txtFechaDeNacimiento\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStFechaDeNacimiento()!= null
                                               ? obclsContactos.getStFechaDeNacimiento(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblAsistente\">Asistente</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Asistente\" \n");
      out.write("                                       name=\"txtAsistente\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStAsistente()!= null
                                               ? obclsContactos.getStAsistente(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNºDeTelefonoDeAsistente\">Nº De Telefono De Asistente</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Nº De Telefono De Asistente\" \n");
      out.write("                                       name=\"txtNDeTelefonoDeAsistente\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStNºDeTelefonoDeAsistente()!= null
                                               ? obclsContactos.getStNºDeTelefonoDeAsistente(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblRespondeA\">Responde A</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Responde A\" \n");
      out.write("                                       name=\"txtRespondeA\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStResponderA()!= null
                                               ? obclsContactos.getStResponderA(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <!--Esto es una Fila-->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblNoParticipacionCorreoElectronico\">\n");
      out.write("                                    <input type=\"checkbox\" \n");
      out.write("                                           name=\"chkNoParticipacionCorreoElectronico\"\n");
      out.write("                                           ");
      out.print( obclsContactos.getChNoParticipacionCorreoElectronico() == 'S' ? "ckecked" : "");
      out.write(" />\n");
      out.write("                                    No Participacion Correo Electronico\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblIDDeSkype\">ID De Skype</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"ID De Skype\" \n");
      out.write("                                       name=\"txtIDDeSkype\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStIDDeSkype()!= null
                                               ? obclsContactos.getStIDDeSkype(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <!--Esto es una Columna-->\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <label name=\"lblCorreoElectronicoSecundario\">Correo Electronico Secundario</label>\n");
      out.write("                                <input type=\"text\" \n");
      out.write("                                       placeholder=\"Correo Electronico Secundario\" \n");
      out.write("                                       name=\"txtCorreoElectronicoSecundario\" \n");
      out.write("                                       class=\"form-control\"\n");
      out.write("                                       value=\"");
      out.print( obclsContactos.getStCorreoElectronicoSecundario()!= null
                                               ? obclsContactos.getStCorreoElectronicoSecundario(): "");
      out.write("\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <!--FILA-->        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col-12\" >\n");
      out.write("                                <b>\n");
      out.write("                                    <i class=\"fa fa-clipboard\"></i>\n");
      out.write("                                    Registro:");
      out.print( lstclsContactos.size());
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
      out.write("                                            <td>Nombre</td>\n");
      out.write("                                            <td>Apellidos</td>\n");
      out.write("                                            <td>Numero De Cuenta</td>\n");
      out.write("                                            <td>Titulo</td>\n");
      out.write("                                            <td>Correo Electronico</td>\n");
      out.write("                                            <td>Departamento</td>\n");
      out.write("                                            <td>Telefono</td>\n");
      out.write("                                            <td>Telefono Particular</td>\n");
      out.write("                                            <td>Otro Telefono</td>\n");
      out.write("                                            <td>Fax</td>\n");
      out.write("                                            <td>Movil</td>\n");
      out.write("                                            <td>Fecha De Nacimiento</td>\n");
      out.write("                                            <td>Asistente</td>\n");
      out.write("                                            <td>Nº De Telefono De Asistente</td>\n");
      out.write("                                            <td>Responder A</td>\n");
      out.write("                                            <td>No Participacion Correo Electronico</td>\n");
      out.write("                                            <td>ID De Skype</td>\n");
      out.write("                                            <td>Correo Electronico Secundario</td>\n");
      out.write("                                            <td>Opciones</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            for (Models.clsContactos item : lstclsContactos) {
                                                Models.clsFuenteDePosibleCliente obclsFuenteDePosibleCliente = item.getObFuenteDePosibleCliente();
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <!--COLUMNA-->   \n");
      out.write("\n");
      out.write("                                            <td>");
      out.print( item.getStNombre());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStApellidos());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStNumeroDeCuenta());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStTitulo());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStCorreoElectronico());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStDepartamento());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStTelefono());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStTelefonoParticular());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStOtroTelefono());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStFax());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStMovil());
      out.write("</td>                                                                                            \n");
      out.write("                                            <td>");
      out.print( item.getStFechaDeNacimiento());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStAsistente());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStNºDeTelefonoDeAsistente());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStResponderA());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getChNoParticipacionCorreoElectronico());
      out.write(" </td>\n");
      out.write("                                            <td>");
      out.print( item.getStIDDeSkype());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( item.getStCorreoElectronicoSecundario());
      out.write(" </td>\n");
      out.write("                                            \n");
      out.write("                                            <td>\n");
      out.write("                                                    <a href=\"ContactosController?stOpcion=M&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                       class=\"btn-success btn-sm\">Modificar</a>\n");
      out.write("\n");
      out.write("                                                    <a href=\"ContactosController?stOpcion=E&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\n");
      out.write("                                                       class=\"btn-danger btn-sm\">Eliminar</a>   \n");
      out.write("                                                </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
