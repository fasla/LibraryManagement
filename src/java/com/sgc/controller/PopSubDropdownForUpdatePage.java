/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.model.SubClassifyConstruct;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fasla faseel
 */
@WebServlet(name = "PopSubDropdownForUpdatePage", urlPatterns = {"/PopSubDropdownForUpdatePage"})
public class PopSubDropdownForUpdatePage extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PopSubDropdownForUpdatePage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PopSubDropdownForUpdatePage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
         String mainId = request.getParameter("mainClassification");
        String bookAuthor = request.getParameter("author");
        String Title = request.getParameter("title");
        String bookId = request.getParameter("bookId");
        String yop = request.getParameter("yop");
        String lpy = request.getParameter("lpy");
        String isbn = request.getParameter("isbn");
        String noP = request.getParameter("noP");
        
        BookDao dao = new BookDao();
        
        try {
            List <SubClassifyConstruct> subClass = dao.popSubClassify(mainId);
            request.setAttribute("listSubCategory", subClass);
            request.setAttribute("mainId", mainId);
            request.setAttribute("author", bookAuthor);
            request.setAttribute("title", Title);
            request.setAttribute("bookId", bookId);
            request.setAttribute("yop", yop);
            request.setAttribute("lpy", lpy);
            request.setAttribute("isbn", isbn);
            request.setAttribute("noP", noP);
            RequestDispatcher dispatcher = request.getRequestDispatcher("updateBookController");
            dispatcher.forward(request, response);
            
        } catch (SQLException ex) {
            Logger.getLogger(PopSubDropdown.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        String categoryId = request.getParameter("mainClassification");
 
        request.setAttribute("selectedCatId", categoryId);
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
