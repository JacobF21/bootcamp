package Week1;
// Java: complile Lanaguage
// java file (Helloworld.java) ->


public class String1 {
  public static void main(String[] args) {
    String y = "Testing";
    String s = "1";
    System.out.println(y + s);

    String s3 = "";//empty string
    String s4 = " ";//space

    // Tool for String
    int lengthOfY = y.length();
    System.out.println(lengthOfY);
    char character = y.charAt(3);
    System.out.println(character);
    //System.out.println(y.charAt(100));//runtime error

    //equal()
    String s6 = "hello";
    String s5 = "hellos";
    boolean isS6EqualToS5 = s6.equals(s5);
    System.out.println(isS6EqualToS5);
    System.out.println(s5+10);
    System.out.println(s5+'a');
    System.out.println(s5+10.3);
    System.out.println(s5+true);
    System.out.println(s5+s6.equals(s5));
  }
}
