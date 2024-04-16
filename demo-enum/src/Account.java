public class Account {
  private String name;
  Transaction[] transactions;

  public Account(String name) {
    this.name = name;
    this.transactions = new Transaction[0];
  }

  private void addTransaction(Transaction transaction) {
    Transaction[] copyTransactions = this.transactions;
    this.transactions = new Transaction[this.transactions.length + 1];
    int idx = 0;
    for (int i = 0; i < copyTransactions.length; i++) {
      this.transactions[i] = copyTransactions[i];
      idx++;
    }
    this.transactions[idx] = transaction;
  }

  public void credit(Currency currency, double amount) {
    Transaction tempTransaction = new Transaction(currency, amount, Sign.CREDIT);
    addTransaction(tempTransaction);
  }

  public boolean debit(Currency currency, double amount) {
    if (amount>balance(currency)) {
      System.out.println("Account balance is "+currency+balance(currency)+" can not process the transaction!");
          return false;
    } else {
      Transaction tempTransaction = new Transaction(currency, amount, Sign.DEBIT);
      addTransaction(tempTransaction);
    }
    return true;
  }

  // balance
  public double balance(Currency currency) {
    double balance = 0;
    for (Transaction t : this.transactions) {
      if (t.currency() == currency) {
        balance += t.amount();
      }
    }
    return balance;
  }

  public double balanceInHKD(Currency currency) {
    double balance = 0;
    for (Transaction t : this.transactions) {
      if (t.currency() == currency) {
        balance += t.amount()* currency.getRate();
      }
    }
    return balance;
  }

  public double totalBalance(){
    double result=0;
    for(Currency c:Currency.values()){
      result+=balanceInHKD(c);
    }
    return result;
  }

  public String getName(){
    return this.name;
  }

  
}
