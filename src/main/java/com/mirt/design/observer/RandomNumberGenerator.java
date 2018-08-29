package com.mirt.design.observer;

import java.util.Random;

/**
 * 具体的数字生成类
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random rand = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = rand.nextInt(50);
            notifyObservers();
        }
    }
}
