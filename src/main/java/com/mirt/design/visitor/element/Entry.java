package com.mirt.design.visitor.element;

import java.util.Iterator;

/**
 * 抽象类，用于文件和文件夹保持一致性
 * <p>
 * 实现element接口 用于接受访问器的访问！
 *
 * @author Mirt Zhang
 * @date 2018/8/6
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    /**
     * 用于获取iterator，此方法仅适用于directory
     *
     * @return
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }
}
