package com.my.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 使用SimpleUrlHandlerMapping方式，这个有配置支撑，设置请求路径等，
 * 如 {@link com.my.spring.controller.config.SimpleUrlConfig}
 */
@Component
public class RequestHandlerController implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("==========RequestHandlerController");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println("ok");
        writer.flush();
        writer.close();
    }
}
