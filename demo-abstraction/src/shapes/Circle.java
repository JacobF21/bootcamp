package shapes;

import java.math.BigDecimal;

//1. You can implement more than one Interfae in a class
public class Circle implements Shape {
  
  private double radius;
  
  @Override
  public double area(){
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(this.radius)).multiply(Shape.PI).doubleValue();
  }

  public String print(){
    return String.valueOf(this.radius);
  }

  public void sleep(){
    System.out.println("Sleeping");
  }

  public static void main(String[] args){
    //Polymorhism
    Shape s = new Circle(); //OK
    s.area();
    //s.sleep();
  }
}
