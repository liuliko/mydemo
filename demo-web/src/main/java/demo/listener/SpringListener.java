package demo.listener;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;


public class SpringListener implements ApplicationListener<ContextRefreshedEvent> {

    public void onApplicationEvent(ContextRefreshedEvent event) {

        WebApplicationContext applicationContext = (WebApplicationContext) event.getApplicationContext();
        ServletContext servletContext = applicationContext.getServletContext();

        //系统启动后执行代码


    }
}
