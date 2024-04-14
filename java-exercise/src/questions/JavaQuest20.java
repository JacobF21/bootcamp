package questions;
/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * 
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * the input need to be lowercase English letters.
 */
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    // code here ...
    char temp;
    StringBuilder s1 = new StringBuilder(s);
    for(int i=0;i<s.length();i++){
      System.out.println(s1);
      if(s1.toString().equals(goal)){
        return true;
      }
        temp =s1.charAt(0);
        s1.append(temp);
        s1.deleteCharAt(0);
      
    }
    return false;
  }
}
