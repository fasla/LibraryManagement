/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.model.BookModel;
import com.sgc.model.SubClassifyModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(name = "DeleteSubBookControl", urlPatterns = {"/DeleteSubBookControl"})
public class DeleteSubBookControl extends HttpServlet {

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
            out.println("<title>Servlet DeleteSubBookControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeleteSubBookControl at " + request.getContextPath() + "</h1>");
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
        SubClassifyModel book=new SubClassifyModel();
          
          String buttonCheck = request.getParameter("subButton"); 
          
          book.setSubId(request.getParameter("subBookId"));
          
           
           
          
           BookDao bookdao=new BookDao();
           
         // request.setAttribute("message","success");
          //request.getParameter("b")
        //request.setAttribute("Pass",password);
        //processRequest(request, response);
       //request.getRequestDispatcher("/out.jsp").forward(request, response);
          
        try {
            if(buttonCheck != null)
            bookdao.deleteSubBook(book);
           
            RequestDispatcher dispatcher = request.getRequestDispatcher("DeleteSubClassification.jsp");
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteBookControl.class.getName()).log(Level.SEVERE, null, ex);
           // out.println("Your data is not added" + ex.getMessage());
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
