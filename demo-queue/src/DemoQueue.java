import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemoQueue {
    public static void main(String[] args) {
       //Queue is a contract/interface
       List<String> strings = new LinkedList<>();
       strings.add("hello");
       strings.remove(0);
       strings.add("def");


       //not safe coz strings is a LinkedList behind the scene, LinkedList is List and Queue is array
       Queue<String> strings2 =(Queue<String>)strings;
       //strings.remoce(1); //queue does not have index concept
    //    strings2.add("abc");
    //    System.out.println(strings2.size());//2

       //strings2.poll();//hello (poll() means remove and return the head object)
    //    System.out.println(strings2.poll());
    //    System.out.println(strings2);
    //    System.out.println(strings2.poll());
    //    System.out.println(strings2.poll());

       strings2.add("xyz");
       strings2.add("ijk");
       strings2.add("xyz");
       //System.out.println(strings2.peek());

       //while loop
       while(!strings2.isEmpty()){
        System.out.println(strings2.poll());
       }
       //System.out.println(strings2.size());

       strings2.add("Vincent");
       strings2.add("Oscar");

       //Remove even number
       Queue<Integer>integers = new LinkedList<>();
       integers.add(1);       
       integers.add(101);       
       integers.add(2);       
       integers.add(99);       
       integers.add(-8);
       integers.remove();

       int size = integers.size();
       int val = -1;
       while(size-- >0){
        val = integers.poll();
        if(val % 2 ==1){
            integers.add(val);
        }
       }
       System.out.println(integers);

       String x = "hello";
       String x2 = x;
       x = x+ "hello"; // x object (new object), because us immutable
       System.out.println(x2);//hello
       System.out.println(x);
       
       int[] arr = new int[] {2,1,3};
       //int[] backup = Arrays.copyOf(arr, arr.length);
       int[] backup =arr;
       arr[1] = 100;
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(backup));
    //    int count =integers.size();
    //    while (count-- > 0) {
    //     if(integers.peek() % 2 == 0 ){
    //         integers.poll();
    //         continue;
    //     } else {
    //         integers.add(integers.poll());
    //     }
    //    }
    //    System.out.println(integers);
       
    // stack(pop, push)
    Stack<String> string4 = new Stack<>();
    string4.push("hello");
    string4.push("hello2");
    string4.push("hello3");
    System.out.println(string4.pop());
        
    Queue<String>qs=new ArrayDeque<>();
    qs.add("hello");
    qs.add("abc");
    System.out.println(qs.poll());

    qs.add("x");
    qs.add("y");
    System.out.println(qs);
    qs.remove();
    System.out.println(qs);
    qs.add("y");
    System.out.println(qs);

    Deque<String>ds=(Deque<String>)qs;
    ds.addLast("mnm");
    ds.addLast("nmn");
    System.out.println(ds);

    System.out.println(qs);
    qs.add("ooo");
    qs.offer("kkk");
    System.out.println(qs);

    Deque<String>ds2 = new LinkedBlockingDeque<>(2);
    ds2.add("hello");
    ds2.add("world");
    System.out.println(ds2.size());
    ds2.add("xxx");//IllegalStateException: Deque full
    ds2.offer("yyy");
    System.out.println(ds2);
    

    }
}
