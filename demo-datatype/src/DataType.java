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

    // byte
    byte b1 = 10;
    byte b2 = 127;
    // byte b3 =128; //compile error

    // short
    short s1 = 32767;
    // short s2 = 32768; //compile error
    // short s3 = 32769;//compile error
    // s3 = s3/2; //compile error
    //
    short s4 = 32768 / 2;
    System.out.println(s4);

    // Conversion
    int i1 = 100;
    long l1 = i1 + 100; // i1 + 100 -> int value -> long value
    System.out.println(l1);

    // Java ensure security, thus int is not able to assign into a short variable
    // short s5 = i1;

    int i9 = 10;
    float f1 = i9;
    float f2 = 103942902234234233904.2389028409328f;
    // int i10 = f2;
    float f3 = i9;
    System.out.println(f2);

    int r1 = 10; // 10 is a int value by default
    byte b10 = 4;// for integr, java will help chek the value, if it is in range
    // int -> byte
    // byte b12 = r1; //security problem -> error

    long l4 = i1; // int -> long
    long l5 = 5; // 5 is an int value by default
    // long l6 = 5i;
    long l6 = 10000; // 10000 is a int value
    long l7 = 10000L;// 10000 is a long value
    System.out.println();

    // char
    char c1 = 'a';
    char c2 = ' ';
    char c3 = '^';

    // boolean
    boolean bo1 = true;
    boolean bo2 = false;

    // Keyword
    //int true =10;
    //int class =13;
    //int public =14;
    byte b8 = 10;
    byte b9 =9;
    //short s9 = b8+b9;


  }
}
