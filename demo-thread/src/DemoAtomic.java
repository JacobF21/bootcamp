import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  static AtomicInteger x = new AtomicInteger(17);
  static Integer x2 = 17;

  public static void main(String[] args){
    Runnable task =()->{
      for(int i=0;i<1_000_000_0;i++){
        x.incrementAndGet();
      }
    };

    Runnable task2 =()->{
      for(int i=0;i<1_000_000_0;i++){
        x2++;
      }
    };

    Long start = System.nanoTime();
    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    }catch(InterruptedException e){

    }
    Long end = System.nanoTime();
    System.out.println(x);
    System.out.println(end - start);

    Long start2 = System.nanoTime();
    Thread th3 = new Thread(task2);
    Thread th4 = new Thread(task2);
    th3.start();
    th4.start();

    try{
      th3.join();
      th4.join();
    }catch(InterruptedException e){

    }
    Long end2 = System.nanoTime();
    System.out.println(x2);
    System.out.println(end2 - start2);
    
  }

}
