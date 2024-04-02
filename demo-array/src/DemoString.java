public class DemoString {
  public static void main(String[] args) {
    String s="hello";
    String s2="";
    String s3=" ";
    
    //isEmpty() vs isBlank()
    boolean isEmptyResult= s2.isEmpty();//True
    boolean isEmptyResult2 = s3.isEmpty();//False
    System.out.println(isEmptyResult2);

    // substring()
    String result = s.substring(0,3); //hel
    System.out.println(result);
    result = s.substring(2);
    System.out.println(result);//llo

    //lowercase()
    System.out.println("HELLo".substring(0, 4).toUpperCase());
    System.out.println(s.contains("ll"));

    //startsWith()
    System.out.println(s.startsWith("he"));

    //endsWith()
    System.out.println(s.endsWith("elo"));

    //replace
    System.out.println(s.replace("l", "o"));

    //trim() -> remove the space at the begining and the tail of the string
    String s5 = "   hello  ! world ";
    System.out.println(s5.trim());
    System.out.println(s5.replace(" ", ""));

    //indexOf()
    char c = s.charAt(2);//'l'
    System.out.println(s.indexOf('l'));
    System.out.println(s.indexOf('!'));

  }
}
