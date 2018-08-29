package com.mirt.design.observer;

/**
 * 观察者接口，具体的观察者会实现该接口
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public interface Observer {
    /**
     * NumberGenerator会调用观察者的update方法告知观察者，生成数值发生了变化
     *
     * @param generator
     */
    void update(NumberGenerator generator);
}
