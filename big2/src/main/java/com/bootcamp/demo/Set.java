package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Set {
  List<Card> set;
  int score;

  public Set(List<Card> cards) {
    this.set = new ArrayList<>();
    for (Card card : cards) {
      this.set.add(card);
    }
    Collections.sort(set,new HandComperator());
    this.score();
  }

  public Set(Card[] cards) {
    this.set = new ArrayList<>();
    for (int i = 0; i < cards.length; i++) {
      this.set.add(cards[i]);
    }
    this.score();
  }

  public Set() {
    this.set = new ArrayList<>();
  }

  public int getSize() {
    return this.set.size();
  }

  public static Set of(Card... cards) {
    return new Set(cards);
  }

  public void add(List<Card> temp) {
    for (Card card : temp) {
      this.set.add(card);
    }
    Collections.sort(set,new HandComperator());
    this.score();
  }

  public void score(){
    if(this.set.size() ==1){
      this.score=this.set.get(0).getRank().getRank()*100+this.set.get(0).getSuit().getNum();
    } else if(this.set.size() ==2){
      this.score=this.set.get(1).getRank().getRank()*100+this.set.get(1).getSuit().getNum();
    } else if(this.set.size()==3){
      this.score=this.set.get(0).getRank().getRank()*100;
    } else if(this.set.size()==5){
      if(Rule.isStraightFlush(this)){
        this.score=5*10000+this.set.get(4).getRank().getRank()*100+this.set.get(4).getSuit().getNum();
      } else if (Rule.isFourKind(this)){
        this.score=4*10000+this.set.get(2).getRank().getRank()*100+this.set.get(2).getSuit().getNum();
      } else if(Rule.isFullHouse(this)){
        this.score=3*10000+this.set.get(2).getRank().getRank()*100+this.set.get(2).getSuit().getNum();
      } else if(Rule.isFlush(this)){
        this.score=2*10000;
        for(int i =0;i<this.set.size();i++){
          this.score+=this.set.get(i).getRank().getRank()*100+this.set.get(i).getSuit().getNum();
        } 
      } else if(Rule.isStraight(this)){
        this.score=1*10000+this.set.get(4).getRank().getRank()*100+this.set.get(4).getSuit().getNum();
      }
    }
  }

  public boolean compare(Set temp) {
    if(this.score > temp.getScore()){
      return true;
    }
    return false;   
  }
}


