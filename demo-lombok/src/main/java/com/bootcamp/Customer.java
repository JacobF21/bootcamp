package com.bootcamp;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Customer {
  private String name;
  //private List<Order> orders;
  private List<Order> orders;

  public Customer(String name){
    this.name= name;
    orders = new ArrayList<Order>();
  }

  public void addOrder(Order order){
    orders.add(order);
  }


  public int getOrderSize(){
    return getOrders().size();
  }

  public boolean isVIP(){
    return this.getOrderSize()>=10;
  }

  public static int orderCount(Customer customer){
    return customer.getOrderSize();
  }

}
