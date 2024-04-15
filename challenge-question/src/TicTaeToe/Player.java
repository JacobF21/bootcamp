package TicTaeToe;

import java.util.Scanner;

public class Player {
  
  public Player(){

  }

  public char[][] playerTurn(Board board,int position,char symbol){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which position ypu would like to choose?:");
    int playerInput = scanner.nextInt();
    board.addSymbol(position,symbol);


 
    }
  }

