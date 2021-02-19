package com.my.spring.controller;

import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/query")
    public String query(@RequestParam String name) {
        //如果想拿request，但是不想通过参数传递，可以使用RequestContextHolder工具类，resp同理
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        System.out.println(request.getParameter("name"));
        //通过流的方式获取参数名称，spring封装的工具类
        ParameterNameDiscoverer parameterNameDiscoverer = new DefaultParameterNameDiscoverer();
        Method method = ReflectionUtils.findMethod(TestController.class, "query", String.class);
        String[] parameterNames = parameterNameDiscoverer.getParameterNames(method);
        if (parameterNames.length > 0) {
            for (String parameterName : parameterNames) {
                System.out.println(parameterName);
            }
        }
        return name;
    }
}
