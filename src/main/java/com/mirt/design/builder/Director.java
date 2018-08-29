package com.mirt.design.builder;

/**
 * 指挥者，内聚Builder但是不指定具体使用哪一种builder，这个由调用者来决定
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("This is title");
        builder.makeString("this is string 1");
        builder.makeItems(new String[]{"strArray", "strArray again"});
        builder.makeString("This is the end");
        builder.close();
    }
}
