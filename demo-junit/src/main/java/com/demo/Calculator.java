package com.demo;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static String concat(List<String> strings){
        String temp ="";
        for(String s: strings){
            temp+=s;
        }
        return temp;
    }
    
    public static int sum(int x, int y){
        return x+y;
    }

    public static int substract(int x, int y){
        return x-y;
    }

    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
