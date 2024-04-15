package TicTaeToe;

import java.util.Arrays;

public class Board {
  private char[][] board = {{' ',' ',' '},
                            {' ',' ',' '},
                            {' ',' ',' '},};

  public Board(){
    
  }

  public void printBoard(){
    System.out.println(this.board[0][0]+"|"+this.board[0][1]+"|"+this.board[0][1]);
    System.out.println("-+-+-");
    System.out.println(this.board[1][0]+"|"+this.board[1][1]+"|"+this.board[1][1]);
    System.out.println("-+-+-");
    System.out.println(this.board[2][0]+"|"+this.board[2][1]+"|"+this.board[2][1]);
  }

  public void addSymbol(int position, char symbol){
    switch (position) {
      case 1:
        this.board[0][0] = symbol;
        break;
      case 2:
        this.board[0][1] = symbol;
        break;
      case 3:
        this.board[0][2] = symbol;
        break;
      case 4:
        this.board[1][0] = symbol;
        break;
      case 5:
        this.board[1][1] = symbol;
        break;
      case 6:
        this.board[1][2] = symbol;
        break;
      case 7:
        this.board[2][0] = symbol;
        break;
      case 8:
        this.board[2][1] = symbol;
        break;
      case 9:
        this.board[2][2] = symbol;
        break;
      default:
        System.out.println("Invalid Input, Please Try again");
    }
  }
}
