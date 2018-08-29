package com.mirt.design.decorator;

/**
 * 可以显示多行字符串的抽象类
 *
 * @author Mirt Zhang
 * @date 2018/8/7
 */
public abstract class Display {
    /**
     * 获取横向字符数
     *
     * @return 字符数
     */
    public abstract int getColumns();

    /**
     * 获取纵向行
     *
     * @return 纵向行数
     */
    public abstract int getRows();

    /**
     * 获取第row行字符串
     *
     * @param row 行数
     * @return 字符串
     */
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
