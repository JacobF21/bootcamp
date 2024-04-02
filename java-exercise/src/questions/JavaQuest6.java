package questions;

import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 0 1 2 3 4 5 6 7
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int[] fs = new int[16];
    for(int i=0;i<16;i++){
      if(i<2){
        fs[i]=1;
        //System.err.println(i);
      }
      else if(i>=2){
        fs[i]=fs[i-1]+fs[i-2];
      }
    }
    System.out.println(Arrays.toString(fs));
  }
}