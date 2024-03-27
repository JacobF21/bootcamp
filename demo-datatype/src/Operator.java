package Week1;

public class Operator {
  public static void main(String[] args){
    // increment
    int x = 1;
    x = x+1;
    System.out.println(x);
    x = x+1;
    System.out.println(x);

    int y=1;
    y++;
    System.out.println(y);
    y++;
    System.out.println(y);
    ++y;
    System.out.println(y);
    y=y+1;
    System.out.println(y);
    y+=1;
    System.out.println(y);

    int e=10;
    System.out.println(e);
    e--;
    System.out.println(e);
    --e;
    System.out.println(e);
    e=e-1;
    System.out.println(e);
    e-=1;
    System.out.println(e);

    int predecrement = --e;//e=5
    System.out.println(predecrement);
    System.out.println(e);
    int postdecrement = e--;// postdecrement
    System.out.println(postdecrement);//5 is assign to postdecrement, then e minus 1
    System.out.println(e);//4


  }
}
