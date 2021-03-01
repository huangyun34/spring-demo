package com.my.spring.cors;

import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping("/cross")
public class CrossController {

    @CrossOrigin
    @GetMapping("/query")
    public String query() {
        return "ok";
    }
}
