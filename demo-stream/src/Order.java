import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Order {
  private int orderId;
  private int customerId;
  private double amount;
  private LocalDate orderDate;

  public Order(int orderId, int customerId, double amount, LocalDate orderDate){
    this.orderId=orderId;
    this.customerId=customerId;
    this.amount=amount;
    this.orderDate=orderDate;
  }

  public LocalDate getOrderDate(){
    return this.orderDate;
  }

  public int getCustomerId(){
    return this.customerId;
  }

  public double getAmount(){
    return this.amount;
  }

  public double getOrderId(){
    return this.orderId;
  }

  public String toString(){
    return "(CustomerID="+ this.getCustomerId()
          // +", OrderID="+ this.getOrderId()
          +", Amount="+this.getAmount()
          +", orderDate"+this.getOrderDate()
          +")";
  }

  public static void main(String[] args) {
    List<Order> orders = new ArrayList<>();
    orders.add(new Order(1, 101, 800, LocalDate.of(2023, 4, 15)));
    orders.add(new Order(2, 102, 1700, LocalDate.of(2023, 4, 20)));
    orders.add(new Order(3, 101, 1500, LocalDate.of(2023, 4, 25)));
    orders.add(new Order(4, 103, 900, LocalDate.of(2023, 4, 18)));
    orders.add(new Order(5, 102, 1100, LocalDate.of(2023, 4, 22)));

    Map<Integer, Double> result = orders.stream()
                                .filter(e->e.getAmount()>1000)
                                .sorted((p1,p2) -> p1.getOrderDate().compareTo(p2.getOrderDate()))
                                .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.averagingDouble(Order::getAmount)));
    System.out.println(result);

    Map<Integer, List<Order>> result2 = orders.stream()
    .sorted((p1,p2) -> p1.getOrderDate().compareTo(p2.getOrderDate()))
    .collect(Collectors.groupingBy(Order::getCustomerId));
System.out.println(result2);

Map<Integer, Double> result3 = orders.stream()
                              .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.summingDouble(Order::getAmount)))
                              .entrySet().stream()
                              .filter(entry -> entry.getValue() > 1000)
                              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


System.out.println(result3);

List<Order> result4 = orders.stream()
                              .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.summingDouble(Order::getAmount)))
                              .entrySet().stream()
                              .filter(entry -> entry.getValue() > 1000)
                              .flatMap(entry -> orders.stream().filter(order -> order.getCustomerId() == entry.getKey()))
                              .collect(Collectors.toList());


System.out.println(result4);



  }

}