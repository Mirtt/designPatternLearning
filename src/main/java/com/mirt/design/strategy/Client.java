package com.mirt.design.strategy;

/**
 * 客户端调用
 *
 * @author Mirt Zhang
 * @date 2018/8/2
 */
public class Client {
    public static void main(String[] args) {
        int seed1 = 1;
        int seed2 = 2;
        Player player1 = new Player("tom", new WinningStrategy(seed1));
        Player player2 = new Player("jerry", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                player1.win();
                player2.lose();
                System.out.println("Winner is :" + player1);
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                player1.lose();
                player2.win();
                System.out.println("Winner is :" + player2);
            } else {
                player1.even();
                player2.even();
                System.out.println("Even ...");
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
