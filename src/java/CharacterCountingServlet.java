/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nitro V15
 */
public class CharacterCountingServlet extends HttpServlet {

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
        String inputString = request.getParameter("inputString");
        if (inputString != null) {
            int characterCount = inputString.length();
            int digitCount = 0;
            int vowelCount = 0;
            int consonantCount = 0;
            int symbolCount = 0;

            for (int i = 0; i < inputString.length(); i++) {
                char c = inputString.charAt(i);
                if (Character.isDigit(c)) {
                    digitCount++;
                } else if (Character.isLetter(c)) {
                    if ("AEIOUaeiou".indexOf(c) != -1) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                } else {
                    if (c != ' ') {
                        symbolCount++;
                    }
                }
            }

            request.setAttribute("characterCount", characterCount);
            request.setAttribute("digitCount", digitCount);
            request.setAttribute("vowelCount", vowelCount);
            request.setAttribute("consonantCount", consonantCount);
            request.setAttribute("symbolCount", symbolCount);
        }
        request.getRequestDispatcher("/success.jsp").forward(request, response);
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
