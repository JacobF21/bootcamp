package sport;

public interface Action {
  void run();
  void walk();
  
  default void swim(){
    System.out.println("default swimming");
  };

  static void sleep(){
    System.out.println("Static, sleep");
  }

  public static void main(String[] args) {
    Action.sleep();
    Person person =new Person();
    person.swim();
  }
  
} 
