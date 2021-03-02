package com.my.spring.handleexception;

/**
 * spring controller异常处理，代码在DispatcherServlet中processDispatchResult方法中，有一段逻辑处理的，源码就在if (exception != null)中
 *
 * spring中controller异常处理有3种方式
 * 1、在对应的controller类中增加@ExceptionHandler注解的方法
 * 2、写个单独的处理类（支持多个），上面加上@ControllerAdvice注解，然后在方法中加入@ExceptionHandler注解的方法来处理
 * 3、自定义异常，使用@ResponseStatus注解，抛出该异常
 */