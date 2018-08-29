package com.mirt.design.prototype;

import com.mirt.design.prototype.framework.Product;

/**
 * 一种产品的形式，这种产品的实例类不容易生成，可以通过框架中Manager来生成
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        println(length);
        System.out.println(decochar + " " + s + " " + decochar);
        println(length);
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

    private void println(int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
}
