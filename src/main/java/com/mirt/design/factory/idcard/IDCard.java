package com.mirt.design.factory.idcard;

import com.mirt.design.factory.framework.Product;

/**
 * 需要被工厂类生产的具体产品
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class IDCard extends Product {

    private String owner;

    private Integer id;

    protected IDCard(String owner, Integer id) {
        System.out.println("making " + owner + "'s idCard with id : " + id);
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("using " + owner + "'s idCard");
    }

    public String getOwner() {
        return this.owner;
    }

    public Integer getId() {
        return id;
    }
}
