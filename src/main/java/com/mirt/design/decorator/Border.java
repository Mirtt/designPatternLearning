package com.mirt.design.decorator;

/**
 * 用于装饰string输出样式的 装饰器抽象类
 *
 * @author Mirt Zhang
 * @date 2018/8/7
 */
public abstract class Border extends Display {
    //表示被装饰物
    protected Display display;

    // 在生成实例的时候 通过参数指定被装饰物
    protected Border(Display display) {
        this.display = display;
    }
}
