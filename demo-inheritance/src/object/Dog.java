package object;

public class Dog {

  private Color color;

  private int id;
  
  public Dog(int id, Color color){
    this.color=color;
  }

  public Color getColor(){
    return this.color;
  }
}
