package DemoHashMap;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer2 {
  
  private ArrayList<Order> orders;
  public String getName(){
    return this.getName();
  }


  public static void main(String[] args) {
    ArrayList<Customer2> customer = new ArrayList<>();
  
  //searching
  for(Customer2 c : customer){
    if(c.getName().equals("Vincnet")){

    }
  }

  HashSet<String> strings = new HashSet<>(); //String.class -> hashCode()
  strings.add("abc"); // true
  strings.add("abc"); // false, data structure of Hashset -> HashMAp
  System.out.println(strings.size());  
  
    //Polymophism
    List<String> ss = new ArrayList<>();
    ss.add("hello");
    ss.remove(0);
    ss.add("abc");
    System.out.println(ss.get(0));

    //Set (Hashset)
    Set<String> ss2= new HashSet<>();
    ss2.add("abc");
    ss2.remove("abc");
    System.out.println(ss2.size());

    //MAp
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("John", "ABC");
    System.out.println(stringMap.get("John"));

    Collection<String> cs = new ArrayList<>();
    cs.add("hello");
    System.out.println(cs.size());

    long startTime = System.nanoTime();
    ascii(new ArrayList<>(List.of("hello","Vincnet")));
    long endTime = System.nanoTime();
    System.out.println("time:"+ (endTime-startTime));
  
    
    long startTime2 = System.nanoTime();
    ascii(new HashSet<>(Set.of("world")));
    long endTime2 = System.nanoTime();
    System.out.println("time:"+ (endTime2-startTime2));

    long startTime3 = System.nanoTime();
    System.out.println(new ArrayList<>(List.of("Vincent")).contains("Vincent"));
    long endTime3 = System.nanoTime();
    System.out.println("time:"+ (endTime3-startTime3));

    long startTime4 = System.nanoTime();
    System.out.println(new HashSet<>(Set.of("Vincent")).contains("Vincent"));
    long endTime4 = System.nanoTime();
    System.out.println("time:"+ (endTime4-startTime4));


}

  public static void ascii(Collection<String> cs){
    if(cs instanceof ArrayList<String>){
      ArrayList<String> as = (ArrayList<String>) cs;
      System.out.println(as.get(0));
    } else if (cs instanceof HashSet) {
      HashSet<String> hs = (HashSet<String>) cs;
      System.out.println(hs.add("hello"));
      System.out.println(hs.add("hello"));
    }

  }



  

}
