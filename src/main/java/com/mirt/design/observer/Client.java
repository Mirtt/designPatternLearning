package com.mirt.design.observer;

/**
 * 客户端
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class Client {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);
        generator.execute();
    }
}
