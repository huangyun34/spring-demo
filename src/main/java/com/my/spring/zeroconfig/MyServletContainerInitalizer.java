package com.my.spring.zeroconfig;

import org.springframework.util.ReflectionUtils;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@HandlesTypes(LoadServlet.class)
public class MyServletContainerInitalizer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        if (null != set) {
            Iterator<Class<?>> iterator = set.iterator();
            while (iterator.hasNext()) {
                Class<?> waiClass = iterator.next();
                if (!waiClass.isInterface() && !Modifier.isAbstract(waiClass.getModifiers()) && LoadServlet.class.isAssignableFrom(waiClass)) {
                    try {
                        ((LoadServlet)waiClass.newInstance()).loadOnStartup(servletContext);
                    } catch (Throwable var7) {
                        throw new ServletException("Failed to instantiate WebApplicationInitializer class", var7);
                    }
                }
            }
        }

    }
}
