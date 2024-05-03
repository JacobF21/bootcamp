package Classwork;

public interface SUV {
  boolean isRed();
  
  public static SUV create(CarFactory factory){
    return factory.createSUV();
  }
}
