package object;

import java.time.LocalDate;

public class Student {
  private String name;
  private LocalDate dob;
  private String studentID;

  public Student(String studentID, String name,LocalDate dob){
    this.name=name;
    this.dob=dob;
    this.studentID=studentID;
  }
  public String getName(){
    return this.name;
  }

  public LocalDate getDOB(){
    return this.dob;
  }

  public String getStudentID(){
    return this.studentID;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof Student)){
      return false;
    }
    Student student = (Student) obj;
    //return (this.name.equals(student.getName()) && this.dob.compareTo(student.getDOB())==0);
    //The above is not a good design it is because we did not create a key to identify to
    return (this.studentID.compareTo(student.getStudentID())==0); 
  }

  public static void main(String[] args) {
    Student s1= new Student("S1","Vincent",LocalDate.of(2000,10,4));
    Student s2= new Student(s1.getStudentID(),s1.getName(),s1.getDOB());
    System.out.println(s1==s2); 
    /* 
    this code will compare the address of two object, 
    but s1 and s2 both reflecting the same student vincent. 
    Thus the purpose of comaparing two object 
    is to determine both object pointing to the same person in real life.
    So the belows equals() method is going to determine it by compare the attribute of a object
    instead their address in the memory; 
    */
    System.out.println(s1.equals(s2)); //
      

  }

}
