package abstracts;

public final class SuperCat extends SuperAnimal{
  
  private int age;
  public SuperCat(int age, String name){
    super(name); //!!!!
    this.age=age;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public void sleep(){
    System.out.println("Cat is sleeping");
  }

  @Override
  public void eat(){
    System.out.println("Cat is eating");
  }

  @Override
  public void sit(){
      System.out.println("Cat is siting");
  }


  //public void swim()


  public static void main(String[] args) {
    SuperCat sc = new SuperCat(10, "Peter");
    System.out.println(sc.getName());
    System.out.println(sc.getAge());
    sc.sleep();
    sc.run();
    sc.eat();
    sc.sit();
    sc.swim();

    SuperCat sc2 =sc;
    System.out.println(sc2 == sc);
    System.out.println(sc2.equals(sc));
  }
}
