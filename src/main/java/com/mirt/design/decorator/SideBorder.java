package com.mirt.design.decorator;

/**
 * 具体的装饰类，装饰字符串的左右边界
 *
 * @author Mirt Zhang
 * @date 2018/8/7
 */
public class SideBorder extends Border {

    private char borderChar;


    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
