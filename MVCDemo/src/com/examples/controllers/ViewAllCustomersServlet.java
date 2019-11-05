package com.examples.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examples.daos.UserDao;
import com.examples.daosimpl.UserDaoImpl;
import com.examples.models.User;

@WebServlet("/viewAllCustomers")
public class ViewAllCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		
		//will call the appropriate dao  to process the request
		UserDao daoObj=new UserDaoImpl();
		
		List<User> usersList=daoObj.getAllCustomers();
		
		request.setAttribute("customerList",usersList);
		RequestDispatcher rd=request.getRequestDispatcher("CustomersList.jsp");
		rd.forward(request, response);
		
	}

}
