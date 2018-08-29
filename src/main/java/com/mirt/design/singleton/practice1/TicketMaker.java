package com.mirt.design.singleton.practice1;

/**
 * 将该类实现为单例模式，保证制作ticket的时候程序只能从一个实例获取id
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class TicketMaker {

    public static TicketMaker getInstance() {
        return TicketHolder.INSTANCE;
    }

    public synchronized int getNextTicketNumber() {
        System.out.println(ticket++);
        return ticket;
    }

    private int ticket = 1000;

    private TicketMaker() {
    }

    private static class TicketHolder {
        private static final TicketMaker INSTANCE = new TicketMaker();
    }

}
