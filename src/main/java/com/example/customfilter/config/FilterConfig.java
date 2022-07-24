package com.example.customfilter.config;

import com.example.customfilter.filter.StopwatchFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {

    @Bean
    FilterRegistrationBean<StopwatchFilter> stopwatchFilter() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean(new StopwatchFilter());
        return filterBean;
    }


}
