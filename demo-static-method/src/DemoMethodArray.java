import java.util.Arrays;

public class DemoMethodArray {
  public static void main(String[] args) {
    double[] prices = new double[]{2.0, 9.8, 5.6};
    int[] quantites = new int[]{2,4,5};
    double test1=0.1;
    double test2=0.2;
    System.out.println(test1+test2);
    System.out.println(DemoMethodArray.totalAmount(prices, quantites));
    System.out.println(ABC.hello());
    String[] test= new String[] {"  aa a ", "  b  b b "};
    System.out.println(Arrays.toString(DemoMethodArray.trimSpace(test)));

    //pass by reference example
    trimSpace(test);
    System.out.println(Arrays.toString(test));
  }

  // Method:totalAmount
  public static double totalAmount(double[] price, int[] quantity){
    double total=0;
    for(int i =0;i<quantity.length;i++){
      total += subTotal(price[i], quantity[i]);
    }
    return total;
  }

  //Method: subTotal(double price, int quantity)
  public static double subTotal(double price, int quantity){
    return price*quantity;
  }

  public static String trimSpace(String s){
    return s.replace(" ","");
  }

  public static Integer sum(Integer x, Integer y){ //pass by value
    return x+y; // int + int -> int -> autobox
  }

  public static String trimSpace2(String s){// pass by value (a copy of the original string object)
    return s.replace(" ", "");
  }

  public static void trimSpace3(String[] ss){
    for (int i=0;i<ss.length;i++){
      ss[i]=ss[i].replace(" ", "");
    }
  }
  //In Java, we have "pass by reference"(address) and "pass by value"(a copy of the original sting object)
  
  public static String[] trimSpace(String[] ss){
    String[] strings = new String[ss.length]; //If after execute the method we don't wnat to modify the original String, it needs to duplicate a
    for(int i = 0 ;i<strings.length;i++){
      strings[i] = ss[i].replace(" ", "");
    }
    return strings;//returning string array object address
    //Refer to
    /* 
    String testing1 = "hello";
    String testing2 = "hello";
    System.out.println(testing1 == testing2);
    testing2 = testing2.replace("h", "i");
    System.out.println(testing1 == testing2);
    testing2 = testing2.replace("i", "h");
    System.out.println(testing1 == testing2);
    */
  }

}
