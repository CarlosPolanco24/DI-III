<%-- 
    Document   : Eventos
    Created on : 22/02/2018, 07:45:49 PM
    Author     : Carlos Enrique P P
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Eventos</title>
        <!-- Bootstrap core CSS-->
        <link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <!-- Custom styles for this template-->
        <link href="css/sb-admin.css" rel="stylesheet">

        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="js/sweetalert.min.js" type="text/javascript"></script>

    </head>

    <body class="bg-white">
        <!-- Zona de SCRIPTLETS -->
        <!---OBTENER LISTA DE OBJETOS EN SESION-->
        <%
            List<Models.clsEventos> lstclsEventos
                    = new ArrayList<Models.clsEventos>();

            //EXISTENCIA DE LA VARIABLE DE SESION
            if (session.getAttribute("session_lstclsEventos") != null) {

                //CASTING PARA DARLE UN TIPO DE DATO A LA VARIABLE DE SESION 
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");

            }

            Models.clsEventos obclsEventos = new Models.clsEventos();

            if (request.getAttribute("obclsEventos") != null) {
                obclsEventos = (Models.clsEventos) request.getAttribute("obclsEventos");
            }

            if (request.getAttribute("stMensaje") != null
                    && request.getAttribute("stTipo") != null) {

        %>
        <input type="text" hidden="" id="txtMensaje"
               value="<%=request.getAttribute("stMensaje")%>"/>

        <input type="text" hidden="" id="txtTipo"
               value="<%=request.getAttribute("stTipo")%>"/>

        <script>
            var mensaje = document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;

            swal("mensaje", mensaje, tipo);

        </script>


        <%
            }
        %>



        <%
            if (request.getAttribute("stMensaje") != null) {
        %>
        <input type="text" 
               hidden=""
               name="txtMensaje"
               value="<%= request.getAttribute("stMensaje")%>"/>
        <input type="text" 
               hidden=""
               name="txtTipo"
               value="<%= request.getAttribute("stTipo")%>"/>

        <script>
            var mensaje = document.getElementByName("txtMensaje").value;
            var mensaje = document.getElementByName("txtTipo").value;

            swal("Mensaje", mensaje, tipo);
        </script>

        <%
            }
        %>
        <div class="container">
            <div class=" mx-auto mt-5">
                <div class="card-header">Crear Evento</div>
                <div class="card-body">
                    <form action="EventosController" method="POST">
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <input type="submit" name="btnGuardar" value="Guardar" class="btn btn-primary"/>  
                                    <input type="submit" name="btnModificar" value="Modificar" class="btn btn-primary"/>  
                                    <input type="submit" name="btnCancelar" value="Cancelar" class="btn btn-primary"/>   
                                    <a href="Index.jsp" class="btn btn-primary">Volver</a>
                                    <input type="text" name="codigoModificar" value="<%= obclsEventos.getInCodigo() != 0 ? obclsEventos.getInCodigo() : ""%>" hidden=""/> 
                                </div>                                                                
                            </div>                            
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Informacion Sobre El Evento</h1>
                            </div>
                        </div>  
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <label name="lblNuevoEvento">Nuevo Evento</label>
                                    <input type="text" 
                                           placeholder="Nuevo Evento" 
                                           name="txtNuevoEvento" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStNuevoEvento() != null
                                                   ? obclsEventos.getStNuevoEvento() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <label name="lblUbicacion">Ubicacion</label>
                                    <input type="text" 
                                           placeholder="Ubicacion" 
                                           name="txtUbicacion" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStUbicacion() != null
                                                   ? obclsEventos.getStUbicacion() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-12">
                                    <label name="lblParticipantes">Participantes</label>
                                    <input type="text" 
                                           placeholder="Participantes" 
                                           name="txtParticipantes" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStParticipantes() != null
                                                   ? obclsEventos.getStParticipantes() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-12">
                                    <label name="lblTodoElDia">
                                        <input type="checkbox" 
                                               name="chkTodoElDia"
                                               <%= obclsEventos.getChTodoElDia() == 'S' ? "ckecked" : ""%>/>
                                        Todo El Dia
                                    </label>
                                </div>
                            </div>
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <label name="lblFecha">Fecha</label>
                                    <input type="text" 
                                           placeholder="dd/mm/aaaa" 
                                           name="txtFecha" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStFecha() != null
                                                   ? obclsEventos.getStFecha() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <label name="lblRelacionadoCon">Relacionado Con</label>
                                    <i class="fa fa-search-minus"></i>
                                    <select class="form-control" name="ddlRelacionadoCon">
                                        <option value="1" <%= obclsEventos.obclsRelacionadoCon != null ? obclsEventos.obclsRelacionadoCon.getInCodigo() == 1 ? "selected" : "" : ""%>>-None-</option>
                                        <option value="2" <%= obclsEventos.obclsRelacionadoCon != null ? obclsEventos.obclsRelacionadoCon.getInCodigo() == 2 ? "selected" : "" : ""%>>Posible Cliente</option>
                                        <option value="3" <%= obclsEventos.obclsRelacionadoCon != null ? obclsEventos.obclsRelacionadoCon.getInCodigo() == 3 ? "selected" : "" : ""%>>Contacto</option>
                                        <option value="4" <%= obclsEventos.obclsRelacionadoCon != null ? obclsEventos.obclsRelacionadoCon.getInCodigo() == 4 ? "selected" : "" : ""%>>Otros</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-12">
                                    <label name="lblInformacionDeLaDescripcion">Informacion De La Descripcion</label>
                                    <input type="text" 
                                           placeholder="Informacion De La Descripcion" 
                                           name="txtInformacionDeLaDescripcion" 
                                           class="form-control"
                                           value="<%= obclsEventos.getStInformacionDeLaDescripcion() != null
                                                   ? obclsEventos.getStInformacionDeLaDescripcion() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!--FILA-->        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-12" >
                                    <b>
                                        <i class="fa fa-clipboard"></i>
                                        Registro:<%= lstclsEventos.size()%>
                                    </b>
                                </div>
                            </div>
                            <!--FILA-->        
                            <div class="form-group">
                                <div class="form-row">
                                    <!--COLUMNA-->
                                    <div class="col-12" >
                                        <table class="table table-bordered table-responsive">
                                            <!--FILA-->
                                            <tr>
                                                <!--COLUMNAS-->   
                                                <td>Codigo</td>
                                                <td>Nuevo Evento</td>
                                                <td>Ubicacion</td>
                                                <td>Participantes</td>
                                                <td>Todo El Dia</td>
                                                <td>Fecha</td>
                                                <td>Relacionado Con</td>
                                                <td>Informacion De La Descripcion</td>
                                                <td>Opciones</td>
                                            </tr>
                                            <%
                                                for (Models.clsEventos item : lstclsEventos) {
                                                    Models.clsRelacionadoCon obclsRelacionadoCon = item.getObclsRelacionadoCon();
                                            %>
                                            <tr>
                                                <!--COLUMNA-->
                                                <td><%= item.getInCodigo()%></td>
                                                <td><%= item.getStNuevoEvento()%></td>
                                                <td><%= item.getStUbicacion()%></td>
                                                <td><%= item.getStParticipantes()%></td>
                                                <td><%= item.getChTodoElDia()%></td>
                                                <td><%= item.getStFecha()%></td>
                                                <td><%=obclsRelacionadoCon.getStDescripcion()%></td>
                                                <td><%= item.getStInformacionDeLaDescripcion()%></td>
                                                <td>
                                                    <a href="EventosController?stOpcion=M&codigoSeleccionado=<%= item.getInCodigo()%>"
                                                       class="btn-success btn-sm">Modificar</a>

                                                    <a href="EventosController?stOpcion=E&codigoSeleccionado=<%= item.getInCodigo()%>"
                                                       class="btn-danger btn-sm">Eliminar</a>   
                                                </td>
                                            </tr>
                                            <%
                                                }
                                            %>
                                        </table>

                                    </div>
                                </div>
                            </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
