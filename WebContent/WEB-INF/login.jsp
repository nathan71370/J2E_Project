<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
  
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

	<style>
     	<%@ include file="css/main.css"%>
     	<%@ include file="vendor/mdi-font/css/material-design-iconic-font.min.css"%>
     	<%@ include file="vendor/font-awesome-4.7/css/font-awesome.min.css"%>
     	<%@ include file="vendor/select2/select2.min.css"%>
     	<%@ include file="vendor/datepicker/daterangepicker.css"%>
	</style>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	

    <title>SupPictures</title>
  </head>
  <body>
    <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading">
                <img src="<%=getServletContext().getContextPath()%>images/bg-heading-03.jpg"/>
                	
                	
                	
                </div>
                <div class="card-body">
                    <h2 class="title">Sign In</h2>
                    <form method="POST">
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Username" name="username">
                        </div>
                        <div class="input-group">
                            <input class="input--style-3" type="password" placeholder="Password" name="password">
                        </div>
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
  </body>
</html>