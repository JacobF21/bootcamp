import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  static Map<Integer, Integer> queue = new HashMap<>();

  public static void main(String[] args) {

    Runnable addQueue =()->{
    for(int i=0;i<1_000_000;i++){
      queue.put(i,i);
    }
  };
    
    Thread thread1 = new Thread(addQueue);
    Thread thread2 = new Thread(addQueue);
    Thread thread3 = new Thread(addQueue);
    thread1.start();
    thread2.start();
    thread3.start();

    try{
      thread1.join();
      thread2.join();
      thread3.join();
    }catch(InterruptedException e){

    }
    System.out.println(queue.size());
  }
}
