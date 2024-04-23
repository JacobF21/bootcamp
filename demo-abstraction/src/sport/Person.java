package sport;

public class Person implements Action{
  
  @Override
  public void run(){
    System.out.println("run");
  }

  @Override
  public void walk(){
    System.out.println("walk");
  }

  //You can still Override
  @Override
  public void swim(){
    System.out.println("Person is swimming");
  }

  public void cry(){
    System.out.println("cry");
  }

  public static void main(String[] args) {
    Action a = new Person();
    //a.cry; compile error, Action Type does not have cry method();
    if(a instanceof Person){
      Person p = (Person) a;
      p.cry();
    }
  }
}
