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

public class AddCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String name=request.getParameter("cName");
		
		Category cObj=new Category();
		cObj.setCategoryName(name);
		
		CategoryDao dao=new CategoryDaoImpl();
		boolean b=dao.addCategory(cObj);
		
		if(b){
			List<Category> categories=dao.getAllCategories();
			
			request.setAttribute("msg", "Category Added Succesfully...");
			request.setAttribute("categories",categories);
			RequestDispatcher rd=request.getRequestDispatcher("ViewCategories.jsp");
			rd.forward(request, response);
		}
	}

}
