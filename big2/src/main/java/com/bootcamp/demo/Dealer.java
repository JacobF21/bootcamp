package com.bootcamp.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dealer {
  private Deck deck;
  private GameStatus gameStatus =GameStatus.START;
  private Stack<Set> pool;
  private int passCount = 0;
  private List<Player> playerOrder;

  public Dealer(){
    this.deck=new Deck(false);
    this.deck.shuffle();
    this.pool = new Stack<>();
    this.playerOrder=new LinkedList<>();
  }

  public void shuffle(){
    this.deck.shuffle();
  }

  public void distribute(Player player1,Player player2,Player player3,Player player4){
    while(!this.deck.isEmpty()){
      player1.addHand(this.deck.distribute());
      player2.addHand(this.deck.distribute());
      player3.addHand(this.deck.distribute());
      player4.addHand(this.deck.distribute());
    }
  }


  public boolean addToPool(Set cards){
    if(passCount ==3 || gameStatus==GameStatus.START){
      this.pool.add(cards);
      passCount=0;
      gameStatus=GameStatus.CONTINUE;
      return true;
    } else{
      if(cards.getSize() != pool.peek().getSize() || !(cards.compare(pool.peek()))){
        return false;
      }
    }
    System.out.println(pool);
    return true;
  }

  public void increment(){
    passCount++;
  }

}
