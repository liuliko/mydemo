package demo.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CustomerServletContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext context = arg0.getServletContext();
		context.setAttribute("contextpath", context.getContextPath());
	}
}
