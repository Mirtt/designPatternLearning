package com.mirt.design.template;

/**
 * 模板方法的子类 char display
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class CharDisplay extends AbstractDisplay {
    private char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(aChar);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
