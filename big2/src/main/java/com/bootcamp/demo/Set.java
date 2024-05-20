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
    set = new ArrayList<>();
    for (Card card : cards) {
      this.set.add(card);
    }
    Collections.sort(set,new HandComperator());
    this.score();
  }

  public Set(Card[] cards) {
    set = new ArrayList<>();
    for (int i = 0; i < cards.length; i++) {
      this.set.add(cards[i]);
    }
  }

  public Set() {
    set = new ArrayList<>();
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
  }

  public void score(){
    if(this.set.size() ==1){
      this.score=this.set.get(0).getRank().getRank();
    } else if(this.set.size() ==2){
      this.score=this.set.get(1).getRank().getRank()*10+this.set.get(1).getSuit().getNum();
    } else if(this.set.size()==3){
      this.score=this.set.get(0).getRank().getRank();
    } else if(this.set.size()==5){

    }
  }

  public boolean compare(Set temp) {
    // Check the validity of the current set
    boolean isValidCurrentSet = Rule.isValid(this);

    // Check the validity of the other set
    boolean isValidOtherSet = Rule.isValid(temp);

    if (!isValidCurrentSet && !isValidOtherSet) {
      // Both sets are invalid
      return false;
    } else if (!isValidCurrentSet) {
      // The current set is invalid
      return false;
    } else if (!isValidOtherSet) {
      // The other set is invalid
      return true;
    }

    // The other set is bigger or they have the same combination
    return false;
  }

}


