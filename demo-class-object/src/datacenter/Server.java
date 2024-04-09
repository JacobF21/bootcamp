package datacenter;

public class Server {
  private int ram; //16, 32, 64
  private String cpuBrand; //Intel, AMD
  private String gpuBrand; //AMD, Nvidia
  private int power;  
  private String os; //Windows, Linux
  
  public Server(int ram, String cpuBrand, String gpuBrand, int power, String os ){
    this.ram = ram;
    this.cpuBrand=cpuBrand;
    this.gpuBrand=gpuBrand;
    this.power=power;
    this.os=os;
  }

  public int dailyPowerConsumption(){
    return this.power*24;
  }

  public String toString(){
    return os + " PC, with "
          + ram+"GB ram, "//
          + cpuBrand + " CPU, "//
          + gpuBrand + " GPU, "//
          + power + "W power consumption";
          
  }
}
