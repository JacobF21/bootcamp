package trade;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class OrderBook {
  private PriorityQueue<Order> bidQueue = new PriorityQueue<>(new CustomBidComparator());
  private PriorityQueue<Order> askQueue = new PriorityQueue<>(new CustomAskComparator());
  private double marketPrice;

  public OrderBook(double marketPrice){
    this.marketPrice = marketPrice;
  }
  
  public PriorityQueue<Order> getBidQueue(){
    return this.bidQueue;
  }

  public PriorityQueue<Order> getAskQueue(){
    return this.askQueue;
  }

  public double getMarketPrice(){
    return this.marketPrice;
  }

  public boolean bid(double price, int quantity){
    OrderType orderType = OrderType.BID; 
    BigDecimal bdPrice = BigDecimal.valueOf(price);
    BigDecimal divisor = BigDecimal.valueOf(0.05);
    if( bdPrice.remainder(divisor).doubleValue() !=0 ||price < 1.0 || price > 2){
      //System.out.println(bdPrice.remainder(divisor).doubleValue());
      System.out.println("Invalid input! Fail to creater bid Order.");
      return false;
    }
    Order order = new Order(price, quantity,orderType);
    bidQueue.add(order);
    return true;
  }
  
  public boolean ask(double price, int quantity){
    OrderType orderType = OrderType.ASK;
    BigDecimal bdPrice = BigDecimal.valueOf(price);
    BigDecimal divisor = BigDecimal.valueOf(0.05);
    if( bdPrice.remainder(divisor).doubleValue() !=0 ||price < 1.0 || price > 2){
      System.out.println("Invalid input! Fail to creater ask Order.");
      return false;
    } 
    Order order = new Order(price, quantity, orderType);
    askQueue.add(order);
    return true;
  }

  public void priceMatch(){
    Order tempAsk = this.askQueue.peek();
    Order tempBid = this.bidQueue.peek();
    while (tempBid.getPrice() >= tempAsk.getPrice()){
      Order.deal(tempBid, tempAsk);
      this.marketPrice = tempAsk.getPrice();
      //System.out.println(tempBid);
      //System.out.println(tempAsk);
      if(tempBid.getQuantity() == 0){
        this.bidQueue.poll();
        tempBid = this.bidQueue.peek();
        //System.out.println(tempBid);
      }
      if(tempAsk.getQuantity() == 0){
        this.askQueue.poll();
        tempAsk = this.askQueue.peek();
        //System.out.println(tempAsk);
      }
    }
  }

  
  //assumption $1-$2, $0.05
  //Buy,bid price < market
  //Buy,bid price >= market

  //Sell, ask price > market
  //Sell, ask price <= market
  
  //Buy
  //$10 3q (1) -> trade(Vincent/Oscar 1q at$10)
  //$2 1000q (1)

  //Sell
  //$10 1q (1)
  //$11 3q (2)
  //$13 100q (1)
  
  //Market price -> the price of the lats trade in the market
}
