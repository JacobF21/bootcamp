public class test {
  public static void main(String[] args) {
    Car car =new Car(); //still work, because Class car is public
    car.setSpeed(100);
    car.setCapacity(2);
    System.out.println("color="+car.getColor()); //Default value of String is null
    System.out.println("speed="+car.getSpeed());
    System.out.println("capacity="+car.getCapacity());
    System.out.println(car.toString());

    if(car.isOverSpeed()){
      System.out.println("the car is over speed");
    }

    // int[] integers =null;
    //integer[0] = 1 ; //null pointer exception

    //int x= null;
    //Integer x2 =null;
    Person Alan = new Person();
    Alan.setAge(31);
    System.out.println(Alan.getAge());
    System.out.println(Alan.isElderly());
    System.out.println(Alan.toString());

    Person Weak = new Person();
    Weak.setAge(67);
    System.out.println(Weak.getAge());
    System.out.println(Weak.isElderly());


  }
}
