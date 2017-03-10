package com.skynet.service;

import com.skynet.entity.UserEntity;

import java.util.List;

/**
 * Created by SkyNet on 2017/3/9.
 */
public interface UserService {

    UserEntity getUser(long userId);

    List<UserEntity> getUsers(int offset, int limit);

    void deleteUser(long userId);

}
