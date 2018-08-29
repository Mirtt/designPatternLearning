package com.mirt.design.strategy;

/**
 * 猜拳游戏的策略抽象方法
 *
 * @author Mirt Zhang
 * @date 2018/8/2
 */
public interface Strategy {
    /**
     * 返回下次的出拳
     *
     * @return
     */
    Hand nextHand();

    /**
     * 学习上局的结果
     *
     * @param win
     */
    void study(boolean win);
}
