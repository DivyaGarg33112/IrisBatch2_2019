package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.EmployeeDao;
import com.iris.daosimpl.EmployeeDaoImpl;
import com.iris.models.Employee;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("eId"));
		String pass=request.getParameter("pwd");
		
		EmployeeDao daoObj=new EmployeeDaoImpl();
		Employee obj=daoObj.validateEmployee(id, pass);
		if(obj==null){
			out.println("<div align='center' style='color:red'>Employee Id or password is incorrect</div>");
			
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		else {
			
			request.setAttribute("employeeObj",obj);
			
			//If user is valid I want to forward my request
			//to another resource..
			RequestDispatcher rd=request.getRequestDispatcher("valid");
			rd.forward(request, response);
			
			//response.sendRedirect("valid");
		}
		
	}

}
