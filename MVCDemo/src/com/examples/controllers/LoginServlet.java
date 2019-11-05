package com.examples.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.examples.daos.UserDao;
import com.examples.daosimpl.UserDaoImpl;
import com.examples.models.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		String s1=request.getParameter("userId");
		String s2=request.getParameter("pass");
		
		int id=Integer.parseInt(s1);
		
		//will call the appropriate dao  to process the request
		UserDao daoObj=new UserDaoImpl();
		
		//According to the result will call the appropriate View
		User userObj=daoObj.validate(id, s2);
		if(userObj!=null){
			
			HttpSession session=request.getSession();
			session.setAttribute("uObj",userObj);
			
			if(userObj.getRole().equals("Admin")){
				RequestDispatcher rd=request.getRequestDispatcher("AdminWelcome.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("CustomerWelcome.jsp");
				rd.forward(request, response);
			}
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.jsp");
			rd.forward(request, response);
		}
		
	}

}
