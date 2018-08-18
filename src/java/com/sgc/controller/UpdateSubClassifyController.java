/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.model.BookModel;
import com.sgc.model.MainClassifyConstruct;
import com.sgc.model.SubClassifyConstruct;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
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
@WebServlet(name = "UpdateSubClassifyController", urlPatterns = {"/UpdateSubClassifyController"})
public class UpdateSubClassifyController extends HttpServlet {

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
            out.println("<title>Servlet UpdateSubClassifyController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateSubClassifyController at " + request.getContextPath() + "</h1>");
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
        listCategory(request, response);
    }

    private void listCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookModel book=new BookModel();
          
          
         BookDao dao = new BookDao();
         
         if (request.getAttribute("author")!= null){
             String Author = (String)request.getAttribute("author");
             request.setAttribute("author", Author);
         }
         if (request.getAttribute("bookId")!= null){
             String Author = (String)request.getAttribute("bookId");
             request.setAttribute("bookId", Author);
         }
         if (request.getAttribute("title")!= null){
             String Title = (String)request.getAttribute("title");
             request.setAttribute("title", Title);
         }
         if (request.getAttribute("yop")!= null){
             String yop = (String)request.getAttribute("yop");
             request.setAttribute("yop", yop);
         }
         if (request.getAttribute("lpy")!= null){
             String lpy = (String)request.getAttribute("lpy");
             request.setAttribute("lpy", lpy);
         }
         if (request.getAttribute("isbn")!= null){
             String isbn = (String)request.getAttribute("isbn");
             request.setAttribute("isbn", isbn);
         }
         if (request.getAttribute("noP")!= null){
             String noP = (String)request.getAttribute("noP");
             request.setAttribute("noP", noP);
         }
         if (request.getAttribute("listSubCategory")!= null){
             List <SubClassifyConstruct> listSub = (List)request.getAttribute("listSubCategory");
             request.setAttribute("listSubCategory", listSub);
         }
         if (request.getAttribute("mainId")!= null){
             String mainId = (String)request.getAttribute("mainId");
             request.setAttribute("mainId", mainId);
         }
        try {
            
            List<MainClassifyConstruct> listCatagory = dao.list();
            request.setAttribute("listCategory", listCatagory);
            
            
                
            RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateSubClassification.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            throw new ServletException(e);
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
