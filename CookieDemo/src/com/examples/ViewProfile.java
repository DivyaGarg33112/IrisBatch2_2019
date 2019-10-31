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

@WebServlet("/viewProfile")
public class ViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userName=null;
		
		Cookie[] c=request.getCookies();
		if(c==null){
			out.println("U need to login first....");
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.htm");
			rd.include(request, response);
		
			
		}
		if(c!=null) {
			for(int i=0;i<c.length;i++){
			String cName=c[i].getName();
			if(cName.equals("userId")){
				userName=c[i].getValue();
			}
			
		}
		
		
		out.println("<div align='center'>");
		out.println("Welcome "+userName+"<hr/>");
		
		out.println("<table>");
		out.println("<tr><td><a href='getAllUsers'>Get All Users</a></td></tr>");
		
		out.println("</table>");
		
		
		out.println("</div>");
		
		}
			
	}

}
