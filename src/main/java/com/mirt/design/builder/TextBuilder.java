package com.mirt.design.builder;

/**
 * 文本建造方式，以文本的形式构建
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class TextBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("================\n");
        buffer.append("\t").append(title).append("\t");
        buffer.append("\n");
    }

    @Override
    public void makeString(String string) {
        buffer.append("——").append(string).append('\n');
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            buffer.append("\t").append(s).append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("================");
    }

    public String build() {
        return buffer.toString();
    }
}
