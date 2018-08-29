package com.mirt.design.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示gamer状态的类
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class Memento {
    int money;
    ArrayList<String> fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
