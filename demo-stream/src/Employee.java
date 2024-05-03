import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
  private String name;
  private String department;
  private double salary;

  public Employee(String name, String department, double salary){
    this.name=name;
    this.department=department;
    this.salary=salary;
  }

  public String getDepartment(){
    return this.department;
  }

  public double getSalary(){
    return this.salary;
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    List<Employee> employee = new ArrayList<>();
    employee.add(new Employee("Alice", "HR", 60000));
    employee.add(new Employee("Bob", "HR", 45000));
    employee.add(new Employee("Carol", "HR", 75000));
    employee.add(new Employee("David", "HR", 48000));
    employee.add(new Employee("Jenny", "IT", 60000));

    List<String> result = employee.stream()
                          .filter(e->"IT".equals(e.getDepartment()) && e.getSalary()>=60000)
                          .map(c-> c.getName())
                          .collect(Collectors.toList());

    System.out.println(result);

    
    
  }
}
