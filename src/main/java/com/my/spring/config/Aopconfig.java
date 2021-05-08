package com.my.spring.config;

import com.my.spring.importbean.WeiYuanImport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@WeiYuanImport
public class Aopconfig {
}
