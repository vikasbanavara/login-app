package com.ty.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.login.dao.UserDao;
import com.ty.login.dto.User;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter pout = resp.getWriter();
		
		UserDao dao = new UserDao();
		User user = dao.validateUser(email, password);
		
		if(user != null) {
			
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("name", user.getName());
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
			
			
		} else {
			
			pout.print("<h1>Invalid email or password</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
			dispatcher.include(req, resp);
			
		}
		
	
	}
}
