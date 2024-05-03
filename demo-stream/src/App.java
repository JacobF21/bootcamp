import java.security.cert.CertPathValidatorResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        List<Integer> integers = new LinkedList<>();
        integers.add(21);
        integers.add(44);
        integers.add(100);
        integers.add(101);

        List<Integer> odds = new ArrayList<>();
        for(Integer number:integers){
            if(number % 2 ==1){
                odds.add(number);
            }
        }
        //System.out.println(odds);

        List<Integer> result = integers.stream()//List<Integer> -> Stream<Integer>
        .filter(e->e%2==1 && e>10)//Stream<Integer>
        //.filter(e->e>100)
        .collect(Collectors.toList());//List<Integer> (new)
        //System.out.println(result);    
        
        //remove duplicate
        List<Integer> integers2 = new LinkedList<>(List.of(101,101,203,200));
        List<Integer> result4 = integers2.stream()//
                    .distinct()//
                    .collect(Collectors.toList());
        //System.out.println(result4);
 
        //counting
        long size = integers2.stream()//
                    .filter(e-> e<200)
                    .distinct()
                    .count();
        //System.out.println(size);

        List<Customer>customers = new ArrayList<>(List.of(new Customer(13,"Jenny"),new Customer(20,"Paul")));
        List<Customer> result5 = customers.stream() // new Stream<Customer>
                                .filter(e -> e.getAge()>=18)//
                                .collect(Collectors.toList());//new Customer Vincent
        System.out.println(result5);
        System.out.println(customers);
        customers.get(1).setAge(19);
        System.out.println(result5);
        System.out.println(customers);

        String[] strings = new String[]{"abc","Akjf","a","bcd","aaa"};
        List<String> temp = Arrays.asList(strings);
        System.out.println(temp.getClass());
        List<String> result6 = temp.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(result6.getClass());
        String[] resultArray = result6.toArray(new String[result6.size()]);
        //System.out.println(Arrays.toString(resultArray));
        //System.out.println(resultArray.getClass());
     
        
        
    }
    public static List<Integer> getOdds(List<Integer> integers){
        return integers.stream()//
            .filter(e -> e %2 ==1)
            .collect(Collectors.toList());
    }


}
