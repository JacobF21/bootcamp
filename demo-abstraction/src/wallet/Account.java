package wallet;

public class Account extends CryptoWallet implements Transactable{
  public String splAddress;
  public String bep20Address;
  public String erc20Address;
  Transaction[] transaction;

  public void deposit(CoinSymbol coinSymbol, double amount){
    for(CoinSymbol coin: CoinSymbol.values()){
      if(coin == coinSymbol){

      }
    }
  };

  public void withdraw(double amount);
}
