package com.mirt.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类，继承Entry，跟文件类保持一致
 *
 * @author Mirt Zhang
 * @date 2018/8/6
 */
public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        directory.forEach(d -> d.printList(prefix + "/" + name));
    }
}
