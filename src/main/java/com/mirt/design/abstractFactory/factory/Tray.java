package com.mirt.design.abstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示含有多个Link或者多个Tray的容器
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public abstract class Tray extends Item {

    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
