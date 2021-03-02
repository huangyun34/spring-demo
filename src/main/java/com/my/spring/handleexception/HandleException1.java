package com.my.spring.handleexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice
public class HandleException1 {

    @ExceptionHandler(value = Exception.class)
    public @ResponseBody String ex1() {
        return "bb";
    }
}
