package com.mirt.design.mediator;

/**
 * 中介接口，用于管理其下的所有组件间通信
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public interface Mediator {
    /**
     * 用于生成mediator管理的组件
     */
    void createColleagues();

    /**
     * 此方法会被各个组件调用，用于组件和mediator之间通信
     */
    void colleagueChanged();
}
