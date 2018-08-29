package com.mirt.design.observer;

/**
 * 其中一个观察者
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator
                               generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
