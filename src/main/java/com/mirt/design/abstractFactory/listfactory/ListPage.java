package com.mirt.design.abstractFactory.listfactory;

import com.mirt.design.abstractFactory.factory.Item;
import com.mirt.design.abstractFactory.factory.Page;

/**
 * Page的具体实例类
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>" + title + "</title></head>")
                .append("<body>\n")
                .append("<h1>" + title + "title")
                .append("<ul>\n");
        for (Item item : content) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n")
                .append("<hr><address>" + author + "</address>")
                .append("</body></html>\n");
        return sb.toString();
    }
}
