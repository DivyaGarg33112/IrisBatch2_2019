package com.examples.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.daos.UserDao;
import com.examples.daosimpl.UserDaoImpl;
import com.examples.models.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		String s1=request.getParameter("firstname");
		String s2=request.getParameter("lastname");
		String s3=request.getParameter("gender");
		String s4=request.getParameter("city");
		String s5=request.getParameter("role");
		String s6=request.getParameter("password");
		
		User userObj=new User();
		userObj.setFirstname(s1);
		userObj.setLastname(s2);
		userObj.setGender(s3);
		userObj.setCity(s4);
		userObj.setRole(s5);
		userObj.setPassword(s6);
		
		//will call the appropriate dao  to process the request
		UserDao daoObj=new UserDaoImpl();
		
		//According to the result will call the appropriate View
		boolean b=daoObj.registerUser(userObj);
		if(b){
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("RegistrationForm.jsp");
			rd.forward(request, response);
		}
		
	}

}
