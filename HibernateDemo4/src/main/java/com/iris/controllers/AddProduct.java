package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CategoryDao;
import com.iris.daos.ProductDao;
import com.iris.daosimpl.CategoryDaoImpl;
import com.iris.daosimpl.ProductDaoImpl;
import com.iris.models.Product;

public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ProductDao daoObj=new ProductDaoImpl();
		CategoryDao cDao=new CategoryDaoImpl();
		
		String name=request.getParameter("name");
		double price=Double.parseDouble(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		String desc=request.getParameter("description");
		int cId=Integer.parseInt(request.getParameter("category"));
		
		Product p=new Product();
		p.setProductName(name);
		p.setQuantity(quantity);
		p.setDescription(desc);
		p.setPrice(price);
		p.setCategory(cDao.getCategoryById(cId));
		
		boolean b=daoObj.addProduct(p);
		if(b){
			out.println("Product Added Succesfully..");
		}
		
		
		
	}

}
