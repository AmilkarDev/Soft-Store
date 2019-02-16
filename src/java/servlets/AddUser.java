/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.sun.org.apache.xpath.internal.operations.Bool;
import controllers.UserFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.User;
import static models.User_.username;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "AddUser", urlPatterns = {"/AddUser"})
public class AddUser extends HttpServlet {
    
    @EJB
    private UserFacadeLocal userFacade;
    

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
        response.setContentType("text/html;charset=UTF-8");
        int id=Integer.parseInt(request.getParameter("id_user"));
        String name=request.getParameter("username");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        //boolean isAdmin=Boolean.parseBoolean(request.getParameter("isAdmin"));
   
        try (PrintWriter out = response.getWriter()) {
            try{
                User u=new User();
                u.setIdUser(id);
                u.setUsername(name);
                 u.setPassword(password);
                 u.setEmail(email);
               //  u.setIsAdmin(isAdmin);
                 
                  
                 userFacade.create(u);
                 out.println("Ajouter avec succee");
            
            }
            
            
            
        catch(Exception e){
        out.println("Erreur");}    
            
            
        }
        catch(Exception ex){
        System.out.println("Erreuuuur");}
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
