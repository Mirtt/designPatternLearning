package com.mirt.design.chain;

/**
 * 客户端调用，使用责任链解决问题
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class Client {
    public static void main(String[] args) {
        Support nonSupport = new NoSupport("nonSupport");
        Support limitSupport = new LimitSupport("limitSupport", 100);
        Support oddSupport = new OddSupport("oddSupport");
        Support specialSupport = new SpecialSupport("specialSupport", 428);

        nonSupport.setNext(limitSupport).setNext(oddSupport).setNext(specialSupport);

        for (int i = 0; i < 500; i++) {
            nonSupport.support(new Trouble(i));
        }
    }
}
