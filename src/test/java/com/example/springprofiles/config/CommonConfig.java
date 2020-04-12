package com.example.springprofiles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;

@Configuration
@Import(value = {SqlServerConfig.class, OracleConfig.class})
public class CommonConfig {

    @PostConstruct
    public void init() {
        System.out.println("inside common config");
    }

}
