package com.skynet.service;

import com.skynet.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by SkyNet on 2017/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUser() throws Exception {
        long userId = 1;
        UserEntity user = userService.getUser(userId);
        System.out.println(user);
    }

    @Test
    public void getUsers() throws Exception {

    }

}