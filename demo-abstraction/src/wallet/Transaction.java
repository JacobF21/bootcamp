package wallet;

public class Transaction{
  
  private CoinSymbol coinSymbol;
  private double amount;

  public Transaction(CoinSymbol coinSymbol,double amount){
    this.coinSymbol=coinSymbol;
    this.amount=amount;
  }

}
