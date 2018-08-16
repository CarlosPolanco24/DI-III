package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class Trato_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>Trato</title>\r\n");
      out.write("        <!-- Bootstrap core CSS-->\r\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <!-- Bootstrap core JavaScript-->\r\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- Core plugin JavaScript-->\r\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/sweetalert.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-white\">\r\n");
      out.write("    <!-- Zona de SCRIPTLETS -->\r\n");
      out.write("            <!---OBTENER LISTA DE OBJETOS EN SESION-->\r\n");
      out.write("        ");

            Models.clsTrato obclsTrato = new Models.clsTrato();
            
            if(request.getAttribute("obclsTrato") != null){
                obclsTrato = (Models.clsTrato) request.getAttribute("obclsTrato");
            }
            
            List<Models.clsTrato> lstclsTrato
                    = new ArrayList<Models.clsTrato>();

            //EXISTENCIA DE LA VARIABLE DE SESION
            if (session.getAttribute("session_lstclsTrato") != null) {

                //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION 
                lstclsTrato = (List<Models.clsTrato>) session.getAttribute("session_lstclsTrato");

            }

            if (request.getAttribute("stMensaje") != null
                    && request.getAttribute("stTipo") != null) {

        
      out.write("\r\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtMensaje\"\r\n");
      out.write("               value=\"");
      out.print(request.getAttribute("stMensaje"));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"text\" hidden=\"\" id=\"txtTipo\"\r\n");
      out.write("               value=\"");
      out.print(request.getAttribute("stTipo"));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            var mensaje = document.getElementById(\"txtMensaje\").value;\r\n");
      out.write("            var tipo = document.getElementById(\"txtTipo\").value;\r\n");
      out.write("\r\n");
      out.write("            swal(\"mensaje\", mensaje, tipo);\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            if (request.getAttribute("stMensaje") != null) {
        
      out.write("\r\n");
      out.write("        <input type=\"text\" \r\n");
      out.write("               hidden=\"\"\r\n");
      out.write("               name=\"txtMensaje\"\r\n");
      out.write("               value=\"");
      out.print( request.getAttribute("stMensaje"));
      out.write("\"/>\r\n");
      out.write("        <input type=\"text\" \r\n");
      out.write("               hidden=\"\"\r\n");
      out.write("               name=\"txtTipo\"\r\n");
      out.write("               value=\"");
      out.print( request.getAttribute("stTipo"));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            var mensaje = document.getElementByName(\"txtMensaje\").value;\r\n");
      out.write("            var mensaje = document.getElementByName(\"txtTipo\").value;\r\n");
      out.write("\r\n");
      out.write("            swal(\"Mensaje\", mensaje, tipo);\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\" mx-auto mt-5\">\r\n");
      out.write("            <div class=\"card-header\">Crear Trato</div>\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <form action=\"TratoController\" method=\"POST\">\r\n");
      out.write("                    <!--Esto es una Fila-->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                                <input type=\"submit\" name=\"btnGuardar\" value=\"Guardar\" class=\"btn btn-primary\"/>  \r\n");
      out.write("                                <input type=\"submit\" name=\"btnModificar\" value=\"Modificar\" class=\"btn btn-primary\"/>  \r\n");
      out.write("                                <input type=\"submit\" name=\"btnCancelar\" value=\"Cancelar\" class=\"btn btn-primary\"/> \r\n");
      out.write("                                <a href=\"Index.jsp\" class=\"btn btn-primary\">Volver</a>\r\n");
      out.write("                                   <input type=\"text\" name=\"codigoModificar\" value=\"");
      out.print( obclsTrato.getInCodigo()!= 0 ? obclsTrato.getInCodigo(): "" );
      out.write("\" hidden=\"\"/>\r\n");
      out.write("                            </div>                                                                \r\n");
      out.write("                        </div>                            \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--Esto es una Fila-->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <h1>Informacion De Trato</h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>  \r\n");
      out.write("                    <!--Esto es una Fila-->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblImporte\">Importe</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Importe\" \r\n");
      out.write("                                       name=\"txtImporte\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStImporte()!= null ? 
                                                   obclsTrato.getStImporte(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblNombreDeTrato\">Nombre De Trato</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Nombre De Trato\" \r\n");
      out.write("                                       name=\"txtNombreDeTrato\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStNombreDeTrato()!= null ? 
                                                   obclsTrato.getStNombreDeTrato(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblFechaDeCierre\">Fecha De Cierre</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"dd/mm/yyyy\" \r\n");
      out.write("                                       name=\"txtFechaDeCierre\"\r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStFechaDeCierre()!= null ? 
                                                   obclsTrato.getStFechaDeCierre(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblNombreDeCuenta\">Nombre De Cuenta</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Nombre De Cuenta\" \r\n");
      out.write("                                       name=\"txtNombreDeCuenta\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStNombreDeCuenta()!= null ? 
                                                   obclsTrato.getStNombreDeCuenta(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--Esto es una Fila-->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblFase\">Fase</label>\r\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\r\n");
      out.write("                                <select class=\"form-control\" name=\"ddlFase\">\r\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">-None-</option>\r\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Clasificacion</option>\r\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Necesita Analisis</option>\r\n");
      out.write("                                    <option value=\"4\" ");
      out.print( obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Propuesta De Valor</option>\r\n");
      out.write("                                    <option value=\"5\" ");
      out.print( obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Identificar Responsables</option>\r\n");
      out.write("                                    <option value=\"6\" ");
      out.print( obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Cotizacion De Propuesta/Precio</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblTipo\">Tipo</label>\r\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\r\n");
      out.write("                                <select class=\"form-control\" name=\"ddlTipo\">\r\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsTrato.obclsTipo != null ? obclsTrato.obclsTipo.getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">-None-</option>\r\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsTrato.obclsTipo != null ? obclsTrato.obclsTipo.getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Negocios Existentes</option>\r\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsTrato.obclsTipo != null ? obclsTrato.obclsTipo.getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Nuevo Negocio</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblProbabilidad\">Probabilidad</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Probabilidad\" \r\n");
      out.write("                                       name=\"txtProbabilidad\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStProbabilidad()!= null ? 
                                                   obclsTrato.getStProbabilidad(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblSiguientePaso\">Siguiente Paso</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Siguiente Paso\" \r\n");
      out.write("                                       name=\"txtSiguientePaso\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStSiguientePaso()!= null ? 
                                                   obclsTrato.getStSiguientePaso(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--Esto es una Fila-->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblIngresosEsperados\">Ingresos Esperados</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Ingresos Esperados\" \r\n");
      out.write("                                       name=\"txtIngresosEsperados\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStIngresosEsperados()!= null ? 
                                                   obclsTrato.getStIngresosEsperados(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblFuenteDePosibleCliente\">Fuente De Posible Cliente</label>\r\n");
      out.write("                                <i class=\"fa fa-search-minus\"></i>\r\n");
      out.write("                                <select class=\"form-control\" name=\"ddlFuenteDePosibleCliente\">\r\n");
      out.write("                                    <option value=\"1\" ");
      out.print( obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 1 ? "selected" : "" : "" );
      out.write(">-None-</option>\r\n");
      out.write("                                    <option value=\"2\" ");
      out.print( obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 2 ? "selected" : "" : "" );
      out.write(">Aviso</option>\r\n");
      out.write("                                    <option value=\"3\" ");
      out.print( obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 3 ? "selected" : "" : "" );
      out.write(">Llamada No Solicitada</option>\r\n");
      out.write("                                    <option value=\"4\" ");
      out.print( obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 4 ? "selected" : "" : "" );
      out.write(">Recomendacion De Empleado</option>\r\n");
      out.write("                                    <option value=\"5\" ");
      out.print( obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 5 ? "selected" : "" : "" );
      out.write(">Recomendacion Externa</option>\r\n");
      out.write("                                    <option value=\"6\" ");
      out.print( obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 6 ? "selected" : "" : "" );
      out.write(">Tienda En Linea</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblFuenteDeCampaña\">Fuente De Campaña</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Fuente De Campaña\" \r\n");
      out.write("                                       name=\"txtFuenteDeCampaña\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStFuenteDeCampaña()!= null ? 
                                                   obclsTrato.getStFuenteDeCampaña(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--Esto es una Columna-->\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <label name=\"lblNombreDeContacto\">Nombre De Contacto</label>\r\n");
      out.write("                                <input type=\"text\" \r\n");
      out.write("                                       placeholder=\"Nombre De Contacto\" \r\n");
      out.write("                                       name=\"txtNombreDeContacto\" \r\n");
      out.write("                                       class=\"form-control\"\r\n");
      out.write("                                       value=\"");
      out.print( obclsTrato.getStNombreDeContacto()!= null ? 
                                                   obclsTrato.getStNombreDeContacto(): "" );
      out.write("\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--Esto es una Fila-->\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"form-row\">\r\n");
      out.write("                                <!--Esto es una Columna-->\r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <label name=\"lblDescripcion\">Descripcion</label>\r\n");
      out.write("                                    <input type=\"text\" \r\n");
      out.write("                                           placeholder=\"Descripcion\" \r\n");
      out.write("                                           name=\"txtDescripcion\" \r\n");
      out.write("                                           class=\"form-control\"\r\n");
      out.write("                                           value=\"");
      out.print( obclsTrato.getStDescripcion()!= null ? 
                                                   obclsTrato.getStDescripcion(): "" );
      out.write("\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        <!--FILA-->        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"form-row\">\r\n");
      out.write("                                <div class=\"col-12\" >\r\n");
      out.write("                                    <b>\r\n");
      out.write("                                        <i class=\"fa fa-clipboard\"></i>\r\n");
      out.write("                                        Registro:");
      out.print( lstclsTrato.size());
      out.write("\r\n");
      out.write("                                    </b>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--FILA-->        \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"form-row\">\r\n");
      out.write("                                    <!--COLUMNA-->\r\n");
      out.write("                                    <div class=\"col-12\" >\r\n");
      out.write("                                        <table class=\"table table-bordered table-responsive\">\r\n");
      out.write("                                            <!--FILA-->\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <!--COLUMNAS-->   \r\n");
      out.write("                                                <td>Importe</td>\r\n");
      out.write("                                                <td>Nombre De Trato</td>\r\n");
      out.write("                                                <td>Fecha De Cierre</td>\r\n");
      out.write("                                                <td>Nombre De Cuenta</td>\r\n");
      out.write("                                                <td>Fase</td>\r\n");
      out.write("                                                <td>Tipo</td>\r\n");
      out.write("                                                <td>Probabilidad</td>\r\n");
      out.write("                                                <td>Siguiente Paso</td>\r\n");
      out.write("                                                <td>Igresos Esperados</td>\r\n");
      out.write("                                                <td>Fuente de posible cliente</td>\r\n");
      out.write("                                                <td>Fuente de Campaña</td>                                                \r\n");
      out.write("                                                <td>Nombre De Contacto</td>\r\n");
      out.write("                                                <td>Descripcion</td>\r\n");
      out.write("                                                <td>Opciones</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            ");

                                                for (Models.clsTrato item : lstclsTrato) {
                                                    Models.clsFase obclsFase = item.getObclsFase();
                                                    Models.clsTipo obclsTipo = item.getObclsTipo();
                                                    Models.clsFuenteDePosibleCliente obclsFuenteDePosibleCliente = item.getObclsFuenteDePosibleCliente();
                                            
      out.write("\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <!--COLUMNA-->   \r\n");
      out.write("                                                <td>");
      out.print( item.getStImporte());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStNombreDeTrato());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStFechaDeCierre());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStNombreDeCuenta());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(obclsFase.getStDescripcion());
      out.write(" </td>\r\n");
      out.write("                                                <td>");
      out.print(obclsTipo.getStDescripcion());
      out.write(" </td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStProbabilidad());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStSiguientePaso());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStIngresosEsperados());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print(obclsFuenteDePosibleCliente.getStDescripcion());
      out.write(" </td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStFuenteDeCampaña());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStNombreDeContacto());
      out.write("</td>\r\n");
      out.write("                                                <td>");
      out.print( item.getStDescripcion());
      out.write(" </td>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <a href=\"TratoController?stOpcion=M&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\r\n");
      out.write("                                                       class=\"btn-success btn-sm\">Modificar</a>\r\n");
      out.write("\r\n");
      out.write("                                                       <a href=\"TratoController?stOpcion=E&codigoSeleccionado=");
      out.print( item.getInCodigo());
      out.write("\"\r\n");
      out.write("                                                       class=\"btn-danger btn-sm\">Eliminar</a>   \r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
