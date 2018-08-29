package com.mirt.design.composite;

/**
 * 抽象类，用于文件和文件夹保持一致性
 *
 * @author Mirt Zhang
 * @date 2018/8/6
 */
public abstract class Entry {

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
}
