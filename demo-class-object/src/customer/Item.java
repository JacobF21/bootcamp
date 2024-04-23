package customer;

import java.math.BigDecimal;

public class Item {

  private String desc; // description

  private double price;

  private int quantity;

  public Item(String desc, double price, int quantity) {
    this.desc = desc;
    this.price = price;
    this.quantity = quantity;
  }

  public String toString() {
    return "Item(" //
        + "description=" + this.desc //
        + ", price=" + this.price //
        + ", quantity=" + this.quantity //
        + ")";
  }

  public double subTotal(){
    return BigDecimal.valueOf(this.price)//; //double price, int quantity
          .multiply(BigDecimal.valueOf(this.quantity))
          .doubleValue();
  }       

  public static void main(String[] args) {
    Item item1 = new Item("APPLE", 4.5, 2);
    Item item2 = new Item("ORANGE", 5.0, 4);
    //Item[] items = new Item[2];
    //items[0] = item1;
    //items[1] = item2;

    Order order1 = new Order("V00001");
    order1.add(item1);
    order1.add(item2);
    System.out.println(order1);
    System.out.println(order1.total());

    Customer c = new Customer("sallychan");
    c.addOrder(order1);
    System.out.println(c.lifeTimeSpend());
    //System.out.println(c); // Customer(username=sallychan, orders=[Order(orderNo=V00001, items=[Item(description=APPLEprice=4.5quantity=2), Item(description=ORANGEprice=5.0quantity=4)])])

  }

}
