package com.mirt.design.chain;

/**
 * 用于表示需要交给责任链处理解决的问题
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}