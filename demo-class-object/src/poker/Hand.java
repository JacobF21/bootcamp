package poker;

public class Hand {
  private Card2[] cards;

  public Hand(Card2 c1, Card2 c2, Card2 c3, Card2 c4, Card2 c5){
    if(c1 == null || c2== null || c3==null || c4==null || c5==null){
      throw new IllegalArgumentException();
    }  
    this.cards = new Card2[5];
    this.cards[0] = c1;
    this.cards[1] = c2;
    this.cards[2] = c1;
    this.cards[3] = c1;
    this.cards[4] = c1;
  } 

  public Card2[] getCards(){
    return this.cards;
  }

  public boolean isFourKind(){
    int[] temp = new int[13];
    for(int i=0;i<this.cards.length;i++){
      temp[this.cards[i].getRank()-1]++;
    }
    for(int j=0;j<temp.length;j++){
      if(temp[j] == 4){
        return true;
      }
    }
    return false;
  }
}
