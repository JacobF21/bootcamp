package buildin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("hello");

    Consumer<List<Integer>> printer2 = integers ->{
      for(Integer i:integers){
        System.out.println(i);
      }
    };
    printer2.accept(new ArrayList<>(List.of(5,6,8,9,10)));

    BiConsumer<String, Boolean> printer3 = (s,b) ->{
      if(b == true){
        System.out.println(s);
      } else{
        System.out.println(s.length());
      }
    };
    printer3.accept("HAHA", false);

    BiFunction<Integer, Integer, Integer> sum = (x,y) -> {
      return x+y;
    };
    sum.apply(3, 4);

    List<String> strings = new LinkedList<>();
    strings.add("xyz");
    strings.add("abc");

    int o=3;

    //for-each
    for(String s: strings){
      o+=1;
    }

    //foreach (lambda - Map -> Consumer)
    Map<String, String> nameMap = new HashMap<>();
    nameMap.put("Vincent", "abc");
    nameMap.put("Jenny", "ijk");
    for(Map.Entry<String, String> entry: nameMap.entrySet()){

    }
    nameMap.forEach((k,v)->{
      System.out.println("k="+k+", v="+v);
    });
    



    //for loop
    for(int i=0;i<strings.size();i++){}
    //for each (lambda consumer)
    strings.forEach(s->{
      //o+=1; //lambda foreach cannot modify non-local variable
      int p=1;
      System.out.println(s);
    });
    //p=2;

    for(String str: strings){
      str ="hello";
      System.out.println("inside the loop " + str);//hello
    }
    System.out.println("outside the loop " + strings);//[xyz, abc]

    strings.forEach(e->{
      e="hello";
      System.out.println("inside the loop " + e);
    });
    System.out.println("outside the loop " + strings);

    Queue<String> q = new LinkedList<>();
    strings.forEach(e->{
      q.add(e);//OK
      //q = new ArrayDeque<>();// NOT OK, address cannot be changed
    });

    Queue<String> q2 = new LinkedList<>();
    for(String str:strings){
      q2.add(str);//OK
      q2= new ArrayDeque<>();//OK
    }
  }
}

