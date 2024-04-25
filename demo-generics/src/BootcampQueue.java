import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BootcampQueue<T> {
  private Queue<T> data;
  public BootcampQueue(){
      this.data = new LinkedList<>();
  }

  //add
  public void add(String s){
    this.data.add((T)s);
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
