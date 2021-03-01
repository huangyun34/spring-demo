package com.my.spring.cors;

/**
 * 描述：
 * 解决跨域问题
 * 三种方式
 * 1、在controller中增加@CrossOrigin注解
 * 2、spring拦截器处理(重写ZeroConfig中addCorsMappings)
 * 3、servlet规范中的filter解决
 */