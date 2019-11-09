package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.daos.PersonDao;
import com.iris.daosimpl.PersonDaoImpl;
import com.iris.models.Address;
import com.iris.models.Person;

public class AddAddressController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String a1=request.getParameter("addr1");
		String a2=request.getParameter("addr2");
		
		Address addr=new Address();
		addr.setAddressLine1(a1);
		addr.setAddressLine2(a2);
		
		HttpSession session=request.getSession();
		Person personObj=(Person)session.getAttribute("pObj");
		
		Set<Address> addresses=personObj.getAddrSet();
		addresses.add(addr);
		personObj.setAddrSet(addresses);
		
		session.setAttribute("pObj",personObj);
		
		PersonDao daoObj=new PersonDaoImpl();
		boolean b=daoObj.updatePerson(personObj);
		if(b){
			request.setAttribute("msg", "New Address Added Succesfully..");
			RequestDispatcher rd=request.getRequestDispatcher("ViewAddresses.jsp");
			rd.forward(request, response);
		}
	}

}
