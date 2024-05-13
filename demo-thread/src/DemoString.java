import java.time.LocalDateTime;

public class DemoString {
  static String x= "";

  public static void main(String[] args){
    Runnable task =()->{
      for(int i=0;i<1_000_000;i++){
        x=x.concat("s");
      }
    };

    LocalDateTime starTime = LocalDateTime.now();
    Thread th1 = new Thread(task);
    Thread th2 = new Thread(task);
    th1.start();
    th2.start();

    try{
      th1.join();
      th2.join();
    } catch(InterruptedException e){

    }
    LocalDateTime endTime = LocalDateTime.now();
    System.out.println(x.length());
    System.out.println(starTime+"   "+endTime);

  }
}
