package com.hello.dao;

import com.hello.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    int addUser(User user);
    int addUser2(Map<String, Object> map);
    int updateUser(User user);
    int deleteUser(int id);
}
