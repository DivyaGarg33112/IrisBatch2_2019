package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.EmployeeDao;
import com.iris.daosimpl.EmployeeDaoImpl;
import com.iris.models.Employee;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("ename");
		String gender=request.getParameter("gender");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		
		Employee emp=new Employee(name,gender,city,email,pwd);
		EmployeeDao daoObj=new EmployeeDaoImpl();
		boolean b=daoObj.registerEmployee(emp);
		if(b){
			out.println("Registered Succesfully..");
		}
		else {
			out.println("Problem in Registering employee");
		}
		
	}

}
