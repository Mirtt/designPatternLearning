package com.mirt.design.decorator;

/**
 * 客户端调用，装饰器
 *
 * @author Mirt Zhang
 * @date 2018/8/7
 */
public class Client {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("hello,world");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d1);

        d1.show();
        d2.show();
        d3.show();

        Display d4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(new StringDisplay("world!!")
                                        ), '*'
                                )
                        )
                ), '/'
        );
        d4.show();
    }
}
