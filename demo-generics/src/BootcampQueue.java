import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BootcampQueue<T> {
  private Queue<T> data;
  private Object data2;
  public BootcampQueue(){
      this.data = new LinkedList<>();
  }

  //add
  public void add(T data){ // S -> Intger or String or Customer...
    this.data2=data;
  }

   //add
   public void add2(Object data2){ // S -> Intger or String or Customer...
    this.data2=data2;
  }

  //poll
  public T poll(){
    return this.data.poll();
  }

  public static void main(String[] args) {
    BootcampQueue<String> bq = new BootcampQueue<>();
    bq.add("hello");
  }
}
