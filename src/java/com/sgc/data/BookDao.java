/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sgc.data;

import com.sgc.model.BookModel;
import com.sgc.model.MainClassifyConstruct;
import com.sgc.model.MainClassifyModel;
import com.sgc.model.SubClassifyConstruct;
import com.sgc.model.SubClassifyModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fasla faseel
 */
public class BookDao {
    public void addMainClassify(MainClassifyModel book)throws ClassNotFoundException,SQLException
    {
        
      MyDbConnect db=new MyDbConnect();
      Connection con=db.connect();
      Statement stmt=con.createStatement();
        try{
                stmt.executeUpdate("INSERT INTO mainclasstable(mainid,mainname) VALUES ('"+book.getMainId()+"','"+book.getMainName()+"')");
           }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
        con.close();
    }
    
    public void addSubClassify(SubClassifyModel book)throws ClassNotFoundException,SQLException
    {
        
      MyDbConnect db=new MyDbConnect();
      Connection con=db.connect();
      Statement stmt=con.createStatement();
        try{
                stmt.executeUpdate("INSERT INTO subclasstable(subid,subname,mainid) VALUES ('"+book.getSubId()+"','"+book.getSubName()+"','"+book.getMainId()+"')");
           }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
        con.close();
    }
    
   public List<MainClassifyConstruct> list() throws SQLException 
    {
        //Book book=new Book();
        Connection con=MyDbConnect.connect();
        //Statement stmt = null;
       // System.out.println(con.isValid(10));
        
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        List<MainClassifyConstruct> listCategory = new ArrayList<>();
         
        try  {
            String sql = "SELECT * FROM mainclasstable";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet result = stmt.executeQuery();
             
            while (result.next()) {
                String id = result.getString("mainid");
                String name = result.getString("mainname");
                MainClassifyConstruct category = new MainClassifyConstruct(id, name);
                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            throw ex;
        }      
        con.close();
        return listCategory;
  
    }
   
   public List<SubClassifyConstruct> popSubClassify(String mc) throws SQLException 
    {
        Connection con=MyDbConnect.connect();
        List<SubClassifyConstruct> listCategory = new ArrayList<>();
         
        try  {
            String sql = "SELECT * FROM subclasstable where mainid = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, mc);
            ResultSet result = stmt.executeQuery();
             
            while (result.next()) {
                String id = result.getString("mainid");
                String name = result.getString("subid");
                SubClassifyConstruct category = new SubClassifyConstruct(id, name);                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            throw ex;
        }      
        con.close();
        return listCategory;
  
    }
   
   public void saveBook(BookModel book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        stmt.executeUpdate("INSERT INTO book(id,title,author,mainclassification,subclassification,yearofpublishing,lastprintedyear,isbnno,noofpages) VALUES ('"+book.getBookID()+"','"+book.getTitle()+"','"+book.getAuthor()+"','"+book.getMc()+"','"+book.getSc()+"','"+book.getYop()+"','"+book.getLpy()+"','"+book.getIsbnNo()+"','"+book.getNoPg()+"')");
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
   
   public void deleteBook(BookModel book)throws ClassNotFoundException,SQLException
    {
       
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        PreparedStatement st = null;
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        st= con.prepareStatement("delete  from book where id = ?");
        st.setString(1, book.getBookID());
        st.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
   public void deleteSubBook(SubClassifyModel book)throws ClassNotFoundException,SQLException
    {
       
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        PreparedStatement st = null;
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        st= con.prepareStatement("delete  from subclasstable where subid = ?");
        st.setString(1, book.getSubId());
        st.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
      public void deleteMainClass(MainClassifyModel book)throws ClassNotFoundException,SQLException
    {
       
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        PreparedStatement st = null;
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        st= con.prepareStatement("delete  from mainclasstable where mainid = ?");
        st.setString(1, book.getMainId());
        st.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
   public void updateBook(BookModel book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        String sql="update book set  title=?,author=?, mainclassification=?,subclassification=?,yearofpublishing=?,lastprintedyear=?,isbnno=?,noofpages=? where id=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1, book.getTitle());
                    pst.setString(2, book.getAuthor());
                    pst.setString(3, book.getMc());
                    pst.setString(4, book.getSc());
                    pst.setString(5, book.getYop());
                    pst.setString(6, book.getLpy());
                    pst.setString(7, book.getIsbnNo());
                    pst.setString(8, book.getNoPg());
                    pst.setString(9, book.getBookID());
                    
                    pst.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
   public void updateSubClass(SubClassifyModel book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        String sql="update subclasstable set  mainid=?,subname=? where subid=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1, book.getMainId());
                    pst.setString(2, book.getSubName());
                   pst.setString(3, book.getSubId());
                    
                    
                    pst.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
   public void updateMainClass(MainClassifyModel book)throws ClassNotFoundException,SQLException
    {
        //Book book=new Book();
      MyDbConnect db=new MyDbConnect();
        Connection con=db.connect();
       // System.out.println(con.isValid(10));
        Statement stmt=con.createStatement();
        
//         Book book=new Book();
//         String bookId=book.getBookId();
//         String author=book.getAuthor();
//         String title=book.getTitle();
        try{
        String sql="update mainclasstable set mainname=? where mainid=?";
                    PreparedStatement pst=con.prepareStatement(sql);
                    pst.setString(1, book.getMainName());
                    pst.setString(2, book.getMainId());
                   
                    
                    
                    pst.executeUpdate();
        //System.out.print("succesfully insert");
        }
        catch(SQLException ex)
        {
            System.out.print("not connect" +ex);
        }
  
    }
}
