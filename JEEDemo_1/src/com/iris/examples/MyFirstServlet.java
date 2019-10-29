package com.iris.examples;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class MyFirstServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("I m destroy");	
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("I m getServlet Config");
		return null;
	}

	@Override
	public String getServletInfo() {
		return "Created by Divya garg";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("I m  init");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("I  m service");
	}

}
