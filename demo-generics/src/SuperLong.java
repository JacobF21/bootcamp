public class SuperLong extends Number implements Swim{
  
  @Override
  public double doubleValue(){
    return super.shortValue();
  }
  public int intValue(){
    return super.shortValue();
  }
  public float floatValue(){
    return super.shortValue();
  }
  public long longValue(){
    return super.shortValue();
  }

  @Override
  public void swim(){
    System.out.println("I am Swimming");
  }
}
