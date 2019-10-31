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

@WebServlet("/getAllUsers")
public class GetAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","iris2","iris2");
			PreparedStatement ps=conn.prepareStatement("select * from UserTab");
			ResultSet rs=ps.executeQuery();
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td>Email Id</td>");
			out.println("<td>Name</td>");
			out.println("<td colspan='2'>Choose</td>");
			out.println("</tr>");
		
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td><a href='update?myId="+rs.getString(1)+"&&myName="+rs.getString(3)+"'>Update</a></td>");
				out.println("<td><a href='delete?myId="+rs.getString(1)+"'>Delete</a></td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			}
			catch(Exception e){
				e.printStackTrace();
			}			
	}

}
