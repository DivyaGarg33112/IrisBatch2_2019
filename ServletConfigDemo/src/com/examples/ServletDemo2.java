package com.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/run2" }, 
		initParams = { 
				@WebInitParam(name = "mail3", value = "uttam@almamate.in")
		})
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//Here u need the object of ServletConfig
		ServletConfig config=getServletConfig();
		String s1=config.getInitParameter("myEmail");
		String  s2=config.getInitParameter("anotherEmail");
		String s3=config.getInitParameter("mail3");
		
		ServletContext context=getServletContext();
		String h=context.getInitParameter("hrEmail");
		
		
		out.println("<h1>");
		out.println("For Java Queries write here :"+s1+"<br/>");
		out.println("For Other Queries write here :"+s2+"<br/>");
		out.println("For Other Queries write here :"+s3+"<br/>");
		out.println("For HR Queries write here :"+h);
		out.println("</h1>");
	}

}
