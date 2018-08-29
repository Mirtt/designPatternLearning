package com.mirt.design.iterator;

/**
 * 迭代器接口，表明迭代器中具体需要实现的方法
 *
 * @author Zhang Yuqi
 * @date 2018/7/11.
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
