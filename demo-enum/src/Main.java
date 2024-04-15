public class Main {

  public static void main(String[] args) {
    Account account1 = new  Account("account1");
    //account1.addTransaction(new Transaction(Currency.HKD,25000,Sign.CREDIT));
    //account1.addTransaction(new Transaction(Currency.USD,60,Sign.DEBIT));
    //account1.addTransaction(new Transaction(Currency.HKD,1000,Sign.DEBIT));
    //account1.addTransaction(new Transaction(Currency.HKD,5000,Sign.DEBIT));
    //account1.addTransaction(new Transaction(Currency.JPY,15000,Sign.DEBIT));
    //account1.credit(Currency.HKD, 1000);
    account1.credit(Currency.HKD, 25000);
    account1.credit(Currency.JPY, 1000);
    account1.credit(Currency.USD, 100);
    account1.debit(Currency.HKD, 500);
    account1.debit(Currency.JPY, 500);
    account1.debit(Currency.USD, 500);
    System.out.println(account1.balance(Currency.HKD)); 
    System.out.println(account1.balance(Currency.JPY)); 
    System.out.println(account1.balance(Currency.USD)); 

  }

}
