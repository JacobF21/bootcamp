package object;

public class Person {
  
  private Dog dog;

  public Dog getDog(){
    return this.dog;
  }

  public void setDog(Dog dog){
    this.dog=dog;
  }

  public static void main(String[] args) {
    Person Vincent = new Person();
    Vincent.setDog(new Dog(001,Color.BLACK));
    Dog vincentDog = Vincent.getDog();
    System.out.println(vincentDog.getColor());

    Person Oscar = new Person();
    Oscar.setDog(new Dog(002,Color.BLACK));
    Dog oscarDog = Oscar.getDog();

    Vincent.setDog(new Dog(003,Color.RED));
    Dog vincentDog2 = Vincent.getDog();
    System.out.println(vincentDog2.getColor());
    
    
  }
}
