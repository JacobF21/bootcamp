import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoVector {

  static List<Character> characters= new LinkedList<>();
  static List<Character> characters2= new Vector<>();

  public static void main(String[] args) {


    Runnable concatLinkList =()->{
      for(int i =0;i<1_000_000;i++){
        characters.add('s');
      }
    };

    Runnable concatVector =()->{
      for(int i =0;i<1_000_000;i++){
        characters2.add('s');
      }
    };

    // Thread th1 = new Thread(concatLinkList);
    // Thread th2 = new Thread(concatLinkList);
    // th1.start();
    // th2.start();

    long startTime = System.nanoTime();
    Thread th3 = new Thread(concatVector);
    Thread th4 = new Thread(concatVector);
    th3.start();
    th4.start();

    try{
      th3.join();
      th4.join();
    } catch(InterruptedException e){

    }
    long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println(elapsedTime);
    System.out.println(characters.size());

    //82830167

    //66918750
  }
}
