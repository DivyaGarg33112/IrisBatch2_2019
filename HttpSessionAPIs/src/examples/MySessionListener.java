package examples;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener {

	
    public void sessionCreated(HttpSessionEvent event)  {
    	
    	HttpSession session=event.getSession();
    	ServletContext context=session.getServletContext();
    	
    	Object obj=context.getAttribute("counter");
    	if(obj!=null){
    		Integer i=(Integer)obj;
    		i++;
    		context.setAttribute("counter",i);
    	}
    	else {
    		context.setAttribute("counter",1);
    	}
    }

    public void sessionDestroyed(HttpSessionEvent event)  {
    	HttpSession session=event.getSession();
    	ServletContext context=session.getServletContext();
    	Object obj=context.getAttribute("counter");
    	if(obj!=null){
    		Integer i=(Integer)obj;
    		i--;
    		context.setAttribute("counter",i);
    	}
    	
    }
	
}
