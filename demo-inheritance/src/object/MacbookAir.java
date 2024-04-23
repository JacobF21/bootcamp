package object;

import java.util.Arrays;
import java.util.Objects;

public class MacbookAir {
  
  private double inch;
  private double cpu;
  private double ram;
  private double disk;
  private Color color;

  public MacbookAir(double inch,double cpu,double ram, double disk, Color color){
    this.inch=inch;
    this.cpu=cpu;
    this.ram=ram;
    this.disk=disk;
    this.color=color;
  }

  public double getInch(){
    return this.inch;
  }

  public double getCpu(){
    return this.cpu;
  }

  public double getRam(){
    return this.ram;
  }

  public double getDisk(){
    return this.disk;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){ 
      // this line is comparing the address of both object, if they are in the same address in memory they must be the same 
      return true;
    }
    if(!(obj instanceof MacbookAir)){
      return false;
    }
    MacbookAir ma = (MacbookAir) obj;
    // return this.inch == ma.getInch() 
    //     && this.cpu == ma.getCpu() 
    //     && this.ram == ma.getRam()
    //     && this.disk == ma.getDisk()
    //     && this.color == ma.getColor();
    return Objects.equals(this.inch, ma.getInch())
          && Objects.equals(this.cpu, ma.getCpu())
          && Objects.equals(this.ram, ma.getInch())
          && Objects.equals(this.disk, ma.getDisk())
          && Objects.equals(this.color, ma.getColor());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.inch,this.cpu,this.ram,this.disk,this.color);
  }

  public static void main(String[] args) {
    MacbookAir ma = new MacbookAir(1.4,54,45,45,Color.BLACK);
    MacbookAir ma2 = new MacbookAir(1.4,54,45,45,Color.BLACK);
    System.out.println(ma.hashCode());//112810359 Object.class hashCode //After overide has code 50541078
    System.out.println(ma2.hashCode());//2124308362 Object.class hashCode //After overide has code 50541078
    System.out.println(System.identityHashCode(ma));//2124308362
    System.out.println(System.identityHashCode(ma2));//146589023
    System.out.println(ma == ma2);
    System.out.println(ma.equals(ma2));

  //Sorting
  int[] test = new int[]{10,5,2,4};
  Arrays.sort(test);
  System.out.println(Arrays.toString(test));
  //merge sort, ascending sorting
  }


}
