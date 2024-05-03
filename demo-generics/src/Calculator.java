

public class Calculator {
  public static double sum2(Number x, Number y){
    return x.doubleValue() + y.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(sum2(6L,3.0));
  }
}
