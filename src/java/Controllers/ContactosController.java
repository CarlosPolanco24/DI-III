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
 * @author Carlos E Polanco P
 */
@WebServlet(name = "ContactosController", urlPatterns = {"/ContactosController"})
public class ContactosController extends HttpServlet {

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
            
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();
            
            HttpSession session = request.getSession(true);
     
            
            if (session.getAttribute("session_lstclsContactos") != null) {
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }

            int inPosicion = 0;
            for (Models.clsContactos item : lstclsContactos) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                    break;
                }
                inPosicion++;
            }
            
            if (request.getParameter("txtNombre") != null) {
                lstclsContactos.get(inPosicion).setStNombre(request.getParameter("txtNombre"));
            }

            if (request.getParameter("txtApellidos") != null) {
                lstclsContactos.get(inPosicion).setStApellidos(request.getParameter("txtApellidos"));
            }

            if (request.getParameter("txtNumeroDeCuenta") != null) {
                lstclsContactos.get(inPosicion).setStNumeroDeCuenta(request.getParameter("txtNumeroDeCuenta"));
            }

            if (request.getParameter("txtTitulo") != null) {
                lstclsContactos.get(inPosicion).setStTitulo(request.getParameter("txtTitulo"));
            }

            if (request.getParameter("txtCorreoElectronico") != null) {
                lstclsContactos.get(inPosicion).setStCorreoElectronico(request.getParameter("txtCorreoElectronico"));
            }

            if (request.getParameter("txtDepartamento") != null) {
                lstclsContactos.get(inPosicion).setStDepartamento(request.getParameter("txtDepartamento"));
            }

            if (request.getParameter("txtTelefono") != null) {
                lstclsContactos.get(inPosicion).setStTelefono(request.getParameter("txtTelefono"));
            }

            if (request.getParameter("txtTelefonoParticular") != null) {
                lstclsContactos.get(inPosicion).setStTelefonoParticular(request.getParameter("txtTelefonoParticular"));
            }

            if (request.getParameter("txtOtroTelefono") != null) {
                lstclsContactos.get(inPosicion).setStOtroTelefono(request.getParameter("txtOtroTelefono"));
            }

            if (request.getParameter("txtFax") != null) {
                lstclsContactos.get(inPosicion).setStFax(request.getParameter("txtFax"));
            }

            if (request.getParameter("txtMovil") != null) {
                lstclsContactos.get(inPosicion).setStMovil(request.getParameter("txtMovil"));
            }

            if (request.getParameter("txtFechaDeNacimiento") != null) {
                lstclsContactos.get(inPosicion).setStFechaDeNacimiento(request.getParameter("txtFechaDeNacimiento"));
            }

            if (request.getParameter("txtAsistente") != null) {
                lstclsContactos.get(inPosicion).setStAsistente(request.getParameter("txtAsistente"));
            }

            if (request.getParameter("txtNDeTelefonoDeAsistente") != null) {
                lstclsContactos.get(inPosicion).setStNºDeTelefonoDeAsistente(request.getParameter("txtNDeTelefonoDeAsistente"));
            }

            if (request.getParameter("txtRespondeA") != null) {
                lstclsContactos.get(inPosicion).setStResponderA(request.getParameter("txtRespondeA"));
            }

            if (request.getParameter("chkNoParticipacionCorreoElectronico") != null) {

                char chSeleccion = request.getParameter("chkNoParticipacionCorreoElectronico").equals("on")
                        ? 'S' : 'N';
                lstclsContactos.get(inPosicion).setChNoParticipacionCorreoElectronico(chSeleccion);
            } else {
                lstclsContactos.get(inPosicion).setChNoParticipacionCorreoElectronico('N');
            }

            if (request.getParameter("txtIDDeSkype") != null) {
                lstclsContactos.get(inPosicion).setStIDDeSkype(request.getParameter("txtIDDeSkype"));
            }

            if (request.getParameter("txtCorreoElectronicoSecundario") != null) {
                lstclsContactos.get(inPosicion).setStCorreoElectronicoSecundario(request.getParameter("txtCorreoElectronicoSecundario"));
            }
            
            session.setAttribute("session_lstclsContactos", lstclsContactos);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);
            
            
        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

        }
    }
    
    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            List<Models.clsContactos> lstclsContactosNueva = new ArrayList<Models.clsContactos>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsContactos obclsContactos = new Models.clsContactos();

            if (session.getAttribute("session_lstclsContactos") != null) {
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
                lstclsContactosNueva = lstclsContactos;
            }

            for (Models.clsContactos item : lstclsContactos) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsContactos = item;
                    lstclsContactosNueva.remove(item);
                    break;
                }
            }

            session.setAttribute("session_lstclsContactos", lstclsContactos);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se Realizo Proceso Con Exito");
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

        }

    }
    
    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsContactos obclsContactos = new Models.clsContactos();

            if (session.getAttribute("session_lstclsContactos") != null) {
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }

            for (Models.clsContactos item : lstclsContactos) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsContactos = item;
                }
            }

            request.setAttribute("obclsContactos", obclsContactos);
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

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
            Models.clsContactos obclsContactos = new Models.clsContactos();
            
            //ASIGNACION DE ATRIBUTOS O PROPIEDADES            
            if (request.getParameter("txtNombre") != null) {
                obclsContactos.setStNombre(request.getParameter("txtNombre"));
            }

            if (request.getParameter("txtApellidos") != null) {
                obclsContactos.setStApellidos(request.getParameter("txtApellidos"));
            }

            if (request.getParameter("txtNumeroDeCuenta") != null) {
                obclsContactos.setStNumeroDeCuenta(request.getParameter("txtNumeroDeCuenta"));
            }

            if (request.getParameter("txtTitulo") != null) {
                obclsContactos.setStTitulo(request.getParameter("txtTitulo"));
            }

            if (request.getParameter("txtCorreoElectronico") != null) {
                obclsContactos.setStCorreoElectronico(request.getParameter("txtCorreoElectronico"));
            }

            if (request.getParameter("txtDepartamento") != null) {
                obclsContactos.setStDepartamento(request.getParameter("txtDepartamento"));
            }

            if (request.getParameter("txtTelefono") != null) {
                obclsContactos.setStTelefono(request.getParameter("txtTelefono"));
            }

            if (request.getParameter("txtTelefonoParticular") != null) {
                obclsContactos.setStTelefonoParticular(request.getParameter("txtTelefonoParticular"));
            }

            if (request.getParameter("txtOtroTelefono") != null) {
                obclsContactos.setStOtroTelefono(request.getParameter("txtOtroTelefono"));
            }

            if (request.getParameter("txtFax") != null) {
                obclsContactos.setStFax(request.getParameter("txtFax"));
            }

            if (request.getParameter("txtMovil") != null) {
                obclsContactos.setStMovil(request.getParameter("txtMovil"));
            }

            if (request.getParameter("txtFechaDeNacimiento") != null) {
                obclsContactos.setStFechaDeNacimiento(request.getParameter("txtFechaDeNacimiento"));
            }

            if (request.getParameter("txtAsistente") != null) {
                obclsContactos.setStAsistente(request.getParameter("txtAsistente"));
            }

            if (request.getParameter("txtNDeTelefonoDeAsistente") != null) {
                obclsContactos.setStNºDeTelefonoDeAsistente(request.getParameter("txtNDeTelefonoDeAsistente"));
            }

            if (request.getParameter("txtRespondeA") != null) {
                obclsContactos.setStResponderA(request.getParameter("txtRespondeA"));
            }

            if (request.getParameter("chkNoParticipacionCorreoElectronico") != null) {

                char chSeleccion = request.getParameter("chkNoParticipacionCorreoElectronico").equals("on")
                        ? 'S' : 'N';
                obclsContactos.setChNoParticipacionCorreoElectronico(chSeleccion);
            } else {
                obclsContactos.setChNoParticipacionCorreoElectronico('N');
            }

            if (request.getParameter("txtIDDeSkype") != null) {
                obclsContactos.setStIDDeSkype(request.getParameter("txtIDDeSkype"));
            }

            if (request.getParameter("txtCorreoElectronicoSecundario") != null) {
                obclsContactos.setStCorreoElectronicoSecundario(request.getParameter("txtCorreoElectronicoSecundario"));
            }

            HttpSession session = request.getSession(true); //VARIABLE DE SESION

            //LISTA DE OBJETOS
            List<Models.clsContactos> lstclsContactos = new ArrayList<Models.clsContactos>();

            //VALIDAMOS PREVIA EXISTENCIA DE LA VARIABLE DE SESSION
            if (session.getAttribute("session_lstclsContactos") != null) {
                lstclsContactos = (List<Models.clsContactos>) session.getAttribute("session_lstclsContactos");
            }

            //PARA CALCULO AUTOMATICO DEL CODIGO QUE IDENTIFICA ESE REGISTRO
            int inCodigo = lstclsContactos.size() + 1;
            obclsContactos.setInCodigo(inCodigo);

            //AGREGAMOS EL OBJETO A LA LISTA
            lstclsContactos.add(obclsContactos);
            session.setAttribute("session_lstclsContactos", lstclsContactos);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

        } catch (Exception ex) {

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Contactos.jsp").forward(request, response);

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
