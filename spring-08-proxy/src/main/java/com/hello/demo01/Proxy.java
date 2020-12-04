package com.hello.demo01;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        hetong();
        host.rent();
        jiaoqian();
    }

    public void hetong() {
        System.out.println("链家：你们两方签合同");
    }

    public void jiaoqian() {
        System.out.println("链家：这边把费用算一下");
    }
}
