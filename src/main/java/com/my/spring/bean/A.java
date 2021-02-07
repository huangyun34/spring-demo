package com.my.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class A {

    private String name;

    private String sex;

    public void hallo() {
        System.out.println("123231");
    }
}
