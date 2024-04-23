public class Main {
  
  public static void main(String[] args) {
    ParentClass o1 = new ParentClass();
    ParentClass o2 = new SubclassA();
    ParentClass o3 = new SubclassB();
    
    
    o1.doSomething();
    o2.doSomething();
    o3.doSomething();
    SubclassA o4 = (SubclassA) o2;
    o4.getString();
  }
}
