package com.mirt.design.template;

/**
 * 抽象模板类，其中抽象方法交由子类实现，不可继承的具体方法为模版方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 模板方法，子类不可实现该方法
     */
    final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
