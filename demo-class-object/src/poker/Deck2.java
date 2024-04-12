package poker;

import java.util.Arrays;

public class Deck2 {
  

  public static final Suit[] SUITS = new Suit[] {Suit.DIAMOND,Suit.CLUB,Suit.HEART,Suit.SPADE};
  public static final int[] RANKS = new int[] {Card2.ONE,Card2.TWO,Card2.THREE,Card2.FOUR,Card2.FIVE,Card2.SIX,Card2.SEVEN,Card2.EIGHT,Card2.NINE,Card2.TEN,Card2.JACK,Card2.QUEEN,Card2.KING};
  private final Card2[] cards; //final is pointing  to the address instead of the value of the array 

  private Deck2(boolean isEmpty){
    if(isEmpty){
      this.cards=new Card2[0];
    } else{
      this.cards=new Card2[52];
      int idx=0;
      for(Suit suit: SUITS){//SUITS
        for(int rank:RANKS){//RANKS
          this.cards[idx++] = new Card2(rank, suit);
        }
      }
      }
   }

   public static Deck2 empty(){
    return new Deck2(true);
   }

   public static Deck2 full(){
    return new Deck2(false);
   }



  //public Card2[] empty(){
    //this.cards = new Card2[0];
    //return this.cards;
  //}

  //public Card2[] full(){
    //this.cards=new Card2[52];
    //int idx=0;
    //for(char suit: SUITS){//SUITS
      //for(int rank:RANKS){//RANKS
        //this.cards[idx++] = new Card2(rank, suit);
      //}
    //}
    //return this.cards;
  //}

  public Card2[] getCards(){
    return this.cards;
  }

  public void shuffle(){ 
    int n = this.cards.length;
    for(int i =n-1;i>0;i--){
      int random = (int) (Math.random() * (i + 1));
      Card2 temp = cards[i];
      cards[i] = cards[random];
      cards[random] = temp;
    }
  }

  public String toString(){
    return "Deck "//
          +"cards=" +Arrays.toString(this.cards)//
          +")";
  }


  public static void main(String[] args){

    Deck2 deck2 = Deck2.empty();
    Deck2 deck3 = Deck2.full();

    //System.out.println(deck3.toString());
    deck3.shuffle();
    System.out.println(deck3.toString());



  }
}
