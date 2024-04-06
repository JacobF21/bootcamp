import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] bubbleSortArr =new int[]{-30,9,7,10,-50,90,100,67};
        int temp =0;
        for(int i=0;i<bubbleSortArr.length;i++){
            for(int j=0;j<bubbleSortArr.length-1-i;j++){
                if(bubbleSortArr[j]>bubbleSortArr[j+1]){
                    temp=bubbleSortArr[j+1];
                    bubbleSortArr[j+1]=bubbleSortArr[j];
                    bubbleSortArr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleSortArr));
    }
}
