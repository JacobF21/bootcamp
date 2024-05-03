public class Ball extends ParentBall{
  private Color color;
  private double weight;

  enum Color{
    RED,YELLOW,BLACK,;
  }

  // public Ball(Color color, double weight, String name){
  //   super(name);
  //   this.color = color;
  //   this.weight = weight;
  // }

  private Ball(BallBuilder ballBuilder){
    super(ballBuilder.name);
    this.color=ballBuilder.color;
    this.weight=ballBuilder.weight;
  }
  

  public static BallBuilder builder(){
    return new Ball.BallBuilder();
  }

  public String toString(){
    return "Ball(" + this.weight
          +", " + this.color
          +", " + super.name
          +")";
  }

  //Builder Pattern (Coding Pattern)
  //1. avoid setter, so that I can create ball object with all attribute values
  //2. avoid all-args constructor
  public static class BallBuilder{
    private Color color;
    private double weight;
    private String name;

    public BallBuilder setColor(Color color){
      this.color=color;
      return this;
    }

    public BallBuilder setWeight(double weight){
      this.weight=weight;
      return this;
    }

    public BallBuilder setName(String name){
      this.name=name;
      return this;
    }

    public Ball build(){
      return new Ball(this);
    }

  }

  public static void main(String[] args) {
    Ball ball = new Ball.BallBuilder().setColor(Color.RED).setWeight(30.0d).setName("Football").build();
    System.out.println(ball);

    Ball ball2 = Ball.builder().setColor(Color.RED).setWeight(30.0d).setName("Baseball").build();
    System.out.println(ball2);


  }
}
