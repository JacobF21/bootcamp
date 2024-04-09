package datacenter;
import java.util.Arrays;

public class Rack {
  private String rackID;
  private int capacity;
  private Server[] servers;
  private String routerBrand;
  private int routerQuantity;

  public Rack(String rackID,String routerBrand, int routerQuantity) {
    this.rackID=rackID;
    this.routerBrand = routerBrand;
    this.routerQuantity = routerQuantity;
    this.capacity += routerQuantity;
  }

  public int dailyRackPowerConsumption(){
    int dailyConsumption = 0;
    for(int i=0;i<this.servers.length;i++){
      dailyConsumption+=servers[i].dailyPowerConsumption();
    }
    return dailyConsumption;
  }

  public int getNumOfServer(){
    return this.servers.length;
  }

  public int getNumOfNetworkDevice(){
    return this.routerQuantity;
  }

  public void install(Server server, int quantity) {
    this.servers = new Server[quantity];
    for (int i = 0; i < quantity; i++) {
      this.servers[i] = server;
    }
    this.capacity += quantity;
  }

  public String toString(){
    int temp = this.capacity-routerQuantity;
    return "Rack cotains " + this.capacity//
          +" devices, included " + routerQuantity
          +" " + routerBrand + " routers"
          +" and " + temp +" servers";
  }


}
