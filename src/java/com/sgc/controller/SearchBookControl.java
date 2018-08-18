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
@WebServlet(name = "SearchBookControl", urlPatterns = {"/SearchBookControl"})
public class SearchBookControl extends HttpServlet {

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
            out.println("<title>Servlet SearchBookControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchBookControl at " + request.getContextPath() + "</h1>");
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
        String bookId =request.getParameter("bookId");
          String title =request.getParameter("title");
          String author=request.getParameter("author");
          
         MyDbConnect db=new MyDbConnect();
         Connection con=db.connect();
         PreparedStatement pst = null;
         ResultSet rs = null;
         // PreparedStatement stmt=con.Statement(sql);
          //Statement stmt=con.createStatement();
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
        
         String sql1="select id,title,author,mainclassification,subclassification,yearofpublishing,lastprintedyear,isbnno,noofpages from book where id='"+bookId+"'";
         String sql2="select id,title,author,mainclassification,subclassification,yearofpublishing,lastprintedyear,isbnno,noofpages from book where title='"+title+"'";
         String sql3="select id,title,author,mainclassification,subclassification,yearofpublishing,lastprintedyear,isbnno,noofpages from book where author='"+author+"'";
         
         String sql4="select id,title,author,mainclassification,subclassification,yearofpublishing,lastprintedyear,isbnno,noofpages from book where title='"+title+"' AND author='"+author+"'";
         
         
         try{
             
            if(!bookId.isEmpty() && title.isEmpty() && author.isEmpty())
             pst = con.prepareStatement(sql1);
            
            else if(bookId.isEmpty() && !title.isEmpty() && author.isEmpty())
             pst = con.prepareStatement(sql2);
             //pst = con.prepareStatement(sql2);
              else if(bookId.isEmpty() && title.isEmpty() && !author.isEmpty())
             pst = con.prepareStatement(sql3);
            
            else if(bookId.isEmpty() && !title.isEmpty() && !author.isEmpty())
             pst = con.prepareStatement(sql4);
             rs = pst.executeQuery();
              
             System.out.print("succesfully retive data"); 
             
             String str="<table  align=center style = 'border: 8px solid green;'><tr style='background-color: #f2f2f2;'><th style = 'padding: 15px;' >bookid</th><th>title</th><th>author</th><th>mainclassification</th><th>subclassification</th><th>yearofpublishing</th><th>lastprintedyear</th><th>isbnno</th><th>noofpages</th></tr>";
             while(rs.next()){
                 str+="<tr style='background-color: #eeffbb;'><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td></tr>";
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
