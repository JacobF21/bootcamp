public enum Number {
  ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6),;

  private int num;

  private Number(int num) {
    this.num = num;
  }

  public int getValue() {
    return this.num;
  }
}
