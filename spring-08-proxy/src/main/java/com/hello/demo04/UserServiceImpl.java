package com.hello.demo04;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void update() {
        System.out.println("更新用户");
    }

    public void query() {
        System.out.println("查询用户");
    }
}