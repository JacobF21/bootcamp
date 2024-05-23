package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Player {
  private List<Card> hand;
  private boolean containDiamondThree = false;
  private int id;
  private boolean endTurn = false;

  public Player() {
    this.hand = new ArrayList<>();
  }

  public void containDiamondThree() {
    for (Card card : this.hand) {
      if (card.getSuit() == Suit.DIAMOND && card.getRank() == Rank.THREE) {
        this.containDiamondThree = true;
      }
    }
  }

  public void addHand(Card card) {
    this.hand.add(card);
    if (this.hand.size() == 13) {
      Collections.sort(hand, new HandComperator());
      this.containDiamondThree();
    }
  }

  public int getHandSize() {
    return this.hand.size();
  }

  public void clear() {
    hand.clear();
  }

  public void play(Dealer dealer) {
    this.endTurn = false;
    while (!this.endTurn) {
      Scanner scanner = new Scanner(System.in);
      System.out.println(this.getHand());
      if (!dealer.getPool().isEmpty()) {
        System.out.println(dealer.getPool().peek());
      }
      System.out.print("PLAYER " + (this.id + 1) + ":" + " Choose your set:");
      String input = scanner.nextLine();
      if (Dealer.getPassCount() == 3 && "pass".equals(input.toLowerCase())) {
        continue;
      } else if (isContainDiamondThree()
          && "pass".equals(input.toLowerCase())) {
        continue;
      } else if ("pass".equals(input.toLowerCase())) {
        dealer.increment();
        this.endTurn = true;
        break;
      }
      Set cards;
      try {
        cards = convertStringToCard(input);
      } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
        continue;
      }
      if (cards.getSize() == 0) {
        continue;
      } else {
        if (dealer.addToPool(cards)) {
          for (Card card : cards.getSet()) {
            this.hand.remove(card);
            if (this.hand.size() == 0) {
              dealer.setGameStatus(GameStatus.END);
              System.out
                  .println("Winner is Player" + (this.getId() + 1) + "!!!");
            }
          }
          Collections.sort(this.hand, new HandComperator());
          this.endTurn = true;
          this.containDiamondThree = false;
        } else {
          System.out.println("Your set can not beat the previous player, Please choose again");
          continue;
        }
      }
    }
  }

  private Set convertStringToCard(String input) {
    List<Card> cards = new ArrayList<>();
    Set set = new Set();
    String[] parts = input.split(",");

    if (parts.length % 2 != 0) {
      System.out.println(
          "Invalid input format. Expected '<Suit>,<Rank>,<Suit>,<Rank>...'.");
      // throw new IllegalArgumentException(
      // "Invalid input format. Expected '<Suit>,<Rank>,<Suit>,<Rank>...'.");
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
        // "Hand did not contain " + suit + " " + rank);
        return set;
      }
      cards.add(new Card(suit, rank));
    }
    set.add(cards);
    set.score();
    if (!(Rule.isValid(set))) {
      // throw new IllegalArgumentException("Invalid set");
      System.out.println("Invalid set");
      return new Set();
    }
    return set;
  }


}


