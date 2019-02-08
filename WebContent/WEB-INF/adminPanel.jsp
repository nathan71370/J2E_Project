<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="fr.project_j2ee.entity.*" %>
    
    <% Users user = (Users) request.getSession().getAttribute("user");
    Users admin = (Users) request.getSession().getAttribute("admin");
    	
    	if(user!=null && admin==null){
    		response.sendRedirect("index");
    	}
    	else{
    		response.sendRedirect("login");
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Panel</title>
</head>
<body>

</body>
</html>