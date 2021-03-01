package com.my.spring.interceptors;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.AsyncWebRequestInterceptor;
import org.springframework.web.context.request.WebRequest;

public class InterceptorSimple implements AsyncWebRequestInterceptor {
    @Override
    public void afterConcurrentHandlingStarted(WebRequest webRequest) {

    }

    @Override
    public void preHandle(WebRequest webRequest) throws Exception {
//        System.out.println("bbbbbb");
//        webRequest.setAttribute("age", 1, 1);
//        System.out.println(webRequest.getAttribute("age", 1));
    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {
//        System.out.println(webRequest.getAttribute("age", 1));
    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
