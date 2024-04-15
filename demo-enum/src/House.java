public class House {
  private Direction direction;

  public House(Direction direction){
    this.direction=direction;
  }
  public void setDirection(Direction direction){
    this.direction=direction;
  }

  public Direction getDirection(){
    return this.direction;
  }

  public String toString(){
    return "House pointed to: "+this.direction;
  }
}
