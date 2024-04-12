package literalpool;

public class DemoString {
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";
    String s3 = "hello ";
    String s4 = new String("hello");
    String s5 = String.valueOf("hello");

    System.out.println(System.identityHashCode(s)); // 1933863327 hashcode -> object address
    System.out.println(System.identityHashCode(s2)); // 1933863327 hashcode -> object address
    System.out.println(System.identityHashCode(s3)); // 112810359
    System.out.println(System.identityHashCode(s4)); // 2124308362
    System.out.println(System.identityHashCode(s5)); // 1933863327

    System.out.println(s == s2);
    System.out.println(s == s5);
    System.out.println(s == s4);
    System.out.println(s == s3);

    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb1 == sb2);

    String test = "aaa";
    System.out.println(System.identityHashCode(test));// 146589023
    test += "bbb";
    System.out.println(System.identityHashCode(test));// 349885916

  }
}
