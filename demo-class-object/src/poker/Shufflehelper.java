package poker;

public class Shufflehelper {
  private Card2[] cards;
  
  public Shufflehelper(Deck2 deck){
    this.cards=deck.getCards();
  }
  
  public void riffle(){ 
    int n = this.cards.length;
    for(int i =n-1;i>0;i--){
      int random = (int) (Math.random() * (i + 1));
      Card2 temp = this.cards[i];
      cards[i] = cards[random];
      cards[random] = temp;
    }
  }

  public void riffle2(){
    for(int i=0;i<cards.length/2;i++){

    
    }
  }
  public static void main(String[] args) {
    Shufflehelper shufflehelper = new Shufflehelper(Deck2.full());
    shufflehelper.riffle2();
    shufflehelper.riffle2();
  }

}



