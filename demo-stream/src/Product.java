import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
  private String name;
  private String category;
  private double price;
  private int quantity;

  //Constructor, getter, setter
  public Product(String name,String category,double price,int quantity){
    this.name= name;
    this.category=category;
    this.price=price;
    this.quantity=quantity;
  }

  public double getPrice(){
    return this.price;
  }

  public String getName(){
    return this.name;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1200, 5));
        products.add(new Product("Book", "Stationery", 500, 10));
        products.add(new Product("Watch", "Fashion", 1500, 3));
        products.add(new Product("Headphones", "Electronics", 800, 8));
        products.add(new Product("Shoes", "Fashion", 2000, 2));

    Comparator<Product> sortByName = (c1,c2) ->  c1.getName().compareToIgnoreCase(c2.getName());
    List<String> result = products.stream()
                        .filter(e-> e.getPrice()>1000)
                        .sorted(sortByName)
                        .map(c->c.getName().concat("-").concat(String.valueOf(c.getQuantity())))
                        .collect(Collectors.toList());

    System.out.println(result);
  }
}
