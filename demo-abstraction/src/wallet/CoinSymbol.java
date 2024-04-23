package wallet;

public enum CoinSymbol {
  ETH("1a",3000),
  BNB("2b",550),
  SOL("3c",130),
  ;

  private String contrackAddress;
  private double rate;

  private CoinSymbol(String contrackAddress, double rate){
    this.contrackAddress=contrackAddress;
    this.rate=rate;
  }

  public double getRate() {
    return this.rate;
  }

}