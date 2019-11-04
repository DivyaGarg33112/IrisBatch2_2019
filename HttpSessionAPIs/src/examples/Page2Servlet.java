package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String fn=request.getParameter("fname");
		
		HttpSession session=request.getSession();
		session.setAttribute("fn",fn);
		
		out.println("<div align='center'><h1>Page 2</h1><hr/>");
		out.println("<form action='page3' method='post'>");
		out.println("Last Name : <input type='text' name='lname'>");
		out.println("<input type='submit'>");
		out.println("</form>");
		
	}

}
