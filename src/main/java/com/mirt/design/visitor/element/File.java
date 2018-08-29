package com.mirt.design.visitor.element;

import com.mirt.design.visitor.Visitor;

/**
 * 表示文件的类，继承Entry
 *
 * @author Mirt Zhang
 * @date 2018/8/6
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
