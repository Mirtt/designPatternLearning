package com.mirt.design.abstractFactory.factory;

/**
 * 抽象工厂类，提供获取其他抽象零件产品等的方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/14
 */
public abstract class Factory {
    public static Factory getFactory(Class<?> clazz) {
        Factory factory = null;
        try {
            factory = (Factory) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);

}
