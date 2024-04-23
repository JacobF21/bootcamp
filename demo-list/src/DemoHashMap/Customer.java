package DemoHashMap;

import java.util.Objects;

public class Customer {
  private String name;

  public Customer(String name){
    this.name=name;
  }
  
  //equals
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof Customer)){
      return false;
    }
    Customer c = (Customer) obj;
    return Objects.equals(c.getName(), this.getName());
  }

  public String getName(){
    return this.name;
  }


  public int hashCode(){
    System.out.println("hashCode function");
    return Objects.hashCode(this.name);
  }
}
