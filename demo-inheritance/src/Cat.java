public class Cat extends Animal{
  
  private int age;
  private String name;
  //Child Class Cat object inherit all instance variable, instance method from Parent Class Animal object
  //but it does not inherit constructor
  public Cat(){
    //super(); //create Animal's Constructor
  }
  
  public Cat(int age){
    //super(); //create Animal's Constructor
    System.out.println("I'm a Cat Constructor");
  }

  public Cat(int age, String name){
    super(name);
    //new Animal(name,test);
    this.age = age;
    System.out.println("I'm a Cat Constructor2");
  }
  
  public int getAge(){
    System.out.println("Cat getAge()");
    return this.age;
  }

  public void setAge(int age){
    this.age=age;
  }

  @Override
  public void sleep(){//Method signature is same as the Animal object sleep()
    System.out.println("Cat is sleeping");
  }

  @Override
  public void run(){//Method signature is same as the Animal object sleep()
    System.out.println("Cat is running");
  }

  //Approach1
  //@Override




  //Approach2
  public String getAnimalName(){
    return super.getName();
  }
  //New Animal

  //Cat has its own instance variable

  //Another child class extend Animal
  public static void main(String[] args) {
    //Cat cat = new Cat(10);
    Cat cat2 = new Cat(10,"Alan");
    System.out.println(cat2.getName());
    //System.out.println(cat2.getName2());
    cat2.setName("Peter");
    System.out.println(cat2.getAnimalName());
    //System.out.println(cat2.getName2());
    //System.out.println(cat2.getName());
    //cat2.sleep();
    //cat2.run();
    //System.out.println(cat2.getAge());

    //Animal animal = new Animal();
  }
}
