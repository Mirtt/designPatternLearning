package com.mirt.design.strategy;

import java.util.Random;

/**
 * 策略之一，获胜就出上局相同的手势,失败就随机出拳
 *
 * @author Mirt Zhang
 * @date 2018/8/2
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false; //记录上局获胜状态
    private Hand preHand; //记录上局的出拳

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
