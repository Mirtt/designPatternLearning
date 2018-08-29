package com.mirt.design.bridge;

/**
 * 类的实现层次结构第二层级，具体实现怎么输出
 *
 * @author Zhang Yuqi
 * @date 2018/7/16
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string; // 要显示的字符串
    private int width; // 要显示的字符串的byte数组长度

    public StringDisplayImpl(String s) {
        this.string = s;
        this.width = s.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|"); // 前后加入 | 显示
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
