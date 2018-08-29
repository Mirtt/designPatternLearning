package com.mirt.design.state;

/**
 * 客户端调用
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class Client {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("状态变换演示");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
