package com.mirt.design.iterator;

/**
 * 迭代接口，实现该接口表明可以使用iterator方法返回迭代器
 * <p>
 * 与 java.lang.Iterable 类比
 *
 * @author Zhang Yuqi
 * @date 2018/7/11.
 */
public interface Aggregate {

    Iterator iterator();

}
