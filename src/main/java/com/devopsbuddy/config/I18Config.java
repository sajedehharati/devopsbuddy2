package com.devopsbuddy.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by adminuser on 7/6/17.
 */
@Configuration
public class I18Config {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
     ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
     resourceBundleMessageSource.setBasename("classpath:i18n/messages");
     resourceBundleMessageSource.setCacheSeconds(1800);
     return  resourceBundleMessageSource;
    }
}

