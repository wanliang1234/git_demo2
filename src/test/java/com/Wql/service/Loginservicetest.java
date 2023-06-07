package com.Wql.service;

import com.Wql.config.SpringConfig;
import com.Wql.domain.LoginPojo;
import com.Wql.service.imp.Loginservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Loginservicetest
{
    @Autowired
    private Loginservice loginservice;

    @Test
    public void getByid()
    {
        LoginPojo loginPojo=new LoginPojo();
        loginPojo.setUser("nh");
        loginPojo.setPassword("nh6");
        LoginPojo byid = loginservice.getByid(loginPojo);
        System.out.println(byid);
    }
}
