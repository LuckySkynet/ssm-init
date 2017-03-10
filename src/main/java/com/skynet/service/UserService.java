package com.skynet.service;

import com.skynet.entity.UserEntity;

import java.util.List;

/**
 * Created by SkyNet on 2017/3/9.
 */
public interface UserService {

    UserEntity getUser(Long userId);

    List<UserEntity> getUsers(Integer offset, Integer limit);

    void deleteUser(Long userId);

    void saveUser(UserEntity user);

}
