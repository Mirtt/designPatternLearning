package com.mirt.design.chain;

/**
 * 责任链之一，只解决问题编号为奇数的问题
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 != 0;
    }
}
