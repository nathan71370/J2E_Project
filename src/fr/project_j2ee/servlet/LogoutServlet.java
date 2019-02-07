package fr.project_j2ee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 resp.setContentType("text/html");  
         PrintWriter out=resp.getWriter();  
           
         req.getRequestDispatcher("link.html").include(req, resp);  
           
         HttpSession session=req.getSession();  
         session.invalidate();  
           
         out.print("You are successfully logged out!");  
           
         out.close();  
	}

}