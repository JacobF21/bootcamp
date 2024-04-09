package datacenter;

import java.util.Arrays;
import customer.Order;

public class Datacenter {
  private String datacenterID;
  private String location;
  private int capacity;
  private Rack[] racks;
  private int powersupply;

  Datacenter(String datacenterID, String location, int capacity, int powersupply){
    this.datacenterID = datacenterID;
    this.location=location;
    this.capacity=capacity;
    this.powersupply=powersupply;
    this.racks = new Rack[0];
  }

  public void moveIn(Rack rack){
    Rack[] copyArr = this.racks;
    this.racks = new Rack[this.racks.length +1];
    int idx=0;
    for(int i=0;i<copyArr.length;i++){
      this.racks[i] = copyArr[i];
      idx++;
    }
    this.racks[idx]=rack;
  }

  public int remainSpace(){
    return this.capacity-racks.length;
  }

  public int totalPowerConsumption(){
    int total=0;
    for(int i =0;i<this.racks.length;i++){
      if(this.racks[i] != null){
        total+=racks[i].dailyRackPowerConsumption();
      }
    }
    return total;
  }

  public double poewerLevel(){
    int total=0;
    double level=0;
    for(int i =0;i<this.racks.length;i++){
      if(this.racks[i] != null){
        total+=racks[i].dailyRackPowerConsumption();
      }
    }
    level = total*100/this.powersupply;
    return level;
  }

  public double checkOccupancy(){
    double usingRate=racks.length*100/capacity;
    return usingRate;
  }

  public String toString(){
    return "Datacenter " +datacenterID
          + " is located in "+location
          + ", with total capacity of "+ capacity
          + " rack spaces. " + Arrays.toString(racks);
  }
}
