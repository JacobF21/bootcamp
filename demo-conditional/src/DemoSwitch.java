public class DemoSwitch {
  public static void main(String[] args){
        // score > 90 ->A
        // 80 - 90 -> B
        // 70-79 -> C
        // <70 -> F
        // Print out: "The grade is B and passed"
        // && score <=90 is not necessary, coz the program need to check 2 condition to peform the task
        char grade = 'A';
        int score =0;
        switch (grade){
          case 'A':
            score++;
            //break;
          case 'B':
            score++;
            //break;
          case 'C':
            score++;
            //break;
          case 'D':
            score++;
          case 'E':
            score++;
          default:
            System.out.println("score="+score);
          }
          //switch CANNOT compare value
        switch (score) {
          case 1:
          case 2:
          default:
            break;
        }
      }
}

