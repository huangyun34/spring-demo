package com.my.spring.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

@Configuration
public class SimpleUrlConfig {

    @Bean
    public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        Properties properties = new Properties();
        properties.put("request/index", "requestHandlerController");
        simpleUrlHandlerMapping.setMappings(properties);
        return simpleUrlHandlerMapping;
    }
}
