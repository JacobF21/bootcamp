package questions;

import java.util.Arrays;

/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5. Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 : Input : num = 3535 Output : 3333
 * 
 * Example 2 : Input: num = 5555 Output: 3355
 */
public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {
    // code here ...
    int count = 2;
    String[] result = new String[String.valueOf(num).length()];
    String copy = String.valueOf(num);
    //System.out.println(copy);
    for(int i=0;i<copy.length();i++){
      result[i]=String.valueOf(copy.charAt(i));
    }

    for(int i =0;i<String.valueOf(num).length();i++){
      if(result[i].equals("5")){
        result[i]=result[i].replace("5", "3");
        count --;
      }
      if(count==0){
        break;
      }
    }
    //System.out.println(Arrays.toString(result));
    String temp="";
    for(int j=0;j<result.length;j++){
      temp = temp.concat(result[j]);
    }
    System.out.println(temp);
    int ans = Integer.parseInt(temp);
    return ans;
  }
}
