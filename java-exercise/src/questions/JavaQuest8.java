package questions;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    int temp;
    // code here ...
    //reorder all the value then find the second max
    for(int i=0;i<nums3.length-1;i++){
      for(int j=0;j<nums3.length - i- 1;j++){
        if(nums3[j]>nums3[j+1]){
          temp = nums3[j+1];
          nums3[j+1] = nums3[j];
          nums3[j]=temp;
        }
      }
    }
    secondMax = nums4[nums4.length-2];
    //System.out.println(Arrays.toString(nums4));
    //System.out.println(secondMax);

    //Find the max value, then find the second max by comparing the value with max 
    int secondMax2 = nums3[0];
    int max2=Integer.MIN_VALUE;
    for(int i=0;i<nums3.length;i++){
      if(nums[i]>max2){
        max2=nums3[i];
      }
    }
    for(int j=0;j<nums3.length;j++){
      if(nums3[j]<=max2 && nums3[j]>=secondMax2){
        secondMax2=nums3[j];
      }
      //System.out.println(secondMax2);
    }  
    //System.out.println(Arrays.toString(nums));
    //System.out.println(max2);
    System.out.println(secondMax2); 
  }
}