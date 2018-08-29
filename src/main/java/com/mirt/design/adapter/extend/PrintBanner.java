package com.mirt.design.adapter.extend;

/**
 * 由于print与banner 中方法不同，两个类无法衔接，
 * 需要此类作为适配器，将已有的banner与需求方要求的print适配起来
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
