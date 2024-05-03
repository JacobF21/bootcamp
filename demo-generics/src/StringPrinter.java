public class StringPrinter {
 
  private String data;

  public StringPrinter(String data){
    this.data=data;
  }

  public void setData(String s){
    this.data=s;
  }

  public void print(){
    System.out.println(this.data + "StringPrinter");
  }

  public String toString(){
    return "StringPrinter("//
          +"data="+this.data//
          +")";
  }

  public static void main(String[] args) {
    StringPrinter sp = new StringPrinter("Hello");
    sp.print();
  }

}
