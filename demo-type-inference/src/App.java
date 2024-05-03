import java.util.List;

public class App {
    public static void main(String[] args) {
        String x ="hello";
        var x2 = "100"; // compile-time compiler knows x2 is with type String
        //String x2 ="hello";
        var x3 =1000;
        System.out.println(x2.getClass());
        var names = List.of("Vincent","Oscar",100,10L,10.56);
        System.out.println(names.getClass());
        List<> temp = List.of("Vincent","Oscar",100,10L,10.56);
        

        for(var n:names){
            System.out.println(n);
        }

        //1. Cannot Do in var
        //public static var print(x){
        //    return x
        //}

        //2. instance
        //

        //3.
    }
}
