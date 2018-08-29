package com.mirt.design.adapter.delegate;

/**
 * 由于print与banner 中方法不同，两个类无法衔接，由于java受限于只可以继承单独类，故无法通过类继承的方式适配方法，
 * 只能通过在该类中聚合需要被适配的类来达到目的
 * 此类作为适配器，将已有的banner与需求方要求的print适配起来
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
