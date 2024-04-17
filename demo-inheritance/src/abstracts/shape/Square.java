package abstracts.shape;
import java.math.BigDecimal;

public class Square extends Shape {
  
  private double length;

  public double area(){
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }  
}
