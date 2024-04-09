package customer;

import java.util.Arrays;

public class Order {

  private String orderNo;

  private Item[] items;

  public Order(String orderNo) {
    this.orderNo = orderNo;
    this.items = new Item[0];
  }

  public void add(Item item){
    Item[] copyArr = this.items;
    this.items = new Item[this.items.length +1];
    int idx=0;
    for(int i=0;i<copyArr.length;i++){
      this.items[i] = copyArr[i];
      idx++;
    }
    this.items[idx]=item;

    //for(int i=0;i<100;i++){
      //if(this.items[i] == null){
        //items[i] = item;
        //break;
      //}

  }

  public double orderTotal(){
    int total = 0;
    for(int i =0;i<this.items.length;i++){
      total += this.items[i].subTotal();
    }
    return total;
  }
  

  public String toString() {
    return "Order(" //
        + "orderNo=" + this.orderNo //
        + ", items=" + Arrays.toString(this.items) //
        + ")";
  }

}
