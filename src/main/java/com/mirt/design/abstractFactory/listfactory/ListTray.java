package com.mirt.design.abstractFactory.listfactory;

import com.mirt.design.abstractFactory.factory.Item;
import com.mirt.design.abstractFactory.factory.Tray;

/**
 * Tray的具体实例类
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n")
                .append(caption + "\n")
                .append("<ul>\n");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n")
                .append("</li>\n");
        return sb.toString();
    }
}
