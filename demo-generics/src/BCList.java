public class BCList<T,U> {
  private T data;
  private U data2;

  public BCList(T data, U data2){
    this.data = data;
    this.data2 = data2;
  }


  public T getData(){
    return this.data;
  }

  public void setData(T data){
    this.data = data;
  }

  public U getData2(){
    return this.data2;
  }

  public void setData2(U data2){
    this.data2 = data2;
  }

  public static <T extends Number> double sum(T number1, T number2){
    System.out.println(number1.getClass());
    System.out.println(number2.getClass());
    return number1.doubleValue() + number2.doubleValue();
  }

  public static void main(String[] args) {
    BCList<String, Integer> bclist = new BCList<>("hello", 10);
    // T and U can be same type or different type
    BCList<String, String> bclist2 = new BCList<>("world", "!!!");
    System.out.println(bclist.getData());
    System.out.println(bclist.getData2());
    System.out.println(bclist2.getData());
    System.out.println(bclist2.getData2());

    System.out.println(sum(Integer.valueOf(13),Long.valueOf(10)));


  }


}
