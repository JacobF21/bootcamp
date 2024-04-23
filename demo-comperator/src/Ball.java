import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private Color color;
  private double size;
  public Ball(Color color, double size){
    this.color=color;
    this.size=size;
  }

  // @Override
  // public int compareTo(Ball ball){
  //   return this.size > ball.getSize()? -1:1;
  //   //-1 means (this) object move to left
  // }
    @Override
  public int compareTo(Ball ball){
    return this.color.getValue() > ball.getColor().getValue()? -1:1;
    //-1 means (this) object move to left
  }

    
  public double getSize(){
    return this.size;
  }

  public String toString(){
    return "Ball("
          + "size=" + this.size
          +" color=" + this.color;
  }

  public Color getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10));
    balls.add(new Ball(Color.RED, 20));
    balls.add(new Ball(Color.YELLOW, 13));
    balls.add(new Ball(Color.YELLOW, 3.4));
    //sort() is calling a comparaeTo method, the writer of the Class has the right to determine the rule of the sorting
    Collections.sort(balls);//Compile-time check if the list of the objects implements a contracr
    System.out.println(balls);

  }


}
