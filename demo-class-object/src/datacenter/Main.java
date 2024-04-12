package datacenter;

public class Main {
  public static void main(String[] args) {
    Server pc1 = new Server(16, "Intel", null, 140, "Linux");
    Server pc2 = new Server(32, "AMD", "Nvidia",240, "Windows");
    Rack rack1 = new Rack("Rack001","Cisco", 2);
    Rack rack2 = new Rack("Rack002", "Jupiter", 1);
    rack1.install(pc1, 10);
    rack2.install(pc2, 5); //62400
    Datacenter datacenter1= new Datacenter("HKG60","Hong Kong",10,70000);
    datacenter1.moveIn(rack1);
    datacenter1.moveIn(rack2);
    System.out.println(datacenter1.toString());
    System.out.println(datacenter1.checkOccupancy());
    System.out.println(datacenter1.remainSpace());
    System.out.println(datacenter1.poewerLevel());
    //System.out.println(datacenter1.totalPowerConsumption());
  }

}
