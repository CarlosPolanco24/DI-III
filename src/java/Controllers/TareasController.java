/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Carlos Enrique P P
 */
@WebServlet(name = "TareasController", urlPatterns = {"/TareasController"})
public class TareasController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //VALIDAMOS QUE SE HALLA PRESIONADO EL BOTON DE GUARDAR
        if (request.getParameter("btnGuardar") != null) {
            btnGuardar(request, response);

        } else if (request.getParameter("btnModificar") != null) {
            btnModificar(request, response);

        } else if (request.getParameter("btnCancelar") != null) {

        } else if (request.getParameter("stOpcion") != null) {
            if (request.getParameter("stOpcion").equals("M")) {
                cargarModificar(request, response);
            } else if (request.getParameter("stOpcion").equals("E")) {
                btnEliminar(request, response);
            }
        }
    }

    public void btnModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();
            Models.clsEstado obclsEstado = new Models.clsEstado();
            Models.clsPrioridad obclsPrioridad = new Models.clsPrioridad();
            
            HttpSession session = request.getSession(true);
     
            
            if (session.getAttribute("session_lstclsTareas") != null) {
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }

            int inPosicion = 0;
            for (Models.clsTareas item : lstclsTareas) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                    break;
                }
                inPosicion++;
            }
            
            if (request.getParameter("txtTitularDeLaTarea") != null) {
                lstclsTareas.get(inPosicion).setStTitularDeLaTarea(request.getParameter("txtTitularDeLaTarea"));

            } else {
                throw new Exception("Ingrese el titular de la tarea"); //Exeption no controlada
            }
            if (request.getParameter("txtAsunto") != null) {
                lstclsTareas.get(inPosicion).setStAsunto(request.getParameter("txtAsunto"));//Asignacion de propiedades

            }

            if (request.getParameter("txtFechaDeVencimiento") != null) {
                lstclsTareas.get(inPosicion).setStFechaDeVencimiento(request.getParameter("txtFechaDeVencimiento"));//Asignacion de propiedades

            }
            if (request.getParameter("txtContacto") != null) {
                lstclsTareas.get(inPosicion).setStContacto(request.getParameter("txtContacto"));//Asignacion de propiedades

            }
            if (request.getParameter("txtContacto") != null) {
                lstclsTareas.get(inPosicion).setStContacto(request.getParameter("txtContacto"));//Asignacion de propiedades

            }
            if (request.getParameter("txtCuenta") != null) {
                lstclsTareas.get(inPosicion).setStCuenta(request.getParameter("txtCuenta"));//Asignacion de propiedades

            }
            if (request.getParameter("ddlEstado") != null) {

                //MODELO HIJO
                obclsEstado.setInCodigo(Integer.parseInt(request.getParameter("ddlEstado")));

                String stDescripcion = "";

                if (request.getParameter("ddlEstado").equals("1")) {
                    stDescripcion = "-None-";
                } else if (request.getParameter("ddlEstado").equals("2")) {
                    stDescripcion = "No Iniciado";

                } else if (request.getParameter("ddlEstado").equals("3")) {
                    stDescripcion = "Aplazado";

                } else if (request.getParameter("ddlEstado").equals("4")) {
                    stDescripcion = "En Curso";

                } else if (request.getParameter("ddlEstado").equals("5")) {
                    stDescripcion = "Completado";

                } else if (request.getParameter("ddlEstado").equals("6")) {
                    stDescripcion = "En Espera de Entrada";
                }

                obclsEstado.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                lstclsTareas.get(inPosicion).setObclsEstado(obclsEstado);
            }
            if (request.getParameter("ddlPrioridad") != null) {

                //MODELO HIJO
                obclsPrioridad.setInCodigo(Integer.parseInt(request.getParameter("ddlPrioridad")));

                String stDescripcion = "";

                if (request.getParameter("ddlPrioridad").equals("1")) {
                    stDescripcion = "-None-";
                } else if (request.getParameter("ddlPrioridad").equals("2")) {
                    stDescripcion = "Alto";

                } else if (request.getParameter("ddlPrioridad").equals("3")) {
                    stDescripcion = "Mas Alto";

                } else if (request.getParameter("ddlPrioridad").equals("4")) {
                    stDescripcion = "Bajo";

                } else if (request.getParameter("ddlPrioridad").equals("5")) {
                    stDescripcion = "Mas Bajo";

                } else if (request.getParameter("ddlPrioridad").equals("6")) {
                    stDescripcion = "Normal";
                }

                obclsPrioridad.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                lstclsTareas.get(inPosicion).setObclsPrioridad(obclsPrioridad);
            }
            if (request.getParameter("chkEnviarMensajedeCorreoElectronicoDeNotificacion") != null) {
                char chEnviarMensajedeCorreoElectronicoDeNotificacion = request.getParameter("chkEnviarMensajedeCorreoElectronicoDeNotificacion").equals("on")
                        ? 'S' //Si Se Cumple
                        : 'N'; // Si No Se Cumple
                lstclsTareas.get(inPosicion).setChEnviarMensajedeCorreoElectronicoDeNotificacion(chEnviarMensajedeCorreoElectronicoDeNotificacion);
            }
            if (request.getParameter("chkRepetir") != null) {
                char chRepetir = request.getParameter("chkRepetir").equals("on")
                        ? 'S' //Si Se Cumple
                        : 'N'; // Si No Se Cumple
                lstclsTareas.get(inPosicion).setChRepetir(chRepetir);
            }

            if (request.getParameter("txtInformacionDeLaDescripcion") != null) {
                lstclsTareas.get(inPosicion).setStInformacionDeLaDescripcion(request.getParameter("txtInformacionDeLaDescripcion"));
            }
            
            session.setAttribute("session_lstclsTareas", lstclsTareas);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        }
    }

    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();

            List<Models.clsTareas> lstclsTareasNueva = new ArrayList<Models.clsTareas>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsTareas obclsTareas = new Models.clsTareas();

            if (session.getAttribute("session_lstclsTareas") != null) {
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
                lstclsTareasNueva = lstclsTareas;
            }

            for (Models.clsTareas item : lstclsTareas) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsTareas = item;
                    lstclsTareasNueva.remove(item);
                    break;
                }
            }

            session.setAttribute("session_lstclsTareas", lstclsTareas);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se Realizo Proceso Con Exito");
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        }

    }

    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsTareas obclsTareas = new Models.clsTareas();

            if (session.getAttribute("session_lstclsTareas") != null) {
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }

            for (Models.clsTareas item : lstclsTareas) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsTareas = item;
                }
            }

            request.setAttribute("obclsTareas", obclsTareas);
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        }
    }

