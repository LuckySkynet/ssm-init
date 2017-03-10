package com.skynet.dao;

import com.skynet.entity.UserEntity;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by SkyNet on 2017/3/9.
 * 配置spring与junit整合，junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    //注入Dao实现类依赖
    @Autowired
    private UserDao userDao;

    @Test
    public void queryById() throws Exception {
        long userId = 1;
        UserEntity userEntity = userDao.queryById(userId);
        System.out.println(userEntity);
        assertNotNull(userEntity);
    }

    @Test
    public void queryAll() throws Exception {
        List<UserEntity> userEntities = userDao.queryAll(0, 5);
        for (UserEntity userEntity : userEntities) {
            System.out.println(userEntity);
        }
        assertNotNull(userEntities);
    }

    @Test
    public void deleteById() throws Exception {
        long userId = 6;
        userDao.deleteById(userId);
    }

    @Test
    public void updateUser() throws Exception {
        UserEntity userEntity = userDao.queryById(6);
        userEntity.setUserName("废柴君");
        userDao.updateUser(userEntity);
    }

    @Test
    public void insertUser() throws Exception {
        UserEntity userEntity = new UserEntity("a云巅","123456");
        userDao.insertUser(userEntity);
    }

}