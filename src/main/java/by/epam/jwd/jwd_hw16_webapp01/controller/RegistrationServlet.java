package by.epam.jwd.jwd_hw16_webapp01.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.epam.jwd.jwd_hw16_webapp01.bean.User;

public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 7475049715413998819L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String age = req.getParameter("age");
		String country = req.getParameter("country");
		String[] languages = req.getParameterValues("languages"); 
		
		User user = new User(firstName, lastName, Integer.parseInt(age), country, languages);
		
		req.setAttribute("user", user); 
		req.getRequestDispatcher("/users.jsp").forward(req, resp);
		
	}
	
	

}
