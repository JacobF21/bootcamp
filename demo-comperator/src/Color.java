public enum Color {
  RED(0),
  BLACK(0),
  YELLOW(5);

  private int value;
  private Color(int value){
    this.value=value;
  }


  public int getValue(){
    return this.value;
  }
}
