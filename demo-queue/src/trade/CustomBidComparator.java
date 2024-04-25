package trade;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomBidComparator implements Comparator<Order> {
  @Override
  public int compare(Order a, Order b){
    if(a.getPrice() > b.getPrice()){
      return -1;
    } else if(a.getPrice() < b.getPrice()){
      return 1;
    } else if(a.getTimeStamp().compareTo(b.getTimeStamp()) == -1){
      return -1;
    } else {
      return 1;
    }
  }
public static void main(String[] args) {
// PriorityQueue<Order> bidQueue = new PriorityQueue<>(new CustomBidComparator());
// bidQueue.add(new Order(1.5,100));
// bidQueue.add(new Order(1.6,100));
// bidQueue.add(new Order(1.7,100));
// bidQueue.add(new Order(1.8,100));
// bidQueue.add(new Order(1.8,100));
// bidQueue.add(new Order(1.24,100));
// bidQueue.add(new Order(1.78,100));

// while(bidQueue.size() != 0){
//   System.out.println(bidQueue.poll());
// }

// PriorityQueue<Order> askQueue = new PriorityQueue<>(new CustomAskComparator());
// askQueue.add(new Order(1.5,100));
// askQueue.add(new Order(1.6,100));
// askQueue.add(new Order(1.7,100));
// askQueue.add(new Order(1.7,100));
// askQueue.add(new Order(1.7,100));
// askQueue.add(new Order(1.8,100));
// askQueue.add(new Order(1.8,100));
// askQueue.add(new Order(1.24,100));
// askQueue.add(new Order(1.78,100));

// while(askQueue.size() != 0){
//   System.out.println(askQueue.poll());
// }


}

}

