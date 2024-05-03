package Classwork;

public interface raceCar {

  boolean isRed();

  public static raceCar create(CarFactory factory){
    return factory.cRaceCar();
  }

}
