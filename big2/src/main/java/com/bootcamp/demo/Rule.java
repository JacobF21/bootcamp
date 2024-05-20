package com.bootcamp.demo;

import java.util.List;

public class Rule {

  private static boolean isValid(List<Card> cards){
      if(cards.size()==1){
        return true;
      } else if(cards.size()==2){
        if(isPair(cards)){
          return true;
        } 
        return false;
      } else if(cards.size()==3){
        if(isTriple(cards)){
          return true;
        } 
        return false;
      } else if(cards.size()==5){
        return true;
      }
      return false;
    }

  public static boolean isValid(Set cards){
    return isValid(cards.getSet());
  }

    
  private static boolean isStraightFlush(List<Card> cards) {
    if(cards.size() !=5){
      return false;
    }
    int[] temp = new int[13];
    int count = 0;
    for (int i = 1; i < cards.size(); i++) {
      if (cards.get(i).getSuit() != cards.get(0).getSuit()) {
        return false;
      }
    }
    for (int i = 0; i < cards.size(); i++) {
      temp[cards.get(i).getRank().getRank() - 1]++;
    }
    for (int j = 0; j < temp.length; j++) {
      if (temp[j] == 1) {
        count++;
        if (count == 5) {
          return true;
        }
      } else if (temp[j] == 0) {
        count = 0;
      }
    }
    return false;
  }

  public static boolean isStraightFlush(Set set) {
    return isStraightFlush(set.getSet());
  }


  private static boolean isFourKind(List<Card> cards) {
    if(cards.size() !=5){
      return false;
    }
    int[] temp = new int[13];
    for (int i = 0; i < cards.size(); i++) {
      // .ordinal()
      temp[cards.get(i).getRank().getRank() - 1]++;
    }
    // System.out.println(Arrays.toString(temp));
    for (int j = 0; j < temp.length; j++) {
      if (temp[j] == 4) {
        return true;
      }
    }
    return false;
  }

  // use a new input may not need to change the original function, can private the old one and use the new method to call the old function
  public static boolean isFourKind(Set set) {
    return isFourKind(set.getSet());
  }

  private static boolean isFullHouse(List<Card> cards) {
    if(cards.size() !=5){
      return false;
    }
    int[] temp = new int[13];
    boolean three = false;
    for (int i = 0; i < cards.size(); i++) {
      // .ordinal()
      temp[cards.get(i).getRank().getRank() - 1]++;
    }
    // System.out.println(Arrays.toString(temp));
    for (int j = 0; j < temp.length; j++) {
      if (temp[j] == 3) {
        three = true;
      }
    }
    for (int j = 0; j < temp.length; j++) {
      if (temp[j] == 2 && three == true) {
        return true;
      }
    }
    return false;
  }

  public static boolean isFullHouse(Set set) {
    return isFullHouse(set.getSet());
  }

  private static boolean isFlush(List<Card> cards) {
    if(cards.size() !=5){
      return false;
    }
    if(isStraightFlush(cards)){
      return false;
    }
    for (int i = 1; i < cards.size(); i++) {
      if (cards.get(i).getSuit() != cards.get(0).getSuit()) {
        return false;
      }
    }
    return true;
  }

  public static boolean isFlush(Set set){
    return isFlush(set.getSet());
  }

  private static boolean isStraight(List<Card> cards) {
    if(cards.size() !=5){
      return false;
    }
    if(isStraightFlush(cards)){
      return false;
    }
    
    int[] temp = new int[13];
    int count = 0;

    for (int i = 0; i < cards.size(); i++) {
      temp[cards.get(i).getRank().getRank() - 1]++;
    }

    for (int j = 0; j < temp.length; j++) {
      if (temp[j] == 1) {
        count++;
        if (count == 5) {
          return true;
        }
      } else if (temp[j] == 0) {
        count = 0;
      }
    }
    return false;
  }

  public static boolean isStraight(Set set) {
    return isStraight(set.getSet());
  }

  private static boolean isOffSuit(List<Card> cards){
    if(cards.size() !=5){
      return false;
    }
    if(isStraightFlush(cards) || isFourKind(cards) || isFullHouse(cards) || isFlush(cards) || isStraight(cards)){
      return false;
    }
      return true;
  }

  public static boolean isOffSuit(Set set){
    return isOffSuit(set.getSet());
  }

