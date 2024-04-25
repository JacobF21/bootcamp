package trade;

public class main {
  public static void main(String[] args) {
    
    OrderBook orderBook = new OrderBook(1.3);
    
    orderBook.bid(1.65, 900);
    orderBook.bid(1.65,10);
    orderBook.bid(1.25,100);
    orderBook.bid(1.25,8);
    // orderBook.bid(1.27,9);
    // orderBook.bid(2.3,9);
        
    orderBook.ask(1.25,100);
    orderBook.ask(1.35,100);
    orderBook.ask(1.45,900);
    orderBook.ask(1.65, 900);
    orderBook.ask(1.65,10);
    orderBook.ask(1.95,8);
    // orderBook.ask(0.95,8);
    
    //System.out.println(orderBook.getBidQueue());
    // System.err.println(orderBook.getBidQueue().size());
    //System.out.println(orderBook.getAskQueue());
    // System.out.println(orderBook.getAskQueue().size());

    orderBook.priceMatch();


    System.out.println(orderBook.getBidQueue());
    System.out.println(orderBook.getAskQueue());
    // System.out.println(orderBook.getMarketPrice());



  }
}
