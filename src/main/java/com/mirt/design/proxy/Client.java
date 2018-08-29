package com.mirt.design.proxy;

/**
 * 客户端调用
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class Client {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("alice");
        System.out.println("现在的打印机是：" + p.getPrinterName());
        p.setPrinterName("bob");
        System.out.println("现在的打印机是：" + p.getPrinterName());
        p.print("hello world!");
    }
}
