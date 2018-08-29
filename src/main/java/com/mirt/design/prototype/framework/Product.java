package com.mirt.design.prototype.framework;

/**
 * 声明了原型中需要实现的方法和复制原型的方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
