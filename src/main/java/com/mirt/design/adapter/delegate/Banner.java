package com.mirt.design.adapter.delegate;

/**
 * 打印标语功能，作为需要被适配的类
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + this.string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + this.string + "*");
    }
}
