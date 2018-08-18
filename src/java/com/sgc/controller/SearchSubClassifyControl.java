/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.controller;

import com.sgc.data.MyDbConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fasla faseel
 */
@WebServlet(name = "SearchSubClassifyControl", urlPatterns = {"/SearchSubClassifyControl"})
public class SearchSubClassifyControl extends HttpServlet {

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
            out.println("<title>Servlet SearchSubClassifyControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchSubClassifyControl at " + request.getContextPath() + "</h1>");
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
        String bookId =request.getParameter("subId");
          
          
         MyDbConnect db=new MyDbConnect();
         Connection con=db.connect();
         PreparedStatement pst = null;
         ResultSet rs = null;
         // PreparedStatement stmt=con.Statement(sql);
          //Statement stmt=con.createStatement();
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
        
         String sql1="select subid,subname,mainid from subclasstable where subid='"+bookId+"'";
         
         
         
         try{
             
            if(!bookId.isEmpty() )
             pst = con.prepareStatement(sql1);
            
            
             rs = pst.executeQuery();
              
             System.out.print("succesfully retive data"); 
             
             String str="<table border=1 align=center style = 'border: 8px solid green;'><tr style='background-color: #f2f2f2;'><th style = 'padding: 15px;'>Sub Classification ID</th><th>Sub Classification Name</th><th>Main Classification Name</th></tr>";
             while(rs.next()){
                 str+="<tr style='background-color: #eeffbb;'><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>";
             }
             str+="</table>";
             out.println(str);
             
         }catch(SQLException e){
             System.err.println(e);
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
