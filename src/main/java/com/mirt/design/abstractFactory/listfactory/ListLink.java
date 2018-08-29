package com.mirt.design.abstractFactory.listfactory;

import com.mirt.design.abstractFactory.factory.Link;

/**
 * Link零件的具体实例类
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>";
    }
}
