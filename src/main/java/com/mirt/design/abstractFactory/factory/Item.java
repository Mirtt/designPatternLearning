package com.mirt.design.abstractFactory.factory;

/**
 * 是Link和Tray的父类，这样可以让List和Tray具有了可替换性
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
