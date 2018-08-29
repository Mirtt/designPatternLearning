package com.mirt.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成数值的抽象类
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public abstract class NumberGenerator {
    // 用于保存所有的观察者
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        // 向观察者发送通知
        observers.forEach(o -> o.update(this));
    }

    /**
     * 获取当前数值
     *
     * @return
     */
    public abstract int getNumber();

    /**
     * 生成数值，并且通知所有观察者
     */
    public abstract void execute();
}
