package com.my.spring.zeroconfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class LoadServletImpl implements LoadServlet {
    @Override
    public void loadOnStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic initServlet = servletContext.addServlet("initServlet", InitServlet.class);
        initServlet.setLoadOnStartup(1);
        initServlet.addMapping("/init");
    }
}
