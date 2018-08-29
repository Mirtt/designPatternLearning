package com.mirt.design.bridge;

/**
 * 类的功能层次结构第二层级，扩展了新的功能
 *
 * @author Zhang Yuqi
 * @date 2018/7/16
 */
public class CountDisplay extends Dispaly {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 拓展的新功能（多次打印）
     *
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
