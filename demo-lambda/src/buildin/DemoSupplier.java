package buildin;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplier {
  public static void main(String[] args) {
    Supplier<String> hello = () ->"hello";
    System.out.println(hello.get());


    Supplier<Weekday> monday = () -> Weekday.MONDAY;
    printName(() -> Weekday.MONDAY);
    
    Weekday monday2 = Weekday.MONDAY;
    System.out.println(monday2);
  
    Supplier<LocalDate> now =() -> LocalDate.now();
    System.out.println(now.get());

    Supplier<Integer> random = () -> new Random().nextInt(10)+1;
    System.out.println(random.get());
  
  }

  public static void printName(Supplier<Weekday> weekday){
    System.out.println(weekday.get());
  }
}
