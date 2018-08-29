package com.mirt.design.abstractFactory.factory;

/**
 * 抽象零件LINK，是抽象的表示HTML中的超链接属性
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
