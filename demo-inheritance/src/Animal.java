public class Animal {
  private int test;
  private String name;
  public Animal(){
    System.out.println("I'm a Animal Constructor");
  }

  public Animal(int test){
    this.test=test;
    System.out.println("I'm a Animal Constructor3");
  }

  public Animal(String name, int test){
    this.test=test;
    this.name = name;
    System.out.println("I'm a Animal Constructor4");
  }

  public Animal(String name){
    this.name =  name;
    System.out.println("I'm a Animal Constructor2");
  }

  public String getName(){
    System.out.println("Animal getName()");
    return this.name;
  }

  public void setName(String name){
    this.name = name;
    //System.out.println("function in animal class");
  }

  public void sleep(){
    System.out.println("Animal is sleeping");
  }

  public void run(){
    System.out.println("Animal is running");
  }

}
