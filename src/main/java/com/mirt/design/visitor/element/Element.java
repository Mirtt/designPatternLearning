package com.mirt.design.visitor.element;

import com.mirt.design.visitor.Visitor;

/**
 * 接受访问者的接口
 *
 * @author Mirt Zhang
 * @date 2018/8/13
 */
public interface Element {

    void accept(Visitor v);

}
