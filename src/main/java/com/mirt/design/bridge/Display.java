package com.mirt.design.bridge;

/**
 * 类的功能层次结构最顶层
 *
 * @author Zhang Yuqi
 * @date 2018/7/16
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 模版方法 ，不应被重写
     */
    public final void display() {
        open();
        print();
        close();
    }

}
