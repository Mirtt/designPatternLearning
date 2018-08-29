package com.mirt.design.chain;

/**
 * 责任链之一，只解决一些特殊的问题
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
