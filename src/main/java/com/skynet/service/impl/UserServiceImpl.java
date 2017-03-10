package com.skynet.service.impl;

import com.skynet.dao.UserDao;
import com.skynet.entity.UserEntity;
import com.skynet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SkyNet on 2017/3/9.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserEntity getUser(long userId) {
        return userDao.queryById(userId);
    }

    @Override
    public List<UserEntity> getUsers(int offset, int limit) {
        return userDao.queryAll(offset, limit);
    }

    @Override
    public void deleteUser(long userId) {
        userDao.deleteById(userId);
    }
}
