package com.mirt.design.bridge;

/**
 * 客户端
 * <p>
 * 桥接模式，将类的功能层次结构 和 类的实现层次结构 分开来实现，能够更加清晰的表述出来。
 *
 * @author Zhang Yuqi
 * @date 2018/7/16
 */
public class Client {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("hello,1"));
        Display d2 = new CountDisplay(new StringDisplayImpl("hello,2"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,3"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        // practice 实现一种随机打印次数的功能

        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("rnd! num!"));
        d4.randomDisplay(7);
    }
}
