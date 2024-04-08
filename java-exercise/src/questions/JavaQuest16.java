package questions;
/*
 * Sum up to Zero
 */

import java.util.Arrays;

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(15); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));
    System.out.println(Arrays.toString(nums3));
  }

  // code here ...
  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique
  public static int[] sumToZero(int n) {
    int[] arr = new int[n];
    if (n % 2 == 0) {
      for (int i = 0; i < n / 2; i++) {
        arr[i] = (int) (Math.random() * 10);
        arr[n - 1 - i] = arr[i] * -1;
      }
    }
    if (n % 2 == 1) {
      for(int i=0;i<(n-1)/2;i++){
        if(i<(n-1)/2-1){
          arr[i] = (int) (Math.random() * 10);
          arr[n - 1 - i] = arr[i] * -1;
        }
        if(i==(n-1)/2-1){
          arr[i] = (int) (Math.random() * 10);
          arr[i+1] = (int) (Math.random() * 10);
          arr[i+2] = -arr[i] - arr[i+1];
        }

      }
    }

    return arr;
  }

}
