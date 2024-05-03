import java.util.Optional;

public class App {
    public static void main(String[] args){
        //System.out.println(upperName("Steven"));
        //System.out.println(upperName("Steven").get());
        //System.out.println(upperName(null));

        // 1. ifPresent()
        Optional<String> result = upperName(null);
        upperName("Steven").ifPresent(e -> {
            System.out.println("hello"+e.charAt(0)); // e must be non-null value
        });

        //2. isPresent()
        Optional<String> name=Optional.of("Vincent");
            if(name.isPresent()){
                System.out.println(name.get().charAt(0)); // No risk on NPE
            } else{
                System.out.println(name); //Optional.empty -> u can not call get()
            }
    }

    public static Optional<String> upperName(String name){
        // if(name == null)
        //     throw new IllegalArgumentException();
        if(name != null)
            return Optional.of(name.toUpperCase());
        return Optional.empty();
    }
}
