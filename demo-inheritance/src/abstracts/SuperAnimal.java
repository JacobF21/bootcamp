package abstracts;

public abstract class SuperAnimal extends SuperObject{// you cannot create an object for abstract SuperAnimal;

  private String name;
  public SuperAnimal(){//2. Abstract class still having Constructor, even you cannot create an object for it
    //super();
  }

  public SuperAnimal(String name){//???
    //super();
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name =name;
  }

  public void sleep(){
    System.out.println("Animal is sleeping");
  }

  public void run(){
    System.out.println("Animal is running");
  }

  public abstract void eat();//method signature 3.Abstract method, but it is a method signature ONLY
  //the child class has to implement it.

  //4. Automatically inherits abctract method from parent abstract class

  public static void main(String[] args) {
    //SuperAnimal sa = new SuperAnimal();
  }
  
}
