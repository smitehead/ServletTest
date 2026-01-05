package com.web.common.listener;

import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletContextTestListener implements ServletContextListener {


    public ServletContextTestListener() {
        // TODO Auto-generated constructor stub
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("서버종료 됨");
    	
    	// TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("서버생성됨");
    	ServletContext context = sce.getServletContext();
    	System.out.println(context.getContextPath());
    	String javahome = System.getenv("JAVA_HOME");
    	System.out.println(javahome);
    }
	
}
