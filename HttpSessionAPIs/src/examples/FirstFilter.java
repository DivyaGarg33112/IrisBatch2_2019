package examples;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/index.htm")
//@WebFilter("/*")
//@WebFilter({"/page2","/page3"})
public class FirstFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	System.out.println("First filter is getting initialized");
	}

	public void destroy() {
	System.out.println("I m getting destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse 
			response, FilterChain chain) 
					throws IOException, ServletException {
		
	System.out.println("Preprocessing the request");	
	chain.doFilter(request, response);
	System.out.println("Postprocessing the request");
	}
}
