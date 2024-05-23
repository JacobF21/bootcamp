package com.bootcamp.demo;

import java.util.ListIterator;

public class Game {
  public static void main(String[] args) {
    Dealer dealer = new Dealer();
    // System.out.println(dealer.getDeck());
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    Player p4 = new Player();
    dealer.distribute(p1, p2, p3, p4);
    int currentPlayerIndex = dealer.determineFirstPlayer();
    while (dealer.getGameStatus() != GameStatus.END) {
      dealer.getPlayerList().get(currentPlayerIndex).play(dealer);
      if (currentPlayerIndex == 3) {
        currentPlayerIndex = 0;
      } else {
        currentPlayerIndex++;
      }
    }

  }
}
