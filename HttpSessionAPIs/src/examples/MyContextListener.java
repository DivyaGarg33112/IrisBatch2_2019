package examples;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
      System.out.println("Application has been shut down");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
       System.out.println("Application has been deployed..");
    }
	
}
