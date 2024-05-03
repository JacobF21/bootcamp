import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
public interface StringBuilder2 {
  String concat(List<String> strings);

  public static void main(String[] args) {
    
  
  StringBuilder2 sb2 = strings -> {
    //lambda
    String result = "";
    for(String string: strings){
      result += string;
    }
    return result;
  };

  List<String> fruits = List.of("Apple", "Banana", "Orange");
  System.out.println(sb2.concat(fruits));
}
}
