package com.skynet.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SkyNet on 2017/3/9.
 */
public class UserEntity implements Serializable{

    private static final Long serialVersionUID=1L;

    private Long userId;
    private String userName;
    private String password;
    private Date createTime;

    public UserEntity() {
    }

    public UserEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
