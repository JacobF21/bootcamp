package customer; // subfolder

import java.util.Arrays;

public class Customer {

  private String username;

  // One Customer has many orders
  private Order[] orders;

  public Customer(String username) {
    this.username = username;
    this.orders = new Order[0];
  }

  public void addOrder(Order order){
    Order[] copyArr = this.orders;
    this.orders = new Order[this.orders.length +1];
    int idx=0;
    for(int i=0;i<copyArr.length;i++){
      this.orders[i] = copyArr[i];
      idx++;
    }
    this.orders[idx]=order;
  }

  public double lifeTimeSpend(){
    double lifeTimeSpend = 0;
    for(int i=0;i<orders.length;i++){
      lifeTimeSpend += orders[i].orderTotal();
    }
    return lifeTimeSpend;
  }

  public String toString() {
    return "Customer(" //
        + "username=" + this.username //
        + ", orders=" + Arrays.toString(this.orders) //
        +")";
  }

}
