package poker;

public class Card2 {
  
  public static final char DIAMOND= 'D';  
  public static final char CLUB= 'C';  
  public static final char HEART= 'H';  
  public static final char SPADE= 'S';  
  public static final int ONE= 1; 
  public static final int TWO= 2; 
  public static final int THREE= 3; 
  public static final int FOUR= 4; 
  public static final int FIVE= 5; 
  public static final int SIX= 6; 
  public static final int SEVEN= 7; 
  public static final int EIGHT=8; 
  public static final int NINE= 9; 
  public static final int TEN= 10; 
  public static final int JACK= 11; 
  public static final int QUEEN= 12; 
  public static final int KING= 13; 

  private int rank;
  private Suit suit;

  public Card2(int rank, Suit suit){
    this.rank=rank;
    this.suit=suit;
  }

  public int getRank(){
    return this.rank = rank;
  }

  public void setRank(int rank){
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit = suit;
  }

  public void setSuit(Suit suit){
    this.suit = suit;
  }

  public String toString(){
    return "suit=" + this.suit//
          +" rank="+this.rank;
  }

  public static boolean isFullHouse(Card[] cards){
    return false;
  }

}
