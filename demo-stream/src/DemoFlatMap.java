import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoFlatMap {
 
  public static void main(String[] args) {
    List<List<Integer>> integerList = new LinkedList<>();
    integerList.add(List.of(1,2,3));
    integerList.add(List.of(10,-10,100));
    integerList.add(List.of(101,203,-99));

    List<Integer> flattenedMap = integerList.stream()
                                .flatMap(e->e.stream())
                                .collect(Collectors.toList());
    System.out.println(flattenedMap);

    List<Customer> customers = integerList.stream()
                              .map(e ->  new Customer(1, "Vincent"))
                              .collect(Collectors.toList());
    System.out.println(customers);
  }
}
