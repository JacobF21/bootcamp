package trade;
import java.util.Comparator;

public class CustomAskComparator implements Comparator<Order> {
  @Override
  public int compare(Order a, Order b){
    if(a.getPrice() > b.getPrice()){
      return 1;
    } else if(a.getPrice() < b.getPrice()){
      return -1;
    } else if(a.getTimeStamp().compareTo(b.getTimeStamp()) == -1){
      return -1;
    } else {
      return 1;
    }
  }
}