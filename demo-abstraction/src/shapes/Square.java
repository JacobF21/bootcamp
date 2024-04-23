package shapes;
import java.math.BigDecimal;

public class Square implements Shape{
  
  private double length;
  public double area(){
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }

  public String print(){
    return String.valueOf(this.length);
  }

}
