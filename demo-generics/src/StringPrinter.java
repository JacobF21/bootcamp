public class StringPrinter {
 
  private String data;

  public StringPrinter(String data){
    this.data=data;
  }

  public void print(){
    System.out.println(this.data + "StringPrinter");
  }

  public static void main(String[] args) {
    StringPrinter sp = new StringPrinter("Hello");
    sp.print();
  }

}
