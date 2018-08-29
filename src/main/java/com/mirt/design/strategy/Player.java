package com.mirt.design.strategy;

/**
 * 游戏的参与者，每个人都会选取不同的策略
 *
 * @author Mirt Zhang
 * @date 2018/8/2
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "[" + name + ":" + gamecount + " games," + wincount + " win," + losecount + " lose ]";
    }
}
