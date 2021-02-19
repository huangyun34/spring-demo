package com.my.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/order/index")
public class BeanNameController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("============order.index");
        ModelAndView modelAndView = new ModelAndView();
        RedirectView redirectView = new RedirectView("https://www.baidu.com");
        modelAndView.setView(redirectView);
        return modelAndView;
    }
}
