package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
  private List<Card> hand;
  private boolean containDiamondThree = false;
  private int order;
  private boolean endTurn = false;

  public Player() {
    this.hand = new ArrayList<>();
  }

  public void containDiamondThree() {
    for (Card card : this.hand) {
      if (card.getSuit() == Suit.DIAMOND && card.getRank() == Rank.THREE) {
        containDiamondThree = true;
      }
    }
  }

  public void addHand(Card card) {
    this.hand.add(card);
    if(this.hand.size() == 13){
      Collections.sort(hand,new HandComperator());
    }
  }

  public int getHandSize() {
    return this.hand.size();
  }

  public void clear() {
    hand.clear();
  }

  public void play(Dealer dealer) {
    endTurn=false;
    while(!endTurn){
      Scanner scanner = new Scanner(System.in);
      System.out.println(this.getHand());
      System.out.print("Choose your set:");
      String input = scanner.nextLine();
      if(input.toLowerCase() == "pass"){
        dealer.increment();
        endTurn=true;
        continue;
      }
      Set cards = convertStringToCard(input);
      if(cards.getSize()==0){
        continue;
      } else{
        if(dealer.addToPool(cards)){
          for (Card card : cards.getSet()) {
            this.hand.remove(card);
            if(this.hand.size() ==0){
              dealer.setGameStatus(GameStatus.END);
            }
            Collections.sort(hand,new HandComperator());
          }
          endTurn=true;
        } else{
          System.out.println("fail");
        }
      }
    }
  }

  private Set convertStringToCard(String input) {
    List<Card> cards = new ArrayList<>();
    Set set = new Set();
    String[] parts = input.split(",");

    if (parts.length % 2 != 0) {
      System.out.println("Invalid input format. Expected '<Suit>,<Rank>,<Suit>,<Rank>...'.");
      // throw new IllegalArgumentException(
      //     "Invalid input format. Expected '<Suit>,<Rank>,<Suit>,<Rank>...'.");
    }

    for (int i = 0; i < parts.length; i += 2) {
      String suitStr = parts[i].trim();
      String rankStr = parts[i + 1].trim();

      // Convert the rank string to a Rank enum value
      Rank rank = Rank.valueOf(rankStr.toUpperCase());

      // Convert the suit string to a Suit enum value
      Suit suit = Suit.valueOf(suitStr.toUpperCase());

      if (!(this.hand.contains(new Card(suit, rank)))) {
        System.out.println("Hand did not contain " + suit + " " + rank);
        // throw new IllegalArgumentException(
        //     "Hand did not contain " + suit + " " + rank);
        System.out.println(set);
        return set;
      }
      // Create a Card object and add it to the list
      cards.add(new Card(suit, rank));
      set.add(cards);
      if (!(Rule.isValid(set))) {
        // throw new IllegalArgumentException("Invalid set");
        System.out.println("Invalid set");
        return new Set();
      }
    }
    System.out.println(set);
    return set;
  }


}


