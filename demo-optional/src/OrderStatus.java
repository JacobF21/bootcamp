import java.util.List;
import java.util.Arrays;

public enum OrderStatus {
  CONFIRMED(1,"Ordered"),
  PAID(2,"PAID"),
  READY_TO_SHIP(3,"Ready to ship."),
  DELIVERED(4,"Delivered")
  ;

  private final int code;
  private final String desc;
  private OrderStatus(int code,String desc){
      this.code=code;
      this.desc=desc;
  }

  public String getDesc(){
    return this.desc;
  }

  public int getCode(){
    return this.code;
  }

  public static OrderStatus get(int code){ //2->PAID
    return Arrays.stream(values())
          .filter(status -> status.getCode() == code)
          .findFirst()
          .orElseThrow(()-> new IllegalArgumentException());
  }

  public static void main(String[] args) {
      System.out.println(OrderStatus.get(2));
  }




}
