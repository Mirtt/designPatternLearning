package com.mirt.design.visitor;


import com.mirt.design.visitor.element.Directory;
import com.mirt.design.visitor.element.File;

/**
 * 访问模式的抽象类，定义访问方法
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
