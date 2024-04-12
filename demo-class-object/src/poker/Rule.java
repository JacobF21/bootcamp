package poker;

public class Rule {
  
  private static boolean isFourKind(Card2[] cards){
    if(cards.length !=5){
      return false;
    }
    int[] temp = new int[13];
    for(int i=0;i<cards.length;i++){
      temp[cards[i].getRank()-1]++;
    }
    for(int j=0;j<temp.length;j++){
      if(temp[j] == 4){
        return true;
      }
    }
    return false;
  }

  //use a new input may not need to change the original function, can private the old one and use the new method to call the old function
  public static boolean isFourKind(Hand hand){
    return isFourKind(hand.getCards());
  }




}
