package com.my.spring.zeroconfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public interface LoadServlet {

    void loadOnStartup(ServletContext servletContext) throws ServletException;
}
