package Classwork;

public interface CarFactory {
  SUV createSUV();
  raceCar cRaceCar();

  public static CarFactory create(Type type) throws Exception{
    switch (type) {
      case BMW:
        return new BMWFactory();
      case FERRARI:
        return new FerrariFactory();
    }
    throw new Exception("Unknown type of Car");
  }

  public static void main(String[] args) throws Exception{
    CarFactory factory = CarFactory.create(Type.FERRARI);
    raceCar raceCar = factory.cRaceCar();
    System.out.println(raceCar.isRed());

    SUV SUV = factory.createSUV();
    System.out.println(SUV.isRed());

  }
}
