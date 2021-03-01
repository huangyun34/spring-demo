package com.my.spring.zeroconfig;

import com.my.spring.cors.CrossFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author huangyun
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //父容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //扫描根文件
        return new Class[]{SpringContainer.class};
    }

    //Spring MVC配置子容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcContainer.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        //注释，有限使用拦截器解决跨域问题
//        return new Filter[]{new CrossFilter()};
        return super.getServletFilters();
    }
}
