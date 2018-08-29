package com.mirt.design.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 表示游戏主角的类
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsName = {"苹果", "葡萄", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("金钱增加100");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("金钱减半");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果 " + f);
            fruits.add(f);
        } else {
            System.out.println("nothing happened");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        fruits.forEach(f -> {
            if (f.contains("好吃的")) {
                m.addFruit(f);
            }
        });
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "{money = " + money + ",\nfruits = " + fruits + "}";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean())
            prefix = "好吃的";
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }

}
