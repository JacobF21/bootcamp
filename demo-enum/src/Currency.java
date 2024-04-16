public enum Currency {
  HKD(1),//
  USD(7.85),//
  GBP(10),//
  JPY(0.051),//
  EUR(8.31),//
  ;

  private double rate;
  private Currency(double rate){
    this.rate =rate;
  }

  public double getRate() {
    return this.rate;
  }
}
