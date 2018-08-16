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
 * @author Juan Jose
 */
@WebServlet(name = "LlamadasController", urlPatterns = {"/LlamadasController"})
public class LlamadasController extends HttpServlet {

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
            
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();
            Models.clsPropositoDeLaLlamada obclsPropositoDeLaLlamada = new Models.clsPropositoDeLaLlamada();
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();
            Models.clsTipo obclsTipo = new Models.clsTipo();
            
            HttpSession session = request.getSession(true);
     
            
            if (session.getAttribute("session_lstclsLlamadas") != null) {
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }

            int inPosicion = 0;
            for (Models.clsLlamadas item : lstclsLlamadas) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoModificar"))) {
                    break;
                }
                inPosicion++;
            }
            
             if (request.getParameter("txtNombreDeContacto") != null) {
                lstclsLlamadas.get(inPosicion).setStNombreDeContacto(request.getParameter("txtNombreDeContacto"));

            } else {
                throw new Exception("Ingrese el nuevo evento"); //Exeption no controlada
            }
            if (request.getParameter("txtAsunto") != null) {
                lstclsLlamadas.get(inPosicion).setStAsunto(request.getParameter("txtAsunto"));//Asignacion de propiedades
            }

            if (request.getParameter("ddlPropositoDeLaLlamada") != null) {

                //MODELO HIJO
                obclsPropositoDeLaLlamada.setInCodigo(Integer.parseInt(request.getParameter("ddlPropositoDeLaLlamada")));

                String stDescripcion = "";

                if (request.getParameter("ddlPropositoDeLaLlamada").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("2")) {
                    stDescripcion = "Posible";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("3")) {
                    stDescripcion = "Administrativo";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("4")) {
                    stDescripcion = "Negociacion";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("5")) {
                    stDescripcion = "Demostracion";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("6")) {
                    stDescripcion = "Proyecto";
                }

                obclsPropositoDeLaLlamada.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                lstclsLlamadas.get(inPosicion).setObclsPropositoDeLaLlamada(obclsPropositoDeLaLlamada);
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
                    stDescripcion = "Contacto";

                } else if (request.getParameter("ddlRelacionadoCon").equals("4")) {
                    stDescripcion = "Otros";

                }

                obclsRelacionadoCon.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                lstclsLlamadas.get(inPosicion).setObclsRelacionadoCon(obclsRelacionadoCon);
            }

            if (request.getParameter("txtTipoDeLlamada") != null) {
                lstclsLlamadas.get(inPosicion).setStTipoDeLlamada(request.getParameter("txtTipoDeLlamada"));//Asignacion de propiedades

            }

            if (request.getParameter("radLlamada") != null) {
                obclsTipo.setInCodigo(Integer.parseInt(request.getParameter("radLlamada")));
                String stDescripcion = "";

                if (request.getParameter("radLlamada").equals("1")) {
                    stDescripcion = "Llamada Actual";
                } else if (request.getParameter("radLlamada").equals("2")) {
                    stDescripcion = "Llamada Completada";

                } else if (request.getParameter("radLlamada").equals("3")) {
                    stDescripcion = "Programar Llamada";

                }

                obclsTipo.setStDescripcion(stDescripcion);
                lstclsLlamadas.get(inPosicion).setObclsTipo(obclsTipo);
            }

            if (request.getParameter("txtDescripcion") != null) {
                lstclsLlamadas.get(inPosicion).setStDescripcion(request.getParameter("txtDescripcion"));//Asignacion de propiedades

            }

            if (request.getParameter("txtResultadoDeLaLlamada") != null) {
                lstclsLlamadas.get(inPosicion).setStResultadoDeLaLlamada(request.getParameter("txtResultadoDeLaLlamada"));//Asignacion de propiedades

            }
            
            session.setAttribute("session_lstclsLlamadas", lstclsLlamadas);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
            
        } catch (Exception ex) {
            
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);
            
        }

    }

    public void btnEliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            List<Models.clsLlamadas> lstclsLlamadasNueva = new ArrayList<Models.clsLlamadas>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsLlamadas obclsLlamadas = new Models.clsLlamadas();

            if (session.getAttribute("session_lstclsLlamadas") != null) {
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
                lstclsLlamadasNueva = lstclsLlamadas;
            }

            for (Models.clsLlamadas item : lstclsLlamadas) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsLlamadas = item;
                    lstclsLlamadasNueva.remove(item);
                    break;
                }
            }

            session.setAttribute("session_lstclsLlamadas", lstclsLlamadas);
            request.setAttribute("stTipo", "success");
            request.setAttribute("stMensaje", "Se Realizo Proceso Con Exito");
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);

        }

    }

    public void cargarModificar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            HttpSession session = request.getSession(true);
            //BASE DE DATOS
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            //ALMACENAMOS ES VALOR SELECCIONADO
            Models.clsLlamadas obclsLlamadas = new Models.clsLlamadas();

            if (session.getAttribute("session_lstclsLlamadas") != null) {
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }

            for (Models.clsLlamadas item : lstclsLlamadas) {
                if (item.getInCodigo() == Integer.parseInt(request.getParameter("codigoSeleccionado"))) {
                    obclsLlamadas = item;
                }
            }

            request.setAttribute("obclsLlamadas", obclsLlamadas);
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);

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
            Models.clsLlamadas obclsLlamadas = new Models.clsLlamadas();
            Models.clsPropositoDeLaLlamada obclsPropositoDeLaLlamada = new Models.clsPropositoDeLaLlamada();
            Models.clsRelacionadoCon obclsRelacionadoCon = new Models.clsRelacionadoCon();
            Models.clsTipo obclsTipo = new Models.clsTipo();

            if (request.getParameter("txtNombreDeContacto") != null) {
                obclsLlamadas.setStNombreDeContacto(request.getParameter("txtNombreDeContacto"));

            } else {
                throw new Exception("Ingrese el nuevo evento"); //Exeption no controlada
            }
            if (request.getParameter("txtAsunto") != null) {
                obclsLlamadas.setStAsunto(request.getParameter("txtAsunto"));//Asignacion de propiedades
            }

            if (request.getParameter("ddlPropositoDeLaLlamada") != null) {

                //MODELO HIJO
                obclsPropositoDeLaLlamada.setInCodigo(Integer.parseInt(request.getParameter("ddlPropositoDeLaLlamada")));

                String stDescripcion = "";

                if (request.getParameter("ddlPropositoDeLaLlamada").equals("1")) {
                    stDescripcion = "Ninguno";
                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("2")) {
                    stDescripcion = "Posible";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("3")) {
                    stDescripcion = "Administrativo";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("4")) {
                    stDescripcion = "Negociacion";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("5")) {
                    stDescripcion = "Demostracion";

                } else if (request.getParameter("ddlPropositoDeLaLlamada").equals("6")) {
                    stDescripcion = "Proyecto";
                }

                obclsPropositoDeLaLlamada.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                obclsLlamadas.setObclsPropositoDeLaLlamada(obclsPropositoDeLaLlamada);
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
                    stDescripcion = "Contacto";

                } else if (request.getParameter("ddlRelacionadoCon").equals("4")) {
                    stDescripcion = "Otros";

                }

                obclsRelacionadoCon.setStDescripcion(stDescripcion);

                //SE LO ASIGNO AL MODELO PADRE
                obclsLlamadas.setObclsRelacionadoCon(obclsRelacionadoCon);
            }

            if (request.getParameter("txtTipoDeLlamada") != null) {
                obclsLlamadas.setStTipoDeLlamada(request.getParameter("txtTipoDeLlamada"));//Asignacion de propiedades

            }

            if (request.getParameter("radLlamada") != null) {
                obclsTipo.setInCodigo(Integer.parseInt(request.getParameter("radLlamada")));
                String stDescripcion = "";

                if (request.getParameter("radLlamada").equals("1")) {
                    stDescripcion = "Llamada Actual";
                } else if (request.getParameter("radLlamada").equals("2")) {
                    stDescripcion = "Llamada Completada";

                } else if (request.getParameter("radLlamada").equals("3")) {
                    stDescripcion = "Programar Llamada";

                }

                obclsTipo.setStDescripcion(stDescripcion);
                obclsLlamadas.setObclsTipo(obclsTipo);
            }

            if (request.getParameter("txtDescripcion") != null) {
                obclsLlamadas.setStDescripcion(request.getParameter("txtDescripcion"));//Asignacion de propiedades

            }

            if (request.getParameter("txtResultadoDeLaLlamada") != null) {
                obclsLlamadas.setStResultadoDeLaLlamada(request.getParameter("txtResultadoDeLaLlamada"));//Asignacion de propiedades

            }

            HttpSession session = request.getSession(true);

            //LISTA DE OBJETOS
            List<Models.clsLlamadas> lstclsLlamadas = new ArrayList<Models.clsLlamadas>();

            //VALIDAMOS PREVIA EXISTENCIA DE LA VARIABLE DE SESSION
            if (session.getAttribute("session_lstclsLlamadas") != null) {
                lstclsLlamadas = (List<Models.clsLlamadas>) session.getAttribute("session_lstclsLlamadas");
            }

            //PARA CALCULO AUTOMATICO DEL CODIGO QUE IDENTIFICA ESE REGISTRO
            int inCodigo = lstclsLlamadas.size() + 1;
            obclsLlamadas.setInCodigo(inCodigo);

            //AGREGAMOS EL OBJETO A LA LISTA
            lstclsLlamadas.add(obclsLlamadas);
            session.setAttribute("session_lstclsLlamadas", lstclsLlamadas);

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", "Se Realizo Proceso Exitosamente");
            request.setAttribute("stTipo", "success");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);

        } catch (Exception ex) {

            //DEFINIR PARAMETROS DESDE EL CONTROLADOR
            request.setAttribute("stMensaje", ex.getMessage());
            request.setAttribute("stTipo", "error");

            //REDIRECCIONO Y ENVIO LOS VALORES
            request.getRequestDispatcher("Llamadas.jsp").forward(request, response);

        }

    }

//PREGUNTAR AL PROFESOR SOBRE LOS RADIOS COMO PONERLOS!!!!!
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
