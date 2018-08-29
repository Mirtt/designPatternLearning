package com.mirt.design.prototype;

import com.mirt.design.prototype.framework.Manager;
import com.mirt.design.prototype.framework.Product;

/**
 * 客户端，用于生成两个比较难于实例化的实例，并且调用其中的方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class Client {
    public static void main(String[] args) {
        // 此阶段为模拟初始化过程，将所有原型存入到manager中进行统一管理
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("underline1", underlinePen);
        manager.register("messageBox1", messageBox1);
        manager.register("messageBos2", messageBox2);
        // 注册阶段结束

        // 以下为具体客户端调用过程
        Product p1 = manager.create("underline1");
        p1.use("hello,ya");
        Product p2 = manager.create("messageBox1");
        p2.use("hello,ya");
        Product p3 = manager.create("messageBos2");
        p3.use("hello,ya");
    }
}
