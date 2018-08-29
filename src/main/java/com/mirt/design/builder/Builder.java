package com.mirt.design.builder;

/**
 * 决定具体的建造过程，builder模式的核心
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public interface Builder {

    void makeTitle(String title);

    void makeString(String string);

    void makeItems(String[] items);

    void close();
}
