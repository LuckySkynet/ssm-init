package com.skynet.dao;

import com.skynet.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by SkyNet on 2017/3/9.
 */
public interface UserDao {

    /**
     * 通过Id查询用户
     * @param userId
     * @return
     */
    UserEntity queryById(long userId);

    /**
     * 根据偏移量查询用户
     * @return
     */
    List<UserEntity> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过Id删除用户
     * @param userId
     */
    void deleteById(long userId);

    /**
     * 更新用户数据
     * @param user
     */
    void updateUser(UserEntity user);

    /**
     * 创建新用户
     * @param user
     */
    void insertUser(UserEntity user);
}
