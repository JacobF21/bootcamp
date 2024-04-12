package method;

import java.util.Arrays;
import dse.student;

public class Square {

  private int length;
  
  public Square(int length){
    this.length=length;
  }

  public int area(){
    return this.length * this.length;
  }

  public static void resize(Square sqaure, int newSize ){
    sqaure.length=newSize;
  }

  public static int sum(int x, int y){
    return x+y;
  }
  
  public static String concat(String x, String y){
    return x+y;
  }

  public static void addOne(short[] arr){
    //int idx=0;
    for(short item:arr){
      item++; 
      //System.out.println(item);
      //System.out.println(arr[idx]);
      //idx++;
    }
  }

  public static void addOne2(short[] arr){
    int idx=0;
    for(short item:arr){
       arr[idx]++;
       idx++;
    }
  }

  public static void xxx(Square square){
    square = new Square(3);
  }
  /*
   * The issue in your code is that you are trying to increment the item variable within the for-each loop, 
   * which does not modify the original array elements. 
   * The for-each loop assigns each element of the array to the item variable, 
   * creating a copy of the value. Therefore, incrementing item does not affect the original array elements.
   * To fix this, you can use a traditional for loop instead, 
   * where you can access the array elements using the index and increment them directly. 
   * Here's an updated version of your code:
   */


  public static void main(String[] args) {
    //pass by value -> primitives, wrapper clas, String
    //pass by reference -> all type of array, class
    int a=4;
    int b=7;
    sum(a,b); // a=4, b=7
    Integer q =10;
    Integer e =11;
    sum(10,11);// g=10, e=11

    String s1 = "hello";
    String s2 = "World";
    concat(s1,s2);//After concat s1 ="hello" s2="world"

    short[] arr1 = new short[]{3,4,9};
    addOne2(arr1); //pass by copy of ref of arr1
    System.out.println(Arrays.toString(arr1));

    Square sq1=new Square(10);
    resize(sq1, 20);//passing copy of reference of sq1
    System.out.println(sq1.area());

    Square sq2 = new Square(9);
    xxx(sq2);
    System.out.println(sq2.area());
  }
  

}
