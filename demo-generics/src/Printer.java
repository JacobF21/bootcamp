public class Printer<T> {
  
  private T data;

  public Printer(T data){
    this.data = data;
  }

  public void print(){
    System.out.println(data.toString());
  }

  public static void main(String[] args) {
    Printer<String> ps = new Printer<String>("hello"); // compile-time check
    ps.print(); //String.toString

    Printer<Integer> ip = new Printer<Integer>(8); // compile-time check
    ip.print(); //String.toString
  }
}
