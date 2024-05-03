package buildin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  //y=f(x)
  //y=x+1
  public static void main(String[] args) {
    Function<String, String> function = s -> String.valueOf(s.length());
    System.out.println(function.apply("Hello"));//5

    BiFunction<String,String,Integer> totalLength = (s1,s2) -> s1.length() + s2.length();
    System.out.println(totalLength.apply("Hello", "world"));//10

    //Why we need to learn BiFunction
    Map<String, Integer> nameLengthMap= new HashMap<>();
    nameLengthMap.put("John",4);
    Function<String, Integer> nameLength = s -> s.length();
    nameLengthMap.computeIfAbsent("Vincent", nameLength); // if "Vincent" does not exists -> namelength
    nameLengthMap.computeIfAbsent("", nameLength);
    System.out.println(nameLengthMap);
    

    //merge()
    nameLengthMap.merge("Vincent", 9, (o,n)->o*n);
    System.out.println(nameLengthMap);
  }

}
