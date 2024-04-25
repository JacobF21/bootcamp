import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b){
    if(a % 2 !=0 && b % 2 !=0){
      return a<b?-1:1;
    } else if(a % 2 !=0){
      return -1;
    } else if(b % 2 !=0){
      return 1;
    } else {
      return a<b? -1:1;
    }
  }
}
