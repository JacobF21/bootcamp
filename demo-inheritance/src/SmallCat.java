public class SmallCat extends Cat{

  private double weight;
  public SmallCat(int age, String name, double weight){
    super(age , name);
    this.weight = weight;
  }

  public int getAge(){
    System.out.println("sc getAge");
    return super.getAge();
  }

  public String getName(){
    System.out.println("sc getName");
    return super.getName();
  }


  public static void main(String[] args) {
    SmallCat sc =new SmallCat(10,"Jason",10.5);
    System.out.println(sc.getName());
    System.out.println(sc.getAge());
  }
}
