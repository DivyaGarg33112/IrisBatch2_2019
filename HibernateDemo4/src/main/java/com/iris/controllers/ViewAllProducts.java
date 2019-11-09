package com.iris.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.ProductDao;
import com.iris.daosimpl.ProductDaoImpl;

public class ViewAllProducts extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		ProductDao dao=new ProductDaoImpl();
		
	}

	
}
