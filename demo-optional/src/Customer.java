import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer {
  private Optional<String> name;

  public Optional<String> getName(){ // getName() well-known method, getter/setter should not return Optional<T>
    return this.name;
  }

  //deserialization/ serialization
  //{
  //  "name" : "John"
  //}

  //Java Object <-> JSON (deserialization/ serialization)
  //Optional<T> cannot be supported by deserialization/ serialization
public static void main(String[] args) {
  // sum(null, Optional.of(Double.valueOf(3.0)));

  // Optional<String> result = null;
  // result = Optional.of("hello");
  // result = Optional.empty();

  // String str = "hello";
  // int x =10;
  // if(x >= 10){
  //   str=null;
  // }
  // result = Optional.ofNullable(str);

  List<String> names = new ArrayList<>(List.of("Vincent","Jennt","Oscar"));
  //stream
  List<Optional<String>> result2 = names.stream().map(e-> Optional.ofNullable(e)).collect(Collectors.toList());
  System.out.println(result2);

  //.map(Optional::ofNullable)

  //3. orElse
  // Optional<String> name = Optional.of(null);
  // String user = name.orElse("Jenny");

  //4. orElseGet
  // String user2 = name.orElseGet(()->"Jenny"); // Supplier<T>
  // System.out.println(user2);

  //5. orElseThrow
  // String user3 = name.orElseThrow(()-> new RuntimeException());
  // System.out.println(user3); // throw runtime

  //6. stream and optional
  //Cat cat = 
  List.of(new Cat(6,"Vincent"),new Cat(6,"Oscar"),new Cat(5,"Tommy"), new Cat(3, "Vincent"))//
            .stream()
            .filter(e -> "Vincent".equals(e.getName()))
            .findFirst()
            .ifPresent(e->{
              System.out.println(e.getAge());
            });
            //.orElse(new Cat(0,"Vincent"));

            //System.out.println(cat.getAge());
            
    //.filter(e-> "Vincent")

}

    public static Double sum(Optional<Double> d1, Optional<Double> d2){
      if(d1.isPresent() && d2.isPresent()){
        return d1.get().doubleValue() + d2.get().doubleValue();
      }
      throw new IllegalArgumentException();
    }


}
