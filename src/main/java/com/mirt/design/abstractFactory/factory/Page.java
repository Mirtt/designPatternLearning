package com.mirt.design.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的产品，抽象的表示HTML页面
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String fileName = title + ".html";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write(this.makeHTML());
            System.out.println("编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
