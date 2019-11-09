package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.PersonDao;
import com.iris.daosimpl.PersonDaoImpl;
import com.iris.models.Person;

public class AddPersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String n=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		
		Person p=new Person();
		p.setPersonId(id);
		p.setPersonName(n);
		p.setPersonAge(age);
		
		PersonDao daoObj=new PersonDaoImpl();
		boolean b=daoObj.addPerson(p);
		if(b){
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		}
	}

}
