package Classwork;

public class BMWFactory implements CarFactory{ 
  
  @Override
  public SUV createSUV(){
    return new BMWSUV();
  }

  @Override
  public raceCar cRaceCar(){
    return new BMWraceCar();
  }
}