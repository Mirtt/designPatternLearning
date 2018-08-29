package com.mirt.design.factory;

import com.mirt.design.factory.framework.Factory;
import com.mirt.design.factory.framework.Product;
import com.mirt.design.factory.idcard.IDCard;
import com.mirt.design.factory.idcard.IDCardFactory;

/**
 * 客户端 ， 使用工厂来生成具体的产品
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class Client {
    public static void main(String[] args) {
        Factory<IDCard> factory = new IDCardFactory();
        Product idCard1 = factory.create("aaa");
        Product idCard2 = factory.create("bbb");
        Product idCard3 = factory.create("ccc");

        idCard1.use();
        idCard2.use();
        idCard3.use();

        System.out.println(((IDCardFactory) factory).getOwners());
        System.out.println(((IDCard) idCard1).getOwner());
    }
}
