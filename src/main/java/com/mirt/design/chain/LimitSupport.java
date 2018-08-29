package com.mirt.design.chain;

/**
 * 责任链之一，只解决问题编号小于limit值的问题
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
