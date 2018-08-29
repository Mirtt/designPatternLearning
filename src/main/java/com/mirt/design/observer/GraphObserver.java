package com.mirt.design.observer;

/**
 * 其中一个观察者：将观察到的数值以图形的形式显示出来
 *
 * @author Mirt Zhang
 * @date 2018/8/14
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
