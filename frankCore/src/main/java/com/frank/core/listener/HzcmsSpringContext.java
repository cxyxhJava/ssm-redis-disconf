package com.frank.core.listener;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HzcmsSpringContext implements ServletContextListener {
	private static WebApplicationContext springContext;

	public HzcmsSpringContext() {
		super();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		springContext = WebApplicationContextUtils
				.getWebApplicationContext(event.getServletContext());
		
		ConvertUtils.register(new DateConverter(null), java.util.Date.class);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}

	public static ApplicationContext getApplicationContext() {
		return springContext;
	}
}
