package fr.project_j2ee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.project_j2ee.dao.DaoFactory;
import fr.project_j2ee.entity.Users;

public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String adresse = req.getParameter("adresse");
		
		Users users = new Users();
		users.setFirstName(firstname);
		users.setLastName(lastname);
		users.setUsername(username);
		users.setPassword(password);
		users.setPhone(phone);
		users.setEmail(email);
		users.setAdresse(adresse);
		
		DaoFactory.getDaoUsers().addUsers(users);
		
		req.getSession().setAttribute("user", new Users(username, password));
		resp.sendRedirect("index");
	}
}
