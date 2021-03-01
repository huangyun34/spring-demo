package com.my.spring.interceptors;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.AsyncWebRequestInterceptor;
import org.springframework.web.context.request.WebRequest;

public class Interceptor3 implements AsyncWebRequestInterceptor {
    @Override
    public void afterConcurrentHandlingStarted(WebRequest webRequest) {
        System.out.println("异步后置拦截器3");
    }

    @Override
    public void preHandle(WebRequest webRequest) throws Exception {
        System.out.println("前置拦截器3");
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {
        System.out.println("中止拦截器3");
    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {
        System.out.println("同步后置拦截器3");
    }
}
