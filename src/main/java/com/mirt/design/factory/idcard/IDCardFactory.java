package com.mirt.design.factory.idcard;

import com.mirt.design.factory.framework.Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 具体的生产idcard的工厂
 *
 * @author Zhang Yuqi
 * @date 2018/7/12
 */
public class IDCardFactory extends Factory<IDCard> {

    private List<Map<Integer, String>> owners = new ArrayList<>();

    @Override
    protected IDCard createProduct(String owner) {
        return new IDCard(owner, new Random().nextInt(100));
    }

    @Override
    protected void registerProduct(IDCard var) {
        Map<Integer, String> map = new HashMap<>();
        map.put(var.getId(), var.getOwner());
        this.owners.add(map);
    }

    public List<Map<Integer, String>> getOwners() {
        return owners;
    }
}
