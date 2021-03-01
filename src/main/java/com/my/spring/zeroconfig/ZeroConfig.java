package com.my.spring.zeroconfig;

import com.my.spring.interceptors.Interceptor1;
import com.my.spring.interceptors.Interceptor2;
import com.my.spring.interceptors.Interceptor3;
import com.my.spring.interceptors.InterceptorSimple;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 *      可重写勾子方法定制规则
 */
@Configuration
@EnableWebMvc
public class ZeroConfig implements WebMvcConfigurer {

    //    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//
//    }
//
//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//
//    }
//
//    @Override
//    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
//
//    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//
//    }
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor1()).addPathPatterns("/**").excludePathPatterns("/t").order(2);
        registry.addInterceptor(new Interceptor2(new InterceptorSimple())).addPathPatterns("/**").excludePathPatterns("/t").order(3);
        registry.addWebRequestInterceptor(new Interceptor3()).addPathPatterns("/**").excludePathPatterns("/t").order(1);
    }

    //
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//
//    }
//
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//
//    }
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//
//    }
//
//    @Override
//    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
//
//    }
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//
//    }
//
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//
//    }
//
//    @Override
//    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
//
//    }
//
//    @Override
//    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
//
//    }
//
//    @Override
//    public Validator getValidator() {
//        return null;
//    }
//
//    @Override
//    public MessageCodesResolver getMessageCodesResolver() {
//        return null;
//    }
}
