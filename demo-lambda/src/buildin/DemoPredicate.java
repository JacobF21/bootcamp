package buildin;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    int age =19;
    boolean isElderly = age>65;

    Predicate<Integer> isElderly2 = age2 -> age2>65;
    //System.out.println(isElderly2.test(70));
    //System.out.println(isElderly2.test(65));

    BiPredicate<String, Integer> isCharS = (str, idx) -> str.charAt(idx) == 'S';
    isCharS.test("Hello", 4);

    BiPredicate<String, String> startWith =(s1,s2) -> s1.startsWith(s2);
    //System.out.println(startWith.test("Hello", "he"));

    BiPredicate<String, String> endsWith =(s1,s2) -> s1.endsWith(s2);
    System.out.println(endsWith.test("Hello", "lo"));

    BiPredicate<String, String> combined = startWith.and(endsWith);
    System.out.println(combined.test("Hello", "lo"));
    System.out.println(combined.test("lollo", "lo"));

    BiPredicate<String, String> combined2 = startWith.or(endsWith);
    System.out.println(combined2.test("Hello", "He"));
    System.out.println(combined2.test("lollo", "lo"));

    BiPredicate<String, Integer> lengthLargerThan =(s1, length) -> s1.length()>length;
    System.out.println(lengthLargerThan.test("hello",1));

    //System.out.println(DemoPredicate.isCharacterS("Hello", 4));
  }

  public static boolean isCharacterS(String s, Integer idx){
    return s.charAt(idx) == 'S';
  }
}
