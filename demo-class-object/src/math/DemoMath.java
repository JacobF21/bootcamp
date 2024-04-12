package math;

public class DemoMath {

  public static void main(String[] args) {
    //MAth.pow
    double result = Math.pow(2.0d,4.0d);
    System.out.println(result);
    // upcast 1-> double
    int min = Math.min(3, 2);
    System.out.println(min);

    int a = 9;
    int b = 10;
    //int min =Math.min(a, b);
    if(a > b)
      min =b;
    min =a;
    System.out.println(min);
    System.out.println(Math.round(3.5));

    System.out.println(Math.sqrt(5));
    System.out.println(Math.sqrt(-5)); //double -> NaN

    System.out.println(Math.ceil(3.1));
    System.out.println(Math.floor(2.5));

    int[] arr = new int[]{10,4,2,3};

    int max=Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      max = Math.max(max, arr[i]);
    }
    System.out.println(max);

  }

}
