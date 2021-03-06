<%-- 
    Document   : Posiblecliente
    Created on : 22/02/2018, 07:28:42 PM
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
        <title>Posibles Clientes</title>
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
    <body>
        <!-- Zona de SCRIPTLETS -->
        <!---OBTENER LISTA DE OBJETOS EN SESION-->
        <%
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

        %>
        <input type="text"  id="txtMensaje" hidden=""
               value="<%=request.getAttribute("stMensaje")%>"/>

        <input type="text" id="txtTipo" hidden=""
               value="<%=request.getAttribute("stTipo")%>"/>

        <script>
            var mensaje = document.getElementById("txtMensaje").value;
            var tipo = document.getElementById("txtTipo").value;

            swal("mensaje", "mensaje", "success");

        </script>


        <%
            }
        %>
        <div class="container">
            <div class=" mx-auto mt-5">
                <div class="card-header">Crear Posibles Clientes</div>
                <div class="card-body">
                    <form action="PosibleclienteController" method="POST">
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <input type="submit" name="btnGuardar" value="Guardar" class="btn btn-primary"/>  
                                    <input type="submit" name="btnModificar" value="Modificar" class="btn btn-primary"/>  
                                    <input type="submit" name="btnCancelar" value="Cancelar" class="btn btn-primary"/> 
                                    <a href="Index.jsp" class="btn btn-primary">Volver</a>
                                    <input type="text" name="codigoModificar" value="<%= obclsPosiblecliente.getInCodigo() != 0 ? obclsPosiblecliente.getInCodigo() : ""%>" hidden=""/>
                                </div>                                                               
                            </div>                            
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <h1>Informacion de Posible Cliente</h1>
                            </div>
                        </div>  
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblEmpresa">Empresa</label>
                                    <input type="text" 
                                           placeholder="Empresa" 
                                           name="txtEmpresa" 
                                           class="form-control" required=""
                                           value="<%= obclsPosiblecliente.getStEmpresa() != null
                                                   ? obclsPosiblecliente.getStEmpresa() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblNombre">Nombre</label>
                                    <input type="text" 
                                           placeholder="Nombre" 
                                           name="txtNombre" 
                                           class="form-control" 
                                           required=""
                                           value="<%= obclsPosiblecliente.getStNombre() != null
                                                   ? obclsPosiblecliente.getStNombre() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblApellidos">Apellidos</label>
                                    <input type="text" 
                                           placeholder="Apellidos" 
                                           name="txtApellidos" 
                                           class="form-control" 
                                           required=""
                                           value="<%= obclsPosiblecliente.getStApellidos() != null
                                                   ? obclsPosiblecliente.getStApellidos() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblTitulo">Titulo</label>
                                    <input type="text" 
                                           placeholder="Titulo" 
                                           name="txtTitulo" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStTitulo() != null
                                                   ? obclsPosiblecliente.getStTitulo() : ""%>"/>
                                </div>
                            </div>
                        </div>  
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblCorreoElectronico">Correo Electronico</label>
                                    <input type="text" 
                                           placeholder="Correo Electronico" 
                                           name="txtCorreoElectronico" 
                                           class="form-control" 
                                           required=""
                                           value="<%= obclsPosiblecliente.getStCorreoElectronico() != null
                                                   ? obclsPosiblecliente.getStCorreoElectronico() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblTelefono">Telefono</label>
                                    <input type="text" 
                                           placeholder="Telefono"
                                           name="txtTelefono" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStTelefono() != null
                                                   ? obclsPosiblecliente.getStTelefono() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblFax">Fax</label>
                                    <input type="text" 
                                           placeholder="Fax" 
                                           name="txtFax" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStFax() != null
                                                   ? obclsPosiblecliente.getStFax() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblMovil">Movil</label>
                                    <input type="text" 
                                           placeholder="Movil" 
                                           name="txtMovil" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStMovil() != null
                                                   ? obclsPosiblecliente.getStMovil() : ""%>"/>
                                </div>
                            </div>
                        </div>               
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblSitioWeb">Sitio Web</label>
                                    <input type="text" 
                                           placeholder="Sitio Web" 
                                           name="txtSitioWeb" 
                                           class="form-control" 
                                           value="<%= obclsPosiblecliente.getStSitioWeb() != null
                                                   ? obclsPosiblecliente.getStSitioWeb() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblFuenteDePosibleCliente">Fuente De Posible Cliente</label>
                                    <i class="fa fa-search-minus"></i>
                                    <select class="form-control" name="ddlFuenteDePosibleCliente">
                                        <option value="1" <%= obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                        <option value="2" <%= obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 2 ? "selected" : "" : ""%>>Aviso</option>
                                        <option value="3" <%= obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 3 ? "selected" : "" : ""%>>Llamada No Solicitada</option>
                                        <option value="4" <%= obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 4 ? "selected" : "" : ""%>>Recomendacion De Empleado</option>
                                        <option value="5" <%= obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 5 ? "selected" : "" : ""%>>Recomendacion Externa</option>
                                        <option value="6" <%= obclsPosiblecliente.obclsFuenteDePosibleCliente != null ? obclsPosiblecliente.obclsFuenteDePosibleCliente.getInCodigo() == 6 ? "selected" : "" : ""%>>Tienda En Linea</option>
                                    </select>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblEstadoDePosibleCliente">Estado De Posible Cliente</label>
                                    <i class="fa fa-search-minus"></i>
                                    <select class="form-control" name="ddlEstadoDePosibleCliente">
                                        <option value="1" <%= obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                        <option value="2" <%= obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 2 ? "selected" : "" : ""%>>Intento De Contacto</option>
                                        <option value="3" <%= obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 3 ? "selected" : "" : ""%>>Contactar En El Futuro</option>
                                        <option value="4" <%= obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 4 ? "selected" : "" : ""%>>Contactado</option>
                                        <option value="5" <%= obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 5 ? "selected" : "" : ""%>>Posible Cliente No Solicitado</option>
                                        <option value="6" <%= obclsPosiblecliente.obclsEstadoDePosibleCliente != null ? obclsPosiblecliente.obclsEstadoDePosibleCliente.getInCodigo() == 6 ? "selected" : "" : ""%>>Posible Cliente Perdido</option>
                                    </select>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblSector">Sector</label>
                                    <i class="fa fa-search-minus"></i>
                                    <select class="form-control" name="ddlSector">
                                        <option value="1" <%= obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                        <option value="2" <%= obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 2 ? "selected" : "" : ""%>>ASP (Proveedor De Servicios De Aplicacion)</option>
                                        <option value="3" <%= obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 3 ? "selected" : "" : ""%>>OEM De Datos</option>
                                        <option value="4" <%= obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 4 ? "selected" : "" : ""%>>ERP (Planificacion De Recursos De Empresa)</option>
                                        <option value="5" <%= obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 5 ? "selected" : "" : ""%>>Gobierno/Ejercito</option>
                                        <option value="6" <%= obclsPosiblecliente.obclsSector != null ? obclsPosiblecliente.obclsSector.getInCodigo() == 6 ? "selected" : "" : ""%>>Empresa Grande</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblCantidadDeEmpleados">Cantidad De Empleados</label>
                                    <input type="text" 
                                           placeholder="Cantidad De Empleados" 
                                           name="txtCantidadDeEmpleados" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getInCantidadDeEmpleados() != 0
                                                   ? obclsPosiblecliente.getInCantidadDeEmpleados() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblIngresosAnuales">Ingresos Anuales</label>
                                    <input type="text" 
                                           placeholder="Ingresos Anuales" 
                                           name="txtIngresosAnuales" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getDbIngresosAnuales() != 0
                                                   ? obclsPosiblecliente.getDbIngresosAnuales() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblCalificacion">Calificacion</label>
                                    <i class="fa fa-search-minus"></i>
                                    <select class="form-control" name="ddlCalificacion">
                                        <option value="1" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 1 ? "selected" : "" : ""%>>Ninguno</option>
                                        <option value="2" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 2 ? "selected" : "" : ""%>>Adquirido</option>
                                        <option value="3" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 3 ? "selected" : "" : ""%>>Activo</option>
                                        <option value="4" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 4 ? "selected" : "" : ""%>>Contactado</option>
                                        <option value="5" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 5 ? "selected" : "" : ""%>>Fallo De Mercado</option>
                                        <option value="6" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 6 ? "selected" : "" : ""%>>Proyecto Cancelado</option>
                                        <option value="7" <%= obclsPosiblecliente.obclsCalificacion != null ? obclsPosiblecliente.obclsCalificacion.getInCodigo() == 7 ? "selected" : "" : ""%>>Apagar</option>
                                    </select>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblNoParticipacionCorreoElectronico">
                                        <input type="checkbox" 
                                               name="chkNoParticipacionCorreoElectronico"
                                               <%= obclsPosiblecliente.getChNoParticipacionCorreoElectronico() == 'S' ? "ckecked" : ""%> />
                                        No Participacion Correo Electronico
                                    </label>
                                </div>
                            </div>
                        </div>  
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblIDDeSkype">ID De Skype</label>
                                    <input type="text" 
                                           placeholder="ID De Skype" 
                                           name="txtIDDeSkype" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStIDDeSkype() != null
                                                   ? obclsPosiblecliente.getStIDDeSkype() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-3">
                                    <label name="lblTwitter">Twitter</label>
                                    <input type="text" 
                                           placeholder="Twitter" 
                                           name="txtTwitter" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStTwitter() != null
                                                   ? obclsPosiblecliente.getStTwitter() : ""%>"/>
                                </div>
                                <!--Esto es una Columna-->
                                <div class="col-md-6">
                                    <label name="lblCorreoElectronicoSecundario">Correo Electronico Secundario</label>
                                    <input type="text" 
                                           placeholder="Correo Electronico Secundario" 
                                           name="txtCorreoElectronicoSecundario" 
                                           class="form-control"
                                           value="<%= obclsPosiblecliente.getStCorreoElectronicoSecundario() != null
                                                   ? obclsPosiblecliente.getStCorreoElectronicoSecundario() : ""%>"/>
                                </div>
                            </div>
                        </div>
                        <!--FILA-->        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-12" >
                                    <b>
                                        <i class="fa fa-clipboard"></i>
                                        Registro:<%= lstclsPosiblecliente.size()%>
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
                                                <td>Empresa</td>
                                                <td>Nombre</td>
                                                <td>Apellido</td>
                                                <td>Titulo</td>
                                                <td>Correo Electronico</td>
                                                <td> Telefono</td>
                                                <td>Fax</td>
                                                <td>Movil</td>
                                                <td>Sitio Web</td>
                                                <td>Fuente de posible cliente</td>
                                                <td>Estado de posible cliente</td>
                                                <td>Sector</td>
                                                <td>Cantidad de empleados</td>
                                                <td>Ingresos anuales</td>
                                                <td>Calificacion</td>
                                                <td>No participacion correo Electronico</td>
                                                <td>ID de Skipe</td>
                                                <td>Twiter</td>
                                                <td>Correo Electronico Secundario</td>
                                                <td>Opciones</td>
                                            </tr>
                                            <%
                                                for (Models.clsPosiblecliente item : lstclsPosiblecliente) {
                                                    Models.clsFuenteDePosibleCliente obclsFuenteDePosibleCliente = item.getObclsFuenteDePosibleCliente();
                                                    Models.clsEstadoDePosibleCliente obclsEstadoDePosibleCliente = item.getObclsEstadoDePosibleCliente();
                                                    Models.clsSector obclsSector = item.getObclsSector();
                                                    Models.clsCalificacion obclsCalificacion = item.getObclsClasificacion();

                                            %>
                                            <tr>
                                                <!--COLUMNA-->   
                                                <td><%= item.getStEmpresa()%></td>
                                                <td><%= item.getStNombre()%></td>
                                                <td><%= item.getStApellidos()%></td>
                                                <td><%= item.getStTitulo()%></td>
                                                <td><%= item.getStCorreoElectronico()%></td>
                                                <td><%= item.getStTelefono()%></td>
                                                <td><%= item.getStFax()%></td>
                                                <td><%= item.getStMovil()%></td>
                                                <td><%= item.getStSitioWeb()%> </td>
                                                <td><%=obclsFuenteDePosibleCliente.getStDescripcion()%>  </td>
                                                <td><%=obclsEstadoDePosibleCliente.getStDescripcion()%></td>
                                                <td><%=obclsSector.getStDescripcion()%> </td>
                                                <td><%= item.getInCantidadDeEmpleados()%> </td>
                                                <td><%= item.getDbIngresosAnuales()%></td>
                                                <td><%=obclsCalificacion.getStDescripcion()%></td>
                                                <td><%= item.getChNoParticipacionCorreoElectronico()%> </td>
                                                <td><%= item.getStIDDeSkype()%></td>
                                                <td><%= item.getStTwitter()%> </td>
                                                <td><%= item.getStCorreoElectronicoSecundario()%> </td>
                                                <td>
                                                    <a href="PosibleclienteController?stOpcion=M&codigoSeleccionado=<%= item.getInCodigo()%>"
                                                       class="btn-success btn-sm">Modificar</a>

                                                    <a href="PosibleclienteController?stOpcion=E&codigoSeleccionado=<%= item.getInCodigo()%>"
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
