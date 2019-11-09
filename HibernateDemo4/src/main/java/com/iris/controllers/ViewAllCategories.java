package com.iris.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CategoryDao;
import com.iris.daosimpl.CategoryDaoImpl;
import com.iris.models.Category;

public class ViewAllCategories extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		CategoryDao dao=new CategoryDaoImpl();
		List<Category> categories=dao.getAllCategories();
			
		request.setAttribute("categories",categories);
		RequestDispatcher rd=request.getRequestDispatcher("ViewCategories.jsp");
		rd.forward(request, response);
		
	}


}
