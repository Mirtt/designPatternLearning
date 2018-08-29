package com.mirt.design.adapter.delegate;

/**
 * 客户端调用，使用委托的模式适配
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class Client {
    public static void main(String[] args) {
        Print pb = new PrintBanner("xxx");
        pb.printStrong();
        pb.printWeak();
    }
}
