package method;

public class Staff {
  
  //Static Final Variablr (Class constant, belongs to class)
  private static final Double PI=3.14159;

  //Final Variable (Constant, belongs to object)
  private final int HOURS_OF_DAY =24;

  //Instance Variable
  private String name;
  private double salary;

  //Static Variable
  private static int age_limit;//0
  
  //Constructor
  public Staff(String name){
    this.name=name;
  }

  //Static Method
  public static Staff of(String name){
    return new Staff(name);
  }
  //Static Method
  public static Staff peter(){
    return new Staff("Peter");
  }

  //Static Method
  public static int getAgeLimit(){
    return age_limit;
  }

  //Insatance method
  public double getSalary(){
    return this.salary;
  }

  public double getHoursOfDay(){
    return this.HOURS_OF_DAY;
  }


  public static void main(String[] args){
    Staff.age_limit =10;
    System.out.println(Staff.age_limit);
    Staff.age_limit =12;

    Staff s1 = Staff.of("Vincent");
    System.out.println(s1.age_limit);//12 with warning

    //Object can access static variable
    //Static method cannot access instacne variable *->100
    System.out.println(s1.getHoursOfDay());
    Staff s2 = Staff.of("Jenny");
    System.out.println(s2.getHoursOfDay());
  }

}
