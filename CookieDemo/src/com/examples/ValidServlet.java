package com.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/valid")
public class ValidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<div align='center'>");
		out.println("Welcome : User <hr/>");
		out.println("<ul>");
		out.println("<li><a href='viewProfile'>View Profile</a></li>");
		out.println("<li><a href='#'>Change Password</a></li>");
		out.println("<li><a href='#'>LogOut</a></li>");
		out.println("</ul>");
		out.println("</div>");
		
		
		
			
	}

}
