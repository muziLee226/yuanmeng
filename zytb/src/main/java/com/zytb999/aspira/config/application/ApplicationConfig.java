package com.zytb999.aspira.config.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class ApplicationConfig {

    public static String port;
    @Value("${server.port}")
    public  void  setPort(String port) {
       ApplicationConfig.port=port;
    }

    public static String name;
    @Value("${server.servlet.session.cookie.name}")
    public  void  setName(String name) {
        ApplicationConfig.name=name;
    }

    public static String contextPath;
    @Value("${server.servlet.context-path}")
    public  void  setContextPathe(String contextPath) {
        ApplicationConfig.contextPath=contextPath;
    }

    public static String active;
    @Value("${spring.profiles.active}")
    public  void  setActive(String active) {
        ApplicationConfig.active=active;
    }

    public static String include;
    @Value("${spring.profiles.include}")
    public  void  setInclude(String include) {
        ApplicationConfig.include=include;
    }

    public static String initialSize;
    @Value("${spring.datasource.druid.initialSize}")
    public  void  setInitialSize(String initialSize) {
        ApplicationConfig.initialSize=initialSize;
    }

    public static String maxEvictableIdleTimeMillis;
    @Value("${spring.datasource.druid.maxEvictableIdleTimeMillis}")
    public  void  setMaxEvictableIdleTimeMillis(String maxEvictableIdleTimeMillis) {
        ApplicationConfig.maxEvictableIdleTimeMillis=maxEvictableIdleTimeMillis;
    }

    public static String minEvictableIdleTimeMillis;
    @Value("${spring.datasource.druid.maxEvictableIdleTimeMillis}")
    public  void  setMinEvictableIdleTimeMillis(String minEvictableIdleTimeMillis) {
        ApplicationConfig.minEvictableIdleTimeMillis=minEvictableIdleTimeMillis;
    }
}
