package com.mirt.design.prototype;

import com.mirt.design.prototype.framework.Product;

/**
 * 与messagebox不同的另一个不容易实例化的类
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }


    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
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
}
