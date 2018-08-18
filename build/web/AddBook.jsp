<%-- 
    Document   : test2
    Created on : Aug 6, 2018, 9:56:47 AM
    Author     : fasla faseel
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      .dropdown-submenu {
    position:relative;
}
.dropdown-submenu>.dropdown-menu {
    top:0;
    left:100%;
    margin-top:-6px;
    margin-left:-1px;
    -webkit-border-radius:0 6px 6px 6px;
    -moz-border-radius:0 6px 6px 6px;
    border-radius:0 6px 6px 6px;
}
.dropdown-submenu:hover>.dropdown-menu {
    display:block;
}
.dropdown-submenu>a:after {
    display:block;
    content:" ";
    float:right;
    width:0;
    height:0;
    border-color:transparent;
    border-style:solid;
    border-width:5px 0 5px 5px;
    border-left-color:#cccccc;
    margin-top:5px;
    margin-right:-10px;
}
.dropdown-submenu:hover>a:after {
    border-left-color:red;
}
.dropdown-submenu.pull-left {
    float:none;
}
.dropdown-submenu.pull-left>.dropdown-menu {
    left:-100%;
    margin-left:10px;
    -webkit-border-radius:6px 0 6px 6px;
    -moz-border-radius:6px 0 6px 6px;
    border-radius:6px 0 6px 6px;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
#labl{
    width:22%;
    left: 100px;
    position: fixed;
    top:130px;
}
#textF{
    width:30%;
    
    position: fixed;
}
#welcomeHeading{
    font: bold italic 2em Georgia , Times, "Times New Roman", serif;
    color:#87CEEB;
/* border-bottom: 2px dashed #008B8B;
 border-top: 10px solid #008B8B;*/
 margin: 0;
 padding: 0.5em 0 0.5em 0;
 font-size: 1.5em;
}
.footer {
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    height:4px;
    background-color: black;
    color: white;
    text-align: center;
}
  </style>
    </head>
    <body>
        
         <div class="navbar navbar-inverse" width="100%">
    
        
        
            <ul class="nav navbar-nav">
                <li class="disable">
                                    <a href="Home.jsp">HOME</a>
                </li>
                <li class="menu-item dropdown" >
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">BOOK<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li >
                            <a href="AddBookControl" class="dropdown-toggle" > ADD BOOKS</a>
                            
                        </li>
                        <li >
                            <a href="updateBookController" class="dropdown-toggle" >UPDATE BOOKS</a>
                            
                        </li>
                        <li >
                            <a href="DeleteBookControl" class="dropdown-toggle">DELETE BOOKS</a>
                            
                        </li>
                        <li >
                            <a href="SearchBook.jsp" class="dropdown-toggle" >FIND BOOKS</a>
                            
                        </li>
                    </ul>
                </li>
                <li class="menu-item dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">CLASSIFICATION<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li class="menu-item dropdown dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">MAIN CLASSIFICATION</a>
                            <ul class="dropdown-menu">
                                <li class="menu-item ">
                                    <a href="AddMainClassControl">Add Main Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="UpdateMainClassification.jsp"> Update Main Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="#"> Delete Main Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="SearchMainClassification.jsp">Search Main Classification</a>
                                </li>
                            </ul>
                        </li>
                        <li class="menu-item dropdown dropdown-submenu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">SUB CLASSIFICATION</a>
                            <ul class="dropdown-menu">
                                <li class="menu-item ">
                                    <a href="AddSubClassController">Add Sub Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="UpdateSubClassifyController">Update Sub Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="DeleteSubBookControl">Delete Sub Classification</a>
                                </li>
                                <li class="menu-item ">
                                    <a href="SearchSubClassification.jsp">Search Sub Classification</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        
    </div>
        <div>
            <center><h1 id ="welcomeHeading">ADD BOOK DETAILS</h1></center>
        </div>
            
    <div class="container" >
        <form action="BookController" method="get">
            
                <label for="Book Id" ><b>Book Id</b></label>
                    <input type="text"  placeholder="Enter Book id" name="bookId" value="${bookId}" required>
                    
                <label for="Title"><b>Title</b></label>
                     <input type="text"  placeholder="Enter Book Title" name="title" value ="${title}" required>
                     
        <label for="Author"><b>Author</b></label>
        <input type="text"  placeholder="Enter Author" name="author" value ="${author}" required>
        
            
        
        <table class="classify" cellpadding="10">
            <tr> <td style="width:150px;"><label for="Main classification"><b>Main classification</b></label></td>
        
                <td> <select style="width:300px;" name="mainClassification" onchange="selectvalue(form);">
                             <c:forEach items="${listCategory}" var="category">
                                <option value="${category.mainId}"
                                <c:if test="${category.mainId eq mainId}">selected="selected"</c:if>>
                                
                                ${category.mainId}
                                </option>
                            </c:forEach>
            
                    </select></td>
          
        <td style="width:200px;"><label for="Subclassification"><b>Sub  classification</b></label></td>
            <td> <select style="width:300px;" name="subClassification">
                    
                        <c:forEach items="${listSubCategory}" var="category">
                                <option value="${category.subId}"
                                <c:if test="${category.mainId eq selectedCatId}">selected="selected"</c:if>>
                                        
                                     ${category.subId}
                                </option>
                        </c:forEach>
                   </select></td></tr>
            
        </table>
        <br>
        <label for="Year of publishing"><b>Year of publishing</b></label>
        <input type="text" class = "inpuText" placeholder="Enter Year of publishing" name="yop" value="${yop}" required>
        
        <label for="Last printed year"><b>Last printed year</b></label>
        <input type="text" class = "inpuText" placeholder="Enter Last Printed Year" name="lpy" value="${lpy}" required>
        
        <label for="ISBN no"><b>ISBN no</b></label>
        <input type="text" class = "inpuText" placeholder="Enter ISBN no" name="isbn" value="${isbn}" required>
        
        <label for="No of pages"><b>No of pages</b></label>
        <input type="text" class = "inpuText" placeholder="Enter No of pages" name="noP" value="${noP}" required>
        <button class="btn btn-primary" type="submit" name="AddBookButton">Submit form</button>
        </form>
            
        
    </div>
            
    <footer class="footer">
            
    </footer> 
    </body>
    <script>
            function selectvalue(form) {
                form.action = "PopSubDropdown";
                form.submit();                
            }
        </script>
</html>
