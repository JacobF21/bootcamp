package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.Stack;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Dealer {
  private Deck deck;
  private GameStatus gameStatus =GameStatus.START;
  private Stack<Set> pool;
  private static int passCount = 0;
  private LinkedList<Player> playerList;

  public Dealer(){
    this.deck=new Deck(false);
    this.deck.shuffle();
    this.pool = new Stack<>();
    this.playerList=new LinkedList<>();
  }

  public void shuffle(){
    this.deck.shuffle();
  }

  public void distribute(Player player1,Player player2,Player player3,Player player4){
    while(!this.deck.isEmpty()){
      player1.addHand(this.deck.distribute());
      player1.setId(0);
      player2.addHand(this.deck.distribute());
      player2.setId(1);
      player3.addHand(this.deck.distribute());
      player3.setId(2);
      player4.addHand(this.deck.distribute());
      player4.setId(3);
    }
    playerList.add(player1);
    playerList.add(player2);
    playerList.add(player3);
    playerList.add(player4);
  }

  public int determineFirstPlayer(){
    for(int i=0;i<this.playerList.size();i++){
      if(this.playerList.get(i).isContainDiamondThree()){
        return this.playerList.get(i).getId();
      }
    }
    return -1;
  }


  public boolean addToPool(Set cards){
    if(passCount ==3 || this.gameStatus==GameStatus.START){
      this.pool.add(cards);
      passCount=0;
      this.gameStatus=GameStatus.CONTINUE;
      return true;
    } 
    if(cards.getSize() != pool.peek().getSize() || !(cards.compare(pool.peek()))){
      return false;
    }
    this.pool.add(cards);
    return true;
  }

  public void increment(){
    passCount++;
  }

  public static int getPassCount(){
    return passCount;
  }

}
