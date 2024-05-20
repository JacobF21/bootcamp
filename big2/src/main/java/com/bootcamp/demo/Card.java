package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@EqualsAndHashCode
public class Card {
  private Suit suit;
  private Rank rank;


  public Card(Suit suit, Rank rank){
    this.rank=rank;
    this.suit=suit;
  }

  public Card(){
    
  }
}
