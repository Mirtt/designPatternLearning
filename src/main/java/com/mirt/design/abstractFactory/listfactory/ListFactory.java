package com.mirt.design.abstractFactory.listfactory;

import com.mirt.design.abstractFactory.factory.Factory;
import com.mirt.design.abstractFactory.factory.Link;
import com.mirt.design.abstractFactory.factory.Page;
import com.mirt.design.abstractFactory.factory.Tray;

/**
 * 生成列表的具体的工厂，继承自抽象工厂
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
