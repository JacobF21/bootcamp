public class Dog {

  private String firstName;
  private String lastName;
  private int age;


  //Empty Constructor
  public Dog(String firstName){
    this.firstName = firstName;
  }

  //Setter
  public void setFirstName(String firstName){
    this.firstName=firstName;
  }

  public void setLastName(String lastName){
    this.lastName=lastName;
  }

  public void setAge(int age){
    this.age =age;
  }

  //getter
  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }
  
  public int getAge(){
    return this.age;
  }

  //toString
  public String toString(){
    return "Dog("//
          +"firstName="+this.firstName
          +", lastName="+this.lastName
          +", age="+this.age
          +")";
  }

  public String fullName(){
    return firstName.concat(" ").concat(lastName);
  }

  public static void main(String[] args) {
    Dog dog =new Dog("HEHE");
    dog.setFirstName("John");
    dog.setLastName("Lau");
    dog.setAge(8);
    System.out.println(dog.toString());//"Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.fullName());

    Dog dog2 = null;
    dog2.setAge(4);

  }
}
