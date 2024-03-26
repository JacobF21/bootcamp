package Week1;

public class DataType {
  public static void main(String[] args) {
    // variable
    // In Java we need to delcare the data type of the integer
    // In programming we put the value in righht hand side to left hand side
    int x = 1200;
    int age = 18;
    System.out.println(x);// 1200
    x = x + 200;
    System.out.println(age); // 200
    System.out.println("x"); // x

    int y = -20;
    y = 100;
    int z = 999999;
    // x,y,age
    int sum = x + y + age;


    int price = 8;
    int quantity = 10;
    int total = price * quantity;
    System.out.println(total);

    int price2 = 10;
    int quantity2 = 4;
    int total2 = price2 * quantity2;
    // camlCase
    int averagePrice = (total + total2) / (quantity + quantity2);
    System.out.println(averagePrice);

    double k = 3.14;
    double k2 = 1.32;
    double k3 = 1;
    double k4 = 1.223892789472;
    System.out.println(k4);
    double k6 = 0.1 + 0.2;
    double k7 = 0.2 + 0.3;
    System.out.println(k6);
    System.out.println(k7);

    int u = 10 % 3;
    System.out.println(u);
  }
}
