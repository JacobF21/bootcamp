import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
  
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    integers.add(2);
    integers.add(2);
    integers.add(3);
    integers.add(3);
    integers.add(1);

    System.out.println(Practice.getDuplicated(integers));
  }

  public static Set<Integer> getDuplicated(List<Integer> integers){
      Set<Integer> result = new HashSet<>();
      Map<Integer, Integer> map = new HashMap<>(); 
      for(Integer i: integers){
        if(map.containsKey(i)){
          result.add(i);
          continue;
        }
        map.put(i, null);
      }
      return result;
  }
}
