package questions;
/*

Question : Given an integer n, return true if n has exactly three positive divisors. 
Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.

*/
public class JavaQuest21 {
  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false
    System.out.println(isThreeDivisors(3)); // false
    System.out.println(isThreeDivisors(4)); // true
    System.out.println(isThreeDivisors(12));// false
    System.out.println(isThreeDivisors(9999));// false

  }

  public static boolean isThreeDivisors(int n) {
    // code here ...
    int count = 0;
    if(n==1){
      return false;
    }
    for(int i =1;i<n+1;i++){
      if(n%i == 0){
        count++;
        System.out.println(count);
      }
    }
    if(count == 3){
      return true;
    }
    //System.out.println(count);
    return false;
  }
}
