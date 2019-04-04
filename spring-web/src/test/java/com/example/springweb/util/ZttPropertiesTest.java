package com.example.springweb.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZttPropertiesTest {
    @Autowired
    private ZttProperties zttProperties;

    @Test
    public void getTitle() throws Exception {
        System.out.println(zttProperties.getTitle());
        System.out.println(zttProperties.getDesc());
    }
}