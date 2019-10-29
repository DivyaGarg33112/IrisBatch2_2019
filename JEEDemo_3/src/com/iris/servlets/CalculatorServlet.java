package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		String s3=request.getParameter("btn");
		
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		
		if(s3.equals("+")){
			out.println("Add = "+(num1+num2));
		}
		else if(s3.equals("-")){
			out.println("Subtract = "+(num1-num2));
		}
		else if(s3.equals("*")){
			out.println("Multiply = "+(num1*num2));
		}
		else if(s3.equals("/")){
			out.println("Divide = "+(num1/num2));
		}
	}

}
