package com.my.spring.aop.custom;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

public class CustomAdvisor extends AbstractBeanFactoryPointcutAdvisor {
    CustomPointCut customPointCut = new CustomPointCut();
    @Override
    public Pointcut getPointcut() {
        return customPointCut;
    }
}
