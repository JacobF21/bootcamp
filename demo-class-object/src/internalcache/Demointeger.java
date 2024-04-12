package internalcache;

public class Demointeger {
  
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1==i2);//true
    System.out.println(System.identityHashCode(i1));//1365040271
    System.out.println(System.identityHashCode(i2));//1365040271

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3==(i4));//false
    System.out.println(System.identityHashCode(i3)); //1933863327
    System.out.println(System.identityHashCode(i4)); //112810359

    //Integer, Byte, Long, Short => Support Internal Cache
    //Float, Double -> Do ot support internal cache

    Float f1 =Float.valueOf(127);
    Float f2 =Float.valueOf(127);
    System.out.println(f1==f2);//false
    System.out.println(System.identityHashCode(f1));//2124308362
    System.out.println(System.identityHashCode(f2));//146589023

    Character c1= Character.valueOf('z');
    Character c2= Character.valueOf('z');  
    System.out.println(c1==c2);//true



  }

}
