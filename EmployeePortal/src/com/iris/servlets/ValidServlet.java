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

@WebServlet("/valid")
public class ValidServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Employee eObj=(Employee)request.getAttribute("employeeObj");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<div align='center' style='color:green'>"
				+ "Welcome  "+eObj.getEmployeeName()+"</div>");
		
		RequestDispatcher rd=request.getRequestDispatcher("Menu.html");
		rd.include(request,response);
	}

}
