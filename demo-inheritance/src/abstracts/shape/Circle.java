package abstracts.shape;
import java.math.BigDecimal;

public class Circle extends Shape {
  
  private double radius;
  
  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public double getRadius(){
    return this.radius;
  }

  @Override
  public boolean equals(Object o){
    if(this ==o){
      return true;
    }
    if(!(o instanceof Circle)){
      return false;
    }
    Circle circle = (Circle) o;
      return this.radius == circle.getRadius();
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    Circle c2 = new Circle();
    Circle c3 = c;

    System.out.println(c.equals(c2));//false
    System.out.println(c.equals(c3));//true


  }
}
