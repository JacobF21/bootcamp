import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Staff {
  
  private String name;
  
  public Staff(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    } else if(!(obj instanceof Staff)){
      return false;
    }
    Staff staff = (Staff) obj;
    return Objects.equals(this.name, staff.getName());
  }

  public int hashCode(){
    return Objects.hash(this.name);
  }

  public String toString(){
    return this.name;
  }
  public static void main(String[] args) {
    //Set is a data structure that ensure no duplicated element is stored
    HashSet<Staff> staffs = new HashSet<>();
    staffs.add(new Staff("Vincent"));
    staffs.add(new Staff("Oscar"));
    //System.out.println(staffs.size());
    //System.out.println(staffs.isEmpty());
    //System.out.println(staffs);

    // add -> false
    //System.out.println(staffs.add(new Staff("Vincent")));

    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("hello");
    //System.out.println(strings.size());
    

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(100);
    integers.add(4);
    integers.add(100);
    integers.add(4);
    integers.add(44);

    HashSet<Integer> integers2 = new HashSet<>();
    for(int i=0;i<integers.size();i++){
      System.out.println(integers2.add(integers.get(i)));
      //integers2.add(integers.get(i));
    }
    //System.out.println(integers2);

    integers2.remove(new Integer(100));
    //System.out.println(integers2);
    //System.out.println(integers2.contains(new Integer(44)));
  }
}
