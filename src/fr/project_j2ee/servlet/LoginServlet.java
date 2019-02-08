package fr.project_j2ee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.project_j2ee.entity.Users;



public class LoginServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Login doGet");
		
		req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Login doPost");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(username.equals("nathan") && password.equals("ledieu")) {
			req.getSession().setAttribute("user", new Users(username, password));
			resp.sendRedirect("index");
		}
		else {
			resp.sendRedirect("login");
		}
	}
}