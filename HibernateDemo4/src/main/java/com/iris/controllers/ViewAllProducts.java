package com.iris.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.ProductDao;
import com.iris.daosimpl.ProductDaoImpl;
import com.iris.models.Product;

public class ViewAllProducts extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		ProductDao dao=new ProductDaoImpl();
		List<Product> products=dao.getAllProducts();
		request.setAttribute("products",products);
		
		RequestDispatcher rd=request.getRequestDispatcher("ViewProducts.jsp");
		rd.forward(request, response);
		}

	
}
