package staticblock;

public class Student {
  
  public static final String collegeName;
  public static String abc = initialize();

  //Instance Variable
  private String name;

  public static String initialize(){
    System.out.println("initialize()");
    return "Hello";
  }

  static{
    System.out.println("static block");
    collegeName = "ABC";
  }

  //instance
  {
    System.out.println("instance block");
    this.name ="John";
  }

  public Student(String name){
    System.out.println("Constructor");
    if(name != null){
      this.name = name;
    }

  }

  public static void main(String[] args) {
    System.out.println("main start"); //before the main start it already go through the static block to fet the value of collegeName
    Student s = new Student("Jenny"); //instance block will only be executed when Constructor has been call
    Student s2 = new Student("Sally");
    Student s3 = new Student(null); 
    System.out.println("main end");
    System.out.println(s.name);
    System.out.println(s2.name);
    System.out.println(s3.name);
    System.out.println(abc);
  }

}
