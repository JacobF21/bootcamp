import java.util.Deque;
import java.util.LinkedList;

public class DemoDque {
  public static void main(String[] args) {
    //Deque extends Queue
    Deque<String> strings = new LinkedList<>();
    strings.add("hello");
    strings.add("abc");
    strings.addFirst("first");
    strings.addLast("last");
    System.out.println(strings);//[first, hello, abc, last]
    
    strings.poll();
    System.out.println(strings);//[hello, abc, last]
    strings.pollLast();
    System.out.println(strings);////[hello, abc]


    System.err.println(strings.peekFirst());
    System.err.println(strings.peekLast());

    strings.pop();//removeFirst()
    System.out.println(strings);
    strings.push("mmm");//addFirst, [mmm, abc]
    System.out.println(strings);

  }
}
