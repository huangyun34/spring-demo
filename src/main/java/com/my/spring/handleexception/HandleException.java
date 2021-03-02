package com.my.spring.handleexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice
public class HandleException {

    @ExceptionHandler(value = RuntimeException.class)
    public @ResponseBody String ex1() {
        return "ex";
    }
}
