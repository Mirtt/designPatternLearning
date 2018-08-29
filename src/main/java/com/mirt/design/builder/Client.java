package com.mirt.design.builder;

/**
 * 客户端，通过不同的建造模式的来实现不同的建造效果
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class Client {
    public static void main(String[] args) {
        TextBuilder t = new TextBuilder();
        Director director = new Director(t);
        director.construct();
        System.out.println(t.build());
    }
}
