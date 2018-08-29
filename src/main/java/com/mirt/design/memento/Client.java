package com.mirt.design.memento;

import com.mirt.design.memento.game.Gamer;
import com.mirt.design.memento.game.Memento;

/**
 * 客户端 调用玩家的bet方法，显示金钱和水果
 *
 * @author Mirt Zhang
 * @date 2018/8/16
 */
public class Client {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100); // gamer init with 100
        Memento memento = gamer.createMemento();  // init status
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("当前状态" + gamer);

            gamer.bet();

            System.out.println("金钱为 " + gamer.getMoney());
            // 决定如何处理memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println(" 金钱增加 保持玩家状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println(" 金钱减少，将游戏状态恢复到前一个版本");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
