package com.mirt.design.proxy;

import java.util.Objects;

/**
 * 表示代理人角色的类
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class PrinterProxy implements Printable {
    private String name; // 代理人的名称
    private Printer real; // 被代理的类

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (Objects.nonNull(real))
            real.setPrinterName(name);
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        // 实例化 代理的类
        if (Objects.isNull(real))
            real = new Printer(name);
    }
}
