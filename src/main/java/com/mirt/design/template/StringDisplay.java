package com.mirt.design.template;

import java.io.UnsupportedEncodingException;

/**
 * 模板方法的子类 string display
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class StringDisplay extends AbstractDisplay {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        try {
            printBanner();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        try {
            printBanner();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void printBanner() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("+");
        for (int i = 0; i < string.getBytes("gb2312").length; i++) {
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb);
    }
}
