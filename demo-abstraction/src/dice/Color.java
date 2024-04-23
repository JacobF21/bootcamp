package dice;

public enum Color {
  RED(1),
  YELLOW(2),
  BLUE(3),
  PINK(4),
  BLACK(5),
  WHITE(6)
  ;

  private int num;

  private Color(int num){
  this.num=num;
  }

  public int getValue(){
    return this.num;
  }

}
