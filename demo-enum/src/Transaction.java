public class Transaction {
  private Sign sign;
  private Currency currency;
  private double amount;

  public Transaction(Currency currency, double amount, Sign sign){
    this.currency=currency;
    this.amount=amount;
    this.sign=sign;
  }

  public double amount(){
    if(this.sign == Sign.CREDIT){
      return this.amount;
    } 
    return this.amount*-1;
  }

  public Currency currency(){
    return this.currency;
  }
}
