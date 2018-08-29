package com.mirt.design.factory.framework;

/**
 * 框架中的工厂类，用于生产具体的产品
 * 用到工厂模式就一定会用到模版模式，具体的生成规则交由子类处理，抽象的工厂类编写统一实例化方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public abstract class Factory<E extends Product> {

    public final E create(String owner) {
        E var = createProduct(owner);
        registerProduct(var);
        return var;
    }

    protected abstract E createProduct(String owner);

    protected abstract void registerProduct(E var);
}