//Metodos: PUBLIC---> lo puedo llamar de cualquier lado, PRIVATED --> Tipo de acceso
// String-BOOL-INT-DOUBLE-CHAR-ETC----> Tipo de dato que retorna
//Nota Existe un tipo de dato void (Vacio)---> NO RETORNA INFORMACIÓN
//Nombre del metodo: DESCRIBE LA ACCION E INCIA EN MINUSCULA "enviar info"
//PARAMETROS QUE RECIBE EL METODO: 
    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        try {
            //Definir objetos que vamos a usar
            //OBJETOS-- MODELOS
            //INSTACIA DE OBJETOS
            Models.clsTareas obclsTareas = new Models.clsTareas();
            Models.clsEstado obclsEstado = new Models.clsEstado();
            Models.clsPrioridad obclsPrioridad = new Models.clsPrioridad();

            if (request.getParameter("txtTitularDeLaTarea") != null) {
                obclsTareas.setStTitularDeLaTarea(request.getParameter("txtTitularDeLaTarea"));

            } else {
                throw new Exception("Ingrese el titular de la tarea"); //Exeption no controlada
            }
            if (request.getParameter("txtAsunto") != null) {
                obclsTareas.setStAsunto(request.getParameter("txtAsunto"));//Asignacion de propiedades

            }

            if (request.getParameter("txtFechaDeVencimiento") != null) {
                obclsTareas.setStFechaDeVencimiento(request.getParameter("txtFechaDeVencimiento"));//Asignacion de propiedades

            }
            if (request.getParameter("txtContacto") != null) {
                obclsTareas.setStContacto(request.getParameter("txtContacto"));//Asignacion de propiedades

            }
            if (request.getParameter("txtContacto") != null) {
                obclsTareas.setStContacto(request.getParameter("txtContacto"));//Asignacion de propiedades

            }
            if (request.getParameter("txtCuenta") != null) {
                obclsTareas.setStCuenta(request.getParameter("txtCuenta"));//Asignacion de propiedades

            }
            if (request.getParameter("ddlEstado") != null) {

                //MODELO HIJO
                obclsEstado.setInCodigo(Integer.parseInt(request.getParameter("ddlEstado")));

                String stDescripcion = "";

                if (request.getParameter("ddlEstado").equals("1")) {
                    stDescripcion = "-None-";
                } else if (request.getParameter("ddlEstado").equals("2")) {
                    stDescripcion = "No Iniciado";

                } else if (request.getParameter("ddlEstado").equals("3")) {
                    stDescripcion = "Aplazado";

                } else if (request.getParameter("ddlEstado").equals("4")) {
                    stDescripcion = "En Curso";

                } else if (request.getParameter("ddlEstado").equals("5")) {
                    stDescripcion = "Completado";

                } else if (request.getParameter("ddlEstado").equals("6")) {
                    stDescripcion = "En Espera de Entrada";
                }

                obclsEstado.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                obclsTareas.setObclsEstado(obclsEstado);
            }
            if (request.getParameter("ddlPrioridad") != null) {

                //MODELO HIJO
                obclsPrioridad.setInCodigo(Integer.parseInt(request.getParameter("ddlPrioridad")));

                String stDescripcion = "";

                if (request.getParameter("ddlPrioridad").equals("1")) {
                    stDescripcion = "-None-";
                } else if (request.getParameter("ddlPrioridad").equals("2")) {
                    stDescripcion = "Alto";

                } else if (request.getParameter("ddlPrioridad").equals("3")) {
                    stDescripcion = "Mas Alto";

                } else if (request.getParameter("ddlPrioridad").equals("4")) {
                    stDescripcion = "Bajo";

                } else if (request.getParameter("ddlPrioridad").equals("5")) {
                    stDescripcion = "Mas Bajo";

                } else if (request.getParameter("ddlPrioridad").equals("6")) {
                    stDescripcion = "Normal";
                }

                obclsPrioridad.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                obclsTareas.setObclsPrioridad(obclsPrioridad);
            }
            if (request.getParameter("chkEnviarMensajedeCorreoElectronicoDeNotificacion") != null) {
                char chEnviarMensajedeCorreoElectronicoDeNotificacion = request.getParameter("chkEnviarMensajedeCorreoElectronicoDeNotificacion").equals("on")
                        ? 'S' //Si Se Cumple
                        : 'N'; // Si No Se Cumple
                obclsTareas.setChEnviarMensajedeCorreoElectronicoDeNotificacion(chEnviarMensajedeCorreoElectronicoDeNotificacion);
            }
            if (request.getParameter("chkRepetir") != null) {
                char chRepetir = request.getParameter("chkRepetir").equals("on")
                        ? 'S' //Si Se Cumple
                        : 'N'; // Si No Se Cumple
                obclsTareas.setChRepetir(chRepetir);
            }

            if (request.getParameter("txtInformacionDeLaDescripcion") != null) {
                obclsTareas.setStInformacionDeLaDescripcion(request.getParameter("txtInformacionDeLaDescripcion"));
            }

            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsTareas> lstclsTareas = new ArrayList<Models.clsTareas>();

            //VALIDAMOS PREVIA EXISTENCIA DE LA VARIABLE DE SESSION
            if (session.getAttribute("session_lstclsTareas") != null) {
                lstclsTareas = (List<Models.clsTareas>) session.getAttribute("session_lstclsTareas");
            }

            //PARA CALCULO AUTOMATICO DEL CODIGO QUE IDENTIFICA ESE REGISTRO
            int inCodigo = lstclsTareas.size() + 1;
            obclsTareas.setInCodigo(inCodigo);

            //AGREGAMOS EL OBJETO A LA LISTA
            lstclsTareas.add(obclsTareas);
            session.setAttribute("session_lstclsTareas", lstclsTareas);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);

        } catch (Exception ex) {

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Tareas.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
