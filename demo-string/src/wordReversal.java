import java.util.Arrays;
import java.util.Scanner;

public class wordReversal {
    public static void main(String[] args) {
        // Write a Java program that prompts the user to enter a sentence.
        // Use the appropriate string method(s) to split the sentence into individual words.
        // Reverse each word using string manipulation methods.
        // Reconstruct the modified sentence with the reversed words.
        // Display the modified sentence as the output.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String trimmedSentence = sentence.trim();
        //System.out.println(trimmedSentence);
        //String trimmedSentence = "hihihi this question is so challenge!!!";
        //count the no of space to determine the length of the array
        int noOfSpace=0;
        for(int i=0;i<trimmedSentence.length();i++){
            if(trimmedSentence.charAt(i) == ' '){
                noOfSpace++;
            }
        }
        
        //Use the noOfSpace create the correspondence String[] to store the word
        String temp = "";
        String[] arr = new String[noOfSpace+1];
        int numOfWords = 0;
        for (int i = 0; i < trimmedSentence.length(); i++) {
            if (i == trimmedSentence.length() - 1) {
                temp += trimmedSentence.charAt(i);
                arr[numOfWords] = temp;
                numOfWords++;
                temp = "";
            } else if (trimmedSentence.charAt(i) == ' ') {
                arr[numOfWords] = temp;
                numOfWords++;
                temp = "";
            } else if (trimmedSentence.charAt(i) != ' ') {
                temp += trimmedSentence.charAt(i);
            }
            //System.out.println(Arrays.toString(arr));
        }
        //System.out.println(arr.length);
        //System.out.println(trimmedSentence.length());
        //reverse the order of each element in the array
        for(int j=0;j<arr.length;j++){
            String tempStorage ="";
            //System.out.println(arr[j].length());
            for(int k=arr[j].length()-1;k>=0;k--){
                tempStorage += arr[j].charAt(k);
            }
            arr[j]= tempStorage;
        }
        //System.out.println(Arrays.toString(arr));
        String finalAns="";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                finalAns += arr[i];
            } else{
                finalAns += arr[i]+" "; 
            }

        }
        System.out.println(finalAns);
    }
}
