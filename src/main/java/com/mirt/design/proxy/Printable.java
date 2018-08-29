package com.mirt.design.proxy;

/**
 * 为了保证代理类和被代理类的一致性
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public interface Printable {
    void setPrinterName(String name);

    String getPrinterName();

    void print(String string);
}
