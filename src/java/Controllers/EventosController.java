/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.clsEventos;
import Models.clsRelacionadoCon;
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
 * @author Carlos E Polanco P
 */
@WebServlet(name = "EventosController", urlPatterns = {"/EventosController"})
public class EventosController extends HttpServlet {

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
            
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();
            
            HttpSession session = request.getSession(true);
     
            
            if (session.getAttribute("session_lstclsEventos") != null) {
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
            }

            int inPosicion = 0;
            for (Models.clsEventos item : lstclsEventos) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                    break;
                }
                inPosicion++;
            }
            
            if (request.getParameter("txtNuevoEvento") != null) {
                lstclsEventos.get(inPosicion).setStNuevoEvento(request.getParameter("txtNuevoEvento"));
            }
            if (request.getParameter("txtUbicacion") != null) {
                lstclsEventos.get(inPosicion).setStUbicacion(request.getParameter("txtUbicacion"));
            }
            if (request.getParameter("txtParticipantes") != null) {
                lstclsEventos.get(inPosicion).setStParticipantes(request.getParameter("txtParticipantes"));
            }
            if (request.getParameter("chkTodoElDia") != null) {

                char chTodoElDia = request.getParameter("chkTodoElDia").equals("on")
                        ? 'S' : 'N';
                lstclsEventos.get(inPosicion).setChTodoElDia(chTodoElDia);
            }
            if (request.getParameter("txtFecha") != null) {
                lstclsEventos.get(inPosicion).setStFecha(request.getParameter("txtFecha"));
            }
            if (request.getParameter("ddlRelacionadoCon") != null) {

                //MODELO HIJO
                obclsRelacionadoCon.setInCodigo(Integer.parseInt(request.getParameter("ddlRelacionadoCon")));

                String stDescripcion = "";

                if (request.getParameter("ddlRelacionadoCon").equals("1")) {
                    stDescripcion = "-None-";
                } else if (request.getParameter("ddlRelacionadoCon").equals("2")) {
                    stDescripcion = "Posible Cliente";

                } else if (request.getParameter("ddlRelacionadoCon").equals("3")) {
                    stDescripcion = "Contactos";

                } else if (request.getParameter("ddlRelacionadoCon").equals("4")) {
                    stDescripcion = "Otros";

                }

                obclsRelacionadoCon.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                lstclsEventos.get(inPosicion).setObclsRelacionadoCon(obclsRelacionadoCon);
            }
            if (request.getParameter("txtInformacionDeLaDescripcion") != null) {
                lstclsEventos.get(inPosicion).setStInformacionDeLaDescripcion(request.getParameter("txtInformacionDeLaDescripcion"));
            }
            
            session.setAttribute("session_lstclsEventos", lstclsEventos);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        }

    }

    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            List<Models.clsEventos> lstclsEventosNueva = new ArrayList<Models.clsEventos>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsEventos obclsEventos = new Models.clsEventos();

            if (session.getAttribute("session_lstclsEventos") != null) {
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
                lstclsEventosNueva = lstclsEventos;
            }

            for (Models.clsEventos item : lstclsEventos) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsEventos = item;
                    lstclsEventosNueva.remove(item);
                    break;
                }
            }

            session.setAttribute("session_lstclsEventos", lstclsEventos);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se Realizo Proceso Con Exito");
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        }

    }

    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsEventos obclsEventos = new Models.clsEventos();

            if (session.getAttribute("session_lstclsEventos") != null) {
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
            }

            for (Models.clsEventos item : lstclsEventos) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsEventos = item;
                }
            }

            request.setAttribute("obclsEventos", obclsEventos);
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        }
    }

    //Metodos: PUBLIC---> lo puedo llamar de cualquier lado, PRIVATED --> Tipo de acceso
    //String-BOOL-INT-DOUBLE-CHAR-ETC----> Tipo de dato que retorna
    //Nota Existe un tipo de dato void (Vacio)---> NO RETORNA INFORMACIÓN
    //Nombre del metodo: DESCRIBE LA ACCION E INCIA EN MINUSCULA "enviar info"
    //PARAMETROS QUE RECIBE EL METODO: 
    public void btnGuardar(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        try {

            //DEFINICION DE MODELOS
            Models.clsEventos obclsEventos = new Models.clsEventos();
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();

            //ASIGNACION DE ATRIBUTOS O PROPIEDADES
            if (request.getParameter("txtNuevoEvento") != null) {
                obclsEventos.setStNuevoEvento(request.getParameter("txtNuevoEvento"));
            }
            if (request.getParameter("txtUbicacion") != null) {
                obclsEventos.setStUbicacion(request.getParameter("txtUbicacion"));
            }
            if (request.getParameter("txtParticipantes") != null) {
                obclsEventos.setStParticipantes(request.getParameter("txtParticipantes"));
            }
            if (request.getParameter("chkTodoElDia") != null) {

                char chTodoElDia = request.getParameter("chkTodoElDia").equals("on")
                        ? 'S' : 'N';
                obclsEventos.setChTodoElDia(chTodoElDia);
            }
            if (request.getParameter("txtFecha") != null) {
                obclsEventos.setStFecha(request.getParameter("txtFecha"));
            }
            if (request.getParameter("ddlRelacionadoCon") != null) {

                //MODELO HIJO
                obclsRelacionadoCon.setInCodigo(Integer.parseInt(request.getParameter("ddlRelacionadoCon")));

                String stDescripcion = "";

                if (request.getParameter("ddlRelacionadoCon").equals("1")) {
                    stDescripcion = "-None-";
                } else if (request.getParameter("ddlRelacionadoCon").equals("2")) {
                    stDescripcion = "Posible Cliente";

                } else if (request.getParameter("ddlRelacionadoCon").equals("3")) {
                    stDescripcion = "Contactos";

                } else if (request.getParameter("ddlRelacionadoCon").equals("4")) {
                    stDescripcion = "Otros";

                }

                obclsRelacionadoCon.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                obclsEventos.setObclsRelacionadoCon(obclsRelacionadoCon);
            }
            if (request.getParameter("txtInformacionDeLaDescripcion") != null) {
                obclsEventos.setStInformacionDeLaDescripcion(request.getParameter("txtInformacionDeLaDescripcion"));
            }

            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsEventos> lstclsEventos = new ArrayList<Models.clsEventos>();

            //VALIDAMOS PREVIA EXISTENCIA DE LA VARIABLE DE SESSION
            if (session.getAttribute("session_lstclsEventos") != null) {
                lstclsEventos = (List<Models.clsEventos>) session.getAttribute("session_lstclsEventos");
            }

            //PARA CALCULO AUTOMATICO DEL CODIGO QUE IDENTIFICA ESE REGISTRO
            int inCodigo = lstclsEventos.size() + 1;
            obclsEventos.setInCodigo(inCodigo);

            //AGREGAMOS EL OBJETO A LA LISTA
            lstclsEventos.add(obclsEventos);
            session.setAttribute("session_lstclsEventos", lstclsEventos);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

        } catch (Exception ex) {

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Eventos.jsp").forward(request, response);

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
