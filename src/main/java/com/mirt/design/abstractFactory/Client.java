package com.mirt.design.abstractFactory;

import com.mirt.design.abstractFactory.factory.Factory;
import com.mirt.design.abstractFactory.factory.Link;
import com.mirt.design.abstractFactory.factory.Page;
import com.mirt.design.abstractFactory.factory.Tray;
import com.mirt.design.abstractFactory.listfactory.ListFactory;

/**
 * 客户端，通过抽象工厂组合抽象零件 制造抽象产品
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length != 1) {
            System.out.println("参数不正确！！");
        }
        Factory factory = Factory.getFactory(ListFactory.class);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.com");

        Link baidu = factory.createLink("baidu", "http://www.baidu.com");
        Link sougou = factory.createLink("sogou", "http://www.sougo.com");

        Tray trayNews = factory.createTray("新闻");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray traySearch = factory.createTray("搜索");
        traySearch.add(baidu);
        traySearch.add(sougou);

        Page page = factory.createPage("LinkPage", "Mirt");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
