package com.mirt.design.chain;

/**
 * 责任链之一，但是不解决任何问题
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
