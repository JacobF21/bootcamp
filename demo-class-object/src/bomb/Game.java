package bomb;

import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int userInput;
    int min =1;
    int max =100;
    Random random = new Random();
    int target = random.nextInt(max - min + 1) + min;
    System.out.println(target);

    for(int i=0;i<100;i++){
      //User Input
      System.out.print("Please enter a number: ");
      Scanner input = new Scanner(System.in);
      userInput = Integer.parseInt(input.nextLine());
      //Checking
      if(userInput < min || userInput > max ){
        System.out.println("Invalid Input, Please enter a number between " + min + " - " +max);
        continue;
      }
      //Main Logic
      if(userInput == target){
        System.out.println("Bomb!!!");
        input.close();
        break;
      } else if (userInput>target){
        max=userInput-1;
        System.out.println("Game continue, Please enter a number between "+min+" - "+max);
        continue;
      } else if(userInput < target){
        min = userInput+1;
        System.out.println("Game continue, Please enter a number between "+min+" - "+max);
        continue;
      }
    }
  }
}
