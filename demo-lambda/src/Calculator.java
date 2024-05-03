@FunctionalInterface
public interface Calculator {
    int square(int x);
  public static void main(String[] args) {
    Calculator calculator=(x)->{
      return (int)Math.pow(x,2);
    };
    System.out.println(calculator.square(3));

    Calculator calculator2 = x -> (int) Math.pow(x, 2);
    System.out.println(calculator2.square(3));

    //what is this
    Calculator calculator3 = x ->3;
    System.out.println(calculator3.square(5));
    System.out.println(calculator3.square(2));
    System.out.println(calculator3.square(1));
  }
} 

