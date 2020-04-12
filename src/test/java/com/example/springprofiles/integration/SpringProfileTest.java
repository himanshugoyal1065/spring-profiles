package com.example.springprofiles.integration;

import com.example.springprofiles.config.CommonConfig;
import com.example.springprofiles.dao.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonConfig.class})
public class SpringProfileTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test() {
        System.out.println("the current datasource property is " + dataSource.getProperties());
    }
}
