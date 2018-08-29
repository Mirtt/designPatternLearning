package com.mirt.design.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * 复制生成Product的具体实例
 *
 * @author Zhang Yuqi
 * @date 2018/7/13
 */
public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }
}
