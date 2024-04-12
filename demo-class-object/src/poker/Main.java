package poker;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Deck deck1 = new Deck(Deck.createDeck());
    //System.out.println(deck1.toString());
    Card temp;
    for(int i=0;i<52;i++){
      temp = deck1.drawOneCard();
      System.out.println(temp);
    }
    /* 
    for(int j=0;j<52;j++){
      for(int k=51;k>j;k--){
        if(temp[j].equals(temp[k])){
          System.out.println("Duplicate");
        }
      }
    }
    */

  }

}
