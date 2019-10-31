package com.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("emailId");
		String s2=request.getParameter("password");
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","iris2","iris2");
		PreparedStatement ps=conn.prepareStatement("select * from UserTab where email=? and password=?");
		ps.setString(1,s1);
		ps.setString(2,s2);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			Cookie c1=new Cookie("userId",s1);
			c1.setMaxAge(180);
			response.addCookie(c1);
			
			RequestDispatcher rd=request.getRequestDispatcher("valid");
			rd.forward(request, response);
		
		}
		else {
			out.println("Email Id or password is incorrect..");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
			
	}

}