  private static boolean isTriple(List<Card> cards){
    if(cards.size() !=3){
      return false;
    }
    for(int i=1;i<cards.size();i++){
      if(cards.get(i).getRank().getRank() != cards.get(0).getRank().getRank()){
        return false;
      }
    }
    return true;
  }

  public static boolean isTriple(Set set){
    return isTriple(set.getSet());
  }

  private static boolean isPair(List<Card> cards){
    if(cards.size() !=2){
      return false;
    }

    if(cards.get(0).getRank().getRank() != cards.get(1).getRank().getRank()){
      return false;
    }
    
    return true;
  }

  public static boolean isPair(Set set){
    return isPair(set.getSet());
  }

  private static boolean isSingle(List<Card> cards){
    if(cards.size() ==1){
      return true;
    }
    
    return false;
  }

  public static boolean isSingle(Set set){
    return isSingle(set.getSet());
  }



  public static void main(String[] args) {
    Set straightFlush = Set.of(new Card(Suit.DIAMOND, Rank.ONE),
                               new Card(Suit.DIAMOND, Rank.TWO), 
                               new Card(Suit.DIAMOND, Rank.THREE),
                               new Card(Suit.DIAMOND, Rank.FOUR), 
                               new Card(Suit.DIAMOND, Rank.FIVE));
    Set fourKind = Set.of(new Card(Suit.DIAMOND, Rank.ONE),
                          new Card(Suit.SPADE, Rank.ONE), 
                          new Card(Suit.HEART, Rank.ONE),
                          new Card(Suit.CLUB, Rank.ONE), 
                          new Card(Suit.DIAMOND, Rank.FIVE));
    Set fullHouse = Set.of(new Card(Suit.DIAMOND, Rank.ONE),
                          new Card(Suit.SPADE, Rank.ONE), 
                          new Card(Suit.HEART, Rank.ONE),
                          new Card(Suit.CLUB, Rank.FIVE), 
                          new Card(Suit.DIAMOND, Rank.FIVE));
    Set flush = Set.of(new Card(Suit.SPADE, Rank.ONE),
                       new Card(Suit.SPADE, Rank.JACK), 
                       new Card(Suit.SPADE, Rank.QUEEN),
                       new Card(Suit.SPADE, Rank.SIX), 
                       new Card(Suit.SPADE, Rank.FIVE));
    Set straight = Set.of(new Card(Suit.DIAMOND, Rank.FOUR),
                       new Card(Suit.SPADE, Rank.FIVE), 
                       new Card(Suit.HEART, Rank.SIX),
                       new Card(Suit.SPADE, Rank.SEVEN), 
                       new Card(Suit.SPADE, Rank.EIGHT));
    Set offSuit = Set.of(new Card(Suit.DIAMOND, Rank.JACK),
                         new Card(Suit.SPADE, Rank.FIVE), 
                         new Card(Suit.HEART, Rank.ONE),
                         new Card(Suit.SPADE, Rank.SEVEN), 
                         new Card(Suit.SPADE, Rank.KING));



    System.out.println(isStraightFlush(straightFlush));
    System.out.println(isStraightFlush(fourKind));
    System.out.println(isStraightFlush(fullHouse));
    System.out.println(isStraightFlush(flush));
    System.out.println(isStraightFlush(straight));
    System.out.println(isStraightFlush(offSuit));
    System.out.println(isFourKind(fourKind));
    System.out.println(isFourKind(straightFlush));
    System.out.println(isFourKind(fullHouse));
    System.out.println(isFourKind(flush));
    System.out.println(isFourKind(straight));
    System.out.println(isFourKind(offSuit));
    System.out.println(isFullHouse(fullHouse));
    System.out.println(isFullHouse(straightFlush));
    System.out.println(isFullHouse(fourKind));
    System.out.println(isFullHouse(flush));
    System.out.println(isFullHouse(straight));
    System.out.println(isFullHouse(offSuit));
    System.out.println(isFlush(flush));
    System.out.println(isFlush(straightFlush));
    System.out.println(isFlush(fourKind));
    System.out.println(isFlush(fullHouse));
    System.out.println(isFlush(straight));
    System.out.println(isFlush(offSuit));
    System.out.println(isOffSuit(offSuit));
    System.out.println(isOffSuit(straightFlush));
    System.out.println(isOffSuit(fourKind));
    System.out.println(isOffSuit(fullHouse));
    System.out.println(isOffSuit(flush));
    System.out.println(isOffSuit(straight));
  }
}

 