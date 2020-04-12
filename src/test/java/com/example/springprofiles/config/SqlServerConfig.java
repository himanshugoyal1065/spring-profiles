package com.example.springprofiles.config;

import com.example.springprofiles.dao.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration
@Profile("sqlServer")
public class SqlServerConfig {

    @PostConstruct
    public void init() {
        System.out.println("sql server configuration");
    }

    @Bean
    public DataSource getDataSource() {
        return new DataSource("SQL server");
    }
}
