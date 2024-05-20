package com.bootcamp.demo;

import java.util.Comparator;

public class HandComperator implements Comparator<Card>{
  @Override
  public int compare(Card a, Card b){
    if(a.getRank().getRank() < b.getRank().getRank()){
      return -1;
    }else if(a.getRank().getRank() > b.getRank().getRank()){
      return 1;
    } 
    else if(a.getSuit().getNum() < b.getSuit().getNum()){
      return -1;
    } else{
      return 1;
    }
  }
}
