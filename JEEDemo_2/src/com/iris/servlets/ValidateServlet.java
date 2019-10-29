package com.iris.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/*Here Web Servlet is an annotation through which we are specifying this servlet will be 
 * invoked when the URL pattern is equal to validate . There are two ways to map servlet will be
 * the url-pattern - 1. By web.xml 2. By using @WebServlet annotation*/
@WebServlet("/validate")
public class ValidateServlet extends GenericServlet {
	
	/*service is the method in which we will write what my servlet will do. service() method
	 * will take reference of javax.servlet.ServletRequest interface and javax.servlet.
	 * ServletResponse interface and will throw checked exception classes - javax.servlet.
	 * ServletException
	 * and java.io.IOException*/
	public void service(ServletRequest request, 
			ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		/*getWriter is the method of javax.servlet.ServletResponse
		 * which will return an output stream which is connecting to
		 * browser.*/
		PrintWriter out=response.getWriter();
		
		
		
		System.out.println("Remote address : "+request.getRemoteAddr());
		System.out.println("Local Addr : "+request.getLocalAddr());
		System.out.println("Local Name : "+request.getLocalName());
		System.out.println("Local Port : "+request.getLocalPort());
		
		
		/*taking data coming in request*/
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		
		if((s1.equals("divya"))&&(s2.equals("divya123"))){
			out.println("Welcome Divya");
		}
		else {
			out.println("Email Id or password is incorrect.");
		}
		
	}

}
