package poker;

public class Card { 
  
  private String suits; // Club, Diamond, Spade,Heart
  private int rank; // 1-13

  public Card(String suits, int rank) {
    this.suits = suits;
    this.rank = rank;
  }

  public String toString(){
    return "suit=" + this.suits//
          +" rank="+this.rank;
  }
}
