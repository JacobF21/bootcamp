package object;
import java.time.LocalDate;
import java.util.Arrays;

public class Staff { // 1. All class implicity extends Topmost class "Object"
  
  private LocalDate joinDate;

  public Staff(LocalDate jLocalDate){
    this.joinDate=joinDate;
  }

  public LocalDate getJoinDate(){
    return this.joinDate;
  }
  /*
  @Override
  public String toString(){ //2. Every class should implement/override its own toString() to represent its object value
    return "Staff"//
          +"joinDate=" + this.joinDate//
          +")";
  }
  */
  public static void main(String[] args) {
    Object obj = new Object();
    System.out.println(obj.toString());//java.lang.Object@7344699f

    Staff s = new Staff(LocalDate.now());
    System.out.println(s.toString());//object.Staff@2a139a55
    Staff s2 = new Staff(LocalDate.now());
    System.out.println(s2.toString());//object.Staff@15db9742
    Staff[] temp = new Staff[99999];
    for(int i=0;i<99999;i++){
      temp[i]  = new Staff(LocalDate.now());
    }
    //System.out.println(Arrays.toString(temp));
    int first = 0;
    int last = 0;
    for(int i=0;i<temp.length-1;i++){
      for(int j=i+1;j<temp.length;j++){
        if(temp[i].toString() == temp[j].toString()){
          first =i;
          last =j;
        }
      }
      System.out.println("Working");
    }
    System.out.println(first+" "+last);

  }

}
