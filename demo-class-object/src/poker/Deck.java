package poker;

import java.util.Arrays;

public class Deck {
   Card[] cards;  

   public Deck(Card[] cards){
      this.cards = cards;
   }

   //static method
   public static Card[] createDeck(){
    String suit;
    Card[] Cards =new Card[52];
    for(int k=0;k<52;k++){
        if(k>=0 && k<=12){
          suit = "Diamond";
          Cards[k] = new Card(suit,k+1);
          //System.out.println(Cards[k]);
        }

        if(k>=13 && k<=25){
          suit = "Club";
          Cards[k] = new Card(suit,k-12);
        }

        if(k>=26 && k<=38){
          suit = "Heart";
          Cards[k] = new Card(suit,k-25);
        }

        if(k>=39 && k<=51){
          suit = "Spade";
          Cards[k] = new Card(suit,k-38);
        }
      }
      return Cards;
  }

  public Card[] drawFiveCards(){
    Card[] fiveCards = new Card[5];
    for(int i=0;i<5;i++){
      int randomNum = (int) (Math.random() * 52);
      fiveCards[i] = this.cards[randomNum];
      cards[randomNum] = null;
    }
    return fiveCards;
  }

  public Card drawOneCard(){
    int randomNum = (int) (Math.random() * 52);
    Card card = this.cards[randomNum];
    cards[randomNum] = null;
    return card;
  }
}






