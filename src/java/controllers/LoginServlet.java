package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nitro V15
 */
public class LoginServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        session.setAttribute("authenticated", false);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String configuredUsername = getServletConfig().getInitParameter("username");
        String configuredPassword = getServletConfig().getInitParameter("password");

        List<String> errorMessages = new ArrayList<String>();

        if ((username == null || username.trim().isEmpty()) && (password == null || password.isEmpty())) {
            errorMessages.add("Both username and password are required.");
        } else {
            if (username == null || username.trim().isEmpty()) {
                errorMessages.add("Username is required.");
            } else if (!configuredUsername.equals(username)) {
                errorMessages.add("Incorrect username.");
            }

            if (password == null || password.isEmpty()) {
                errorMessages.add("Password is required.");
            } else if (!configuredPassword.equals(password)) {
                errorMessages.add("Incorrect password.");
            }
        }

        if (errorMessages.isEmpty()) {
            // Successful login
            request.getSession().setAttribute("authenticated", true);
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessages", errorMessages);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
