package com.my.spring.handleexception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/excp/test")
public class ExceptionController {

    @GetMapping("/t1")
    public String t1() {
        if (true) {
            throw new RuntimeException();
        }
        return "ok";
    }

    @GetMapping("/t2")
    public String t2() {
        if (true) {
            throw new ResponseStatusEx();
        }
        return "ok";
    }

//    @ExceptionHandler(value = RuntimeException.class)
//    public String ex1() {
//        return "ex";
//    }
}
