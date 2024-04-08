public class Person {
  private int age;
  private double salary;

  // getter and setter for age
  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age >= 65;
  }

  public String toString() {
    return "Person("//
        +"age="+this.age//
        + ")";
  }
}
