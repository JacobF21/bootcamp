package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@ToString
public class Deck {
  List<Card> deck= new ArrayList<Card>();;
  public static final Suit[] SUITS = Suit.values();
  public static final Rank[] RANKS = Rank.values();
  
  public Deck(boolean isEmpty){
    if(isEmpty){
      this.deck.clear();;
    } else{
      for(Suit suit: SUITS){//SUITS
        for(Rank rank:RANKS){//RANKS
         deck.add(new Card(suit, rank));
        }
      }
    }
  }

  public void shuffle(){ 
    Collections.shuffle(deck);
  }

  public boolean isEmpty(){
    if(this.deck.size()==0){
      return true;
    }
    return false;
  }

  public Card distribute() {
    if (this.deck.isEmpty()) {
        throw new IllegalStateException("The deck is empty.");
    }
    Card distributedCard = this.deck.get(0);
    this.deck.remove(0);
    return distributedCard;
}


  public int getSize(){
    return this.deck.size();
  }

}
