package com.bootcamp.demo;

public class Game {
  public static void main(String[] args) {
    Dealer dealer= new Dealer();
    //System.out.println(dealer.getDeck());
    Player p1 =new Player();
    Player p2 =new Player();
    Player p3 =new Player();
    Player p4 =new Player();
    dealer.distribute(p1, p2, p3, p4);
    // while(dealer.getGameStatus() != GameStatus.END){

    // }
    p1.play(dealer);


  }
}
