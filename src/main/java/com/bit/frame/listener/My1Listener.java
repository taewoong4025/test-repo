package com.bit.frame.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class My1Listener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed");
	}

}
