package com.mirt.design.bridge;

import java.util.Random;

/**
 * 类的功能层次结构第二层，拓展了新功能
 *
 * @author Zhang Yuqi
 * @date 2018/7/16
 */
public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        int rnd = new Random().nextInt(times);
        for (int i = 0; i < rnd; i++) {
            print();
        }
        close();
    }
}
