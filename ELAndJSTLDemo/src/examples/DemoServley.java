package examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/click")
public class DemoServley extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		
		Cookie c=new Cookie("qualification","MCA");
		response.addCookie(c);
		
		request.setAttribute("fname","Divya");
		
		ServletContext context=getServletContext();
		context.setAttribute("lname", "Garg");
		
		HttpSession session=request.getSession();
		session.setAttribute("lname", "Agarwal");
		session.setAttribute("designation", "Senior Trainer");
		
		RequestDispatcher rd=request.getRequestDispatcher("process2.jsp");
		rd.forward(request, response);
		
	}
}
