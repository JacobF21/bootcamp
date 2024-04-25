package trade;

import java.time.LocalTime;

public class Order {
  private double price;
  private  int quantity;
  private LocalTime timestamp;
  OrderType orderType;
  private String OrderID; // to cancel the order when the order is not filled or partially filled in the order book
  // Advance OrderType, Market Order, Limit Order....

  public Order(double price,int quantity,OrderType orderType){
    this.price=price;
    this.quantity=quantity;
    this.orderType=orderType;
    this.timestamp = LocalTime.now();
  }

  public double getPrice(){
    return this.price;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public LocalTime getTimeStamp(){
    return this.timestamp;
  }

  public void changeQuantity(int quantity){
    this.quantity -= quantity;
  }

  public static void deal(Order bidOrder, Order askOrder){
    if(bidOrder.getQuantity() > askOrder.getQuantity()){
      bidOrder.changeQuantity(askOrder.getQuantity());
      askOrder.changeQuantity(askOrder.getQuantity());
    } else if(bidOrder.getQuantity() < askOrder.getQuantity()){
      askOrder.changeQuantity(bidOrder.getQuantity());
      bidOrder.changeQuantity(bidOrder.getQuantity());
    } else {
      int temp = askOrder.getQuantity();
      bidOrder.changeQuantity(temp);
      askOrder.changeQuantity(temp);
    }
  }

  public String toString(){
    return "(" + this.price
          +", "+ this.quantity
          +", "+ this.timestamp
          +", "+ this.orderType
          +")"; 
  }

}
