package com.learningspring.app.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class FilterBeanConfig {

    @Bean
    public FilterRegistrationBean<LoggingFilter> loggingFilter(){
        FilterRegistrationBean<LoggingFilter> loggingBean
                = new FilterRegistrationBean<>();
        loggingBean.setFilter(new LoggingFilter());
        loggingBean.addUrlPatterns("/student/*");
        loggingBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return loggingBean;
    }
}
