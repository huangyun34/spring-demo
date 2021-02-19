package com.my.spring.zeroconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * 不扫描有@Controller的类
 */
@ComponentScan(
        basePackages = "com.my.spring",
        includeFilters = {
                @ComponentScan.Filter(classes = Controller.class)
        }
)
public class MvcContainer {
}
