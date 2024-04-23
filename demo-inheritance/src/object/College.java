package object;

import java.util.Objects;

public class College {
  
  private double area;

  public double getArea(){
    return this.area;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof College)){
      return false;
    }
    College temp = (College) obj;
    return Objects.equals(this.area, temp.getArea());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.area);
  }

  public static void main(String[] args) {
    Object o = new College();//Polymorphism
    //College c = new Object(); NOT OK
    //College c = new College(); // OK
    o.hashCode(); //address -> int

    if(o instanceof College){
      College c2 = (College) o;
    }
  }
}
