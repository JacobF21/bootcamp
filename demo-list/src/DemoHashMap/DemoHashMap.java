package DemoHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DemoHashMap {
  public static void main(String[] args) {
    //John 13
    //Vincent 18
    HashMap<String, Integer> mapper = new HashMap<>();//Left hand side: KEY, right hand side, VALUE
    mapper.put("John", Integer.valueOf(13));//put an "entry" into map
    mapper.put("Vincent", 18); 
    /*"Vincent" .hashcode
    has been override
     */
    
    //no ordering
    //Get Value by Key (We CANNOT get key by value)
    System.out.println(mapper.get("Vincent"));
    System.out.println(mapper.get("John"));

    //for-each
    for(Map.Entry<String, Integer>m:mapper.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }

    //Key canot be deplicated in a HashMap
    mapper.put("Vincent", 20);
    System.out.println(mapper.get("Vincent"));

    mapper.put("Jenny", 24);
    int score =0;
    for(Map.Entry<String, Integer>m:mapper.entrySet()){
      score+=m.getValue(); 
    }
    System.out.println(score);

    HashMap<Customer,Integer> ageMap = new HashMap<>();
    //ageMap.put(new Customer("John"), 13);
    //ageMap.put(new Customer("John"), 17);
    //System.out.println(ageMap.get(new Customer("John"))); 
    /* 
    null, if u disable the hash function int Customer class,
    */
    //System.out.println(ageMap.size());//2

    //
    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
    //John -> order 1:100, order 2:250
    //Vincent -> order 1:1200, order 2:20, order3:88
    ArrayList<Order> johnOrder = new ArrayList<>(List.of(new Order(100), new Order(250)));
    ArrayList<Order>vincentOrder = new ArrayList<>(List.of(new Order(1200), new Order(20), new Order(88)));
    orderMap.put(new Customer("John"),johnOrder );
    orderMap.put(new Customer("Vincent"),vincentOrder);
    int totalAmount=0;
    ArrayList<Order>sallyOrder = johnOrder;
    // for(Map.Entry<Customer, ArrayList<Order>>m:orederMap.entrySet()){
    //   for(Order o : m.getValue()){
    //     totalAmount+=o.getAmount();
    //   }
    // }
    for(ArrayList<Order> orderList : orderMap.values()){
      for(Order o : orderList){
        totalAmount+=o.getAmount();
      }
    }
    System.out.println(totalAmount);
    for(Customer customer: orderMap.keySet()){
      System.out.println("customer = "+ customer.getName());
      System.out.println(orderMap.containsKey(customer));
    }

    System.out.println(orderMap.containsKey(new Customer("Vincent")));
    System.out.println(orderMap.containsValue(250));

    //Conclusion
    //1. Differnet Object -> we can treat them as same thing(equals(),hashcode())
    //2. if they are same object, -> all the values are the same
    orderMap.put(new Customer("Sally"), sallyOrder);
    System.out.println(orderMap.get(new Customer("Sally")));
    sallyOrder.add(new Order(50));
    orderMap.put(new Customer("Sally"), sallyOrder);
    System.out.println(orderMap.get(new Customer("John")));
    System.out.println(orderMap.get(new Customer("Sally")));
  }
}
