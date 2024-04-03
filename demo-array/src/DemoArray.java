import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        // 9 types = Primitives + String
        // int x=2;
        // Sting s = "abc";

        // Array (Store a set of same type of value)
        int[] arr = new int[3];
        // Assign value to the int array
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = -100;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // arr[0] = 3;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        // Create another int array to the original array, the original array is deleted in ram
        arr = new int[4];
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        String[] stringArr = new String[2];
        stringArr[0] = "Demo";
        stringArr[1] = "Demo2";
        // System.out.println(stringArr[0]);
        // System.out.println(stringArr[1]);

        double[] doubleArr = new double[3];
        doubleArr[0] = 1.5;
        doubleArr[1] = 2.5;
        doubleArr[2] = 3.5;
        // System.out.println(doubleArr[0]);
        // System.out.println(doubleArr[1]);
        // System.out.println(doubleArr[2]);

        int[][] testing = new int[5][5];
        int temp = 1;
        for (int i = 0; i < testing.length; i++) {
            for (int j = 0; j < testing.length; j++) {
                testing[i][j] = temp;
                temp++;

            }
        }
        System.out.println(testing);
        // System.out.println(Arrays.deepToString(testing));
        // int max = Integer.MIN_VALUE;
        // System.out.println(max);

        // loop print odd number
        int[] integers2 = new int[] {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 1) {
                // System.out.println(integers2[i]);
            }
        }

        // average value of even numbers
        int total = 0;
        int count = 0;
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 0) {
                total += integers2[i];
                count++;
            }
        }
        double avg = total / count;
        System.out.println(avg);

        // Find the max value within the int array
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < integers2.length; i++) {
            if (maxValue < integers2[i]) {
                maxValue = integers2[i];
            }
        }
        System.out.println("max value is: " + maxValue);

        // Find the min value within the int array
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < integers2.length; i++) {
            if (minValue > integers2[i]) {
                minValue = integers2[i];
            }
        }
        System.out.println("min value is: " + minValue);

        char[] characters = new char[] {'a', '!', 'e', '!'};

        // check if the array contains '!' -> true/false
        boolean result = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '!') {
                result = true;
                break;
            }
        }
        // System.out.println(result);

        // print out of index of '!', if not found print -1 (my ans)

        boolean result2 = false;
        String outcome = "";
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '!') {
                result2 = true;
                outcome += i + ", ";
            }
        }
        if (result2 == true) {
            System.out.println(result2 + ", index of ! is at: " + outcome);
        } else {
            System.out.println("-1");
        }

        // print out of index of '!', if not found print -1 (Vincent's ans)
        char[] characters2 = new char[] {'a', 'b', '!', 'e', '!'};
        int[] indexes = new int[characters2.length];
        int indexesCount = 0;
        boolean result3 = false;
        for (int i = 0; i < characters2.length; i++) {
            if (characters2[i] == '!') {
                result3 = true;
                indexes[indexesCount++] = i;
                // indexesCount++;
                // line 132 and 133 can be combine to 1 line
            }
        }
        if (result3 == true) {
            System.out.println("index of ! is at: " + Arrays.toString(indexes));
        } else {
            System.out.println("-1");
        }

        String[] balls = new String[] {"RED", "YELLOW", "BLACK", "YELLOW"};
        double[] prices = new double[] {5.5, 7.8, 10.0, 7.8};
        int[] quantities = new int[] {1, 3, 4, 5};
        double total2 = 0.0;
        for (int i = 0; i < balls.length; i++) {
            if ("Yellows" == balls[i]) {
                total2 += prices[i] * quantities[i]; // double value * int value -> double value
            }
        }
        System.out.println("total amount of yellow ball is: " + total2);

        // Swapping
        int[] arr3 = new int[] {10, 3, 9, 4};
        int tempIndexOf10 = 0;
        int tempIndexOf9 = 0;
        int temp3;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == 10) {
                tempIndexOf10 = i;
                // System.out.println(tempIndexOf10);
            } else if (arr3[i] == 9) {
                tempIndexOf9 = i;
                // System.out.println(tempIndexOf9);
            }
        }
        temp3 = arr3[tempIndexOf10];
        arr3[tempIndexOf10] = arr3[tempIndexOf9];
        arr3[tempIndexOf9] = temp3;
        // System.out.println(Arrays.toString(arr3));

        // arr3=[9,3,10,4]
        // Target = [3,10,4,9]
        int temp4 = 0;
        for (int i = 0; i < arr3.length - 1; i++) {
            temp4 = arr3[i];
            arr3[i] = arr3[i + 1];
            arr3[i + 1] = temp4;
        }
        // System.out.println(Arrays.toString(arr3));

        // arr3=[3,10,4,9]
        // Target = [10,3,4,9] my ans
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] >= max) {
                max = arr3[i];
            }
        }

        int temp5 = 0;
        for (int j = arr3.length - 1; j > 0; j--) {
            if (arr3[j] == max) {
                temp5 = arr3[j];
                arr3[j] = arr3[j - 1];
                arr3[j - 1] = temp5;
                temp5 = 0;
            }
            // System.out.println(Arrays.toString(arr3));
        }
        //System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[] {3, 10, 4, 9};
        int temp6 = 0;
        for (int k = arr4.length - 1; k > 0; k--) {
            if (arr4[k] > arr4[k - 1]) {
                temp6 = arr4[k];
                arr4[k] = arr4[k - 1];
                arr4[k - 1] = temp6;
            }
            //System.out.println(Arrays.toString(arr4));
        }
        // System.out.println(Arrays.toString(arr4));

        // Sorting (Bubble sort)
        int[] arr5 = new int[] {-10, -42, 8, 19, 1};
        // Target: {-42,-10,1,8,19}
        int temp7 = 0;
        for (int i = 0; i < arr5.length-1; i++) {
            for (int j = 0; j < arr5.length - i - 1; j++) {
                if (arr5[j] > arr5[j + 1]) {
                    temp7 = arr5[j];
                    arr5[j] = arr5[j + 1];
                    arr5[j + 1] = temp7;
                    //System.out.println(Arrays.toString(arr5));
                }
            }
        }
        //System.out.println(Arrays.toString(arr5));

        //Insertion Sort my ans
        int t= 0;
        int[] arr6 = new int[] {-10, -42, 8, 19, 1};
        for(int i=1;i<arr6.length;i++){
            if(arr6[i]<arr6[i-1]){
                t=arr6[i];
                int temp8 =0;
                for(int j =i;j>0;j--){
                    temp8 = arr6[j];
                    arr6[j]=arr6[j-1];
                    arr6[j-1] =temp;
                }
                arr6[0]=t;
            }
            //System.out.println(Arrays.toString(arr6));
        }
        //System.out.println(Arrays.toString(arr6));

        //insertion sort Vincent's ans
        int[] arr7 = new int[] {-5,10,-6};
        for (int i=1; i<arr7.length;i++){
            int key = arr7[i];
            int k;
            for(k= i-1; k>=0; k--){
                if(arr7[k]<=key){
                    break;
                }
                arr7[k+1] = arr7[k]; 
            }
            arr7[k+1]=key;

            System.out.println(Arrays.toString(arr7));
        }
        //System.out.println(Arrays.toString(arr7));
        //Sorting = selection sort

    }
}
