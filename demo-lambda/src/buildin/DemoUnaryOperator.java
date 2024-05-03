package buildin;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
  public static void main(String[] args) {
    Function<String,String> f1 = s->s;
    //Function<T, T>
    UnaryOperator<String> u1= s->s;


    BiFunction<String,String,Integer> sum2 = (x,y) -> x.length()+y.length();
    System.out.println(sum2.apply("Hello", "World"));
    //BiFunction<T,T,T>
    BinaryOperator<Integer> sum = (x,y) -> x+y;
    System.out.println(sum.apply(5, 9));
    
    //toUpperCase
    UnaryOperator<String> uppercase = s->s.toUpperCase();
    System.out.println(uppercase.apply("Hello"));

    //3 in, 1 out -> string1 , replace from string2 to string3 -> string4
    StringFormula formula = (str,from,to) -> str.toUpperCase().replace(from, to); 
    System.out.println(formula.uppercaseNreplace("Hello", "LL", "OO"));
  }
}
