package com.hello.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        //service.add();//不使用代理时
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(service);
        proxy.query();
    }
}
