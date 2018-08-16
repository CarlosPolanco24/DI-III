<%-- 
    Document   : Trato
    Created on : 08-mar-2018, 14:37:55
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
        <title>Trato</title>
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

</head>
<body class="bg-white">
    <!-- Zona de SCRIPTLETS -->
    <!---OBTENER LISTA DE OBJETOS EN SESION-->
    <%
        Models.clsTrato obclsTrato = new Models.clsTrato();

        if (request.getAttribute("obclsTrato") != null) {
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

    <div class="container">
        <div class=" mx-auto mt-5">
            <div class="card-header">Crear Trato</div>
            <div class="card-body">
                <form action="TratoController" method="POST">
                    <!--Esto es una Fila-->
                    <div class="form-group">
                        <div class="form-row">
                            <!--Esto es una Columna-->
                            <div class="col-md-6">
                                <input type="submit" name="btnGuardar" value="Guardar" class="btn btn-primary"/>  
                                <input type="submit" name="btnModificar" value="Modificar" class="btn btn-primary"/>  
                                <input type="submit" name="btnCancelar" value="Cancelar" class="btn btn-primary"/> 
                                <a href="Index.jsp" class="btn btn-primary">Volver</a>
                                <input type="text" name="codigoModificar" value="<%= obclsTrato.getInCodigo() != 0 ? obclsTrato.getInCodigo() : ""%>" hidden=""/>
                            </div>                                                                
                        </div>                            
                    </div>
                    <!--Esto es una Fila-->
                    <div class="form-group">
                        <div class="form-row">
                            <h1>Informacion De Trato</h1>
                        </div>
                    </div>  
                    <!--Esto es una Fila-->
                    <div class="form-group">
                        <div class="form-row">
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblImporte">Importe</label>
                                <input type="text" 
                                       placeholder="Importe" 
                                       name="txtImporte" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStImporte() != null
                                               ? obclsTrato.getStImporte() : ""%>"/>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblNombreDeTrato">Nombre De Trato</label>
                                <input type="text" 
                                       placeholder="Nombre De Trato" 
                                       name="txtNombreDeTrato" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStNombreDeTrato() != null
                                               ? obclsTrato.getStNombreDeTrato() : ""%>"/>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblFechaDeCierre">Fecha De Cierre</label>
                                <input type="text" 
                                       placeholder="dd/mm/yyyy" 
                                       name="txtFechaDeCierre"
                                       class="form-control"
                                       value="<%= obclsTrato.getStFechaDeCierre() != null
                                               ? obclsTrato.getStFechaDeCierre() : ""%>"/>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblNombreDeCuenta">Nombre De Cuenta</label>
                                <input type="text" 
                                       placeholder="Nombre De Cuenta" 
                                       name="txtNombreDeCuenta" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStNombreDeCuenta() != null
                                               ? obclsTrato.getStNombreDeCuenta() : ""%>"/>
                            </div>
                        </div>
                    </div>
                    <!--Esto es una Fila-->
                    <div class="form-group">
                        <div class="form-row">
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblFase">Fase</label>
                                <i class="fa fa-search-minus"></i>
                                <select class="form-control" name="ddlFase">
                                    <option value="1" <%= obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 1 ? "selected" : "" : ""%>>-None-</option>
                                    <option value="2" <%= obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 2 ? "selected" : "" : ""%>>Clasificacion</option>
                                    <option value="3" <%= obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 3 ? "selected" : "" : ""%>>Necesita Analisis</option>
                                    <option value="4" <%= obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 4 ? "selected" : "" : ""%>>Propuesta De Valor</option>
                                    <option value="5" <%= obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 5 ? "selected" : "" : ""%>>Identificar Responsables</option>
                                    <option value="6" <%= obclsTrato.obclsFase != null ? obclsTrato.obclsFase.getInCodigo() == 6 ? "selected" : "" : ""%>>Cotizacion De Propuesta/Precio</option>
                                </select>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblTipo">Tipo</label>
                                <i class="fa fa-search-minus"></i>
                                <select class="form-control" name="ddlTipo">
                                    <option value="1" <%= obclsTrato.obclsTipo != null ? obclsTrato.obclsTipo.getInCodigo() == 1 ? "selected" : "" : ""%>>-None-</option>
                                    <option value="2" <%= obclsTrato.obclsTipo != null ? obclsTrato.obclsTipo.getInCodigo() == 2 ? "selected" : "" : ""%>>Negocios Existentes</option>
                                    <option value="3" <%= obclsTrato.obclsTipo != null ? obclsTrato.obclsTipo.getInCodigo() == 3 ? "selected" : "" : ""%>>Nuevo Negocio</option>
                                </select>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblProbabilidad">Probabilidad</label>
                                <input type="text" 
                                       placeholder="Probabilidad" 
                                       name="txtProbabilidad" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStProbabilidad() != null
                                               ? obclsTrato.getStProbabilidad() : ""%>"/>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblSiguientePaso">Siguiente Paso</label>
                                <input type="text" 
                                       placeholder="Siguiente Paso" 
                                       name="txtSiguientePaso" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStSiguientePaso() != null
                                               ? obclsTrato.getStSiguientePaso() : ""%>"/>
                            </div>
                        </div>
                    </div>
                    <!--Esto es una Fila-->
                    <div class="form-group">
                        <div class="form-row">
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblIngresosEsperados">Ingresos Esperados</label>
                                <input type="text" 
                                       placeholder="Ingresos Esperados" 
                                       name="txtIngresosEsperados" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStIngresosEsperados() != null
                                               ? obclsTrato.getStIngresosEsperados() : ""%>"/>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblFuenteDePosibleCliente">Fuente De Posible Cliente</label>
                                <i class="fa fa-search-minus"></i>
                                <select class="form-control" name="ddlFuenteDePosibleCliente">
                                    <option value="1" <%= obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 1 ? "selected" : "" : ""%>>-None-</option>
                                    <option value="2" <%= obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 2 ? "selected" : "" : ""%>>Aviso</option>
                                    <option value="3" <%= obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 3 ? "selected" : "" : ""%>>Llamada No Solicitada</option>
                                    <option value="4" <%= obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 4 ? "selected" : "" : ""%>>Recomendacion De Empleado</option>
                                    <option value="5" <%= obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 5 ? "selected" : "" : ""%>>Recomendacion Externa</option>
                                    <option value="6" <%= obclsTrato.obclsFuenteDePosibleCliente != null ? obclsTrato.obclsFuenteDePosibleCliente.getInCodigo() == 6 ? "selected" : "" : ""%>>Tienda En Linea</option>
                                </select>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblFuenteDeCampaña">Fuente De Campaña</label>
                                <input type="text" 
                                       placeholder="Fuente De Campaña" 
                                       name="txtFuenteDeCampana" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStFuenteDeCampaña() != null
                                               ? obclsTrato.getStFuenteDeCampaña() : ""%>"/>
                            </div>
                            <!--Esto es una Columna-->
                            <div class="col-md-3">
                                <label name="lblNombreDeContacto">Nombre De Contacto</label>
                                <input type="text" 
                                       placeholder="Nombre De Contacto" 
                                       name="txtNombreDeContacto" 
                                       class="form-control"
                                       value="<%= obclsTrato.getStNombreDeContacto() != null
                                               ? obclsTrato.getStNombreDeContacto() : ""%>"/>
                            </div>
                        </div>
                        <!--Esto es una Fila-->
                        <div class="form-group">
                            <div class="form-row">
                                <!--Esto es una Columna-->
                                <div class="col-md-12">
                                    <label name="lblDescripcion">Descripcion</label>
                                    <input type="text" 
                                           placeholder="Descripcion" 
                                           name="txtDescripcion" 
                                           class="form-control"
                                           value="<%= obclsTrato.getStDescripcion() != null
                                                   ? obclsTrato.getStDescripcion() : ""%>"/>
                                </div>
                            </div>
                        </div> 
                        <!--FILA-->        
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-12" >
                                    <b>
                                        <i class="fa fa-clipboard"></i>
                                        Registro:<%= lstclsTrato.size()%>
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
                                                <td>Importe</td>
                                                <td>Nombre De Trato</td>
                                                <td>Fecha De Cierre</td>
                                                <td>Nombre De Cuenta</td>
                                                <td>Fase</td>
                                                <td>Tipo</td>
                                                <td>Probabilidad</td>
                                                <td>Siguiente Paso</td>
                                                <td>Igresos Esperados</td>
                                                <td>Fuente de posible cliente</td>
                                                <td>Fuente de Campaña</td>                                                
                                                <td>Nombre De Contacto</td>
                                                <td>Descripcion</td>
                                                <td>Opciones</td>
                                            </tr>
                                            <%
                                                for (Models.clsTrato item : lstclsTrato) {
                                                    Models.clsFase obclsFase = item.getObclsFase();
                                                    Models.clsTipo obclsTipo = item.getObclsTipo();
                                                    Models.clsFuenteDePosibleCliente obclsFuenteDePosibleCliente = item.getObclsFuenteDePosibleCliente();
                                            %>
                                            <tr>
                                                <!--COLUMNA-->   
                                                <td><%= item.getStImporte()%></td>
                                                <td><%= item.getStNombreDeTrato()%></td>
                                                <td><%= item.getStFechaDeCierre()%></td>
                                                <td><%= item.getStNombreDeCuenta()%></td>
                                                <td><%=obclsFase.getStDescripcion()%> </td>
                                                <td><%=obclsTipo.getStDescripcion()%> </td>
                                                <td><%= item.getStProbabilidad()%></td>
                                                <td><%= item.getStSiguientePaso()%></td>
                                                <td><%= item.getStIngresosEsperados()%></td>
                                                <td><%=obclsFuenteDePosibleCliente.getStDescripcion()%> </td>
                                                <td><%= item.getStFuenteDeCampaña()%></td>
                                                <td><%= item.getStNombreDeContacto()%></td>
                                                <td><%= item.getStDescripcion()%> </td>

                                                <td>
                                                    <a href="TratoController?stOpcion=M&codigoSeleccionado=<%= item.getInCodigo()%>"
                                                       class="btn-success btn-sm">Modificar</a>

                                                    <a href="TratoController?stOpcion=E&codigoSeleccionado=<%= item.getInCodigo()%>"
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
        </div>
</body>
</html>
