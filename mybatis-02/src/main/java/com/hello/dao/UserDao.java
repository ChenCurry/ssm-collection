package com.hello.dao;

import com.hello.pojo.User;

import java.util.List;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
}
