package Classwork;

public class FerrariFactory implements CarFactory{ 
  
  @Override
  public SUV createSUV(){
    return new FerrariSUV();
  }

  @Override
  public raceCar cRaceCar(){
    return new FerrariRaceCar();
  }
}
