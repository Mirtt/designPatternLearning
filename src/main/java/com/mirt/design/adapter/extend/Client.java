package com.mirt.design.adapter.extend;

/**
 * 客户端调用，使用继承的方式实现适配
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class Client {
    public static void main(String[] args) {
        Print pb = new PrintBanner("xxx");
        pb.printStrong();
        pb.printWeak();
        System.out.println(Client.class.getResource("").getPath());
    }
}
